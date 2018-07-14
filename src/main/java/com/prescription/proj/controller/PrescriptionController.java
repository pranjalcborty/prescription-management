package com.prescription.proj.controller;

import com.prescription.proj.domain.Patient;
import com.prescription.proj.domain.Prescription;
import com.prescription.proj.domain.User;
import com.prescription.proj.service.AppointmentService;
import com.prescription.proj.service.PatientService;
import com.prescription.proj.service.PrescriptionService;
import com.prescription.proj.web.editor.PatientEditor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import static com.prescription.proj.helper.Constants.*;

@Controller
public class PrescriptionController {

    private final PrescriptionService prescriptionService;
    private final PatientService patientService;
    private final AppointmentService appointmentService;

    @Autowired
    public PrescriptionController(PrescriptionService prescriptionService,
                                  PatientService patientService,
                                  AppointmentService appointmentService) {
        this.prescriptionService = prescriptionService;
        this.patientService = patientService;
        this.appointmentService = appointmentService;
    }

    @InitBinder(PRESCRIPTION)
    public void binder(WebDataBinder binder) {
        binder.registerCustomEditor(Patient.class, new PatientEditor(patientService));
    }

    @RequestMapping(value = PRESCRIPTION_PATH, method = RequestMethod.GET)
    public String view(ModelMap model) {
        model.addAttribute(PRESCRIPTIONS, prescriptionService.getAllPrescriptions());
        return PRESCRIPTION_VIEW;
    }

    @RequestMapping(value = CREATE_PRESCRIPTION_PATH, method = RequestMethod.GET)
    public String createView(@RequestParam(defaultValue = "0") Long prescriptionId,
                             @RequestParam(defaultValue = "0") Long appointmentId,
                             ModelMap model) {
        if (notHasRole(User.Role.DOCTOR, User.Role.ADMIN)) {
            return FAIL_VIEW;
        }

        model.addAttribute(PRESCRIPTION, getPrescription(prescriptionId, appointmentId));
        model.addAttribute(PATIENTS, patientService.getAllPatients());
        return CREATE_PRESCRIPTION_VIEW;
    }

    @RequestMapping(value = CREATE_PRESCRIPTION_PATH, method = RequestMethod.POST)
    public String savePrescription(@Valid @ModelAttribute(PRESCRIPTION) Prescription prescription,
                                   BindingResult result,
                                   @RequestParam(defaultValue = "0") Long appointmentId,
                                   ModelMap model) {
        if (notHasRole(User.Role.DOCTOR, User.Role.ADMIN)) {
            return FAIL_VIEW;
        }

        if (result.hasErrors()) {
            model.addAttribute(PRESCRIPTION, prescription);
            model.addAttribute(PATIENTS, patientService.getAllPatients());
            return CREATE_PRESCRIPTION_VIEW;
        }

        prescriptionService.save(prescription, appointmentId);
        return redirectTo(PRESCRIPTION_PATH);
    }

    private Prescription getPrescription(Long id, Long appointmentId) {
        if (id == 0) {
            Prescription prescription = new Prescription();

            if (appointmentId != 0) {
                prescription.setPatient(appointmentService.getAppointment(appointmentId).getPatient());
            }

            return prescription;
        } else {
            return prescriptionService.getPrescriptionById(id);
        }
    }
}
