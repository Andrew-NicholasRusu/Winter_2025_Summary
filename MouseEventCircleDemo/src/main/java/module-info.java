module com.example.mouseeventcircledemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mouseeventcircledemo to javafx.fxml;
    exports com.example.mouseeventcircledemo;
}