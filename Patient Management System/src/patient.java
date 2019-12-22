/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;

/**
 *
 * @author Alex Pritchard
 */
public class patient extends user{

    private int age;
    private String gender;

    public patient(String name, String surname, String address, String id, int age, String gender) {
        super(name, surname, address, id);
        this.age = age;
        this.gender = gender;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
