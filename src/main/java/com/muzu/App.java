package com.muzu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setMaximized(true);
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("MuzU Pro");
        primaryStage.show();
    }
}