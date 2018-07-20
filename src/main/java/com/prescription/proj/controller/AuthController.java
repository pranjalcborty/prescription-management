package com.prescription.proj.controller;

import com.prescription.proj.domain.LoginUser;
import com.prescription.proj.domain.User;
import com.prescription.proj.service.UserService;
import com.prescription.proj.web.validator.AuthValidator;
import com.prescription.proj.web.validator.RegistrationValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import java.util.Arrays;

import static com.prescription.proj.helper.Constants.*;
import static java.util.Objects.isNull;

@Controller
public class AuthController {

    private static final String LOGIN_USER = "loginUser";

    private final AuthValidator authValidator;
    private final RegistrationValidator regValidator;
    private final UserService userService;

    @Autowired
    public AuthController(AuthValidator authValidator,
                          RegistrationValidator regValidator,
                          UserService userService) {

        this.authValidator = authValidator;
        this.regValidator = regValidator;
        this.userService = userService;
    }

    @InitBinder(LOGIN_USER)
    public void loginBinder(WebDataBinder binder) {
        binder.addValidators(authValidator);
    }

    @InitBinder(USER)
    public void regBinder(WebDataBinder binder) {
        binder.addValidators(regValidator);
    }

    @RequestMapping(value = LOGIN_PATH, method = RequestMethod.GET)
    public String viewLogin(HttpSession session, ModelMap model) {
        if (isNull(session.getAttribute(USER))) {
            model.put(LOGIN_USER, new LoginUser());
            return LOGIN_VIEW;
        }

        return redirectTo(HOME_PATH);
    }

    @RequestMapping(value = LOGIN_PATH, method = RequestMethod.POST)
    public String login(@Valid @ModelAttribute(LOGIN_USER) LoginUser user, BindingResult result,
                        ModelMap model, HttpSession session) {
        if (result.hasErrors()) {
            model.put(LOGIN_USER, user);
            return LOGIN_VIEW;
        }

        User currentUser = userService.getUser(user.getUserName());
        session.setAttribute(USER, currentUser);
        currentUser.getRole().forEach(r -> session.setAttribute(r.getName(), true));
        return redirectTo(HOME_PATH);
    }

    @RequestMapping(value = REG_PATH, method = RequestMethod.GET)
    public String registerView(ModelMap model, HttpSession session) {
        if (isNull(session.getAttribute(USER))) {
            model.addAttribute(USER, new User())
                    .addAttribute("allRoles", User.Role.values());
            return REG_VIEW;
        }

        return redirectTo(LOGIN_PATH);
    }

    @RequestMapping(value = REG_PATH, method = RequestMethod.POST)
    public String register(@Valid @ModelAttribute(USER) User user, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            model.addAttribute(USER, user)
                    .addAttribute("allRoles", User.Role.values());

            return REG_VIEW;
        }

        userService.save(user);
        return redirectTo(LOGIN_PATH);
    }

    @RequestMapping(value = LOGOUT_PATH, method = RequestMethod.GET)
    public String logout(HttpSession session) {
        session.removeAttribute(USER);
        Arrays.stream(User.Role.values()).forEach(r -> session.removeAttribute(r.getName()));

        return redirectTo(LOGIN_PATH);
    }
}
