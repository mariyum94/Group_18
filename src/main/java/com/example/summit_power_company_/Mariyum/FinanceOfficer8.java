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

public class FinanceOfficer8 {

    @FXML
    private Label Statusmessage;

    @FXML
    private TableColumn<FinanceOfficerModelClass5, Double> amountColumn;

    @FXML
    private TableView<FinanceOfficerModelClass5> billingTable;

    @FXML
    private TableColumn<FinanceOfficerModelClass5, String> customerColumn;

    @FXML
    private TextField customerSearchTextField;

    @FXML
    private TableColumn<FinanceOfficerModelClass5, Integer> dueDateColumn;

    @FXML
    private DatePicker filterdatePicker;

    @FXML
    private TableColumn<FinanceOfficerModelClass5, String> invoiceColumn;

    @FXML
    private TableColumn<FinanceOfficerModelClass5, String> statusColumn;

    private final ObservableList<FinanceOfficerModelClass5> FinanceOfficerModelClass5list = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        invoiceColumn.setCellValueFactory(new PropertyValueFactory<>("Invoice ID"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("Amount"));
        customerColumn.setCellValueFactory(new PropertyValueFactory<>("Customer"));
        dueDateColumn.setCellValueFactory(new PropertyValueFactory<>("Due Date"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("Status"));

        billingTable.setItems(FinanceOfficerModelClass5list);
    }
    @FXML
    void FilterOnActionButton(ActionEvent event) {

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

    @FXML
    void SendReminderOnActionButton(ActionEvent event) {

    }

}
