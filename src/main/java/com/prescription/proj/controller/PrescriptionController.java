package com.prescription.proj.controller;

import com.prescription.proj.domain.Doctor;
import com.prescription.proj.domain.Patient;
import com.prescription.proj.domain.PatientJsonResponse;
import com.prescription.proj.domain.Prescription;
import com.prescription.proj.helper.Constants;
import com.prescription.proj.service.PatientService;
import com.prescription.proj.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import java.util.stream.Collectors;

import static com.prescription.proj.helper.Constants.*;

@Controller
public class PrescriptionController {

    private final PrescriptionService prescriptionService;
    private final PatientService patientService;

    @Autowired
    public PrescriptionController(PrescriptionService prescriptionService, PatientService patientService) {
        this.prescriptionService = prescriptionService;
        this.patientService = patientService;
    }

    @InitBinder(PRESCRIPTION)
    private void binder(WebDataBinder binder) {
        binder.setDisallowedFields(DOCTOR);
    }

    @RequestMapping(value = PRESCRIPTION_PATH, method = RequestMethod.GET)
    public String view(ModelMap model) {
        model.addAttribute(PRESCRIPTIONS, prescriptionService.getAllPrescriptions());
        return PRESCRIPTION_VIEW;
    }

    @RequestMapping(value = CREATE_PRESCRIPTION_PATH, method = RequestMethod.GET)
    public String createView(ModelMap model, HttpSession session) {
        Prescription prescription = new Prescription();
        prescription.setDoctor((Doctor) Constants.getUser(session));

        model.addAttribute(PRESCRIPTION, new Prescription());
        model.addAttribute(PATIENTS, patientService.getAllPatients());
        return CREATE_PRESCRIPTION_VIEW;
    }

    @PostMapping(value = "/addPatient", produces = { MediaType.APPLICATION_JSON_VALUE })
    @ResponseBody
    public PatientJsonResponse addPatient(@Valid @ModelAttribute Patient patient, BindingResult result) {
        PatientJsonResponse response = new PatientJsonResponse();

        if (result.hasErrors()) {
            response.setValidated(false);
            response.setErrorMessages(result.getFieldErrors().stream().collect(
                    Collectors.toMap(FieldError::getField, FieldError::getDefaultMessage)));
        } else {
            response.setValidated(true);
            patientService.save(patient);
        }

        return response;
    }
}
