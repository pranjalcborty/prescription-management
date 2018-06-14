package com.prescription.proj.dao;

import com.prescription.proj.domain.Patient;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PatientDao {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public List<Patient> getPatients() {
        String jpql = "SELECT p FROM Patient p";

        return em.createQuery(jpql, Patient.class).getResultList();
    }

    @Transactional
    public void save(Patient patient) {
        em.persist(patient);
    }
}
