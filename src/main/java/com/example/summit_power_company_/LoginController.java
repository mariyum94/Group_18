package com.example.summit_power_company_;

import com.example.summit_power_company_.Mariyum.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;


import java.io.IOException;

public class LoginController {
    @FXML
    private PasswordField passwordTextField;
    @FXML
    private Label errorLabel;
    @FXML
    private TextField usernameTextField;

    @FXML
    public void initialize() {
    }

    @FXML
    public void login(ActionEvent actionEvent) throws IOException {
        String username = usernameTextField.getText();
        String password = passwordTextField.getText();
        if ("mariyum".equals(username) && "mariyum123".equals(password)) {
            errorLabel.setText("Log in successful");
            SceneSwitcher.switchTo("com.example.summit_power_company_.Mariyum.FinanceOfficerDashboard");
        } else {
            errorLabel.setText("Incorrect username or password");
        }
    }
}