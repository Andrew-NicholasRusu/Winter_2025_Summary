module org.example.listviewaddition {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.listviewaddition to javafx.fxml;
    exports org.example.listviewaddition;
}