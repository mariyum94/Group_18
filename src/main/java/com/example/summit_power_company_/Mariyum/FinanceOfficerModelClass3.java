package com.example.summit_power_company_.Mariyum;

import java.io.Serializable;
import java.time.LocalDate;

public class FinanceOfficerModelClass3 implements Serializable {
    private LocalDate date;
    private int amount;
    private String category;
    private double budget;

    public FinanceOfficerModelClass3(LocalDate date, int amount, String category, double budget) {
        this.date = date;
        this.amount = amount;
        this.category = category;
        this.budget = budget;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
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
        return "FinanceOfficerModelClass3{" +
                "date=" + date +
                ", amount=" + amount +
                ", category='" + category + '\'' +
                ", budget=" + budget +
                '}';
    }
}