package com.example.summit_power_company_.Mariyum;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

import java.io.IOException;

public class HRManager6 {

    @FXML
    private ComboBox<String> employeecomboBox;

    @FXML
    private ComboBox<String> newrolecomboBox;

    @FXML
    public void initialize() {
        employeecomboBox.getItems().addAll("Present", "Absent", "Leave");
        newrolecomboBox.getItems().addAll(" Developer", "Team Lead", "HR Manager");
    }
    @FXML
    void ReturnHomeOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("HRManagerDashboard_View.fxml", actionEvent);
    }

    @FXML
    void comfirmpromotionOnActionButton(ActionEvent event) {

    }

}
