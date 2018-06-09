package com.prescription.proj.dao;

import com.prescription.proj.domain.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

@Repository
public class UserDao {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public User getUserByUserName(String userName) {
        String jpql = "SELECT u FROM User u WHERE u.userName LIKE :userName";

        try {
            return (User) em.createQuery(jpql).setParameter("userName", userName).getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
}
