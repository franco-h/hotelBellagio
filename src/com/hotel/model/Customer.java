package com.hotel.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Customer {
//    public static final Customer instance = new Customer();
    private static final String nameRegexPattern = "^[a-zA-Z0-9]+S";
    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;
//    private Email email;
//    private Phone phoneNumber;

    public Customer(String firstName, String lastName, String email, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

//    private Customer() {
//    }
//
//    public static Customer getInstance(){
//        return instance;
//    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws Exception {
       if (!firstName.matches(nameRegexPattern)){
           throw new Exception("First name has to be alpha numeric");
       }else{
           this.firstName = firstName;
       }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws Exception {
        if (!lastName.matches(nameRegexPattern)){
            throw new Exception("First name has to be alpha numeric");
        }else{
            this.lastName = lastName;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String checkEmail(){
        return getEmail();
    }

    @Override //verify if == is best practice here. Records created Class
    public boolean equals(Object obj) {
        if (obj instanceof Customer) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Customer) obj;
        return this.firstName.equals(that.firstName) &&
                this.lastName.equals(that.lastName) &&
                this.email.equals(that.email) &&
                this.phoneNumber == that.phoneNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, phoneNumber);
    }

    @Override
    public String toString() {
        return "Customer[" +
                "firstName=" + firstName + ", " +
                "lastName=" + lastName + ", " +
                "email=" + email + ", " +
                "phoneNumber=" + phoneNumber + ']';
    }
}