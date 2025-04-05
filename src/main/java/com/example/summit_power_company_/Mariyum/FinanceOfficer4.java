package com.example.summit_power_company_.Mariyum;

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
import java.util.ArrayList;
import java.util.List;

public class FinanceOfficer4 {
    @javafx.fxml.FXML
    private TextField ProfitorlossTextField;
    @javafx.fxml.FXML
    private ComboBox reportTypeComboBox;
    @javafx.fxml.FXML
    private TextField ExpensesTextField;
    @javafx.fxml.FXML
    private TextField RevenueTextField;

    private List<FinanceOfficerModelClass4> FinanceOfficerModelClass4list = new ArrayList<>();

    @FXML
    public void initialize() {
        reportTypeComboBox.getItems().addAll("Monthly", "Annual");
    }

    @javafx.fxml.FXML
    public void viewReportOnActionButton(ActionEvent actionEvent) {
            System.out.println("Exporting report to PDF ");
        }


    @javafx.fxml.FXML
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

    @javafx.fxml.FXML
    public void exportPdfOnActionButton(ActionEvent actionEvent) {
    }

    public List<FinanceOfficerModelClass4> getFinanceOfficerModelClass4list() {
        return FinanceOfficerModelClass4list;
    }

    public void setFinanceOfficerModelClass4list(List<FinanceOfficerModelClass4> financeOfficerModelClass4list) {
        FinanceOfficerModelClass4list = financeOfficerModelClass4list;
    }
}
