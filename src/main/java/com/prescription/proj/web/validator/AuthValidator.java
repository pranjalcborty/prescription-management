package com.prescription.proj.web.validator;

import com.prescription.proj.domain.LoginUser;
import com.prescription.proj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class AuthValidator implements Validator {

    private final UserService userService;

    @Autowired
    public AuthValidator(UserService userService) {
        this.userService = userService;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return LoginUser.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        LoginUser user = (LoginUser) target;

        if (!userService.isAllowedUser(user)) {
            errors.reject("error.user.invalid");
        }
    }
}
