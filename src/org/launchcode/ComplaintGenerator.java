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

    //TODO Get the complainant info from the user
    private Complainant createComplainant(){
        return new Complainant("", "");
    }

    //TODO Change this to store each value in the correct field as it is entered
    public Complaint createComplaint(Complainant complainant){
        System.out.println("How would you like to title your complaint?");
        String title = keyboard.nextLine();
        System.out.println("What is your complaint?");
        String complaintText = keyboard.nextLine();
        return new Complaint(complainant, title, complaintText);
    }
}
