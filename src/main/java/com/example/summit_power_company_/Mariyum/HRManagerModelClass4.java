package com.example.summit_power_company_.Mariyum;

import java.io.Serializable;

//this model class for file handaling
public class HRManagerModelClass4 implements Serializable {
    private String employeeName;
    private String complaintType;
    private String status;
    private String date;

    public HRManagerModelClass4(String employeeName, String complaintType, String status, String date) {
        this.employeeName = employeeName;
        this.complaintType = complaintType;
        this.status = status;
        this.date = date;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getComplaintType() {
        return complaintType;
    }

    public void setComplaintType(String complaintType) {
        this.complaintType = complaintType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "HRManagerModelClass4{" +
                "employeeName='" + employeeName + '\'' +
                ", complaintType='" + complaintType + '\'' +
                ", status='" + status + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}