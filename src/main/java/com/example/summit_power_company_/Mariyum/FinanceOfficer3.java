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

public class FinanceOfficer3 {

    @FXML
    private TextField FinalSalaryTextField;
    @FXML
    private TextField BonusesTextField;
    @FXML
    private TextField deductionTextField;
    @FXML
    private ComboBox<String> selectemployeeComboBox;


    @FXML
    public void initialize() {
        selectemployeeComboBox.getItems().addAll("Basic Salary", "Overtime Data");

    }

    @FXML
    void ReturnHomeOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("FinanceOfficerDashboard_View.fxml", actionEvent);
    }

    @FXML
    public void CalculateSalaryOnActionButton(ActionEvent actionEvent) {
        try {
            double bonus = Double.parseDouble(BonusesTextField.getText());
            double deduction = Double.parseDouble(deductionTextField.getText());

            double baseSalary;

            // Simulated selection logic
            String selected = selectemployeeComboBox.getValue();
            if ("Basic Salary".equals(selected)) {
                baseSalary = 30000;  // Example base salary
            } else if ("Overtime Data".equals(selected)) {
                baseSalary = 30000 + 5000;  // Example with overtime
            } else {
                showAlert("Selection Error", "Please select a valid employee option.");
                return;
            }

            double finalSalary = baseSalary + bonus - deduction;
            FinalSalaryTextField.setText(String.valueOf(finalSalary));

        } catch (NumberFormatException e) {
            showAlert("Input Error", "Please enter valid numbers .");
        }
    }
    @FXML
    public void ProcessPaymentOnActionButton(ActionEvent actionEvent) {
        String finalSalary = FinalSalaryTextField.getText();
        if (finalSalary.isEmpty()) {
            showAlert("Error", "Please calculate salary before processing payment.");
        } else {
            // Simulate payment processing
            showAlert("Success", "Salary of BDT " + finalSalary + " processed successfully.");
        }
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.show();
    }
}