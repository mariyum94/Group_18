package com.example.summit_power_company_.Mariyum;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

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

    private final ObservableList<HRManagerModelClass1> HRManagerModelClass1list = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        employeeComboBox.getItems().addAll("Present", "Absent","Leave");

        attendancecolumn.setCellValueFactory(new PropertyValueFactory<>("Attendance"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("Date"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("Status"));

        attendanceTable.setItems(HRManagerModelClass1list);

    }
    @FXML
    void ReturnHomeOnActionButton(ActionEvent event) {

    }

    @FXML
    void handleApproveLeave(ActionEvent event) {

    }

}
