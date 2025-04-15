package com.example.summit_power_company_.Mariyum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.ArrayList;

public class HRManager8 {

    @FXML
    private TableColumn<HRManagerModelClass4, String> Attendancecolumn;

    @FXML
    private TableColumn<HRManagerModelClass4, String> Payrollcolumn;

    @FXML
    private TableColumn<HRManagerModelClass4, String> Performancecolumn;

    @FXML
    private TableView<HRManagerModelClass4> reportTableview;

    @FXML
    private ComboBox<?> reportTypeComboBox;

    ArrayList<HRManagerModelClass4> HRManagerModelClass4list= new ArrayList<>();

    @FXML
    public void initialize() {
        Payrollcolumn.setCellValueFactory(new PropertyValueFactory<>(" Payroll"));
        Performancecolumn.setCellValueFactory(new PropertyValueFactory<>("Performance"));
        Attendancecolumn.setCellValueFactory(new PropertyValueFactory<>("Attendance"));
        }

    @FXML
    void ExporttoPDFOnActionButton(ActionEvent event) {

    }

    @FXML
    void GenerateReportOnActionButton(ActionEvent event) {

    }

    @FXML
    void ReturnHomeOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("HRManagerDashboard_View.fxml", actionEvent);
    }


}
