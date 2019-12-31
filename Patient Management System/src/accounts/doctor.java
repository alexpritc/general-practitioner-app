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
public class doctor extends user{
    
    private String rating;
    private String numberOfRates;
    
    public doctor(String name, String surname, String address, String id, 
            String password, String rating, String numberOfRates){
        super(name, surname, address, id, password);
        
        this.rating = rating;
        this.numberOfRates = numberOfRates;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getNumberOfRates() {
        return numberOfRates;
    }

    public void setNumberOfRates(String numberOfRates) {
        this.numberOfRates = numberOfRates;
    }
    
    
}
