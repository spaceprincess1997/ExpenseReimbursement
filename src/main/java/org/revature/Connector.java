package org.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    public static void getConnection() {
        String url = "jdbc:postgresql://localhost:5432/customersdb", user = "mariahford", pw = "password";
        try {
            Connection conn = DriverManager.getConnection(url, user, pw);
        } catch (SQLException e) {
            System.out.println("Error in connecting to the database:");
            e.printStackTrace();

        }
    }
}
