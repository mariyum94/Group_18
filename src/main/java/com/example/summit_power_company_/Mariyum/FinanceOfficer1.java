package com.example.summit_power_company_.Mariyum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

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

    @FXML
    void SavePrintOnActionButton(ActionEvent event) {
        try {
            String customerId = CustomeridTextfield.getText();
            double dues = Double.parseDouble(previousduesTextField.getText());
            int units = Integer.parseInt(totalunitsconsumedTextField.getText());
            double unitRate = 10.0;
            double total = dues + (units * unitRate);

            // Save to file using object output string
            try (FileOutputStream fileOut = new FileOutputStream("bill_" + customerId + ".txt");
                 ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
                out.writeObject("Customer ID: " + customerId + "\nTotal Bill: " + total);
            }

            showAlert("Saved", "Bill saved as bill_" + customerId + ".txt");

        } catch (IOException | NumberFormatException e) {
            showAlert("Error", "Failed to save. Check input values.");
        }
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.show();
    }
}
