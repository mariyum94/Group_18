package com.example.summit_power_company_.Mariyum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class FinanceOfficer2 {

    @FXML
    private TextField invoiceNumberTextField;

    @FXML
    private Label paymentStatusLabel;

    @FXML
    private Label successMessageLabel;
    private ActionEvent actionEvent;

    @FXML
    void FetchPaymentStatusOnActionButton(ActionEvent event) {

    }

    @FXML
    void MarkAsPaidOnActionButton(ActionEvent event) {

    }

    @FXML
    void ReturnHomeOnActionButton(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("FinanceOfficerDashboard_View.fxml", actionEvent);
    }
}
