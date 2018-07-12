package com.prescription.proj.controller;

import com.prescription.proj.dao.PatientDao;
import com.prescription.proj.domain.Patient;
import com.prescription.proj.domain.Prescription;
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
    private final PatientDao patientDao;

    @Autowired
    public PrescriptionController(PrescriptionService prescriptionService, PatientService patientService, PatientDao patientDao) {
        this.prescriptionService = prescriptionService;
        this.patientService = patientService;
        this.patientDao = patientDao;
    }

    @InitBinder(PRESCRIPTION)
    public void binder(WebDataBinder binder) {
        binder.registerCustomEditor(Patient.class, new PatientEditor(patientDao));
    }

    @RequestMapping(value = PRESCRIPTION_PATH, method = RequestMethod.GET)
    public String view(ModelMap model) {
        model.addAttribute(PRESCRIPTIONS, prescriptionService.getAllPrescriptions());
        return PRESCRIPTION_VIEW;
    }

    @RequestMapping(value = CREATE_PRESCRIPTION_PATH, method = RequestMethod.GET)
    public String createView(@RequestParam(defaultValue = "0") Long prescriptionId, ModelMap model) {
        model.addAttribute(PRESCRIPTION, getPrescription(prescriptionId));
        model.addAttribute(PATIENTS, patientService.getAllPatients());
        return CREATE_PRESCRIPTION_VIEW;
    }

    @RequestMapping(value = CREATE_PRESCRIPTION_PATH, method = RequestMethod.POST)
    public String savePrescription(@Valid @ModelAttribute(PRESCRIPTION) Prescription prescription,
                                   BindingResult result,
                                   ModelMap model,
                                   HttpSession session) {
        if (result.hasErrors()) {
            model.addAttribute(PRESCRIPTION, prescription);
            model.addAttribute(PATIENTS, patientService.getAllPatients());
            return CREATE_PRESCRIPTION_VIEW;
        }

        prescriptionService.save(prescription, session);
        return redirectTo(PRESCRIPTION_PATH);
    }

    private Prescription getPrescription(Long id) {
        return id == 0 ? new Prescription() : prescriptionService.getPrescriptionById(id);
    }
}
