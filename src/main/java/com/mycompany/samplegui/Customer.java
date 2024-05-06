
package com.mycompany.samplegui;

import java.util.Objects;

/**
 *
 * @author utentepc
 */
public class Customer {

    private String firstName;
    private String lastName;
    private int birthYear;

    public Customer(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return " firstName = " + firstName + "\n lastName = " 
                + lastName + "\n born in = " + birthYear;
    }

    
    
    
    
}
