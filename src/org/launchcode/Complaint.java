package org.launchcode;

import java.time.LocalDate;

public class Complaint {

    private static int complaintCount = 1;
    private int id;
    private Complainant complainant;
    private String complaintTitle;
    private String complaintText;
    private boolean closed;

    public Complaint() {
        this.complaintCount++;
        this.id = complaintCount;
        this.closed = false;
    }

    public Complaint(Complainant complainant, String complaintTitle, String complaintText) {
        this.complaintCount++;
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

    private String checkStatus() {
        return closed ? "Yes" : "No";
    }

    @Override
    public String toString() {
        return "Complaint ID: " + this.id + "\n" +
                "Complainant: " + this.complainant.getName() + "\n" +
                "Contact Number: " + this.complainant.getPhoneNumber() + "\n" +
                this.complaintTitle + "\n" +
                "Complaint: " + this.complaintText + "\n" +
                "Closed: " + checkStatus();
    }


}
