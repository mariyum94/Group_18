package com.example.summit_power_company_.Mariyum;

import java.io.Serializable;

public class HRManagerModelClass2 implements Serializable {

    private String employee;
    private String leave;
    private String status;
    private String employeeName;
    private String performanceRating;

    public HRManagerModelClass2(String employee, String leave, String status, String employeeName, String performanceRating) {
        this.employee = employee;
        this.leave = leave;
        this.status = status;
        this.employeeName = employeeName;
        this.performanceRating = performanceRating;
    }

    public HRManagerModelClass2(String ali, String sickLeave, String pending) {
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getLeave() {
        return leave;
    }

    public void setLeave(String leave) {
        this.leave = leave;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getPerformanceRating() {
        return performanceRating;
    }

    public void setPerformanceRating(String performanceRating) {
        this.performanceRating = performanceRating;
    }

    @Override
    public String toString() {
        return "HRManagerModelClass2{" +
                "employee='" + employee + '\'' +
                ", leave='" + leave + '\'' +
                ", status='" + status + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", performanceRating='" + performanceRating + '\'' +
                '}';
    }
}

