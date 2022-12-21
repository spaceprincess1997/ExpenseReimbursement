package org.revature;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            AuthRepository test = new AuthRepository("mariahford1997@gmail.com", "password");
            System.out.println(test.exists());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
