package com.prescription.proj.controller;

import com.prescription.proj.domain.Patient;
import com.prescription.proj.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @RequestMapping(method = RequestMethod.GET)
    public String patient(ModelMap model) {
        model.put("patient", new Patient());
        return "index";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String save(@ModelAttribute("patient") Patient patient) {
        patientService.save(patient);
        return "success";
    }
}
