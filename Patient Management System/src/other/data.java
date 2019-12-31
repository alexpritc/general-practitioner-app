package other;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*; 
import java.util.*;

import accounts.*;

/**
 *
 * @author Alex Pritchard
 */
public class data {
    
    public static List<patient> patients = new ArrayList<>();
    public static List<administrator> administrators = new ArrayList<>();
    public static List<doctor> doctors = new ArrayList<>();
    public static List<secretary> secretaries = new ArrayList<>();
    
    public static List<patient> patientRequests = new ArrayList<>();
    public static List<patient> patientRemovals = new ArrayList<>();
    
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
  
//        BufferedWriter bw = new BufferedWriter(new FileWriter(file)); 
//        
//        bw.write(comment);
//        bw.newLine();
//        
//        bw.close();
        
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
}


