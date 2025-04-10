package com.example.summit_power_company_.Mariyum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;

import java.io.IOException;
import java.util.ArrayList;

public class HRManager5 {

    @FXML
    private DatePicker traningDate;

    @FXML
    private ComboBox<String> traningtyprComboBox;

    ArrayList<HRManagerModelClass3> HRManagerModelClass3list= new ArrayList<>();

    @FXML
    public void initialize() {
        traningtyprComboBox.getItems().addAll("Technical", "Leadership", "Compliance");
    }

    @FXML
    void AssignEmployeesOnActionButton(ActionEvent event) {

    }

    @FXML
    void ReturnHomeOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("HRManagerDashboard_View.fxml", actionEvent);
    }

}
