package com.example.summit_power_company_.Mariyum;

import java.io.Serializable;

public class FinanceOfficerModelClass4 implements Serializable {
    private String date;
    private double amount;
    private String category;
    private double budget;

    public FinanceOfficerModelClass4(String date, double amount, String category, double budget) {
        this.date = date;
        this.amount = amount;
        this.category = category;
        this.budget = budget;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "FinanceOfficerModelClass7{" +
                "date='" + date + '\'' +
                ", amount=" + amount +
                ", category='" + category + '\'' +
                ", budget=" + budget +
                '}';
    }
}
