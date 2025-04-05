package com.example.summit_power_company_.Mariyum;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class FinanceOfficer5 {

    @FXML
    private TableView<FinanceOfficerModelClass5> allocationTable;

    @FXML
    private TableColumn<FinanceOfficerModelClass5, String> departmentColumn;

    @FXML
    private TableColumn<FinanceOfficerModelClass5, String> amountColumn;

    @FXML
    private TextField departmentTextField;

    @FXML
    private TextField amountTextField;

    private final ObservableList<FinanceOfficerModelClass5> FinanceOfficerModelClass5list = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        departmentColumn.setCellValueFactory(new PropertyValueFactory<>("departmentName"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("allocationAmount"));

        allocationTable.setItems(FinanceOfficerModelClass5list);
    }

    @FXML
    void DistributeFundsOnActionButton(ActionEvent event) {
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
    void exportPdfOnActionButton(ActionEvent event) {

    }
}
