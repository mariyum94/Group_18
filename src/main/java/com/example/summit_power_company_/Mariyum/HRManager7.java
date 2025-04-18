package com.example.summit_power_company_.Mariyum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.io.IOException;

public class HRManager7 {

    @FXML
    private ComboBox <String> complaintComboBox;
    @FXML
    private Label statusLabel;

    @FXML

        public void initialize() {
            complaintComboBox.getItems().addAll(
                    "Billing Error",
                    "Service Interruption",
                    "Incorrect Meter Reading",
                    "Late Technician Visit",
                    "Other"
            );


    }
    @FXML
    void ReturnHomeOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("HRManagerDashboard_View.fxml", actionEvent);
    }

    @FXML
    void resolveIssueOnActionButton(ActionEvent event) {

    }

    @Deprecated
    public void GenerateReportOnActionButton(ActionEvent actionEvent) {
    }

    @Deprecated
    public void ExporttoPDFOnActionButton(ActionEvent actionEvent) {
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.show();
    }
}
