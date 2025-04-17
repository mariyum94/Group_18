package com.example.summit_power_company_.Mariyum;

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
    private TextField dateTextField;
    @FXML
    private TextField amountTextField;
    @FXML
    private ComboBox<String> CategoryTypeComboBox;

    static ArrayList<FinanceOfficerModelClass2> FinanceOfficerModelClass2list= new ArrayList<>();

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

    }
    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.show();
    }

}
