package com.example.summit_power_company_.Mariyum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class FinanceOfficer3 {

    @FXML
    private TextField FinalSalaryTextField;
    @FXML
    private TextField BonusesTextField;
    @FXML
    private TextField deductionTextField;
    @FXML
    private ComboBox selectemployeeComboBox;


    @FXML
    public void initialize() {
        selectemployeeComboBox.getItems().addAll("Basic Salary", "Overtime Data");

    }

    @FXML
    public void ReturnHomeOnActionButton(ActionEvent actionEvent) {
    }

    @FXML
    public void CalculateSalaryOnActionButton(ActionEvent actionEvent) {
    }

    @FXML
    public void ProcessPaymentOnActionButton(ActionEvent actionEvent) {
    }
}