package com.prescription.proj.controller;

import com.prescription.proj.domain.Doctor;
import com.prescription.proj.service.DoctorService;
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

import javax.validation.Valid;

import static com.prescription.proj.helper.Constants.*;

@Controller
public class DoctorController {

    private final DoctorService doctorService;
    private final RegistrationValidator regValidator;

    @Autowired
    public DoctorController(DoctorService doctorService, RegistrationValidator regValidator) {
        this.doctorService = doctorService;
        this.regValidator = regValidator;
    }

    @InitBinder(DOCTOR)
    public void binder(WebDataBinder binder) {
        binder.addValidators(regValidator);
    }

    @RequestMapping(value = DOCTOR_PATH, method = RequestMethod.GET)
    public String view(ModelMap model) {
        model.addAttribute("doctors", doctorService.getAllDoctors());
        return DOCTOR_VIEW;
    }

    @RequestMapping(value = ADD_DOCTOR_PATH, method = RequestMethod.GET)
    public String addView(ModelMap model) {
        model.addAttribute(DOCTOR, new Doctor());
        return ADD_DOCTOR_VIEW;
    }

    @RequestMapping(value = ADD_DOCTOR_PATH, method = RequestMethod.POST)
    public String add(@Valid @ModelAttribute(DOCTOR) Doctor doctor, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            model.addAttribute(DOCTOR, doctor);
            return ADD_DOCTOR_VIEW;
        }

        doctorService.save(doctor);
        return redirectTo(DOCTOR_PATH);
    }
}
