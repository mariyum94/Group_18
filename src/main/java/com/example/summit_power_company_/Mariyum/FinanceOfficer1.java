package com.example.summit_power_company_.Mariyum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FinanceOfficer1 {

    @FXML
    private TextField CustomeridTextfield;

    @FXML
    private TextField previousduesTextField;

    @FXML
    private TextField totalunitsconsumedTextField;

    @FXML
    void FetchUsageOnActionButton(ActionEvent event) {

    }

    @FXML
    void GenerateBill(ActionEvent event) {

    }

    @FXML
    void ReturnHomeOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("FinanceOfficerDashboard_View.fxml", actionEvent);
    }

    @FXML
    void SavePrintOnActionButton(ActionEvent event) {
        try (
                ObjectOutputStream outputStream = new ObjectOutputStream(
                        new FileOutputStream("data.bin")
                );
        ){
            outputStream.writeObject(userList.getFirst());
            messageLabel.setText("Successfully saved to file.");
        }
        catch (IOException e) {
            e.printStackTrace();
            messageLabel.setText("Could not write to file");
        }
    }
    }

}
