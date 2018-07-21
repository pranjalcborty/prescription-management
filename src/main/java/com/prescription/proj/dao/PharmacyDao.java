package com.prescription.proj.dao;

import com.prescription.proj.domain.Medicine;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PharmacyDao {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void save(Medicine medicine) {
        em.persist(medicine);
    }

    @Transactional
    public List<Medicine> getMeds() {
        String jpql = "SELECT m FROM Medicine m";

        return em.createQuery(jpql, Medicine.class).getResultList();
    }
}
