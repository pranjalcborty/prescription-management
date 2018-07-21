package com.prescription.proj.controller;

import com.prescription.proj.domain.PathologyReport;
import com.prescription.proj.domain.Patient;
import com.prescription.proj.domain.Test;
import com.prescription.proj.domain.User;
import com.prescription.proj.service.PathologyService;
import com.prescription.proj.service.PatientService;
import com.prescription.proj.web.editor.PatientEditor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static com.prescription.proj.helper.Constants.*;

@Controller
public class PathologyController {

    private final PatientService patientService;
    private final PathologyService pathologyService;

    @Autowired
    public PathologyController(PatientService patientService, PathologyService pathologyService) {
        this.patientService = patientService;
        this.pathologyService = pathologyService;
    }

    @InitBinder(TEST)
    public void binder(WebDataBinder binder) {
        binder.registerCustomEditor(Patient.class, new PatientEditor(patientService));
    }

    @RequestMapping(value = TEST_PATH, method = RequestMethod.GET)
    public String prescribe(@RequestParam(defaultValue = "0") Long patientId, ModelMap model) {
        if (notHasRole(User.Role.ADMIN, User.Role.DOCTOR)) {
            return FAIL_VIEW;
        }

        model.addAttribute(PATIENTS, patientService.getAllPatients())
                .addAttribute(TEST, getTest(patientId));
        return CREATE_TEST_VIEW;
    }

    @RequestMapping(value = TEST_PATH, method = RequestMethod.POST)
    public String save(@Valid @ModelAttribute(TEST) Test test, BindingResult result, ModelMap model) {
        if (notHasRole(User.Role.ADMIN, User.Role.DOCTOR)) {
            return FAIL_VIEW;
        }

        if (result.hasErrors()) {
            model.addAttribute(PATIENTS, patientService.getAllPatients())
                    .addAttribute(TEST, test);
            return CREATE_TEST_VIEW;
        }

        pathologyService.save(test);
        return redirectTo(HOME_PATH);
    }

    @RequestMapping(value = CREATE_PATHOLOGY_PATH, method = RequestMethod.GET)
    public String report(@RequestParam Long testId, ModelMap model) {
        PathologyReport report = new PathologyReport();
        report.setTest(pathologyService.getTest(testId));

        model.addAttribute(REPORT, report);
        return PATHOLOGY_VIEW;
    }

    private Test getTest(Long patientId) {
        Test test = new Test();
        if (patientId != 0) {
            test.setPatient(patientService.getPatient(patientId));
        }
        return test;
    }
}
