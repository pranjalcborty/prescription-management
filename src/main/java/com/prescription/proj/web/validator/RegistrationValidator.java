package com.prescription.proj.web.validator;

import com.prescription.proj.domain.Admin;
import com.prescription.proj.domain.Doctor;
import com.prescription.proj.domain.User;
import com.prescription.proj.service.AdminService;
import com.prescription.proj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class RegistrationValidator implements Validator {

    private final AdminService adminService;
    private final UserService userService;

    @Autowired
    public RegistrationValidator(AdminService adminService, UserService userService) {
        this.adminService = adminService;
        this.userService = userService;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        if (target instanceof Admin && adminService.isAdminExistsWithUniqueIdentifiers((Admin) target)) {
            errors.reject("error.user.exists");
        }

        if (target instanceof Doctor && userService.isDoctorExistsWithUniqueIdentifiers((Doctor) target)) {
            errors.reject("error.user.exists");
        }
    }
}
