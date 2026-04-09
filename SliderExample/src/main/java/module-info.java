module org.example.sliderexample {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.sliderexample to javafx.fxml;
    exports org.example.sliderexample;
}