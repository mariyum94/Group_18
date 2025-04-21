package com.example.summit_power_company_.Mariyum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class HRManager7 {
    @FXML
    private TableColumn Payrollcolumn;
    @FXML
    private TableColumn Performancecolumn;
    @FXML
    private TextField performancetextfield;
    @FXML
    private TableView reportTableview;
    @FXML
    private Label statusmassage;
    @FXML
    private TextField attendancetextfield;
    @FXML
    private TableColumn Attendancecolumn;
    @FXML
    private TextField payrolltextfield;

    static ArrayList<HRManagerModelClass3> HRManagerModelClass3list= new ArrayList<>();
    @FXML
    public void initialize() {
        Payrollcolumn.setCellValueFactory(new PropertyValueFactory<>("Payroll"));
        Performancecolumn.setCellValueFactory(new PropertyValueFactory<>("Performance"));
        Attendancecolumn.setCellValueFactory(new PropertyValueFactory<>("Attendance"));

        reportTableview.getItems().addAll(HRManagerModelClass3list);

    }
    @FXML
    public void ReturnHomeOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("HRManagerDashboard_View.fxml", actionEvent);
    }

    @FXML
    public void ExporttoPDFOnActionButton(ActionEvent actionEvent) {
    }

    @FXML
    public void WritetoGenerateReportFileOnActionButton(ActionEvent actionEvent) {
        //dont have checkbox
        try (FileWriter writer = new FileWriter("HRManager7.txt", false)) {
            writer.write("Attendance: " + attendancetextfield.getText() + "\n");
            writer.write("Payroll: " + payrolltextfield.getText() + "\n");
            writer.write("Performance: " + performancetextfield.getText() + "\n");
            statusmassage.setText("File saved successfully!");
        } catch (IOException e) {
            statusmassage.setText("Could not save!");
        }
    }
    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.show();
    }
}