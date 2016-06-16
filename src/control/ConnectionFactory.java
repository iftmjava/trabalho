package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jbdc:://localhost/fj21", "root", "root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
