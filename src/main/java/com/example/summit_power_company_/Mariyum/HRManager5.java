package com.example.summit_power_company_.Mariyum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.io.IOException;
import java.time.LocalDate;


public class HRManager5 {

    @FXML
    private DatePicker traningDate;

    @FXML
    private ComboBox<String> traningtyprComboBox;
    @FXML
    private Label StatusLabel;


    @FXML
    public void initialize() {

        traningtyprComboBox.getItems().addAll("Technical", "Leadership", "Compliance");
    }

    @FXML
    void AssignEmployeesOnActionButton(ActionEvent event) {
//        LocalDate date = traningDate.getValue();
//        String training = traningtyprComboBox.getValue();
//
//        if (training == null || training.isBlank() || date == null) {
//            StatusLabel.setText("Please provide both the training type and the date.");
//        } else {
//            // Simulate assigning employees to the training
//            StatusLabel.setText(" Employees assigned to " + training + " on " + date.toString());
//            traningtyprComboBox.getSelectionModel().clearSelection();
//            traningDate.setValue(null);
//        }

    }
    @FXML
    void ReturnHomeOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("HRManagerDashboard_View.fxml", actionEvent);
    }
    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.show();
    }

}
