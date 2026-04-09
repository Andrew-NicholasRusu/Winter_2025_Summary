module com.example.balldrop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.balldrop to javafx.fxml;
    exports com.example.balldrop;
}