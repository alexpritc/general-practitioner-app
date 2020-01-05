/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Package.
package other;

/**
 *
 * @author Alex Pritchard
 */
public class appointment {
    
    // Declaring variables.
    private String patient;
    private String doctor;
    private String notes;
    private String date;
    private String time;

    // Constructor.
    public appointment(String patient, String doctor, String notes, String date, String time) {
        this.patient = patient;
        this.doctor = doctor;
        this.notes = notes;
        this.date = date;
        this.time = time;
    }

    // Getters and setters.
    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
