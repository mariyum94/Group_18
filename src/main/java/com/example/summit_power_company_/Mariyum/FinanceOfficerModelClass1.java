package com.example.summit_power_company_.Mariyum;

import java.io.Serializable;

public class FinanceOfficerModelClass1 implements Serializable {
    private String departmentName;
    private double allocationAmount;
    private String customerId;
    private double previousDues;
    private int totalUnits;
    private double totalBill;

    public FinanceOfficerModelClass1(String departmentName, double allocationAmount, String customerId, double previousDues, int totalUnits, double totalBill) {
        this.departmentName = departmentName;
        this.allocationAmount = allocationAmount;
        this.customerId = customerId;
        this.previousDues = previousDues;
        this.totalUnits = totalUnits;
        this.totalBill = totalBill;
    }

    public FinanceOfficerModelClass1(String departmentName, double allocationAmount) {
    }

    public FinanceOfficerModelClass1(String department, String amount) {
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public double getAllocationAmount() {
        return allocationAmount;
    }

    public void setAllocationAmount(double allocationAmount) {
        this.allocationAmount = allocationAmount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public double getPreviousDues() {
        return previousDues;
    }

    public void setPreviousDues(double previousDues) {
        this.previousDues = previousDues;
    }

    public int getTotalUnits() {
        return totalUnits;
    }

    public void setTotalUnits(int totalUnits) {
        this.totalUnits = totalUnits;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }

    @Override
    public String toString() {
        return "FinanceOfficerModelClass1{" +
                "departmentName='" + departmentName + '\'' +
                ", allocationAmount=" + allocationAmount +
                ", customerId='" + customerId + '\'' +
                ", previousDues=" + previousDues +
                ", totalUnits=" + totalUnits +
                ", totalBill=" + totalBill +
                '}';
    }
}