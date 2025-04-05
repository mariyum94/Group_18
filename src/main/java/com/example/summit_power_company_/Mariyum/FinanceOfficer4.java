package com.example.summit_power_company_.Mariyum;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class FinanceOfficer4 {

    @FXML
    private TextField ProfitorlossTextField;

    @FXML
    private ComboBox<String> reportTypeComboBox;

    @FXML
    private TextField ExpensesTextField;

    @FXML
    private TextField RevenueTextField;

    private final ObservableList<FinanceOfficerModelClass1> FinanceOfficerModelClass1list = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        reportTypeComboBox.getItems().addAll("Monthly", "Annual");
    }

    @FXML
    public void viewReportOnActionButton(ActionEvent actionEvent) {
    }

    @FXML
    public void exportPdfOnActionButton(ActionEvent actionEvent) {
        System.out.println("Exporting report to PDF...");
    }

    @FXML
    public void ReturnHomeOnActionButton(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("FinanceOfficerDashboard_View.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
