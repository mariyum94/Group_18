package com.example.summit_power_company_.Mariyum;

import java.io.Serializable;

public class FinanceOfficerModelClass4 implements Serializable {
    private String reportType; // "Monthly" or "Annual"
    private double revenue;
    private double expenses;

    public FinanceOfficerModelClass4(String reportType, double revenue, double expenses) {
        this.reportType = reportType;
        this.revenue = revenue;
        this.expenses = expenses;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    @Override
    public String toString() {
        return "FinanceOfficerModelClass4{" +
                "reportType='" + reportType + '\'' +
                ", revenue=" + revenue +
                ", expenses=" + expenses +
                '}';
    }
}

