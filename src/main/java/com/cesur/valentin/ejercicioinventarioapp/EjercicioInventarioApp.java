package com.cesur.valentin.ejercicioinventarioapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class EjercicioInventarioApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        WindowManager.setStage(stage);
        WindowManager.changeWindowTo("login-view.fxml", "Inventario: Iniciar sesión");
        stage.show();
    }
}
