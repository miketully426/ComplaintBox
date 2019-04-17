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
        Complainant complainant = new Complainant();
        System.out.println("Who are you?");
        complainant.setName(keyboard.nextLine());
        System.out.println("What phone number can we get back to you at?");
        complainant.setPhoneNumber(keyboard.nextLine());
        return complainant;
    }

    public Complaint createComplaint(Complainant complainant){
        Complaint complaint = new Complaint();
        complaint.setComplainant(complainant);
        System.out.println("How would you like to title your complaint?");
        complaint.setComplaintTitle(keyboard.nextLine());
        System.out.println("What is your complaint?");
        complaint.setComplaintText(keyboard.nextLine());
        return complaint;
    }
}
