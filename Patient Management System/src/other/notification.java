/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package other;
import accounts.*;
import other.data;

/**
 *
 * @author Alex Pritchard
 */
public class notification {
    
    private patient patient;
    private administrator admin;
    private doctor doctor;
    private secretary secretary;
    private String notification;

    public notification(patient patient, String notification) {
        this.patient = patient;
        this.notification = notification;
    }

    public notification(administrator admin, String notification) {
        this.admin = admin;
        this.notification = notification;
    }

    public notification(doctor doctor, String notification) {
        this.doctor = doctor;
        this.notification = notification;
    }

    public notification(secretary secretary, String notification) {
        this.secretary = secretary;
        this.notification = notification;
    }

    public patient getPatient() {
        return patient;
    }

    public void setPatient(patient patient) {
        this.patient = patient;
    }

    public administrator getAdmin() {
        return admin;
    }

    public void setAdmin(administrator admin) {
        this.admin = admin;
    }

    public doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(doctor doctor) {
        this.doctor = doctor;
    }

    public secretary getSecretary() {
        return secretary;
    }

    public void setSecretary(secretary secretary) {
        this.secretary = secretary;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    } 
}
