module com.example.bullseye {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bullseye to javafx.fxml;
    exports com.example.bullseye;
}