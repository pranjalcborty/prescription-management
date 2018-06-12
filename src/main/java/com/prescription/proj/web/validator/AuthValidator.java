package com.prescription.proj.web.validator;

import com.prescription.proj.domain.LoginUser;
import com.prescription.proj.service.DoctorService;
import com.prescription.proj.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class AuthValidator implements Validator {

    private final AdminService adminService;
    private final DoctorService doctorService;

    @Autowired
    public AuthValidator(AdminService adminService, DoctorService doctorService) {
        this.adminService = adminService;
        this.doctorService = doctorService;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return LoginUser.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        LoginUser user = (LoginUser) target;

        if (user.isDoctor()) {
            if (!doctorService.isAllowedDoctor(user)) {
                errors.reject("error.doctor.invalid");
            }
        } else {
            if (!adminService.isAllowedUser(user)) {
                errors.reject("error.admin.invalid");
            }
        }
    }
}
