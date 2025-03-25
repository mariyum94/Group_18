package com.example.summit_power_company_.Mariyum;

public class Complaint {
    private int complaintId;
    private String type;
    private String details;

    public Complaint(int complaintId, String type, String details) {
        this.complaintId = complaintId;
        this.type = type;
        this.details = details;
    }

    public int getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(int complaintId) {
        this.complaintId = complaintId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Complaint{" +
                "complaintId=" + complaintId +
                ", type='" + type + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
