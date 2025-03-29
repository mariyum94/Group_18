package com.example.summit_power_company_;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private Button loginButton;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField usernameField;
    @FXML
    private Label errormassage;

    @FXML
    void ForgotPasswordHyperlink(ActionEvent event) {

    }

    @FXML
    void LoginOnActionButton(ActionEvent event) {

            String username = usernameField.getText();
            String password = passwordField.getText();

            if (username.equals("mariyum") && password.equals("1234")) {
                errormassage.setText("Log in successful");
            }
            else {
                errormassage.setText("  Incorrect username or password  ");
            }

    }

}
