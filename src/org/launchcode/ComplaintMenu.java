package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;

public class ComplaintMenu {

    private ArrayList<Complaint> complaintLog;

    public ComplaintMenu(){
        this.complaintLog = new ArrayList();
    }

    public void run(){
        welcome();

        int selection;
        Scanner keyboard = new Scanner(System.in);
        do{
            System.out.println("What would you like to do today?");
            System.out.println("1. Make a new complaint");
            System.out.println("2. Check an existing complaint");
            System.out.println("0. Quit");
            selection = keyboard.nextInt();
            keyboard.skip("\n");
            if(selection != 0){
                processSelection(selection);
            }
        }while(selection != 0);

        System.out.println("We appreciate your feedback! Someone will (probably not) be in touch!");
    }

    private void welcome() {
        System.out.println("Hello! Welcome to the Complaints Department!");
    }

    //TODO Add new complaints to the log
    private void processSelection(int selection) {
        switch (selection){
            case 1:
                ComplaintGenerator complaintGenerator = new ComplaintGenerator();
                Complaint complaint = complaintGenerator.generateComplaint();
                break;
            case 2:
                viewComplaints();
                break;
        }
    }

    private void viewComplaints(){
        for(Complaint complaint : complaintLog){
            System.out.println("------------------------------------------");
            System.out.println(complaint.toString());
        }
        System.out.println("------------------------------------------");
        System.out.println("");
    }


}
