package com.prescription.proj.domain;

import javax.persistence.*;

@Entity
public class Doctor extends User {

    private String specialization;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
