package com.example.summit_power_company_.Mariyum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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

    ArrayList<FinanceOfficerModelClass1> FinanceOfficerModelClass1list= new ArrayList<FinanceOfficerModelClass1>();

    @FXML
    public void initialize() {
        departmentColumn.setCellValueFactory(new PropertyValueFactory<>("departmentName"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("allocationAmount"));
       // allocationTable.getItems().addAll(FinanceOfficerModelClass1list);

    }

    @FXML
    void DistributeFundsOnActionButton(ActionEvent event) {
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
