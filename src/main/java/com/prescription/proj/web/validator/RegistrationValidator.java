package com.prescription.proj.web.validator;

import com.prescription.proj.domain.Admin;
import com.prescription.proj.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class RegistrationValidator implements Validator {

    private final AdminService adminService;

    @Autowired
    public RegistrationValidator(AdminService adminService) {
        this.adminService = adminService;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Admin.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Admin admin = (Admin) target;

        if (adminService.isUserExistsWithUniqueIdentifiers(admin)) {
            errors.reject("error.user.exists");
        }
    }
}
