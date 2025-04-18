package com.example.summit_power_company_.Mariyum;

import javafx.event.ActionEvent;

import java.io.IOException;

public class HRManagerDashboard {


    @javafx.fxml.FXML
    public void RegisterNewEmployeesOnActionButton(ActionEvent actionEvent)  throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/Mariyum/HRManager1_View.fxml", actionEvent);
    }
    @javafx.fxml.FXML
    void ManageAttendanceOnActionButton(ActionEvent actionEvent)  throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/Mariyum/HRManager2_View.fxml", actionEvent);
    }
    @javafx.fxml.FXML
    void ApproveorDenyLeaveRequestsOnActionButton(ActionEvent actionEvent)  throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/Mariyum/HRManager3_View.fxml", actionEvent);
    }
    @javafx.fxml.FXML
    void EvaluatePerformanceOnActionButton(ActionEvent actionEvent)  throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/Mariyum/HRManager4_View.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    void ScheduleTrainingProgramsOnActionButton(ActionEvent actionEvent)  throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/Mariyum/HRManager5_View.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    void ProcessPromotionsTransfersOnActionButton(ActionEvent actionEvent)  throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/Mariyum/HRManager6_View.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    void HandleEmployeeComplaintsOnActionButton(ActionEvent actionEvent)  throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/Mariyum/HRManager7_View.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    void GeneratingEmployeeReportsOnActionButton(ActionEvent actionEvent)  throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/Mariyum/HRManager8_View.fxml", actionEvent);
    }
    @javafx.fxml.FXML
    public void LogOutOnActionButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/com/example/summit_power_company_/login.fxml", actionEvent);
    }
}


