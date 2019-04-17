package org.launchcode;

import java.time.LocalDate;

public class Complaint {

    private static int complaintCount;
    private int id;
    private Complainant complainant;
    private String complaintTitle;
    private String complaintText;
    private boolean closed;

    public Complaint (Complainant complainant, String complaintTitle, String complaintText) {
        this.id = complaintCount;
        this.complainant = complainant;
        this.complaintTitle = complaintTitle;
        this.complaintText = complaintText;
        this.closed = false;
    }

    private String checkStatus(){
        return closed ? "Yes" : "No";
    }

    @Override
    public String toString(){
        return "Complainant: " + this.complainant.getName()+"\n"+
        "Contact Number: " + this.complainant.getPhoneNumber() + "\n" +
        this.complaintTitle + "\n" +
        "Complaint: " + this.complaintText +"\n"+
                "Closed: " + checkStatus();
    }


}
