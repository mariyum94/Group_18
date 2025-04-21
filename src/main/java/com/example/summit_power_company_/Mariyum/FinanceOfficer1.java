package com.example.summit_power_company_.Mariyum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import java.io.IOException;

public class FinanceOfficer1 {

    @FXML
    private TextField CustomeridTextfield;

    @FXML
    private TextField previousduesTextField;

    @FXML
    private TextField totalunitsconsumedTextField;

    @FXML
    void FetchUsageOnActionButton(ActionEvent event) {
        String customerId = CustomeridTextfield.getText();
        //  data fetch
        if (!customerId.isEmpty()) {
            previousduesTextField.setText("150.50");
            totalunitsconsumedTextField.setText("120");
            showAlert("Usage Fetched", "Fetched usage for Customer ID: " + customerId);
        } else {
            showAlert("Error", "Please enter a Customer ID.");
        }
    }


    @FXML
    void GenerateBilltOnActionButton(ActionEvent event) {
        try {
            double dues = Double.parseDouble(previousduesTextField.getText());
            int units = Integer.parseInt(totalunitsconsumedTextField.getText());
            double unitRate = 10.0;
            double total = dues + (units * unitRate);
            showAlert("Bill Generated", "Total Bill: " + total);
        } catch (NumberFormatException e) {
            showAlert("Error", "Please enter valid numbers for dues and units.");
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

    @FXML
    public void SavePdfOnActionButton(ActionEvent actionEvent) {
    }
}
