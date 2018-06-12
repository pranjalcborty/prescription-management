package com.prescription.proj.dao;

import com.prescription.proj.domain.Admin;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class AdminDao {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public Admin getUserByUserName(String userName) {
        String jpql = "SELECT a FROM Admin a WHERE a.userName LIKE :userName";

        try {
            return em.createQuery(jpql, Admin.class)
                    .setParameter("userName", userName)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public List<Admin> getUserListWithUniqueIdentifiers(Admin admin) {
        String jpql = "SELECT a FROM Admin a WHERE a.userName LIKE :userName";

        return em.createQuery(jpql, Admin.class)
                .setParameter("userName", admin.getUserName())
                .getResultList();
    }

    public Long countAdmin() {
        String jpql = "SELECT COUNT(a) FROM Admin a";

        return em.createQuery(jpql, Long.class).getSingleResult();
    }

    @Transactional
    public void save(Admin admin) {
        em.persist(admin);
    }
}
