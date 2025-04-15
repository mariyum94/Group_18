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

    private final String FinanceOfficerID = "Admin1234";
    private final String FinanceOfficerpassword = "1234";
    private final String HRManagerID = "Admin1234";
    private final String HRManagerpassword = "1234";
//others user password

    @FXML
    public void Login(ActionEvent actionEvent) throws IOException {
        String username = usernameTextField.getText().trim();
        String password = passwordTextField.getText().trim();

        if (username.equals(FinanceOfficerID) && password.equals(FinanceOfficerpassword)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/summit_power_company_/Mariyum/FinanceOfficerDashboard_View.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) usernameTextField.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } else if (username.equals(HRManagerID) && password.equals(HRManagerpassword)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/summit_power_company_/Mariyum/FinanceOfficerDashboard_View.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) usernameTextField.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
            //others path
//        } else if (username.equals(HRManagerID) && password.equals(HRManagerpassword)) {
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/summit_power_company_/Reana/Dashboard_View.fxml"));
//            Parent root = loader.load();
//            Stage stage = (Stage) usernameTextField.getScene().getWindow();
//            stage.setScene(new Scene(root));
//            stage.show();
        } else {
            massageLabel.setText("Incorrect username or password. Please try again.");
        }
    }
}