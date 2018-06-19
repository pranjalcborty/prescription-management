package com.prescription.proj.controller;

import com.prescription.proj.domain.Admin;
import com.prescription.proj.domain.LoginUser;
import com.prescription.proj.service.DoctorService;
import com.prescription.proj.service.AdminService;
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

import static com.prescription.proj.helper.Constants.*;
import static java.util.Objects.isNull;

@Controller
public class AuthController {

    private static final String LOGIN_USER = "loginUser";

    private final AuthValidator authValidator;
    private final RegistrationValidator regValidator;

    private final AdminService adminService;
    private final DoctorService doctorService;

    @Autowired
    public AuthController(AuthValidator authValidator,
                          RegistrationValidator regValidator,
                          AdminService adminService,
                          DoctorService doctorService) {

        this.authValidator = authValidator;
        this.regValidator = regValidator;
        this.adminService = adminService;
        this.doctorService = doctorService;
    }

    @InitBinder(LOGIN_USER)
    public void loginBinder(WebDataBinder binder) {
        binder.addValidators(authValidator);
    }

    @InitBinder(ADMIN)
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

         session.setAttribute(USER,
                 (user.isDoctor()
                         ? doctorService.getDoctorByUserName(user.getUserName())
                         : adminService.getAdminByUserName(user.getUserName())));

         session.setAttribute(IS_DOCTOR, user.isDoctor());

         return redirectTo(HOME_PATH);
    }

    @RequestMapping(value = REG_PATH, method = RequestMethod.GET)
    public String registerView(ModelMap model, HttpSession session) {
//        if (adminService.isNoAdmin() && isNull(session.getAttribute(USER))) {
        if (isNull(session.getAttribute(USER))) {
            model.put(ADMIN, new Admin());
            return REG_VIEW;
        }

        return redirectTo(LOGIN_PATH);
    }

    @RequestMapping(value = REG_PATH, method = RequestMethod.POST)
    public String register(@Valid @ModelAttribute(ADMIN) Admin admin, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            model.put(ADMIN, admin);
            return REG_VIEW;
        }

        adminService.save(admin);
        return redirectTo(LOGIN_PATH);
    }

    @RequestMapping(value = LOGOUT_PATH, method = RequestMethod.GET)
    public String logout(SessionStatus status, HttpSession session) {
        status.setComplete();
        session.removeAttribute(USER);
        session.removeAttribute(IS_DOCTOR);

        return redirectTo(LOGIN_PATH);
    }
}
