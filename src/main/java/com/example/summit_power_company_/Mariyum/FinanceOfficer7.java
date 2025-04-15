package com.example.summit_power_company_.Mariyum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class FinanceOfficer7 {

    @FXML
    private TextField BudgetTextField;

    @FXML
    private ComboBox<String> CategoryTypeComboBox;

    @FXML
    private TableColumn<FinanceOfficerModelClass3, Integer> amountColumn;

    @FXML
    private TextField amountTextField;

    @FXML
    private TableColumn<FinanceOfficerModelClass3, Double> budgetColumn;

    @FXML
    private TableColumn<FinanceOfficerModelClass3, String> categoryColumn;

    @FXML
    private TableColumn<FinanceOfficerModelClass3, String> dateColumn;

    @FXML
    private DatePicker datePicker;

    @FXML
    private TableView<FinanceOfficerModelClass3> financialDataTableView;

    @FXML
    private Label StatusLabel;

    ArrayList<FinanceOfficerModelClass3> financeDataList = new ArrayList<>();

    @FXML
    public void initialize() {
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        categoryColumn.setCellValueFactory(new PropertyValueFactory<>("category"));
        budgetColumn.setCellValueFactory(new PropertyValueFactory<>("budget"));

        CategoryTypeComboBox.getItems().addAll("Monthly", "Daily");
    }

    @FXML
    void AddDataOnActionButton(ActionEvent event) {
        String budgetStr = BudgetTextField.getText();
        String amountStr = amountTextField.getText();
        LocalDate date = datePicker.getValue();
        String category = CategoryTypeComboBox.getValue();

        if (budgetStr.isBlank() || amountStr.isBlank() || date == null || category == null) {
            StatusLabel.setText("Please provide all inputs");
            return;
        }

        try {
            double budget = Double.parseDouble(budgetStr);
            int amount = Integer.parseInt(amountStr);

            FinanceOfficerModelClass3 record = new FinanceOfficerModelClass3(date.toString(), amount, category, budget);
            financeDataList.add(record);
            financialDataTableView.getItems().add(record);

            StatusLabel.setText("Record added successfully");

            // Clear form
            BudgetTextField.clear();
            amountTextField.clear();
            datePicker.setValue(null);
            CategoryTypeComboBox.setValue(null);

        } catch (NumberFormatException e) {
            StatusLabel.setText("Invalid number format in Budget or Amount");
        }
    }

    @FXML
    void DeleteDataOnActionButton(ActionEvent event) {
        FinanceOfficerModelClass3 selected = financialDataTableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            financialDataTableView.getItems().remove(selected);
            financeDataList.remove(selected);
            StatusLabel.setText("Record deleted");
        } else {
            StatusLabel.setText("Please select a record to delete");
        }
    }

    @FXML
    void EditDataOnActionButton(ActionEvent event) throws IOException {
//        FinanceOfficerModelClass3 selected = financialDataTableView.getSelectionModel().getSelectedItem();
//        if (selected != null) {
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("edit-user.fxml"));
//            Parent root = loader.load();
//
//            EditUserController controller = loader.getController();
//            controller.setUser(selected); // Ensure EditUserController has setUser method
//
//            Stage stage = (Stage) StatusLabel.getScene().getWindow();
//            stage.setScene(new Scene(root));
//        } else {
//            StatusLabel.setText("Please select a record to edit");
//        }
    }

    @FXML
    void ReturnHomeOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("FinanceOfficerDashboard_View.fxml", actionEvent);
    }

    public void setMessage(String message) {
        StatusLabel.setText(message);
    }
}
