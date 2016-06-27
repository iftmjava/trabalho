package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:sqlite:banco.db");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
