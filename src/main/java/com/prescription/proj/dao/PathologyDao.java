package com.prescription.proj.dao;

import com.prescription.proj.domain.Test;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PathologyDao {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void save(Test test) {
        em.persist(test);
    }

    @Transactional
    public void merge(Test test) {
        em.merge(test);
    }

    @Transactional
    public List<Test> getAllTests() {
        String jpql = "SELECT t from Test t where t.active = true";

        return em.createQuery(jpql, Test.class).getResultList();
    }

    public Test getTest(long testId) {
        return em.find(Test.class, testId);
    }
}
