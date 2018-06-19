package com.prescription.proj.web.editor;

import com.prescription.proj.dao.PatientDao;
import com.prescription.proj.domain.Patient;

import java.beans.PropertyEditorSupport;

public class PatientEditor extends PropertyEditorSupport {

    private PatientDao patientDao;

    public PatientEditor(PatientDao patientDao) {
        this.patientDao = patientDao;
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        long id = Long.parseLong(text);

        if (id == 0) {
            setValue(null);
        } else {
            setValue(patientDao.getPatientById(id));
        }
    }

}
