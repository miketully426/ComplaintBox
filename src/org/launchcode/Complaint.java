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
        complaintCount++;
        this.id = complaintCount;
        this.complainant = complainant;
        this.complaintTitle = complaintTitle;
        this.complaintText = complaintText;
        this.closed = false;
    }

    public Complainant getComplainant() {
        return complainant;
    }

    public void setComplainant(Complainant complainant) {
        this.complainant = complainant;
    }

    public String getComplaintTitle() {
        return complaintTitle;
    }

    public void setComplaintTitle(String complaintTitle) {
        this.complaintTitle = complaintTitle;
    }

    public String getComplaintText() {
        return complaintText;
    }

    public void setComplaintText(String complaintText) {
        this.complaintText = complaintText;
    }
    
    private String checkStatus(){
        return closed ? "Yes" : "No";
    }

    //TODO Create the toString method
    @Override
    public String toString(){
        return "";
    }


}
