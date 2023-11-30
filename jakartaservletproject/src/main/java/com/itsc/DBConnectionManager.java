package com.itsc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionManager {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/usersdb";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Nati@2040";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError("Failed to load MySQL JDBC driver");
        }
    }

    private DBConnectionManager() {
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }
}
