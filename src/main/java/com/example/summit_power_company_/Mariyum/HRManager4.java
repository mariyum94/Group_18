package com.example.summit_power_company_.Mariyum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class HRManager4 {

    @FXML
    private Label RatingLabel;

    @FXML
    private ComboBox<String> employeeComboBox;
    @FXML
    public void initialize() {
        employeeComboBox.getItems().addAll("Present", "Absent", "Leave");
    }
    @FXML
    void ReturnHomeOnActionButton(ActionEvent event) {

    }

    @FXML
    void evaluateOnActionButton(ActionEvent event) {

    }

}
