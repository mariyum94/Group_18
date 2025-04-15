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

    }

    @FXML
    void MarkAsPaidOnActionButton(ActionEvent event) {

    }

    @FXML
    void ReturnHomeOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("FinanceOfficerDashboard_View.fxml", actionEvent);
    }
}
