package com.example.imagedemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Image image = new Image("file:Squirrel With A Piece of Bread.jpg");

        ImageView imageView = new ImageView(image);

        HBox hbox = new HBox(imageView);

        Scene scene = new Scene(hbox);

        Stage primaryStage = null;
        primaryStage.setScene(scene);

        primaryStage.setTitle("Squirrel With A Piece of Bread");

        primaryStage.show();
    }
}