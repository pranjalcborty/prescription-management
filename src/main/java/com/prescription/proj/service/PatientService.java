package com.prescription.proj.service;

import com.prescription.proj.dao.PatientDao;
import com.prescription.proj.domain.Patient;
import com.prescription.proj.helper.Constants;
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

    public void save(Patient patient, HttpSession session) {
        if (patient.getId() == 0) {
            patient.setCreatedBy(getUser(session));
            patientDao.save(patient);
        } else {
            patientDao.update(patient);
        }
    }

    public Patient getPatientById(Long id) {
        return patientDao.getPatientById(id);
    }

    public Integer countTodaysPatients() {
        return patientDao.getPatientCount(new Date());
    }
}
