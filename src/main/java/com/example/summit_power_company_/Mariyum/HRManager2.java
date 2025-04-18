package com.example.summit_power_company_.Mariyum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.ArrayList;

public class HRManager2 {

    @FXML
    private TableView<HRManagerModelClass1> attendanceTable;

    @FXML
    private TableColumn<HRManagerModelClass1, String> attendancecolumn;

    @FXML
    private TableColumn<HRManagerModelClass1, Integer> dateColumn;

    @FXML
    private ComboBox<String> employeeComboBox;

    @FXML
    private TableColumn<HRManagerModelClass1, String> statusColumn;

    @FXML
    private Label statusLabel;

    static ArrayList<HRManagerModelClass1> HRManagerModelClass1list= new ArrayList<>();
    @FXML
    private DatePicker datepicker;

    @FXML
    public void initialize() {
        employeeComboBox.getItems().addAll("Present", "Absent","Leave");


        attendancecolumn.setCellValueFactory(new PropertyValueFactory<>("Attendance"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("Date"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("Status"));

        attendanceTable.getItems().addAll(HRManagerModelClass1list);
    }

    @FXML
    void ReturnHomeOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("HRManagerDashboard_View.fxml", actionEvent);
    }

    @FXML
    void handleApproveLeave(ActionEvent event) {

    }
    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.show();
    }

}
