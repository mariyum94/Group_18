package com.example.summit_power_company_.Mariyum;

import java.io.Serializable;

public class HRManagerModelClass3 implements Serializable {
    private String payroll;
    private String performance;
    private String attendance;

    public String getPayroll() {
        return payroll;
    }

    public void setPayroll(String payroll) {
        this.payroll = payroll;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public HRManagerModelClass3(String payroll, String performance, String attendance) {
        this.payroll = payroll;
        this.performance = performance;
        this.attendance = attendance;

    }

    @Override
    public String toString() {
        return "HRManagerModelClass4{" +
                "payroll='" + payroll + '\'' +
                ", performance='" + performance + '\'' +
                ", attendance='" + attendance + '\'' +
                '}';
    }
}
