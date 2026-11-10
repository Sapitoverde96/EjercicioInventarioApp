package com.cesur.valentin.ejercicioinventarioapp.controllers;

import javafx.fxml.FXML;
import com.cesur.valentin.ejercicioinventarioapp.WindowManager;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class CreateController {
    @FXML
    private Button btnCancel;
    @FXML
    private Label lblName;
    @FXML
    private Button btnSave;
    @FXML
    private Label lblTtitle;
    @FXML
    private DatePicker dtpDate;
    @FXML
    private TextArea txaDescription;
    @FXML
    private TextField txfName;
    @FXML
    private ChoiceBox chbStatus;
    @FXML
    private Label lblDate;
    @FXML
    private Label lblDescription;
    @FXML
    private Label lblStatus;

    @FXML
    public void save(ActionEvent actionEvent) {
    }

    @FXML
    public void returnBack(ActionEvent actionEvent) {
        WindowManager.changeWindowTo("main-view.fxml", "Inventario");
    }
}
