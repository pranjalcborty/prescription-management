package com.prescription.proj.controller;

import com.prescription.proj.domain.User;
import com.prescription.proj.helper.Constants;
import com.prescription.proj.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static com.prescription.proj.helper.Constants.APPOINTMENTS;
import static com.prescription.proj.helper.Constants.notHasRole;

@Controller
public class HomeController {

    private final AppointmentService appointmentService;

    @Autowired
    public HomeController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @RequestMapping(value = Constants.HOME_PATH, method = RequestMethod.GET)
    public String home(ModelMap model) {
        if (!notHasRole(User.Role.ADMIN) || !notHasRole(User.Role.DOCTOR)) {
            model.addAttribute(APPOINTMENTS, appointmentService.getPendingAppointments());
        }
        return "success";
    }
}
