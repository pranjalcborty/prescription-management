package com.prescription.proj.dao;

import com.prescription.proj.domain.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;

@Repository
public class UserDao {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public User getUser(String userName) throws NoResultException {
        String jpql = "SELECT d FROM User d WHERE d.userName LIKE :userName";

        return em.createQuery(jpql, User.class)
                .setParameter("userName", userName)
                .getSingleResult();
    }

    @Transactional
    public User getUser(long id) {
        return em.find(User.class, id);
    }

    public List<User> getUserListWithUniqueIdentifiers(User User) {
        String jpql = "SELECT d FROM User d WHERE d.userName LIKE :userName";

        return em.createQuery(jpql, User.class)
                .setParameter("userName", User.getUserName())
                .getResultList();
    }

    @Transactional
    public void save(User User) {
        em.persist(User);
    }

    @Transactional
    public List<User> getUsers() {
        String jpql = "SELECT d FROM User d WHERE d.active = true";

        return em.createQuery(jpql, User.class).getResultList();
    }
}
