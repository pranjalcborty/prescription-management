package com.prescription.proj.web.validator;

import com.prescription.proj.domain.User;
import com.prescription.proj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


import static com.prescription.proj.helper.Constants.isEmpty;

@Component
public class RegistrationValidator implements Validator {

    private final UserService userService;

    @Autowired
    public RegistrationValidator(UserService userService) {
        this.userService = userService;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;

        if (userService.isUserExistsWithUniqueIdentifiers(user)) {
            errors.reject("error.user.exists");
        }

        if (isEmpty(user.getRole())) {
            errors.rejectValue("role", "error.user.role");
        }
    }
}
