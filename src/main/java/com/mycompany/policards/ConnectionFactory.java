package com.mycompany.policards;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String host = "mysql-fe5a95d-eduardo-cd7b.g.aivencloud.com";
    private static final String port = "26327";
    private static final String db = "defaultdb";
    private static final String user = "avnadmin";
    private static final String password = "AVNS_MFlhk9zkp0lB_f-KwXs";

    public static Connection getConnection() throws SQLException {
        String url = String.format("jdbc:mysql://%s:%s/%s?sslMode=REQUIRED", host, port, db);
        return DriverManager.getConnection(url, user, password);
    }
}

