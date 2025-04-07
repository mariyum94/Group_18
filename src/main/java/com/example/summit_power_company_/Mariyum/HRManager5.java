package com.example.summit_power_company_.Mariyum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;

public class HRManager5 {

    @FXML
    private DatePicker traningDate;

    @FXML
    private ComboBox<String> traningtyprComboBox;

    @FXML
    public void initialize() {
        traningtyprComboBox.getItems().addAll("Technical", "Leadership", "Compliance");
    }

    @FXML
    void AssignEmployeesOnActionButton(ActionEvent event) {

    }

    @FXML
    void ReturnHomeOnActionButton(ActionEvent event) {

    }

}
