package com.example.summit_power_company_.Mariyum;

import java.io.Serializable;

public class HRManagerModelClass4 implements Serializable {
    private String employeeId;
    private String name;
    private String currentRole;
    private String newRole;
    private String complaintType;
    private String complaintStatus;

    public HRManagerModelClass4(String employeeId, String name, String currentRole, String newRole, String complaintType, String complaintStatus) {
        this.employeeId = employeeId;
        this.name = name;
        this.currentRole = currentRole;
        this.newRole = newRole;
        this.complaintType = complaintType;
        this.complaintStatus = complaintStatus;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrentRole() {
        return currentRole;
    }

    public void setCurrentRole(String currentRole) {
        this.currentRole = currentRole;
    }

    public String getNewRole() {
        return newRole;
    }

    public void setNewRole(String newRole) {
        this.newRole = newRole;
    }

    public String getComplaintType() {
        return complaintType;
    }

    public void setComplaintType(String complaintType) {
        this.complaintType = complaintType;
    }

    public String getComplaintStatus() {
        return complaintStatus;
    }

    public void setComplaintStatus(String complaintStatus) {
        this.complaintStatus = complaintStatus;
    }

    @Override
    public String toString() {
        return "HRManagerModelClass4{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", currentRole='" + currentRole + '\'' +
                ", newRole='" + newRole + '\'' +
                ", complaintType='" + complaintType + '\'' +
                ", complaintStatus='" + complaintStatus + '\'' +
                '}';
    }
}
