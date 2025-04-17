package com.example.summit_power_company_.Mariyum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.ArrayList;

public class HRManager3 {

    @FXML
    private TableColumn<HRManagerModelClass2, String> employeeColumn;

    @FXML
    private TableView<HRManagerModelClass2> leaveRequestTable;

    @FXML
    private TableColumn<HRManagerModelClass2, String> leaveTypeColumn;

    @FXML
    private TableColumn<HRManagerModelClass2, String> statusColumn;

    ArrayList<HRManagerModelClass2> HRManagerModelClass2list= new ArrayList<>();

    @FXML
    public void initialize() {

        employeeColumn.setCellValueFactory(new PropertyValueFactory<>("employee"));
        leaveTypeColumn.setCellValueFactory(new PropertyValueFactory<>("leave"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("Status"));
        HRManagerModelClass2list.add(new HRManagerModelClass2("Ali", "Sick Leave", "Pending"));
        HRManagerModelClass2list.add(new HRManagerModelClass2("Sara", "Casual Leave", "Pending"));

        leaveRequestTable.getItems().addAll(HRManagerModelClass2list);
    }
    @FXML
    void ReturnHomeOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("HRManagerDashboard_View.fxml", actionEvent);
    }

    @FXML
    void approveLeaveOnActionButton(ActionEvent event) {

    }

    @FXML
    void denyleaveOnActionButton(ActionEvent event) {

    }
    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.show();
    }

}
