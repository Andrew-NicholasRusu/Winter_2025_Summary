package com.example.demo_joe;

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

        Button oilChangeBtn = new Button("Oil change $26");
        Button lubeJobBtn = new Button("Lube job $18");
        Button radiatorFlushBtn = new Button ("Radiator flush $30");
        Button transmissionFlushBtn = new Button ("Transmission flush $80");
        Button inspectionBtn = new Button("Inspection $15");
        Button mufflerReplacementBtn = new Button("Muffler replacement $100");
        Button tireRotationBtn = new Button("Tire rotation $20");

        oilChangeBtn.setOnAction(e -> addService(26));
        lubeJobBtn.setOnAction(e -> addService(18));
        radiatorFlushBtn.setOnAction(e -> addService(30));
        transmissionFlushBtn.setOnAction(e -> addService(80));
        inspectionBtn.setOnAction(e -> addService(15));
        mufflerReplacementBtn.setOnAction(e -> addService(100));
        tireRotationBtn.setOnAction(e -> addService(20));

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
                addService(hours * 20);
                laborField.clear();
            } catch (NumberFormatException ex) {
                showError("Invalid labor input!");
            }
        });

        grid.add(oilChangeBtn, 0, 0);
        grid.add(lubeJobBtn, 0, 1);
        grid.add(radiatorFlushBtn, 0, 2);
        grid.add(transmissionFlushBtn, 0, 3 );
        grid.add(inspectionBtn, 0, 4);
        grid.add(mufflerReplacementBtn, 0, 5);
        grid.add(tireRotationBtn, 0, 6);

        grid.add(new Label("Parts:"), 0, 7);
        grid.add(partsField, 1, 7);
        grid.add(addPartsBtn, 2, 7);

        grid.add(new Label("Hours:"), 0, 8);
        grid.add(laborField, 1, 8);
        grid.add(addLaborBtn, 2, 8);

        grid.add(totalLabel, 0, 9, 3, 1);

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







