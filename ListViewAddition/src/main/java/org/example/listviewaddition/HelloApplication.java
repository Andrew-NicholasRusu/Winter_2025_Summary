package org.example.listviewaddition;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.collections.ObservableList;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class HelloApplication extends Application
{
    public static void main (String[] args)
    {
        // Launch the application
        launch(args);
    }

    @Override
    public void start (Stage primaryStage)
    {
        // Constants for the ListView width and height
        final double WIDTH = 1200, HEIGHT = 100.0;

        // Create a ListView of Integers.
        ListView<Integer> listView = new ListView<>();
        listView.setPrefSize(WIDTH, HEIGHT);
        listView.getItems().addAll(3, 6, 9, 12, 15, 18, 21, 24,
                27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57, 60);
        listView.getSelectionModel().setSelectionMode(
                SelectionMode.MULTIPLE);

        // Create a Label ti display the selection.
        Label outputLabel = new Label ("Select Some Numbers");

        // Create a Button to get the selection.
        Label totalButton = new Label ("Select Some Numbers");

        // Create an event handler for the Button.
        totalButton.setOnAction(event ->
        {
            // Determine whether an item is selected.
            if (listView.getSelectionModel().getSelectedIndex() != -1)
            {
                // Get the ObservableList of selected items.
                ObservableList<Integer> selections =
                    listView.getSelectionModel().getSelectedItems();

                // Accumulator variable
                int total = 0;

                // Get the sum of the numbers.
                for (int num : selections)
                    total += num;

                // Display the total in the Label.
                outputLabel.setText(Integer.toString(total));
            }
            else
            {
                outputLabel.setText("Nothing Selected");
            }
        });

        // Add the controls to a VBox.
        VBox vbox = new VBox (10, listView, outputLabel, totalButton);
        vbox.setPadding(new Insets(10));
        vbox.setAlignment(Pos.CENTER);

        // Create a Scene and display it.
        Scene scene = new Scene (vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}