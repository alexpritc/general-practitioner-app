/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package other;

import accounts.doctor;
import accounts.patient;
import other.medicine;
import other.appointment;

/**
 *
 * @author Alex Pritchard
 */
public class prescription {
    
    private patient patient;
    private doctor doctor;
    private medicine medicine;
    private String appointmentNotes;

    public prescription(patient patient, doctor doctor, medicine medicine, String appointmentNotes) {
        this.patient = patient;
        this.doctor = doctor;
        this.medicine = medicine;
        this.appointmentNotes = appointmentNotes;
    }

    public patient getPatient() {
        return patient;
    }

    public void setPatient(patient patient) {
        this.patient = patient;
    }

    public doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(doctor doctor) {
        this.doctor = doctor;
    }

    public medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(medicine medicine) {
        this.medicine = medicine;
    }

    public String getAppointmentNotes() {
        return appointmentNotes;
    }

    public void setAppointmentNotes(String appointmentNotes) {
        this.appointmentNotes = appointmentNotes;
    }
    
    
    
}
