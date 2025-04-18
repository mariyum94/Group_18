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

    static ArrayList<FinanceOfficerModelClass3> FinanceOfficerModelClass3List = new ArrayList<>();

    @FXML
    public void initialize() {
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        categoryColumn.setCellValueFactory(new PropertyValueFactory<>("category"));
        budgetColumn.setCellValueFactory(new PropertyValueFactory<>("budget"));

        CategoryTypeComboBox.getItems().addAll("Monthly", "Daily");

        financialDataTableView.getItems().addAll(FinanceOfficerModelClass3List);
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
                for (FinanceOfficerModelClass3 record : FinanceOfficerModelClass3List) {
                    if (record.getDate().equals(date.toString()) && record.getCategory().equals(category)) {
                        StatusLabel.setText("This record already exists!");
                        return;
                    }
                }

                FinanceOfficerModelClass3 record = new FinanceOfficerModelClass3(date.toString(), amount, category, budget);
                FinanceOfficerModelClass3List.add(record);
                financialDataTableView.getItems().add(record);

                StatusLabel.setText("Record added successfully");

                // Clear inputs
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

     }

    @FXML
    void EditDataOnActionButton(ActionEvent event) throws IOException {
        FinanceOfficerModelClass3 record = financialDataTableView.getSelectionModel().getSelectedItem();
        if (record != null) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FinanceOfficer7_View.fxml"));
            Parent root = loader.load();

            FinanceOfficer7 controller = loader.getController();
            controller.setFinanceOfficerModelClass3(record);

            Stage stage = (Stage) StatusLabel.getScene().getWindow();
            stage.setScene(new Scene(root));
        }
    }
    private void setFinanceOfficerModelClass3(FinanceOfficerModelClass3 record) {
    }

    public void setMessage(String message) {
        StatusLabel.setText(message);
}

    @FXML
    void ReturnHomeOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("FinanceOfficerDashboard_View.fxml", actionEvent);
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.show();
    }}
