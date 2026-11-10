package com.cesur.valentin.ejercicioinventarioapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class EjercicioInventarioApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(EjercicioInventarioApp.class.getResource("views/login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Inventario App");
        stage.setScene(scene);
        stage.show();
    }
}
