package com.prescription.proj.service;

import com.prescription.proj.dao.AppointmentDao;
import com.prescription.proj.domain.Appointment;
import com.prescription.proj.helper.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

import static com.prescription.proj.helper.Constants.getUser;

@Service
public class AppointmentService {

    private final AppointmentDao appointmentDao;

    @Autowired
    public AppointmentService(AppointmentDao appointmentDao) {
        this.appointmentDao = appointmentDao;
    }

    public Appointment getAppointment(long id) {
        return appointmentDao.getAppointment(id);
    }

    public void save(Appointment appointment) {
        if (appointment.getId() != 0) {
            appointmentDao.merge(appointment);
        } else {
            appointment.setCreatedOn(new Date());
            appointment.setCreatedBy(getUser());
            appointmentDao.save(appointment);
        }
    }


    public List<Appointment> getAllAppointments() {
        return appointmentDao.getAllAppointments();
    }

    public List<Appointment> getPendingAppointments() {
        return appointmentDao.getPending(getUser());
    }
}
