package com.prescription.proj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static com.prescription.proj.helper.Constants.*;

@Controller
public class PrescriptionController {

    @RequestMapping(value = PRESCRIPTION_PATH, method = RequestMethod.GET)
    public String view() {
        return HOME_PATH;
    }
}
