package org.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/customersdb", user = "mariahford", pw = "password";
        return DriverManager.getConnection(url, user, pw);
    }
}
