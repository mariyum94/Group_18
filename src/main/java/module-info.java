module com.example.summit_power_company_ {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.summit_power_company_.Mariyum to javafx.fxml;

    exports com.example.summit_power_company_;
    exports com.example.summit_power_company_.Mariyum;
}
