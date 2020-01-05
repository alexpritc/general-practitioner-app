package accounts;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex Pritchard
 */
public class patient extends user{
    
    // Declaring variables.
    private String age;
    private String gender;

    // Constructor.
    public patient(String name, String surname, String address, String id, String password, String age, String gender) {
        super(name, surname, address, id, password);
        this.age = age;
        this.gender = gender;
    }
    
    // Getters and setters.
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
