package com.example.summit_power_company_.Mariyum;

import java.io.Serializable;
import java.time.LocalDate;

public class FinanceOfficerModelClass2 implements Serializable {
    private LocalDate date;
    private double expenseAmount;
    private String category;

    public FinanceOfficerModelClass2(LocalDate date, double expenseAmount, String category) {
        this.date = date;
        this.expenseAmount = expenseAmount;
        this.category = category;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(double expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "FinanceOfficerModelClass2{" +
                "date=" + date +
                ", expenseAmount=" + expenseAmount +
                ", category='" + category + '\'' +
                '}';
    }
}