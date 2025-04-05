package com.example.summit_power_company_.Mariyum;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class FinanceOfficer6 {

    @FXML
    private TableColumn<FinanceOfficerModelClass6, Double> CategoryColumn;

    @FXML
    private TableColumn<FinanceOfficerModelClass6, Integer> amountColumn;

    @FXML
    private TableColumn<FinanceOfficerModelClass6, Integer> dateColumn;

    @FXML
    private TableView<FinanceOfficerModelClass6> expensesTableView;

    private final ObservableList<FinanceOfficerModelClass6> FinanceOfficerModelClass6list = FXCollections.observableArrayList();
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

        expensesTableView.setItems(FinanceOfficerModelClass6list);
        CategoryTypeComboBox.getItems().addAll("Monthly", "Daily");
}


    @FXML
    void ReturnHomeOnActionButton(ActionEvent event) {

    }

    @FXML
    void ViewExpensesOnActionButton(ActionEvent event) {

    }

}
