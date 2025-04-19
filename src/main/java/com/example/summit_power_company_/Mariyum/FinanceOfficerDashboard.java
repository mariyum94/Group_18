package com.example.summit_power_company_.Mariyum;

import javafx.event.ActionEvent;

import java.io.IOException;

public class FinanceOfficerDashboard {

    @javafx.fxml.FXML
    public void GenerateElectricityBillsOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/Mariyum/FinanceOfficer1_View.fxml", actionEvent);
    }
    @javafx.fxml.FXML
    public void ProcessPaymentsOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/Mariyum/FinanceOfficer2_View.fxml", actionEvent);
    }
    @javafx.fxml.FXML
    public void ManagePayrollOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/Mariyum/FinanceOfficer3_View.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void ExportFinancialDataOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/Mariyum/FinanceOfficer4_View.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void AllocateBudgetOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/Mariyum/FinanceOfficer5_View.fxml", actionEvent);
    }
    @javafx.fxml.FXML
    public void TrackExpensesOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/Mariyum/FinanceOfficer6_View.fxml", actionEvent);
    }
    @javafx.fxml.FXML
    public void ViewFinancialReportsOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/Mariyum/FinanceOfficer7_View.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void HandleLatePaymentsOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/Mariyum/FinanceOfficer8_View.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void LogOutOnActionButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/com/example/summit_power_company_/Login.fxml", actionEvent);
    }
}
