package com.example.summit_power_company_.Mariyum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class FinanceOfficer7 {

    @FXML
    private TextField BudgetTextField;

    @FXML
    private ComboBox<String> CategoryTypeComboBox;

    @FXML
    private TableColumn<FinanceOfficerModelClass4, Integer> amountColumn;

    @FXML
    private TextField amountTextField;

    @FXML
    private TableColumn<FinanceOfficerModelClass3, Double> budgetColumn;

    @FXML
    private TableColumn<FinanceOfficerModelClass3, String> categoryColumn;

    @FXML
    private TableColumn<FinanceOfficerModelClass3, Double> dateColumn;

    @FXML
    private TextField dateTextField;

    @FXML
    private TableView<FinanceOfficerModelClass3> financialDataTableView;

    @FXML
    private Label StatusLabel;

    ArrayList<FinanceOfficerModelClass3> FinanceOfficerModelClass3list= new ArrayList<>();

    @FXML
    public void initialize() {
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("Amount"));
        categoryColumn.setCellValueFactory(new PropertyValueFactory<>("Category"));
        budgetColumn.setCellValueFactory(new PropertyValueFactory<>("Budget"));

        CategoryTypeComboBox.getItems().addAll("Monthly", "Daily");
    }
    @FXML
    void AddDataOnActionButton(ActionEvent event) {
        String Budget = BudgetTextField.getText();
        String amount = amountTextField.getText();
        String date = dateTextField.getValue();

        if (Budget.isBlank() || amount.isBlank() || date  == null) {
            StatusLabel.setText("Please provide all inputs");
            return;
        }
//        if (password.length() < 8) {
//            messageLabel.setText("Password must be at least 8 characters long!");
//            return;
//        }

        for(FinanceOfficerModelClass3 u : FinanceOfficerModelClass3list) {
            if (u.getUsername().equals(username)) {
                StatusLabel.setText("This username is not available!");
                return;
            }
        }

        FinanceOfficerModelClass3 user  = new User(username, password, userType);
        userList.add(user);
        tableView.getItems().add(user);
        StatusLabel.setText("User added successfully");
//        System.out.println("Currently " + userList.size() + " users in the list");

        usernameTF.setText("");
        passwordTF.setText("");
        userTypeCB.setValue(null);
    }

    @FXML
    void DeleteDataOnActionButton(ActionEvent event) {

    }

    @FXML
    void EditDataOnActionButton(ActionEvent event) {
        FinanceOfficerModelClass3 user = tableView.getSelectionModel().getSelectedItem();
        if (user != null) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("edit-user.fxml"));
            Parent root = loader.load();

            EditUserController controller = loader.getController();
            controller.setUser(user);

            Stage stage = (Stage)  StatusLabel.getScene().getWindow();
            stage.setScene(new Scene(root));
        }
    }

    public void setMessage(String message) {
        StatusLabel.setText(message);

    }

    @FXML
    void ReturnHomeOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("FinanceOfficerDashboard_View.fxml", actionEvent);
    }
}
