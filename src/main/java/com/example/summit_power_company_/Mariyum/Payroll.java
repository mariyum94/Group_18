package com.example.summit_power_company_.Mariyum;

import java.io.Serializable;

public class Payroll implements Serializable {
    private int payrollId;
    private double basicSalary;
    private double bonus;
    private double deductions;

    public Payroll(int payrollId, double basicSalary, double bonus, double deductions) {
        this.payrollId = payrollId;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.deductions = deductions;
    }

    public int getPayrollId() {
        return payrollId;
    }

    public void setPayrollId(int payrollId) {
        this.payrollId = payrollId;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    @Override
    public String toString() {
        return "Payroll{" +
                "payrollId=" + payrollId +
                ", basicSalary=" + basicSalary +
                ", bonus=" + bonus +
                ", deductions=" + deductions +
                '}';
    }
}
