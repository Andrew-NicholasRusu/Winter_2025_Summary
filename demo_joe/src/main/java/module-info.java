module com.example.demo_joe {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo_joe to javafx.fxml;
    exports com.example.demo_joe;
}