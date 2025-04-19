package com.example.summit_power_company_.Mariyum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.*;

public class HRManager1 {

    @FXML
    private TextField departmentTextField;

    @FXML
    private TextField idTextField;

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField roleTextField;

    @FXML
    private TextField salaryTextField;

    @FXML
    private Label statusLabel;



    @FXML
    void ReturnHomeOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("HRManagerDashboard_View.fxml", actionEvent);
    }

    @FXML
    void SaveEmployeeOnActionButton(ActionEvent event) {
        String id = idTextField.getText();
        String name = nameTextField.getText();
        String role = roleTextField.getText();
        String department = departmentTextField.getText();
        String salary = salaryTextField.getText();

        if (id.isEmpty() || name.isEmpty() || role.isEmpty() || department.isEmpty() || salary.isEmpty()) {
            showAlert("Missing Fields", "Please fill out all fields.");
            return;
        }
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("data/user.bin"))) {
            Object userList = null;
            outputStream.writeObject(null);
            statusLabel.setText("Successfully saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
            statusLabel.setText("Could not write to file");
        }

    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.show();
    }

}
