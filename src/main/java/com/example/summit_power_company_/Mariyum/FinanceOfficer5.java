package com.example.summit_power_company_.Mariyum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class FinanceOfficer5 {

    @FXML
    private TableView<FinanceOfficerModelClass1> allocationTable;

    @FXML
    private TableColumn<FinanceOfficerModelClass1, String> departmentColumn;

    @FXML
    private TableColumn<FinanceOfficerModelClass1, String> amountColumn;

    @FXML
    private TextField departmentTextField;

    @FXML
    private TextField amountTextField;

    static ArrayList<FinanceOfficerModelClass1> financeOfficerModelClass1List = new ArrayList<>();

    static {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("data/allocation.bin"))) {
            List<FinanceOfficerModelClass1> loadedList = (List<FinanceOfficerModelClass1>) inputStream.readObject();
            financeOfficerModelClass1List.clear();
            financeOfficerModelClass1List.addAll(loadedList);
        } catch (FileNotFoundException e) {
            // Handle file not found (create an empty list or log)
            System.out.println("File not found, creating an empty allocation list.");
            financeOfficerModelClass1List.clear(); // Start with an empty list
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    public void initialize() {
        departmentColumn.setCellValueFactory(new PropertyValueFactory<>("departmentName"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("allocationAmount"));
    }

    @FXML
    void DistributeFundsOnActionButton(ActionEvent event) {
        String departmentName = departmentTextField.getText();
        String allocationAmountText = amountTextField.getText();

        if (departmentName.isEmpty() || allocationAmountText.isEmpty()) {
            showAlert("Input Error", "Please fill in all fields.");
            return;
        }

        try {
            double allocationAmount = Double.parseDouble(allocationAmountText);
            FinanceOfficerModelClass1 allocation = new FinanceOfficerModelClass1(departmentName, allocationAmount);
            allocationTable.getItems().add(allocation);
            financeOfficerModelClass1List.add(allocation);

            departmentTextField.clear();
            amountTextField.clear();
        } catch (NumberFormatException e) {
            showAlert("Input Error", "Please enter a valid amount.");
        }
    }

    @FXML
    void ReturnHomeOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("FinanceOfficerDashboard_View.fxml", actionEvent);
    }

    @FXML
    void exportPdfOnActionButton(ActionEvent event) {
        // Implement PDF export logic here
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.show();
    }
}
