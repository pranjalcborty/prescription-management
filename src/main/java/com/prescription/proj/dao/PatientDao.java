package com.prescription.proj.dao;

import com.prescription.proj.domain.Patient;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TemporalType;
import java.util.Date;
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
    public Patient getPatient(long id) {
        return em.find(Patient.class, id);
    }

    @Transactional
    public void save(Patient patient) {
        em.persist(patient);
    }

    @Transactional
    public void update(Patient patient) {
        em.merge(patient);
    }

    public long countOfToday() {
        String jpql = "SELECT COUNT(p.id) FROM Patient p WHERE p.createdOn = :date";

        return em.createQuery(jpql, Long.class)
                .setParameter("date", new Date(), TemporalType.DATE)
                .getSingleResult();
    }
}
