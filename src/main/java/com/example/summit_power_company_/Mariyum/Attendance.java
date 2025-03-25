package com.example.summit_power_company_.Mariyum;

import java.time.LocalDate;

public class Attendance {
    private int recordId;
    private LocalDate date;
    private String status;

    public Attendance(int recordId, LocalDate date, String status) {
        this.recordId = recordId;
        this.date = date;
        this.status = status;
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "recordId=" + recordId +
                ", date=" + date +
                ", status='" + status + '\'' +
                '}';
    }
}
