package com.example.summit_power_company_.Mariyum;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
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

    ArrayList<FinanceOfficerModelClass4> FinanceOfficerModelClass4list= new ArrayList<>();

    @FXML
    public void initialize() {
        invoiceColumn.setCellValueFactory(new PropertyValueFactory<>("Invoice ID"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("Amount"));
        customerColumn.setCellValueFactory(new PropertyValueFactory<>("Customer"));
        dueDateColumn.setCellValueFactory(new PropertyValueFactory<>("Due Date"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("Status"));
    }
    @FXML
    void FilterOnActionButton(ActionEvent event) {

    }

    @FXML
    void ReturnHomeOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("FinanceOfficerDashboard_View.fxml", actionEvent);
    }

    @FXML
    void SendReminderOnActionButton(ActionEvent event) {

    }

    public Label getStatusmessage() {
        return Statusmessage;
    }

    public void setStatusmessage(Label statusmessage) {
        Statusmessage = statusmessage;
    }
}
