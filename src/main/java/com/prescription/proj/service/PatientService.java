package com.prescription.proj.service;

import com.prescription.proj.dao.PatientDao;
import com.prescription.proj.domain.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private final PatientDao patientDao;

    @Autowired
    public PatientService(PatientDao patientDao) {
        this.patientDao = patientDao;
    }

    public List<Patient> getAllPatients() {
        return patientDao.getPatients();
    }

    public void save(Patient patient) {
        patientDao.save(patient);
    }
}
