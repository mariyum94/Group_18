package com.example.summit_power_company_.Mariyum;

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
import java.util.ArrayList;

public class FinanceOfficer5 {

    @FXML
    private TableView<FinanceOfficerModelClass2> allocationTable;

    @FXML
    private TableColumn<FinanceOfficerModelClass2, String> departmentColumn;

    @FXML
    private TableColumn<FinanceOfficerModelClass2, String> amountColumn;

    @FXML
    private TextField departmentTextField;

    @FXML
    private TextField amountTextField;

    ArrayList<FinanceOfficerModelClass1> FinanceOfficerModelClass1list= new ArrayList<>();

    @FXML
    public void initialize() {
        departmentColumn.setCellValueFactory(new PropertyValueFactory<>("departmentName"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("allocationAmount"));

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
