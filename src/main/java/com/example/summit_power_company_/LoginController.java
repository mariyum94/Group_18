package com.example.summit_power_company_;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private Label massageLabel;
    @FXML
    private TextField passwordTextField;
    @FXML
    private TextField usernameTextField;

    @FXML
    public void Login(ActionEvent actionEvent) throws IOException {
        String username = usernameTextField.getText();
        String password = passwordTextField.getText();

        if (" FinanceOfficer".equals(username) && "Mariyum".equals(password)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Mariyum/FinanceOfficerDashboard_View.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) usernameTextField.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } else if ("HR Manager".equals(username) && "Mariyum".equals(password)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Mariyum/HRManagerDashboard_View.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) usernameTextField.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } else if (" user".equals(username) && "Reana".equals(password)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("reana/Dashboard.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) usernameTextField.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } else {
            massageLabel.setText("Incorrect username or password. Please try again.");
        }
    }
}