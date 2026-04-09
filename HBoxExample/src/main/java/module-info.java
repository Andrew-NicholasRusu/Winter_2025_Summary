module com.example.hboxexample {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hboxexample to javafx.fxml;
    exports com.example.hboxexample;
}