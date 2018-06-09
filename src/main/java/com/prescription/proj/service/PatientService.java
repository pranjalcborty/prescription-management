package com.prescription.proj.service;

import com.prescription.proj.dao.PatientDao;
import com.prescription.proj.domain.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    private PatientDao patientDao;

    public void save(Patient patient) {
        patientDao.save(patient);
    }
}
