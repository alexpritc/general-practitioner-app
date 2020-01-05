/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Package and import.
package other;

import accounts.*;

/**
 *
 * @author Alex Pritchard
 */
public class notification {
    
    // Declaring variables.
    private patient patient;
    private administrator admin;
    private doctor doctor;
    private secretary secretary;
    // 0 = All patients, 1 = all admins, 2 = all doctors, 
    // 3 = all secretaries, 4 = all;
    private int allOneType;
    
    private String notification;

    // Constructors.
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
    
    public notification(int type, String notification) {
        this.allOneType = type;
        this.notification = notification;
    }

    // Getters and setters.
    public user getUser() {
        if (patient != null){
        return patient;
        }
        else if (admin != null){
        return admin;
        }
        else if (doctor != null){
        return doctor;
        }
        else if (secretary != null){
        return secretary;
        }
        else{
        return null;
        }
    }

    public int getAllOneType() {
        return allOneType;
    }

    public void setAllOneType(int type) {
        this.allOneType = type;
    }
    
    public String getNotification() {
        return notification;
    }
}
