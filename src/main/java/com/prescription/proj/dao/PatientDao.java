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

    public Integer getPatientCount(Date date) {
        String jpql = "SELECT COUNT(p) FROM Patient p WHERE p.regDate = :regDate";

        return em.createQuery(jpql, Integer.class).setParameter("regDate", date, TemporalType.DATE).getSingleResult();
    }

    @Transactional
    public void update(Patient patient) {
        em.merge(patient);
    }
}
