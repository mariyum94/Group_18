package com.example.summit_power_company_.Mariyum;

import java.io.Serializable;
import java.time.LocalDate;

public class TrainingProgram implements Serializable {
    private int trainingId;
    private String topic;
    private LocalDate date;

    public TrainingProgram(int trainingId, String topic, LocalDate date) {
        this.trainingId = trainingId;
        this.topic = topic;
        this.date = date;
    }

    public int getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(int trainingId) {
        this.trainingId = trainingId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "TrainingProgram{" +
                "trainingId=" + trainingId +
                ", topic='" + topic + '\'' +
                ", date=" + date +
                '}';
    }
}
