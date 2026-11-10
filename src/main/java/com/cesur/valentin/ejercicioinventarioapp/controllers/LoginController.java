package com.cesur.valentin.ejercicioinventarioapp.controllers;

import com.cesur.valentin.ejercicioinventarioapp.WindowManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class LoginController {
    @FXML
    private BorderPane pneBorderPane;
    @FXML
    private Button btnLogin;
    @FXML
    private Label lblAuthor;
    @FXML
    private VBox vbxVerticalSplit;
    @FXML
    private ImageView imgFotoPerfil;

    @FXML
    public void login(MouseEvent event) {
        WindowManager.changeWindowTo("main-view.fxml", "Inventario: Menú principal");
    }
}
