package org.launchcode;

import java.time.LocalDate;

public class Complaint {

    private static int complaintCount;
    private int id;
    private Complaintant complaintant;
    private LocalDate date;
    private String complaintTitle;
    private String complaintText;

    public Complaint (Complaintant complaintant, String complaintTitle, String complaintText) {
        this.id = complaintCount;
        this.complaintant = complaintant;
        this.date = LocalDate.now();
        this.complaintTitle = complaintTitle;
        this.complaintText = complaintText;
    }


}
