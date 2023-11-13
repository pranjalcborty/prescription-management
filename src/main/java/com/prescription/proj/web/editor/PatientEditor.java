package com.prescription.proj.web.editor;

import com.prescription.proj.dao.PatientDao;
import com.prescription.proj.service.PatientService;

import java.beans.PropertyEditorSupport;

public class PatientEditor extends PropertyEditorSupport {

    private PatientService service;

    public PatientEditor(PatientService service) {
        this.service = service;
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        long id = Long.parseLong(text);

        if (id == 0) {
            setValue(null);
        } else {
            setValue(service.getPatient(id));
        }
    }
}
