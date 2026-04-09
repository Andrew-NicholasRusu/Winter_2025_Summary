module com.example.textmenu {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.textmenu to javafx.fxml;
    exports com.example.textmenu;
}