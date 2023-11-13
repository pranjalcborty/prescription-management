package com.prescription.proj.service;

import com.prescription.proj.dao.PharmacyDao;
import com.prescription.proj.domain.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineService {

    private final PharmacyDao pharmacyDao;

    @Autowired
    public MedicineService(PharmacyDao pharmacyDao) {
        this.pharmacyDao = pharmacyDao;
    }

    public List<Medicine> getAllMedicines() {
        return pharmacyDao.getMeds();
    }

    public void save(Medicine medicine) {
        pharmacyDao.save(medicine);
    }
}
