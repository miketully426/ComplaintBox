package org.launchcode;

public class Complaintant {

    private String name;
    private String phoneNumber;

    public Complaintant (String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return this.name;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }
}
