package com.example.summit_power_company_.Mariyum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FinanceOfficer7 {

    @FXML
    private TextField BudgetTextField;

    @FXML
    private ComboBox<String> CategoryTypeComboBox;

    @FXML
    private TableColumn<FinanceOfficerModelClass3, Integer> amountColumn;

    @FXML
    private TextField amountTextField;

    @FXML
    private TableColumn<FinanceOfficerModelClass3, Double> budgetColumn;

    @FXML
    private TableColumn<FinanceOfficerModelClass3, String> categoryColumn;

    @FXML
    private TableColumn<FinanceOfficerModelClass3, String> dateColumn;

    @FXML
    private DatePicker datePicker;

    @FXML
    private TableView<FinanceOfficerModelClass3> financialDataTableView;

    @FXML
    private Label StatusLabel;

    public static FinanceOfficerModelClass3 FinanceOfficerModelClass3rToEdit = null;
    static List<FinanceOfficerModelClass3> FinanceOfficerModelClass3List = new ArrayList<>();

    static {
//        userList.add(new User("asif", "1234", "admin"));
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("FinanceOfficer7.bin"))) {
            FinanceOfficerModelClass3List.clear();
            List<FinanceOfficerModelClass3> loadedList = (List<FinanceOfficerModelClass3>) inputStream.readObject();
            FinanceOfficerModelClass3List.addAll(loadedList);

//            userList = (List<User>) inputStream.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void initialize() {
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        categoryColumn.setCellValueFactory(new PropertyValueFactory<>("category"));
        budgetColumn.setCellValueFactory(new PropertyValueFactory<>("budget"));

        CategoryTypeComboBox.getItems().addAll("Monthly", "Daily");

        financialDataTableView.getItems().addAll(FinanceOfficerModelClass3List);
    }

    @FXML
    void AddDataOnActionButton(ActionEvent actionEvent) {
        String budgetStr = BudgetTextField.getText();
        String amountStr = amountTextField.getText();
        LocalDate date = datePicker.getValue();
        String category = CategoryTypeComboBox.getValue();

        if (budgetStr.isBlank() || amountStr.isBlank() || date == null || category == null) {
            showAlert("Input Error", "Please fill in all fields before adding data.");
            return;
        }

        try {
            double budget = Double.parseDouble(budgetStr);
            int amount = Integer.parseInt(amountStr);

            FinanceOfficerModelClass3 record = new FinanceOfficerModelClass3(date, amount, category, budget);
            FinanceOfficerModelClass3List.add(record);
            financialDataTableView.getItems().add(record);

            StatusLabel.setText("Record added successfully.");

            // Clear inputs
            BudgetTextField.clear();
            amountTextField.clear();
            datePicker.setValue(null);
            CategoryTypeComboBox.setValue(null);

        } catch (NumberFormatException e) {
            showAlert("Invalid Input", "Amount must be an integer and budget must be a valid number.");
        }
    }

    @FXML
    void DeleteDataOnActionButton(ActionEvent event) {
            FinanceOfficerModelClass3 record = financialDataTableView.getSelectionModel().getSelectedItem();
            if (record != null) {
                FinanceOfficerModelClass3List.remove(record);
                financialDataTableView.getItems().remove(record);
                StatusLabel.setText("Record deleted.");
            } else {
                StatusLabel.setText("Please select a row to delete.");
            }
        }

    @FXML
    void EditDataOnActionButton(ActionEvent event) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("FinanceOfficerModelClass3.bin"))) {
            outputStream.writeObject(FinanceOfficerModelClass3List);
            StatusLabel.setText("Saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
            StatusLabel.setText("Could not save data.");
        }
    }


    @FXML
    void ReturnHomeOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("FinanceOfficerDashboard_View.fxml", actionEvent);
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.show();
    }

    @FXML
    public void saveToFileOnActionButton(ActionEvent actionEvent) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("FinanceOfficerModelClass3.bin"))) {
            outputStream.writeObject(FinanceOfficerModelClass3List);
            StatusLabel.setText("Successfully saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
            StatusLabel.setText("Could not write to file");
        }
    }

    @FXML
    public void loadFromFileOnActionButton(ActionEvent actionEvent) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("data/FinanceOfficerModelClass3.bin"))) {
            FinanceOfficerModelClass3List.clear();
            financialDataTableView.getItems().clear();

            List< FinanceOfficerModelClass3 > loadedList = (List<FinanceOfficerModelClass3>) inputStream.readObject();
            FinanceOfficerModelClass3List.addAll(loadedList);
            financialDataTableView.getItems().addAll(loadedList);

            StatusLabel.setText("Successfully loaded data");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            StatusLabel.setText("Invalid file format");
        } catch (IOException e) {
            e.printStackTrace();
            StatusLabel.setText("Could not load data from file!");
        }
    }
    }
