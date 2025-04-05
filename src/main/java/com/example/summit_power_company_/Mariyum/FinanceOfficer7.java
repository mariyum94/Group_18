package com.example.summit_power_company_.Mariyum;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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

public class FinanceOfficer7 {

    @FXML
    private TextField BudgetTextField;

    @FXML
    private ComboBox<String> CategoryTypeComboBox;

    @FXML
    private TableColumn<FinanceOfficerModelClass8, Integer> amountColumn;

    @FXML
    private TextField amountTextField;

    @FXML
    private TableColumn<FinanceOfficerModelClass7, Double> budgetColumn;

    @FXML
    private TableColumn<FinanceOfficerModelClass7, String> categoryColumn;

    @FXML
    private TableColumn<FinanceOfficerModelClass7, Double> dateColumn;

    @FXML
    private TextField dateTextField;

    @FXML
    private TableView<FinanceOfficerModelClass7> financialDataTableView;

    private final ObservableList<FinanceOfficerModelClass7> FinanceOfficerModelClass7list = FXCollections.observableArrayList();
    @FXML
    private Label StatusLabel;

    @FXML
    public void initialize() {
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("Amount"));
        categoryColumn.setCellValueFactory(new PropertyValueFactory<>("Category"));
        budgetColumn.setCellValueFactory(new PropertyValueFactory<>("Budget"));

        financialDataTableView.setItems(FinanceOfficerModelClass7list);
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
    void ReturnHomeOnActionButton(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("FinanceOfficerDashboard_View.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
