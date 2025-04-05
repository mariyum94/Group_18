package com.example.summit_power_company_.Mariyum;

import java.io.Serializable;

public class FinanceOfficerModelClass2 implements Serializable {
    private String departmentName;
    private String allocationAmount;

    public FinanceOfficerModelClass2(String departmentName, String allocationAmount) {
        this.departmentName = departmentName;
        this.allocationAmount = allocationAmount;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getAllocationAmount() {
        return allocationAmount;
    }

    public void setAllocationAmount(String allocationAmount) {
        this.allocationAmount = allocationAmount;
    }

    @Override
    public String toString() {
        return "FinanceOfficerModelClass5{" +
                "departmentName='" + departmentName + '\'' +
                ", allocationAmount='" + allocationAmount + '\'' +
                '}';
    }
}