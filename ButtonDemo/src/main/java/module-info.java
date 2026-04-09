module com.example.buttondemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.buttondemo to javafx.fxml;
    exports com.example.buttondemo;
}