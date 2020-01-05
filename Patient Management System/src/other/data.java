// Package.

package other;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Imports.

import java.io.*; 
import java.util.*;

import accounts.*;

/**
 *
 * @author Alex Pritchard
 */
// Data class is used to read/write to .txt files and store 
// the data in arrayLists.
public class data {
    
    // Declaring variables.
    public static List<patient> patients = new ArrayList<>();
    public static List<administrator> administrators = new ArrayList<>();
    public static List<doctor> doctors = new ArrayList<>();
    public static List<secretary> secretaries = new ArrayList<>();
    
    public static List<patient> patientRequests = new ArrayList<>();
    public static List<patient> patientRemovals = new ArrayList<>();
    
    public static List feedback = new ArrayList<>();
    public static List messages = new ArrayList<>();
    
    public static List<notification> notifications = new ArrayList<>();
    
    public static List<medicine> medicines = new ArrayList<>();
    public static List<appointment> appointments = new ArrayList<>();
    public static List<prescription> prescriptions = new ArrayList<>();
    
    public static List<appointment> appointmentRequests = new ArrayList<>();

    // Read from files.
    public static void readPatients()throws Exception{
        File file = new File("patients.txt"); 
  
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        
        String line;
        
        while((line = br.readLine()) != null)
        {
            String name, surname, address, id, password, age, gender;
            
            id = line;
            name = br.readLine();
            surname = br.readLine();
            address = br.readLine();
            password = br.readLine();
            age = br.readLine();
            gender = br.readLine();

      
            patient tempPatient = new patient(name, surname, address, id, 
                password, age, gender);
      
            patients.add(tempPatient);
        }
        
        br.close();
    }
    
    public static void readAdministrators()throws Exception{
        File file = new File("administrators.txt"); 
  
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        
        String line;
        
        while((line = br.readLine()) != null)
        {
            String name, surname, address, id, password;
            
            id = line;
            name = br.readLine();
            surname = br.readLine();
            address = br.readLine();
            password = br.readLine();

      
            administrator tempAdmin = new administrator(name, surname, address, id, password);
      
            administrators.add(tempAdmin);
        }
        
        br.close();
    }
    
    public static void readDoctors()throws Exception{
        File file = new File("doctors.txt"); 
  
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        
        String line;
        
        while((line = br.readLine()) != null)
        {
            String name, surname, address, id, password, rating, numberOfRates;
            
            id = line;
            name = br.readLine();
            surname = br.readLine();
            address = br.readLine();
            password = br.readLine();
            rating = br.readLine();
            numberOfRates = br.readLine();

      
            doctor tempDoctor = new doctor(name, surname, address, id, 
                    password, rating, numberOfRates);
      
            doctors.add(tempDoctor);
        }
        
        br.close();
    }
     
    public static void readSecretaries()throws Exception{
        File file = new File("secretaries.txt"); 
  
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        
        String line;
        
        while((line = br.readLine()) != null)
        {
            String name, surname, address, id, password;
            
            id = line;
            name = br.readLine();
            surname = br.readLine();
            address = br.readLine();
            password = br.readLine();

      
            secretary tempSec = new secretary(name, surname, address, id, password);
      
            secretaries.add(tempSec);
            
        }
        
        br.close();
    }
    
      
    public static void readPatientRequests()throws Exception{
        File file = new File("patient-requests.txt"); 
  
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        
        String line;
        
        while((line = br.readLine()) != null)
        {
            String name, surname, address, id, password, age, gender;
            
            id = line;
            name = br.readLine();
            surname = br.readLine();
            address = br.readLine();
            password = br.readLine();
            age = br.readLine();
            gender = br.readLine();

      
            patient tempPatient = new patient(name, surname, address, id, 
                password, age, gender);
      
            patientRequests.add(tempPatient);
        }
        
        br.close();
    }
      
    public static void readPatientRemovals()throws Exception{
        File file = new File("patient-removals.txt"); 
  
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        
        String line;
        
        while((line = br.readLine()) != null)
        {
            String name, surname, address, id, password, age, gender;
            
            id = line;
            name = br.readLine();
            surname = br.readLine();
            address = br.readLine();
            password = br.readLine();
            age = br.readLine();
            gender = br.readLine();

      
            patient tempPatient = new patient(name, surname, address, id, 
                password, age, gender);
      
            patientRemovals.add(tempPatient);
        }
        
        br.close();
    }
    
        
    public static void readFeedback()throws Exception{
        File file = new File("feedback.txt"); 
  
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        
        String line;
        
        while((line = br.readLine()) != null)
        {
            String comment;
            
            comment = line;
           
            feedback.add(comment);
        }
        
        br.close();
        }
         
    public static void readMessages()throws Exception{
        File file = new File("messages.txt"); 
  
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        
        String line;
        
        while((line = br.readLine()) != null)
        {
            String comment;
            
            comment = line;
            
            messages.add(comment);
        }
        
        br.close();
        }
    
    
    public static void readNotifications()throws Exception{
        File file = new File("notifications.txt"); 
  
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        
        String line;
        
        while((line = br.readLine()) != null)
        {
            notification tempNotif;
            String id, notification;
            
            id = line;
            notification = br.readLine();

            if (id.startsWith("P")){
                for (patient p : patients){
                    if (id.equals(p.getId())){
                        tempNotif = new notification(p, notification);
                        notifications.add(tempNotif);                        
                    }
                }
            }
            else if (id.startsWith("A")){
                for (administrator a : administrators){
                    if (id.equals(a.getId())){
                        tempNotif = new notification(a, notification);
                        notifications.add(tempNotif);                        
                    }
                }
            }
            else if (id.startsWith("D")){
                for (doctor d : doctors){
                    if (id.equals(d.getId())){
                        tempNotif = new notification(d, notification);
                        notifications.add(tempNotif);                        
                    }
                }
            }
            else if (id.startsWith("S")){
                for (secretary s : secretaries){
                    if (id.equals(s.getId())){
                        tempNotif = new notification(s, notification);
                        notifications.add(tempNotif);
                    }
                }
            }
            else if (Integer.parseInt(id) == 0){
                tempNotif = new notification(0, notification);
                notifications.add(tempNotif);
            }
            else if (Integer.parseInt(id) == 1){
                tempNotif = new notification(1, notification);
                notifications.add(tempNotif);
            }
            else if (Integer.parseInt(id) == 2){
                tempNotif = new notification(2, notification);
                notifications.add(tempNotif);
            }
            else if (Integer.parseInt(id) == 3){
                tempNotif = new notification(3, notification);
                notifications.add(tempNotif);
            }
            else{
                tempNotif = new notification(4, notification);
                notifications.add(tempNotif);
            }
        }
        
        br.close();
    }
    
     
    public static void readMedicines()throws Exception{
        File file = new File("medicines.txt"); 
  
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        
        String line;
        
        while((line = br.readLine()) != null)
        {
            String name, dosage;
            int stock;
            
            name = line;
            dosage = br.readLine();
            stock = Integer.parseInt(br.readLine());
            
            medicine tempMedicine = new medicine(name, dosage, stock);
      
            medicines.add(tempMedicine);
        }
        
        br.close();
    }
    
    public static void readAppointments()throws Exception{
        File file = new File("appointments.txt"); 
  
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        
        String line;
        
        while((line = br.readLine()) != null)
        {
            String patientId, doctorId, notes, date, time;
            
            patientId = line;
            doctorId = br.readLine();          
            notes = br.readLine();
            date = br.readLine();
            time = br.readLine();
            
            
            appointment tempAppointment = new appointment(patientId, doctorId, 
                    notes, date, time);
      
            appointments.add(tempAppointment);
        }
        
        br.close();
    }
    
    public static void readPrescriptions()throws Exception{
        File file = new File("prescriptions.txt"); 
  
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        
        String line;
        
        while((line = br.readLine()) != null)
        {
            String patientId, doctorId, medicine, quantity, notes;
            
            patientId = line;
            doctorId = br.readLine();          
            medicine = br.readLine();
            quantity = br.readLine();
            notes = br.readLine();
            
            
            prescription tempPrescription = new prescription(patientId, doctorId, 
                    medicine, quantity, notes);
      
            prescriptions.add(tempPrescription);
        }
        
        br.close();
    }
     
    
    public static void readAppointmentRequests()throws Exception{
        File file = new File("appointment-requests.txt"); 
  
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        
        String line;
        
        while((line = br.readLine()) != null)
        {
            String patientId, doctorId, notes, date, time;
            
            patientId = line;
            doctorId = br.readLine();
            notes = br.readLine();
            date = br.readLine();
            time = br.readLine();

            appointment tempAppointment = new appointment(patientId, doctorId, notes, date, 
                time);
      
            appointmentRequests.add(tempAppointment);
        }
        
        br.close();
    }
    
    // Write to files.
    public static void savePatients()throws Exception{
        File file = new File("patients.txt"); 
  
        BufferedWriter bw = new BufferedWriter(new FileWriter(file)); 
        
        for (patient patient : patients){
            
            bw.write(patient.getId());
            bw.newLine();
            bw.write(patient.getName());
            bw.newLine();
            bw.write(patient.getSurname());
            bw.newLine();
            bw.write(patient.getAddress());
            bw.newLine();
            bw.write(patient.getPassword());
            bw.newLine();
            bw.write(patient.getAge());
            bw.newLine();
            bw.write(patient.getGender());
            bw.newLine();
        }
        
        bw.close();
    }
    
    public static void saveAdministrators()throws Exception{
        File file = new File("administrators.txt"); 
  
        BufferedWriter bw = new BufferedWriter(new FileWriter(file)); 
        
        for (administrator admin : administrators){
            
            bw.write(admin.getId());
            bw.newLine();
            bw.write(admin.getName());
            bw.newLine();
            bw.write(admin.getSurname());
            bw.newLine();
            bw.write(admin.getAddress());
            bw.newLine();
            bw.write(admin.getPassword());
            bw.newLine();
        }
        
        bw.close();
    }
    
    public static void saveDoctors()throws Exception{
        File file = new File("doctors.txt"); 
  
        BufferedWriter bw = new BufferedWriter(new FileWriter(file)); 
        
        for (doctor dr : doctors){
            
            bw.write(dr.getId());
            bw.newLine();
            bw.write(dr.getName());
            bw.newLine();
            bw.write(dr.getSurname());
            bw.newLine();
            bw.write(dr.getAddress());
            bw.newLine();
            bw.write(dr.getPassword());
            bw.newLine();
            bw.write(dr.getRating());
            bw.newLine();
            bw.write(dr.getNumberOfRates());
            bw.newLine();
        }
        
        bw.close();
    }
    
    public static void saveSecretaries()throws Exception{
        File file = new File("secretaries.txt"); 
  
        BufferedWriter bw = new BufferedWriter(new FileWriter(file)); 
        
        for (secretary sec : secretaries){
            
            bw.write(sec.getId());
            bw.newLine();
            bw.write(sec.getName());
            bw.newLine();
            bw.write(sec.getSurname());
            bw.newLine();
            bw.write(sec.getAddress());
            bw.newLine();
            bw.write(sec.getPassword());
            bw.newLine();
        }
        
        bw.close();
    }
    
        
    public static void savePatientRequests()throws Exception{
        File file = new File("patient-requests.txt"); 
  
        BufferedWriter bw = new BufferedWriter(new FileWriter(file)); 
        
        for (patient patient : patientRequests){
            
            bw.write(patient.getId());
            bw.newLine();
            bw.write(patient.getName());
            bw.newLine();
            bw.write(patient.getSurname());
            bw.newLine();
            bw.write(patient.getAddress());
            bw.newLine();
            bw.write(patient.getPassword());
            bw.newLine();
            bw.write(patient.getAge());
            bw.newLine();
            bw.write(patient.getGender());
            bw.newLine();
        }
        
        bw.close();
        }
        
    public static void savePatientRemovals()throws Exception{
        File file = new File("patient-removals.txt"); 
  
        BufferedWriter bw = new BufferedWriter(new FileWriter(file)); 
        
        for (patient patient : patientRemovals){
            
            bw.write(patient.getId());
            bw.newLine();
            bw.write(patient.getName());
            bw.newLine();
            bw.write(patient.getSurname());
            bw.newLine();
            bw.write(patient.getAddress());
            bw.newLine();
            bw.write(patient.getPassword());
            bw.newLine();
            bw.write(patient.getAge());
            bw.newLine();
            bw.write(patient.getGender());
            bw.newLine();
        }
        
        bw.close();
        }
    
        
    public static void saveFeedback(String comment)throws Exception{
        File file = new File("feedback.txt"); 
        
        FileWriter fr = null;
	BufferedWriter br = null;
		try {
			// to append to file, you need to initialize FileWriter using below constructor
			fr = new FileWriter(file, true);
			br = new BufferedWriter(fr);
                        br.newLine();
			// you can use write or append method
			br.write(comment);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
        }
        
    public static void saveMessage(String message)throws Exception{
        File file = new File("messages.txt"); 
        
        FileWriter fr = null;
	BufferedWriter br = null;
		try {
			// to append to file, you need to initialize FileWriter using below constructor
			fr = new FileWriter(file, true);
			br = new BufferedWriter(fr);
                        br.newLine();
			// you can use write or append method
			br.write(message);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
        }
    
        
    public static void saveNotifications()throws Exception{
        File file = new File("notifications.txt"); 
  
        BufferedWriter bw = new BufferedWriter(new FileWriter(file)); 
        
        for (notification notif : notifications){
            
            if (notif.getUser() != null){
                bw.write(notif.getUser().getId());
            }
            else{
                bw.write(Integer.toString(notif.getAllOneType()));
            }
            bw.newLine();
            bw.write(notif.getNotification());
            bw.newLine();
        }
        
        bw.close();
    }
    
        
    public static void saveMedicines()throws Exception{
        File file = new File("medicines.txt"); 
  
        BufferedWriter bw = new BufferedWriter(new FileWriter(file)); 
        
        for (medicine medicine : medicines){
            
            bw.write(medicine.getName());
            bw.newLine();
            bw.write(medicine.getDosage());
            bw.newLine();
            bw.write(Integer.toString(medicine.getStock()));
            bw.newLine();
        }
        
        bw.close();
    }
    
    public static void saveAppointments()throws Exception{
        File file = new File("appointments.txt"); 
  
        BufferedWriter bw = new BufferedWriter(new FileWriter(file)); 
        
        for (appointment appointment : appointments){
            
            bw.write(appointment.getPatient());
            bw.newLine();
            bw.write(appointment.getDoctor());
            bw.newLine();
            bw.write(appointment.getNotes());
            bw.newLine();
            bw.write(appointment.getDate());
            bw.newLine();
            bw.write(appointment.getTime());
            bw.newLine();
        }
        
        bw.close();
    }

    public static void savePrescriptions()throws Exception{
        File file = new File("prescriptions.txt"); 
  
        BufferedWriter bw = new BufferedWriter(new FileWriter(file)); 
        
        for (prescription prescription : prescriptions){
            
            bw.write(prescription.getPatientId());
            bw.newLine();
            bw.write(prescription.getDoctorId());
            bw.newLine();
            bw.write(prescription.getMedicine());
            bw.newLine();
            bw.write(prescription.getQuantity());
            bw.newLine();
            bw.write(prescription.getAppointmentNotes());
            bw.newLine();
        }
        
        bw.close();
    }
    
    
    
    public static void saveAppointmentRequests()throws Exception{
        File file = new File("appointment-requests.txt"); 
  
        BufferedWriter bw = new BufferedWriter(new FileWriter(file)); 
        
        for (appointment appointment : appointmentRequests){
            
            bw.write(appointment.getPatient());
            bw.newLine();
            bw.write(appointment.getDoctor());
            bw.newLine();
            bw.write(appointment.getNotes());
            bw.newLine();
            bw.write(appointment.getDate());
            bw.newLine();
            bw.write(appointment.getTime());
            bw.newLine();
        }
        
        bw.close();
        }
}


