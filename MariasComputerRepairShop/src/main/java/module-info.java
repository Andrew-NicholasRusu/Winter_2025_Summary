module com.example.mariascomputerrepairshop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mariascomputerrepairshop to javafx.fxml;
    exports com.example.mariascomputerrepairshop;
}