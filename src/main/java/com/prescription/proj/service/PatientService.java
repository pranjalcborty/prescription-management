package com.prescription.proj.service;

import com.prescription.proj.dao.PatientDao;
import com.prescription.proj.domain.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

import static com.prescription.proj.helper.Constants.getUser;

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
        if (patient.getId() == 0) {
            patient.setCreatedBy(getUser());
            patientDao.save(patient);
        } else {
            patientDao.update(patient);
        }
    }

    public Patient getPatient(long id) {
        return patientDao.getPatient(id);
    }

    public String countTodayPatients() {
        return String.format("%04d", patientDao.countOfToday() + 1);
    }
}
