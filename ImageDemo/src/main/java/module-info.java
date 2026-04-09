module com.example.imagedemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.imagedemo to javafx.fxml;
    exports com.example.imagedemo;
}