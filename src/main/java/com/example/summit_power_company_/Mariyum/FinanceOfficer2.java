package com.example.summit_power_company_.Mariyum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


import java.io.IOException;

public class FinanceOfficer2 {

    @FXML
    private TextField invoiceNumberTextField;

    @FXML
    private Label paymentStatusLabel;

    @FXML
    private Label successMessageLabel;

    @FXML
    void FetchPaymentStatusOnActionButton(ActionEvent event) {
        String invoiceNumber = invoiceNumberTextField.getText();

        if (invoiceNumber.isEmpty()) {
            paymentStatusLabel.setText("Please enter an invoice number.");
        } else {
            paymentStatusLabel.setText("Invoice Status: Pending"); // Example status
        }
    }

    @FXML
    void MarkAsPaidOnActionButton(ActionEvent event) {
        String invoiceNumber = invoiceNumberTextField.getText();
        if (invoiceNumber.isEmpty()) {
            successMessageLabel.setText("Please enter an invoice number.");
        } else {
            successMessageLabel.setText("Invoice " + invoiceNumber + " has been marked as Paid.");
        }
    }

    @FXML
    void ReturnHomeOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("FinanceOfficerDashboard_View.fxml", actionEvent);
    }
}
