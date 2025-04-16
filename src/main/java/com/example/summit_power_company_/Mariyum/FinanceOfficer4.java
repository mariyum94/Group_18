package com.example.summit_power_company_.Mariyum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class FinanceOfficer4 {

    @FXML
    private TextField ProfitorlossTextField;

    @FXML
    private ComboBox<String> reportTypeComboBox;

    @FXML
    private TextField ExpensesTextField;

    @FXML
    private TextField RevenueTextField;

    @FXML
    public void initialize() {
        reportTypeComboBox.getItems().addAll("Monthly", "Annual");
    }

    @FXML
    public void viewReportOnActionButton(ActionEvent actionEvent) {
        try {
            double revenue = Double.parseDouble(RevenueTextField.getText());
            double expenses = Double.parseDouble(ExpensesTextField.getText());
            double result = revenue - expenses;

            ProfitorlossTextField.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            showAlert("Error", "Invalid input in revenue or expenses.");
        }
    }
    @FXML
    public void exportPdfOnActionButton(ActionEvent actionEvent) {
        String profitLoss = ProfitorlossTextField.getText();
        if (profitLoss.isEmpty()) {
            showAlert("Export Error", "Please generate the report first.");
        } else {
            // Simulate export
            System.out.println("Exporting report to PDF...");
            showAlert("Export", "Report exported as PDF (simulated).");
        }
    }

    @FXML
    void ReturnHomeOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("FinanceOfficerDashboard_View.fxml", actionEvent);
    }
    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.show();
    }
}
