package com.example.summit_power_company_.Mariyum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
    public void ReturnHomeOnActionButton(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("FinanceOfficerDashboard_View.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void CalculateSalaryOnActionButton(ActionEvent actionEvent) {
    }

    @FXML
    public void ProcessPaymentOnActionButton(ActionEvent actionEvent) {
    }
}