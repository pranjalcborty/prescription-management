package com.prescription.proj.service;

import com.prescription.proj.dao.PrescriptionDao;
import com.prescription.proj.domain.Prescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
