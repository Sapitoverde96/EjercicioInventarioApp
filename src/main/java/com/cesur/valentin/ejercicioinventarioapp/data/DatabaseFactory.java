package com.cesur.valentin.ejercicioinventarioapp.data;

import com.mysql.cj.jdbc.MysqlDataSource;
import javax.sql.DataSource;

public class DatabaseFactory {
    private static final String dbUrl = "jdbc:mysql://localhost:3307/database";
    private static final String username = System.getenv("USER");
    private static final String password = System.getenv("PASSWORD");
    private static DataSource dataSource = null;

    public static DataSource getDataSource() {
        if (dataSource == null) {
            if (username == null && password == null) {
                throw new NullPointerException("Usuario y/o contraseña son obligatorios");
            }
            MysqlDataSource mysqlDatasource = new MysqlDataSource();
            mysqlDatasource.setURL(dbUrl);
            mysqlDatasource.setUser(username);
            mysqlDatasource.setPassword(password);
            dataSource = mysqlDatasource;
        }
        return dataSource;
    }
}
