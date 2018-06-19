package com.prescription.proj.service;

import com.prescription.proj.dao.PrescriptionDao;
import com.prescription.proj.domain.Doctor;
import com.prescription.proj.domain.Prescription;
import com.prescription.proj.helper.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class PrescriptionService {

    private final PrescriptionDao prescriptionDao;

    @Autowired
    public PrescriptionService(PrescriptionDao prescriptionDao) {
        this.prescriptionDao = prescriptionDao;
    }

    public List<Prescription> getAllPrescriptions() {
        return prescriptionDao.getPrescriptions();
    }

    public Prescription getPrescriptionById(long id) {
        return prescriptionDao.getPrescriptionById(id);
    }

    public void save(Prescription prescription, HttpSession session) {
        if (prescription.getId() != 0) {
            prescriptionDao.update(prescription);
        } else {
            prescription.setDoctor((Doctor) session.getAttribute(Constants.USER));
            prescriptionDao.save(prescription);
        }
    }
}
