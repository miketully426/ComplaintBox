package org.launchcode;

import java.util.Scanner;

public class ComplaintGenerator {

    private Scanner keyboard;

    public ComplaintGenerator(){
        this.keyboard = new Scanner(System.in);
    }

    public Complaint generateComplaint(){
        Complainant complainant = createComplainant();
        String validate;
        Complaint newComplaint;
        do{
            newComplaint = createComplaint(complainant);
            System.out.println("\n" + newComplaint.toString() + "\n");
            System.out.println("Is this correct? (Enter \"y\" for yes)");
            validate = keyboard.nextLine();
        }while(!validate.toLowerCase().equals("y"));
        return newComplaint;
    }

    private Complainant createComplainant(){
        System.out.println("Who are you?");
        String name = keyboard.nextLine();
        System.out.println("What phone number can we get back to you at?");
        String phoneNumber = keyboard.nextLine();
        return new Complainant(name, phoneNumber);
    }

    public Complaint createComplaint(Complainant complainant){
        System.out.println("How would you like to title your complaint?");
        String title = keyboard.nextLine();
        System.out.println("What is your complaint?");
        String complaintText = keyboard.nextLine();
        return new Complaint(complainant, title, complaintText);
    }
}
