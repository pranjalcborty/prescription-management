package com.prescription.proj.controller;

import com.prescription.proj.domain.Appointment;
import com.prescription.proj.domain.Patient;
import com.prescription.proj.domain.User;
import com.prescription.proj.service.AppointmentService;
import com.prescription.proj.service.PatientService;
import com.prescription.proj.service.UserService;
import com.prescription.proj.web.editor.PatientEditor;
import com.prescription.proj.web.editor.UserEditor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import java.text.SimpleDateFormat;
import java.util.Date;

import static com.prescription.proj.helper.Constants.*;

@Controller
public class AppointmentController {

    private final AppointmentService appointmentService;
    private final PatientService patientService;
    private final UserService userService;

    @Autowired
    public AppointmentController(AppointmentService appointmentService, PatientService patientService, UserService userService) {
        this.appointmentService = appointmentService;
        this.patientService = patientService;
        this.userService = userService;
    }

    @InitBinder(APPOINTMENT)
    public void binder(WebDataBinder binder) {
        binder.registerCustomEditor(User.class, new UserEditor(userService));
        binder.registerCustomEditor(Patient.class, new PatientEditor(patientService));
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    @RequestMapping(value = APPOINTMENT_PATH, method = RequestMethod.GET)
    public String list(ModelMap model) {
        model.addAttribute(APPOINTMENTS, appointmentService.getAllAppointments());
        return APPOINTMENTS_VIEW;
    }

    @RequestMapping(value = CREATE_APPOINTMENT_PATH, method = RequestMethod.GET)
    public String view(@RequestParam(defaultValue = "0") Long appointmentId, ModelMap model) {
        if (notHasRole(User.Role.REFERRER, User.Role.ADMIN)) {
            return FAIL_VIEW;
        }

        model.addAttribute(APPOINTMENT, getAppointment(appointmentId));
        model.addAttribute(PATIENTS, patientService.getAllPatients());
        model.addAttribute(DOCTORS, userService.getAllUsers(User.Role.DOCTOR));
        return CREATE_APPOINTMENT_VIEW;
    }

    @RequestMapping(value = CREATE_APPOINTMENT_PATH, method = RequestMethod.POST)
    public String save(@Valid @ModelAttribute(APPOINTMENT) Appointment appointment, BindingResult result,
                       ModelMap model) {
        if (notHasRole(User.Role.REFERRER, User.Role.ADMIN)) {
            return FAIL_VIEW;
        }

        if (result.hasErrors()) {
            model.addAttribute(APPOINTMENT, appointment);
            return CREATE_APPOINTMENT_VIEW;
        }

        appointmentService.save(appointment);

        return redirectTo(APPOINTMENT_PATH);
    }

    private Appointment getAppointment(Long appointmentId) {
        return appointmentId != 0 ? appointmentService.getAppointment(appointmentId) : new Appointment();
    }
}
