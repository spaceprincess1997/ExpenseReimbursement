package org.revature;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthRepository {

    private String email;
    private String password;
    private Connection conn;

    public AuthRepository(String email, String password) throws SQLException {
        this.email = email;
        this.password = password;
        conn = Connector.getConnection();
    }

    public boolean exists() throws SQLException {
        String query = "SELECT * FROM customers.users where email = ?";
        PreparedStatement statement = conn.prepareStatement(query);
        statement.setString(1, this.email);
        ResultSet result = statement.executeQuery();
        return result.next();
    }
    public void login() throws SQLException {
        if (this.exists()) {
            // TODO
        }
    }

    public void register() {
        // TODO
    }

    public void register(String role) {
        // TODO
    }
}
