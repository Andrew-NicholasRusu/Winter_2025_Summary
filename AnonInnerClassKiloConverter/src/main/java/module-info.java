module org.example.anoninnerclasskiloconverter {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.anoninnerclasskiloconverter to javafx.fxml;
    exports org.example.anoninnerclasskiloconverter;
}