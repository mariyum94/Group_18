package com.example.summit_power_company_.Mariyum;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class HRManagerModelClass3 implements Serializable {
    private String trainingType;
    private LocalDate trainingDate;
    private List<String> assignedEmployees;

    public HRManagerModelClass3(String trainingType, LocalDate trainingDate, List<String> assignedEmployees) {
        this.trainingType = trainingType;
        this.trainingDate = trainingDate;
        this.assignedEmployees = assignedEmployees;
    }

    public String getTrainingType() {
        return trainingType;
    }

    public void setTrainingType(String trainingType) {
        this.trainingType = trainingType;
    }

    public LocalDate getTrainingDate() {
        return trainingDate;
    }

    public void setTrainingDate(LocalDate trainingDate) {
        this.trainingDate = trainingDate;
    }

    public List<String> getAssignedEmployees() {
        return assignedEmployees;
    }

    public void setAssignedEmployees(List<String> assignedEmployees) {
        this.assignedEmployees = assignedEmployees;
    }

    @Override
    public String toString() {
        return "HRManagerModelClass3{" +
                "trainingType='" + trainingType + '\'' +
                ", trainingDate=" + trainingDate +
                ", assignedEmployees=" + assignedEmployees +
                '}';
    }
}
