/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package other;


/**
 *
 * @author Alex Pritchard
 */
public class prescription {
    
    private String patientId;
    private String doctorId;
    private String medicine;
    private String appointmentNotes;

    public prescription(String patientId, String doctorId, String medicine, String appointmentNotes) {
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.medicine = medicine;
        this.appointmentNotes = appointmentNotes;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    
    
    public String getAppointmentNotes() {
        return appointmentNotes;
    }

    public void setAppointmentNotes(String appointmentNotes) {
        this.appointmentNotes = appointmentNotes;
    }
    
    
    
}
