module com.example.triangle {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.triangle to javafx.fxml;
    exports com.example.triangle;
}