package com.example.summit_power_company_.Mariyum;

import java.io.Serializable;
import java.time.LocalDate;

public class Report implements Serializable {
    private int reportId;
    private String reportType;
    private LocalDate generatedDate;

    public Report(int reportId, String reportType, LocalDate generatedDate) {
        this.reportId = reportId;
        this.reportType = reportType;
        this.generatedDate = generatedDate;
    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public LocalDate getGeneratedDate() {
        return generatedDate;
    }

    public void setGeneratedDate(LocalDate generatedDate) {
        this.generatedDate = generatedDate;
    }

    @Override
    public String toString() {
        return "Report{" +
                "reportId=" + reportId +
                ", reportType='" + reportType + '\'' +
                ", generatedDate=" + generatedDate +
                '}';
    }
}
