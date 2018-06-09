package com.prescription.proj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/patient")
public class PrescriptionController {

    @RequestMapping(method = RequestMethod.GET)
    public String pres() {
        return "index";
    }
}
