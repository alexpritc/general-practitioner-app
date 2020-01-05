/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package accounts;

/**
 *
 * @author Alex Pritchard
 */
public class user {
    
    // Declaring variables.
    private String name;
    private String surname;
    private String address;
    private String id;
    private String password;
    
    // Constructor.
    public user(String name, String surname, String address, String id, String password) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.id = id;
        this.password = password;
    }

    // Getters and setters.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
