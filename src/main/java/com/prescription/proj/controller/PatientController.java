package com.prescription.proj.controller;

import com.prescription.proj.domain.Patient;
import com.prescription.proj.domain.User;
import com.prescription.proj.service.PatientService;
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
public class PatientController {

    private final PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }


    @InitBinder(PATIENT)
    public void binder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    @RequestMapping(value = PATIENT_PATH, method = RequestMethod.GET)
    public String view(ModelMap model) {
        model.addAttribute(PATIENTS, patientService.getAllPatients());
        return PATIENT_VIEW;
    }

    @RequestMapping(value = CREATE_PATIENT_PATH, method = RequestMethod.GET)
    public String createView(@RequestParam(defaultValue = "0") Long patientId, ModelMap model, HttpSession session) {
        if (notHasRole(User.Role.RECEPTIONIST, User.Role.ADMIN)) {
            return FAIL_VIEW;
        }

        model.addAttribute(PATIENT, getPatient(patientId));
        setCommonValues(model);
        return CREATE_PATIENT_VIEW;
    }

    @RequestMapping(value = CREATE_PATIENT_PATH, method = RequestMethod.POST)
    public String add(@Valid @ModelAttribute(PATIENT) Patient patient, BindingResult result,
                      ModelMap model) {
        if (notHasRole(User.Role.RECEPTIONIST, User.Role.ADMIN)) {
            return FAIL_VIEW;
        }

        if (result.hasErrors()) {
            model.addAttribute(PATIENT, patient);
            setCommonValues(model);
            return CREATE_PATIENT_VIEW;
        }

        patientService.save(patient);
        return redirectTo(PATIENT_PATH);
    }

    private Patient getPatient(Long id) {
        Patient patient = new Patient();
        patient.setRegNum(getRegNum());
        return id == 0 ? patient : patientService.getPatient(id);
    }

    private void setCommonValues(ModelMap model) {
        model.addAttribute(GENDER, genderList)
                .addAttribute(BLOOD, bloodList)
                .addAttribute(RELIGION, religionList);
    }

    private long getRegNum() {
        String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
        return Long.valueOf(date + patientService.countTodayPatients());
    }
}
