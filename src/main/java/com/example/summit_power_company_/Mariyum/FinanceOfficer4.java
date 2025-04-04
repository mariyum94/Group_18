package com.example.summit_power_company_.Mariyum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

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
//    private ArrayList<CheckoutProduct> products;
  List<FinanceOfficerModelClass4> FinanceOfficerModelClass4list = new ArrayList();
//    @FXML
//    public void initialize() {
//        this.UserTypeComboBox.getItems().addAll(new String[]{"admin", "standard", "test "});
//    }

    @FXML
    public void initialize() {
        reportTypeComboBox.getItems().addAll("Basic Salary", "Overtime Data");

    }

    @javafx.fxml.FXML
    public void viewReportOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ReturnHomeOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void exportPdfOnActionButton(ActionEvent actionEvent) {
    }
}
