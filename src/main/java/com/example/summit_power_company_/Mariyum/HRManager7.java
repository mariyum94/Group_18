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
    private TableColumn<HRManagerModelClass3, Integer> Payrollcolumn;

    @FXML
    private TableColumn<HRManagerModelClass3, String> Performancecolumn;

    @FXML
    private TableColumn<HRManagerModelClass3, Integer> Attendancecolumn;

    @FXML
    private TextField performancetextfield;

    @FXML
    private TextField attendancetextfield;

    @FXML
    private TextField payrolltextfield;

    @FXML
    private TableView<HRManagerModelClass3> reportTableview;

    @FXML
    private Label statusmassage;

    @FXML
    private TextArea textArea;

    static ArrayList<HRManagerModelClass3> HRManagerModelClass3list = new ArrayList<>();

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
        try
                (FileWriter writer = new FileWriter("HRManager7.txt", false)) {
            writer.write(textArea.getText());
            statusmassage.setText("File saved successfully!");
        } catch (IOException e) {
            statusmassage.setText("Could not save!");
            showAlert("Error", "Something went wrong while saving the file.");
        }
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.show();
    }
}
