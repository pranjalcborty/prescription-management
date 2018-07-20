package com.prescription.proj.controller;

import com.prescription.proj.domain.User;
import com.prescription.proj.helper.Constants;
import com.prescription.proj.service.AppointmentService;
import com.prescription.proj.service.PathologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static com.prescription.proj.helper.Constants.*;

@Controller
public class HomeController {

    private final AppointmentService appointmentService;
    private final PathologyService pathologyService;

    @Autowired
    public HomeController(AppointmentService appointmentService, PathologyService pathologyService) {
        this.appointmentService = appointmentService;
        this.pathologyService = pathologyService;
    }

    @RequestMapping(value = Constants.HOME_PATH, method = RequestMethod.GET)
    public String home(ModelMap model) {
        if (!notHasRole(User.Role.ADMIN) || !notHasRole(User.Role.DOCTOR)) {
            model.addAttribute(APPOINTMENTS, appointmentService.getPendingAppointments());
        }
        if (!notHasRole(User.Role.ADMIN) || !notHasRole(User.Role.PATHOLOGIST)) {
            model.addAttribute(TESTS, pathologyService.getAllPendingTests());
        }

        return HOME_VIEW;
    }
}
