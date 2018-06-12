package com.prescription.proj.dao;

import com.prescription.proj.domain.Doctor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

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

    @Transactional
    public void save(Doctor doctor) {
        em.persist(doctor);
    }
}
