package com.example.summit_power_company_.Mariyum;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class FinanceOfficer6 {

    @FXML
    private TableColumn<FinanceOfficerModelClass3, Double> CategoryColumn;

    @FXML
    private TableColumn<FinanceOfficerModelClass3, Integer> amountColumn;

    @FXML
    private TableColumn<FinanceOfficerModelClass3, Integer> dateColumn;

    @FXML
    private TableView<FinanceOfficerModelClass3> expensesTableView;

    private final ObservableList<FinanceOfficerModelClass3> FinanceOfficerModelClass3list = FXCollections.observableArrayList();
    @FXML
    private TextField dateTextField;
    @FXML
    private TextField amountTextField;
    @FXML
    private ComboBox<String> CategoryTypeComboBox;

    @FXML
    public void initialize() {
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("Amount"));
        CategoryColumn.setCellValueFactory(new PropertyValueFactory<>("Category"));

        expensesTableView.setItems(FinanceOfficerModelClass3list);
        CategoryTypeComboBox.getItems().addAll("Monthly", "Daily");
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
    void ViewExpensesOnActionButton(ActionEvent event) {

    }

}
