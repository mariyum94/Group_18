package com.example.summit_power_company_.Mariyum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.ArrayList;

public class FinanceOfficer5 {

    @FXML
    private TableView<FinanceOfficerModelClass1> allocationTable;

    @FXML
    private TableColumn<FinanceOfficerModelClass1, String> departmentColumn;

    @FXML
    private TableColumn<FinanceOfficerModelClass1, Double> amountColumn;

    @FXML
    private TextField departmentTextField;

    @FXML
    private TextField amountTextField;

    static ArrayList<FinanceOfficerModelClass1> FinanceOfficerModelClass1list = new ArrayList<>();

    @FXML
    public void initialize() {
        departmentColumn.setCellValueFactory(new PropertyValueFactory<>("departmentName"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("allocationAmount"));
        allocationTable.getItems().addAll(FinanceOfficerModelClass1list);
    }

    @FXML
    void DistributeFundsOnActionButton(ActionEvent event) {
        String department = departmentTextField.getText();
        String amount = amountTextField.getText();

        if (department.isBlank() || amount.isBlank()) {
            showAlert("Input Error", "Please fill in both department and amount fields.");
            return;
        }

        try {
            // Create a new allocation entry
            FinanceOfficerModelClass1 allocation = new FinanceOfficerModelClass1(department, amount);

            // Add to the list and refresh the TableView
            FinanceOfficerModelClass1list.add(allocation);
            allocationTable.getItems().clear();
            allocationTable.getItems().addAll(FinanceOfficerModelClass1list);

            // Clear the input fields
            departmentTextField.clear();
            amountTextField.clear();

        } catch (Exception e) {
            showAlert("Error", "An unexpected error occurred while adding the allocation.");
        }
    }

    @FXML
    void ReturnHomeOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("FinanceOfficerDashboard_View.fxml", actionEvent);
    }

    @FXML
    void exportPdfOnActionButton(ActionEvent event) {

    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.show();
    }
}
