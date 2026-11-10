package com.cesur.valentin.ejercicioinventarioapp.controllers;

import com.cesur.valentin.ejercicioinventarioapp.WindowManager;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class MainController {
    @FXML
    private TableColumn tbcId;
    @FXML
    private TableView tbvInventoryTable;
    @FXML
    private TableColumn tbcCategory;
    @FXML
    private BorderPane pneBorderPane;
    @FXML
    private Button btnNew;
    @FXML
    private TableColumn tbcName;
    @FXML
    private TableColumn tbcAvailability;
    @FXML
    private Separator sprSeparator;
    @FXML
    private HBox hbxHorizontalSplit;
    @FXML
    private Label lblTitle;

    @FXML
    public void add(ActionEvent actionEvent) {
        WindowManager.changeWindowTo("create-view.fxml", "Inventario: Añadir equipo");
    }
}
