module org.example.getselectionmonths {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.example.getselectionmonths to javafx.fxml;
    exports org.example.getselectionmonths;
}