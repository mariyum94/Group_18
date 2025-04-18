package com.example.summit_power_company_.Mariyum;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class FinanceOfficer6 {

    @FXML
    private TableColumn<FinanceOfficerModelClass2, Double> CategoryColumn;

    @FXML
    private TableColumn<FinanceOfficerModelClass2, Integer> amountColumn;

    @FXML
    private TableColumn<FinanceOfficerModelClass2, Integer> dateColumn;

    @FXML
    private TableView<FinanceOfficerModelClass2> expensesTableView;
    @FXML
    private TextField amountTextField;
    @FXML
    private ComboBox<String> CategoryTypeComboBox;

    static ArrayList<FinanceOfficerModelClass2> FinanceOfficerModelClass2list= new ArrayList<>();
    @FXML
    private DatePicker datepicker;

    @FXML
    public void initialize() {
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("Amount"));
        CategoryColumn.setCellValueFactory(new PropertyValueFactory<>("Category"));

        CategoryTypeComboBox.getItems().addAll("Monthly", "Daily");

        expensesTableView.getItems().addAll(FinanceOfficerModelClass2list);
}


    @FXML
    void ReturnHomeOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("FinanceOfficerDashboard_View.fxml", actionEvent);
    }

    @FXML
    void ViewExpensesOnActionButton(ActionEvent event) {
        try {
            String amountText = amountTextField.getText();
            String category = CategoryTypeComboBox.getValue();
            LocalDate date = datepicker.getValue();

            if (amountText.isBlank() || category == null || date == null) {
                showAlert("Input Error", "Please fill all the fields before adding an expense.");
                return;
            }
            int amount = Integer.parseInt(amountText);  // Convert amount to integer

            // Create and add the new expense
            FinanceOfficerModelClass2 expense = new FinanceOfficerModelClass2(date, amount, category);
            FinanceOfficerModelClass2list.add(expense);

            // Refresh the TableView
            expensesTableView.getItems().clear();
            expensesTableView.getItems().addAll(FinanceOfficerModelClass2list);

            // Clear inputs
            amountTextField.clear();
            CategoryTypeComboBox.getSelectionModel().clearSelection();
            datepicker.setValue(null);

        } catch (NumberFormatException e) {
            showAlert("Invalid Amount", "Please enter a valid number for the amount.");
        }
    }
    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.show();
    }

}
