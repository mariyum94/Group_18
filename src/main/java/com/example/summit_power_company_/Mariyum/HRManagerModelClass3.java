package com.example.summit_power_company_.Mariyum;

import java.io.Serializable;

public class HRManagerModelClass3 implements Serializable {
    private Integer payroll;
    private String performance;
    private Integer attendance;

    public HRManagerModelClass3(Integer payroll, String performance, Integer attendance) {
        this.payroll = payroll;
        this.performance = performance;
        this.attendance = attendance;
    }

    public Integer getPayroll() {
        return payroll;
    }

    public void setPayroll(Integer payroll) {
        this.payroll = payroll;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    public Integer getAttendance() {
        return attendance;
    }

    public void setAttendance(Integer attendance) {
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "HRManagerModelClass3{" +
                "payroll=" + payroll +
                ", performance='" + performance + '\'' +
                ", attendance=" + attendance +
                '}';
    }
}