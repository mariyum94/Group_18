package com.example.summit_power_company_.Mariyum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
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


    @FXML
    private ComboBox <String >LeaveTypeComboBOx;
    @FXML
    private TextField employeenameTextField;

    @FXML
    private Label massagelabel;

    static ArrayList<HRManagerModelClass2> HRManagerModelClass2list= new ArrayList<>();
    @FXML
    public void initialize() {
        LeaveTypeComboBOx.getItems().addAll("Present", "Absent", "Leave");

        employeeColumn.setCellValueFactory(new PropertyValueFactory<>("employee"));
        leaveTypeColumn.setCellValueFactory(new PropertyValueFactory<>("leave"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("Status"));

        leaveRequestTable.getItems().addAll(HRManagerModelClass2list);
    }
    @FXML
    void ReturnHomeOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("HRManagerDashboard_View.fxml", actionEvent);
    }

    @FXML
    void approveLeaveOnActionButton(ActionEvent event) {
        HRManagerModelClass2 selectedLeave = leaveRequestTable.getSelectionModel().getSelectedItem();

        if (selectedLeave != null) {
            selectedLeave.setStatus("Approved");

            // Refresh the table to reflect changes
            leaveRequestTable.refresh();
        } else {
            showAlert("No Selection", "Please select a leave request to approve.");
        }
    }

    @FXML
    void denyleaveOnActionButton(ActionEvent event) {
        HRManagerModelClass2 selectedLeave = leaveRequestTable.getSelectionModel().getSelectedItem();
        if (selectedLeave != null) {
            // Update status to "Denied"
            selectedLeave.setStatus("Denied");

            // Refresh the table to reflect changes
            leaveRequestTable.refresh();
        } else {
            showAlert("No Selection", "Please select a leave request to deny.");
        }
    }
    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.show();
    }

}
