package com.prescription.proj.dao;

import com.prescription.proj.domain.Prescription;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PrescriptionDao {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public List<Prescription> getPrescriptions() {
        String jpql = "SELECT p FROM Prescription p";

        return em.createQuery(jpql, Prescription.class).getResultList();
    }

    @Transactional
    public Prescription getPrescriptionById(long id) {
        return em.find(Prescription.class, id);
    }

    @Transactional
    public void save(Prescription prescription) {
        em.persist(prescription);
    }

    @Transactional
    public void update(Prescription prescription) {
        em.merge(prescription);
    }
}
