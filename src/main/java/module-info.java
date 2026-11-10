module com.cesur.valentin.ejercicioinventarioapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;
    requires java.sql;
    requires mysql.connector.j;


    opens com.cesur.valentin.ejercicioinventarioapp to javafx.fxml;
    exports com.cesur.valentin.ejercicioinventarioapp;
    exports com.cesur.valentin.ejercicioinventarioapp.controllers;
    opens com.cesur.valentin.ejercicioinventarioapp.controllers to javafx.fxml;
}