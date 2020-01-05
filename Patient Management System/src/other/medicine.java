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
public class medicine {
    
    // Declaring variables.
    private String name;
    private String dosage;
    private int stock;

    // Constructors.
    public medicine(){};
    
    public medicine(String name, String dosage, int stock) {
        this.name = name;
        this.dosage = dosage;
        this.stock = stock;
    }

    // Getters and setters.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    } 
}
