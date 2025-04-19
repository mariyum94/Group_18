package com.example.summit_power_company_.Mariyum;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
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
        String selectedEmployee = employeecomboBox.getSelectionModel().getSelectedItem();
        String selectedRole = newrolecomboBox.getSelectionModel().getSelectedItem();

        if (selectedEmployee != null && selectedRole != null) {

            showAlert("Promotion Successful", selectedEmployee + " has been promoted to " + selectedRole + "!");
        } else {
            // Show an error if either the employee or new role is not selected
            showAlert("Incomplete Selection", "Please select both an employee and a new role.");
        }
    }
    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.show();
    }

}
