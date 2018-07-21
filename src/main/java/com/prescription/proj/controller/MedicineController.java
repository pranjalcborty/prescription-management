package com.prescription.proj.controller;

import com.prescription.proj.domain.Medicine;
import com.prescription.proj.domain.Test;
import com.prescription.proj.domain.User;
import com.prescription.proj.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

import static com.prescription.proj.helper.Constants.*;

@Controller
public class MedicineController {

    private final MedicineService medicineService;

    @Autowired
    public MedicineController(MedicineService medicineService) {
        this.medicineService = medicineService;
    }

    @RequestMapping(value = MEDICINE_PATH, method = RequestMethod.GET)
    public String prescribe(ModelMap model) {
        if (notHasRole(User.Role.ADMIN, User.Role.PHARMACIST)) {
            return FAIL_VIEW;
        }

        model.addAttribute(MEDICINES, medicineService.getAllMedicines())
                .addAttribute(MEDICINE, new Medicine());

        return MEDICINE_VIEW;
    }

    @RequestMapping(value = MEDICINE_PATH, method = RequestMethod.POST)
    public String save(@Valid @ModelAttribute(MEDICINE) Medicine medicine, BindingResult result, ModelMap model) {
        if (notHasRole(User.Role.ADMIN, User.Role.DOCTOR)) {
            return FAIL_VIEW;
        }

        if (result.hasErrors()) {
            model.addAttribute(MEDICINES, medicineService.getAllMedicines())
                    .addAttribute(MEDICINE, medicine);

            return MEDICINE_VIEW;
        }

        medicineService.save(medicine);
        return redirectTo(MEDICINE_PATH);
    }
}
