package com.example.summit_power_company_.Mariyum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

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
        try {
            Parent root = FXMLLoader.load(getClass().getResource("HRManagerDashboard.fxml"));
            Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void evaluateOnActionButton(ActionEvent event) {

    }

}
