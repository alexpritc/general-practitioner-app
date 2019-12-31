/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package other;

import accounts.doctor;
import accounts.patient;

/**
 *
 * @author Alex Pritchard
 */
public class appointment {
    
    private patient patient;
    private doctor doctor;
    private String date;
    private String notes;

    public appointment(patient patient, doctor doctor, String date, String notes) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.notes = notes;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    
}
