module org.example.stopsign {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.stopsign to javafx.fxml;
    exports org.example.stopsign;
}