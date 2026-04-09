module org.example.pizzatoppings {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.pizzatoppings to javafx.fxml;
    exports org.example.pizzatoppings;
}