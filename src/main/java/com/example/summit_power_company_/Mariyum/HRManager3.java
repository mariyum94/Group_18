package com.example.summit_power_company_.Mariyum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

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
    }
    @FXML
    void ReturnHomeOnActionButton(ActionEvent event) {

    }

    @FXML
    void approveLeaveOnActionButton(ActionEvent event) {

    }

    @FXML
    void denyleaveOnActionButton(ActionEvent event) {

    }

}
