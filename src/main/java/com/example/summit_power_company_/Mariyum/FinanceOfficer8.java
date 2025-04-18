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
import java.time.LocalDate;
import java.util.ArrayList;

public class FinanceOfficer8 {

    @FXML
    private Label Statusmessage;

    @FXML
    private TableColumn<FinanceOfficerModelClass4, Double> amountColumn;

    @FXML
    private TableView<FinanceOfficerModelClass4> billingTable;

    @FXML
    private TableColumn<FinanceOfficerModelClass4, String> customerColumn;

    @FXML
    private TextField customerSearchTextField;

    @FXML
    private TableColumn<FinanceOfficerModelClass4, Integer> dueDateColumn;

    @FXML
    private DatePicker filterdatePicker;

    @FXML
    private TableColumn<FinanceOfficerModelClass4, String> invoiceColumn;

    @FXML
    private TableColumn<FinanceOfficerModelClass4, String> statusColumn;

  static ArrayList<FinanceOfficerModelClass4> FinanceOfficerModelClass4list = new ArrayList<>();

    @FXML
    public void initialize() {
        invoiceColumn.setCellValueFactory(new PropertyValueFactory<>("Invoice ID"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("Amount"));
        customerColumn.setCellValueFactory(new PropertyValueFactory<>("Customer"));
        dueDateColumn.setCellValueFactory(new PropertyValueFactory<>("Due Date"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("Status"));

        billingTable.getItems().addAll(FinanceOfficerModelClass4list);
    }

    @FXML
    void FilterOnActionButton(ActionEvent event) {
        LocalDate selectedDate = filterdatePicker.getValue();
        if (selectedDate != null) {
            for (FinanceOfficerModelClass4 item : FinanceOfficerModelClass4list) {
                if (selectedDate.equals(item.getDueDate())) {
                    FinanceOfficerModelClass4list.add(item);
                }
            }
            Statusmessage.setText("Filtered by date: " + selectedDate);
        } else {
            Statusmessage.setText("Please select a date to filter.");
        }
    }

    @FXML
    void ReturnHomeOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("FinanceOfficerDashboard_View.fxml", actionEvent);
    }

    @FXML
    void SendReminderOnActionButton(ActionEvent event) {
        FinanceOfficerModelClass4 selected = billingTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            Statusmessage.setText("Reminder sent to: " + selected.getCustomer());
        } else {
            Statusmessage.setText("Please select a row to send reminder.");
        }
    }
    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.show();
    }
}


