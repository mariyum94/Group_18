package com.example.summit_power_company_.ReanaManagingDirector;

import javafx.event.ActionEvent;

import java.io.IOException;

public class ProductionManagerDeshboardSceneController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButtonOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void CheckQualityOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ManageStockOnClick(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/ManageStockPM.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void productionToDistributorProcessOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ManufacturingPlansOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void RecordsProductionOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ProductionEquipmentOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ProductionInfoOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ComunicationStackholdersOnClick(ActionEvent actionEvent) {
    }
}