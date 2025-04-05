package com.example.summit_power_company_.Mariyum;

import java.io.Serializable;

public class FinanceOfficerModelClass5 implements Serializable {
    private String customerName;
    private String invoiceId;
    private String dueDate;
    private double amount;
    private String status;

    public FinanceOfficerModelClass5(String customerName, String invoiceId, String dueDate, double amount, String status) {
        this.customerName = customerName;
        this.invoiceId = invoiceId;
        this.dueDate = dueDate;
        this.amount = amount;
        this.status = status;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "FinanceOfficerModelClass8{" +
                "customerName='" + customerName + '\'' +
                ", invoiceId='" + invoiceId + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                '}';
    }
}
