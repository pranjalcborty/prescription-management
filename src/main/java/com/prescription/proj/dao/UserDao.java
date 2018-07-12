package com.prescription.proj.dao;

import com.prescription.proj.domain.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDao {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public User getUserByUserName(String userName) {
        String jpql = "SELECT d FROM User d WHERE d.userName LIKE :userName";

        try {
            return em.createQuery(jpql, User.class)
                    .setParameter("userName", userName)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
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
        String jpql = "SELECT d FROM User d";

        return em.createQuery(jpql, User.class).getResultList();
    }

    @Transactional
    public List<User> getUsers(User.Role role) {
        String jpql = "SELECT d FROM User d where d.role = :role";

        return em.createQuery(jpql, User.class)
                .setParameter("role", role)
                .getResultList();
    }
}
