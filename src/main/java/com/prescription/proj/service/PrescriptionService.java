package com.prescription.proj.service;

import com.prescription.proj.dao.AppointmentDao;
import com.prescription.proj.dao.PrescriptionDao;
import com.prescription.proj.domain.Appointment;
import com.prescription.proj.domain.Prescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

import static com.prescription.proj.helper.Constants.getUser;

@Service
public class PrescriptionService {

    private final PrescriptionDao prescriptionDao;
    private final AppointmentDao appointmentDao;

    @Autowired
    public PrescriptionService(PrescriptionDao prescriptionDao, AppointmentDao appointmentDao) {
        this.prescriptionDao = prescriptionDao;
        this.appointmentDao = appointmentDao;
    }

    public List<Prescription> getAllPrescriptions() {
        return prescriptionDao.getPrescriptions();
    }

    public Prescription getPrescriptionById(long id) {
        return prescriptionDao.getPrescriptionById(id);
    }

    public void save(Prescription prescription, long appointmentId) {
        if (appointmentId != 0) {
            Appointment appointment = appointmentDao.getAppointment(appointmentId);
            appointment.setPrescribed(true);
            appointmentDao.merge(appointment);
        }

        if (prescription.getId() != 0) {
            prescriptionDao.update(prescription);
        } else {
            prescription.setDoctor(getUser());
            prescriptionDao.save(prescription);
        }
    }
}
