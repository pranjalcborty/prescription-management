package com.prescription.proj.dao;

import com.prescription.proj.domain.Appointment;
import com.prescription.proj.domain.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class AppointmentDao {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public Appointment getAppointment(long id) {
        return em.find(Appointment.class, id);
    }

    @Transactional
    public void save(Appointment appointment) {
        em.persist(appointment);
    }

    @Transactional
    public void merge(Appointment appointment) {
        em.merge(appointment);
    }

    @Transactional
    public List<Appointment> getAllAppointments() {
        String jpql = "SELECT a FROM Appointment a";

        return em.createQuery(jpql, Appointment.class).getResultList();
    }

    public List<Appointment> getPending(User user) {
        String jpql = "SELECT a FROM Appointment a WHERE a.doctor = :user AND a.prescribed = false";

        return em.createQuery(jpql, Appointment.class).setParameter("user", user).getResultList();
    }
}
