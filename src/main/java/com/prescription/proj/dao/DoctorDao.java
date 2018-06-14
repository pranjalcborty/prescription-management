package com.prescription.proj.dao;

import com.prescription.proj.domain.Doctor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class DoctorDao {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public Doctor getDoctorByUserName(String userName) {
        String jpql = "SELECT d FROM Doctor d WHERE d.userName LIKE :userName";

        try {
            return em.createQuery(jpql, Doctor.class)
                    .setParameter("userName", userName)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public List<Doctor> getDoctorListWithUniqueIdentifiers(Doctor doctor) {
        String jpql = "SELECT d FROM Doctor d WHERE d.userName LIKE :userName";

        return em.createQuery(jpql, Doctor.class)
                .setParameter("userName", doctor.getUserName())
                .getResultList();
    }

    @Transactional
    public void save(Doctor doctor) {
        em.persist(doctor);
    }

    @Transactional
    public List<Doctor> getDoctors() {
        String jpql = "SELECT d FROM Doctor d";

        return em.createQuery(jpql, Doctor.class).getResultList();
    }
}
