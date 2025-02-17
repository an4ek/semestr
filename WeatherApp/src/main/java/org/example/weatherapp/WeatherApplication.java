package org.example.weatherapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class WeatherApplication extends Application {

    DatabaseService databaseService = new DatabaseService();
    String fxmlFile;

    @Override
    public void start(Stage stage) throws IOException {

        fxmlFile = databaseService.hasCityRecord() ? "MainScene.fxml" : "CitySearchScene.fxml";

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlFile));
        Scene scene = new Scene(fxmlLoader.load(), 800, 350);

        stage.setTitle("Погода");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}