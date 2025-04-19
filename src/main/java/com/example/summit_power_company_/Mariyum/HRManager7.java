package com.example.summit_power_company_.Mariyum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.ArrayList;

public class HRManager7 {

    @FXML
    private TableColumn<HRManagerModelClass3, String> Attendancecolumn;

    @FXML
    private TableColumn<HRManagerModelClass3, String> Payrollcolumn;

    @FXML
    private TableColumn<HRManagerModelClass3, String> Performancecolumn;

    @FXML
    private TableView<HRManagerModelClass3> reportTableview;

    @FXML
    private ComboBox<String> reportTypeComboBox;

    static ArrayList<HRManagerModelClass3> HRManagerModelClass3list= new ArrayList<>();

    @FXML
    public void initialize() {
        reportTypeComboBox.getItems().addAll("Monthly", "Daily");

        Payrollcolumn.setCellValueFactory(new PropertyValueFactory<>(" Payroll"));
        Performancecolumn.setCellValueFactory(new PropertyValueFactory<>("Performance"));
        Attendancecolumn.setCellValueFactory(new PropertyValueFactory<>("Attendance"));
        reportTableview.getItems().addAll(HRManagerModelClass3list);
        }

    @FXML
    void ExporttoPDFOnActionButton(ActionEvent event) {

    }

    @FXML
    void GenerateReportOnActionButton(ActionEvent event) {
        String type = reportTypeComboBox.getValue();

        if (type == null) {
            showAlert("Missing Input", "Please select a report type.");
            return;
        }

        reportTableview.getItems().clear();
        HRManagerModelClass3list.clear();

        // Simulated report data
        if (type.equals("Monthly")) {
            HRManagerModelClass3list.add(new HRManagerModelClass3("Present 25 days", "TK 50,000", "Excellent"));
            HRManagerModelClass3list.add(new HRManagerModelClass3("Present 22 days", "TK 47,000", "Good"));
        } else {
            HRManagerModelClass3list.add(new HRManagerModelClass3("Present", "TK 2000", "Average"));
            HRManagerModelClass3list.add(new HRManagerModelClass3("Absent", "TK 0", "Needs Improvement"));
        }

        reportTableview.getItems().addAll(HRManagerModelClass3list);

    }

    @FXML
    void ReturnHomeOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("HRManagerDashboard_View.fxml", actionEvent);
    }
    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.show();
    }

}
