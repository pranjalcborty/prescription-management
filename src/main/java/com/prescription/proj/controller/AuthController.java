package com.prescription.proj.controller;

import com.prescription.proj.domain.User;
import com.prescription.proj.helper.Constants;
import com.prescription.proj.web.validator.AuthValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.Objects;

import static com.prescription.proj.helper.Constants.*;

@Controller
public class AuthController {

    private static final String REG_USER = "regUser";

    @Autowired
    private AuthValidator authValidator;

    @InitBinder(USER)
    public void loginBinder(WebDataBinder binder) {
        binder.addValidators(authValidator);
    }

    @RequestMapping(value = LOGIN_PATH, method = RequestMethod.GET)
    public String viewLogin(HttpSession session, ModelMap model) {

        if (Objects.isNull(session.getAttribute(USER))) {
            model.put(USER, new User());
            return LOGIN_VIEW;
        }

        return redirectTo(HOME_PATH);
    }

    @RequestMapping(value = LOGIN_PATH, method = RequestMethod.POST)
    public String login(@Valid @ModelAttribute(USER) User user, BindingResult result, ModelMap model) {
         if (result.hasErrors()) {
             model.put(USER, user);
             return LOGIN_VIEW;
         }

         return redirectTo(HOME_PATH);
    }
}
