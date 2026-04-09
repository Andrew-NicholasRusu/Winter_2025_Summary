module org.example.comboboxexample {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.comboboxexample to javafx.fxml;
    exports org.example.comboboxexample;
}