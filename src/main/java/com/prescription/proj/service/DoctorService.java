package com.prescription.proj.service;

import com.prescription.proj.dao.DoctorDao;
import com.prescription.proj.domain.Doctor;
import com.prescription.proj.domain.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DoctorService {

    private final DoctorDao doctorDao;

    @Autowired
    public DoctorService(DoctorDao doctorDao) {
        this.doctorDao = doctorDao;
    }

    public void save(Doctor doctor) {
        doctorDao.save(doctor);
    }

    public Doctor getDoctorByUserName(String userName) {
        return doctorDao.getDoctorByUserName(userName);
    }

    public boolean isDoctorExistsWithUniqueIdentifiers(Doctor doctor) {
        return !doctorDao.getDoctorListWithUniqueIdentifiers(doctor).isEmpty();
    }

    public boolean isAllowedDoctor(LoginUser user) {
        Doctor retrievedDoctor = getDoctorByUserName(user.getUserName());

        if (Objects.isNull(retrievedDoctor)) {
            return false;
        }

        return retrievedDoctor.getPassword().equals(user.getPassword());
    }

    public List<Doctor> getAllDoctors() {
        return doctorDao.getDoctors();
    }
}
