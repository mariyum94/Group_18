package com.example.summit_power_company_.Mariyum;

import java.io.Serializable;

public class Budget implements Serializable  {
    private int budgetId;
    private String department;
    private double allocatedAmount;

    public Budget(int budgetId, String department, double allocatedAmount) {
        this.budgetId = budgetId;
        this.department = department;
        this.allocatedAmount = allocatedAmount;
    }

    public int getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(int budgetId) {
        this.budgetId = budgetId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getAllocatedAmount() {
        return allocatedAmount;
    }

    public void setAllocatedAmount(double allocatedAmount) {
        this.allocatedAmount = allocatedAmount;
    }

    @Override
    public String toString() {
        return "Budget{" +
                "budgetId=" + budgetId +
                ", department='" + department + '\'' +
                ", allocatedAmount=" + allocatedAmount +
                '}';
    }
}
