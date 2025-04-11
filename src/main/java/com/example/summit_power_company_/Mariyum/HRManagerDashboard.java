package com.example.summit_power_company_.Mariyum;

import javafx.event.ActionEvent;

import java.io.IOException;

public class HRManagerDashboard {

    @javafx.fxml.FXML
    void ApproveorDenyLeaveRequestsOnActionButton(ActionEvent event) {
    }

    @javafx.fxml.FXML
    void EvaluatePerformanceOnActionButton(ActionEvent event) {

    }

    @javafx.fxml.FXML
    void GeneratingEmployeeReportsOnActionButton(ActionEvent event) {

    }

    @javafx.fxml.FXML
    void HandleEmployeeComplaintsOnActionButton(ActionEvent event) {

    }

    @javafx.fxml.FXML
    void ManageAttendanceOnActionButton(ActionEvent event) {

    }

    @javafx.fxml.FXML
    void ProcessPromotionsTransfersOnActionButton(ActionEvent event) {

    }

    @javafx.fxml.FXML
    void ScheduleTrainingProgramsOnActionButton(ActionEvent event) {

    }

    @javafx.fxml.FXML
    public void RegisterNewEmployeesOnActionButton(ActionEvent actionEvent)  throws IOException {
        SceneSwitcher.switchTo("FinanceOfficer6_View.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void LogOutOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Login.fxml", actionEvent);
    }
}

