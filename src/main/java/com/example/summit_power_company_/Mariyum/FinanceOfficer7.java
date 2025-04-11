package com.example.summit_power_company_.Mariyum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class FinanceOfficer7 {

    @FXML
    private TextField BudgetTextField;

    @FXML
    private ComboBox<String> CategoryTypeComboBox;

    @FXML
    private TableColumn<FinanceOfficerModelClass4, Integer> amountColumn;

    @FXML
    private TextField amountTextField;

    @FXML
    private TableColumn<FinanceOfficerModelClass3, Double> budgetColumn;

    @FXML
    private TableColumn<FinanceOfficerModelClass3, String> categoryColumn;

    @FXML
    private TableColumn<FinanceOfficerModelClass3, Double> dateColumn;

    @FXML
    private TextField dateTextField;

    @FXML
    private TableView<FinanceOfficerModelClass3> financialDataTableView;

    @FXML
    private Label StatusLabel;

    ArrayList<FinanceOfficerModelClass3> FinanceOfficerModelClass3list= new ArrayList<>();

    @FXML
    public void initialize() {
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("Amount"));
        categoryColumn.setCellValueFactory(new PropertyValueFactory<>("Category"));
        budgetColumn.setCellValueFactory(new PropertyValueFactory<>("Budget"));

        CategoryTypeComboBox.getItems().addAll("Monthly", "Daily");
    }
    @FXML
    void AddDataOnActionButton(ActionEvent event) {

    }

    @FXML
    void DeleteDataOnActionButton(ActionEvent event) {

    }

    @FXML
    void EditDataOnActionButton(ActionEvent event) {

    }

    @FXML
    void ReturnHomeOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("FinanceOfficerDashboard_View.fxml", actionEvent);
    }
}
