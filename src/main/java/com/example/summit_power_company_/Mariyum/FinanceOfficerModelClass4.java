package com.example.summit_power_company_.Mariyum;

import java.io.Serializable;

public class FinanceOfficerModelClass4 implements Serializable {
    private String customer;
    private String invoiceId;
    private double amount;
    private int dueDate;
    private String status;

    public FinanceOfficerModelClass4(String customer, String invoiceId, double amount, int dueDate, String status) {
        this.customer = customer;
        this.invoiceId = invoiceId;
        this.amount = amount;
        this.dueDate = dueDate;
        this.status = status;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getDueDate() {
        return dueDate;
    }

    public void setDueDate(int dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "FinanceOfficerModelClass4{" +
                "customer='" + customer + '\'' +
                ", invoiceId='" + invoiceId + '\'' +
                ", amount=" + amount +
                ", dueDate=" + dueDate +
                ", status='" + status + '\'' +
                '}';
    }
}