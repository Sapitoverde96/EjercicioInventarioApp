module com.cesur.valentin.ejercicioinventarioapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;


    opens com.cesur.valentin.ejercicioinventarioapp to javafx.fxml;
    exports com.cesur.valentin.ejercicioinventarioapp;
    exports com.cesur.valentin.ejercicioinventarioapp.controllers;
    opens com.cesur.valentin.ejercicioinventarioapp.controllers to javafx.fxml;
}