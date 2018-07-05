package com.prescription.proj.controller;

import com.prescription.proj.domain.User;
import com.prescription.proj.service.UserService;
import com.prescription.proj.web.validator.RegistrationValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static com.prescription.proj.helper.Constants.*;

@Controller
public class UserController {

    private final UserService userService;
    private final RegistrationValidator regValidator;

    @Autowired
    public UserController(UserService userService, RegistrationValidator regValidator) {
        this.userService = userService;
        this.regValidator = regValidator;
    }

    @InitBinder(USER)
    public void binder(WebDataBinder binder) {
        binder.addValidators(regValidator);
    }

    @RequestMapping(value = USER_LIST_PATH, method = RequestMethod.GET)
    public String view(@RequestParam User.Role role, ModelMap model) {
        model.addAttribute(USERS, userService.getAllUsers(role));
        return DOCTOR_VIEW;
    }

    @RequestMapping(value = ADD_USER_PATH, method = RequestMethod.GET)
    public String addView(ModelMap model) {
        model.addAttribute(USER, new User());
        return ADD_USER_VIEW;
    }

    @RequestMapping(value = ADD_USER_PATH, method = RequestMethod.POST)
    public String add(@Valid @ModelAttribute(USER) User user, BindingResult result,
                      @RequestParam User.Role role,
                      ModelMap model) {
        if (result.hasErrors()) {
            model.addAttribute(USER, user);
            return ADD_USER_VIEW;
        }

        user.setRole(role);
        userService.save(user);
        return redirectTo(urlAddParams(USER_LIST_PATH, "role", role.name()));
    }
}
