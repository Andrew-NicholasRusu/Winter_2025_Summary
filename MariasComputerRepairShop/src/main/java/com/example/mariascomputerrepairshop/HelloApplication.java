package com.example.mariascomputerrepairshop;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private double total = 0.0;
    private Label totalLabel;

    @Override
    public void start(Stage stage) throws IOException {

        stage.setTitle("Joe's Automotive");
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setVgap(10);
        grid.setHgap(10);

        Button virusRemovalBtn = new Button("Virus Removal $45");
        Button hardwareDiagnosticsBtn = new Button("Hardware Diagnostics $35");
        Button operatingSystemReinstallationBtn = new Button ("Operating System Reinstallation $60");
        Button dataBackupBtn = new Button ("Data Backup $50");
        Button softwareInstallationBtn = new Button("Software Installation $25");
        Button laptopScreenReplacementBtn = new Button("Laptop Screen Replacement $150");
        Button batteryReplacementBtn = new Button("Battery Replacemnt $80");
        Button mouseFunctionsBtn = new Button("Mouse Functions $10");

        virusRemovalBtn.setOnAction(e -> addService(45));
        hardwareDiagnosticsBtn.setOnAction(e -> addService(35));
        operatingSystemReinstallationBtn.setOnAction(e -> addService(60));
        dataBackupBtn.setOnAction(e -> addService(50));
        softwareInstallationBtn.setOnAction(e -> addService(25));
        laptopScreenReplacementBtn.setOnAction(e -> addService(150));
        batteryReplacementBtn.setOnAction(e -> addService(80));
        mouseFunctionsBtn.setOnAction(e -> addService(10));

        TextField partsField = new TextField();
        TextField laborField = new TextField();
        Button addPartsBtn = new Button("Add Parts Charges");
        Button addLaborBtn = new Button("Add Labor Charges");

        totalLabel = new Label ("Total; 0.00");

        addPartsBtn.setOnAction(e -> {
            try {
                double parts = Double.parseDouble(partsField.getText());
                addService(parts);
                partsField.clear();
            } catch (NumberFormatException ex) {
                showError("Invalid parts input!");
            }
        });

        addLaborBtn.setOnAction(e -> {
            try {
                double hours = Double.parseDouble(laborField.getText());
                addService(hours * 30);
                laborField.clear();
            } catch (NumberFormatException ex) {
                showError("Invalid labor input!");
            }
        });

        grid.add(virusRemovalBtn, 0, 0);
        grid.add(hardwareDiagnosticsBtn, 0, 1);
        grid.add(operatingSystemReinstallationBtn, 0, 2);
        grid.add(dataBackupBtn, 0, 3 );
        grid.add(softwareInstallationBtn, 0, 4);
        grid.add(laptopScreenReplacementBtn, 0, 5);
        grid.add(batteryReplacementBtn, 0, 6);
        grid.add(mouseFunctionsBtn, 0, 7);

        grid.add(new Label("Parts:"), 0, 8);
        grid.add(partsField, 1, 8);
        grid.add(addPartsBtn, 2, 8);

        grid.add(new Label("Hours:"), 0, 9);
        grid.add(laborField, 1, 9);
        grid.add(addLaborBtn, 2, 9);

        grid.add(totalLabel, 0, 10, 3, 1);

        Scene scene = new Scene(grid, 450, 400);
        stage.setScene(scene);
        stage.show();

    }

    private void addService(double amount) {
        total += amount;
        totalLabel.setText(String.format("Total: %,.2f", total));
    }

    private void showError(String msg) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Input Error");
        alert.setContentText(msg);
        alert.showAndWait();

    }

    public static void main(String[] args) {
        launch();
    }
}
