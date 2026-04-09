module org.example.checkerboard {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.checkerboard to javafx.fxml;
    exports org.example.checkerboard;
}