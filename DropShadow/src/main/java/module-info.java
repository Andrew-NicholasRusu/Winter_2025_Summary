module com.example.dropshadow {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dropshadow to javafx.fxml;
    exports com.example.dropshadow;
}