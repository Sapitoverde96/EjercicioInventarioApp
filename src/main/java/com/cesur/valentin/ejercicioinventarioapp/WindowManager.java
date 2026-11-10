package com.cesur.valentin.ejercicioinventarioapp;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class WindowManager {
    private static Stage stage;

    public static void setStage(Stage stage) {
        WindowManager.stage = stage;
        stage.resizableProperty().setValue(false);
    }

    public static void changeWindowTo(String fxmlFile, String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(EjercicioInventarioApp.class.getResource("views/" + fxmlFile));
        Scene scene;
        try {
            scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
            stage.setTitle(title);
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
}
