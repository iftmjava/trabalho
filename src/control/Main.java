package control;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.table.TableUtils;
import javax.swing.JOptionPane;
import modelDB.EventoDAO;
import control.SQLITE;
import java.awt.Menu;
import modelDB.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Artigo;
import modelDB.ArtigoDAO;
import model.Usuarios;
import view.Menu2;

public class Main {

    public Main() throws SQLException {
        
         Connection c = SQLITE.conectar("test");
        
        Statement stmt;
        try {
            stmt = c.createStatement();
                  String sql = "CREATE TABLE COMPANY " +
                   "(ID INT PRIMARY KEY     NOT NULL," +
                   " NAME           TEXT    NOT NULL, " + 
                   " AGE            INT     NOT NULL, " + 
                   " ADDRESS        CHAR(50), " + 
                   " SALARY         REAL)"; 
      stmt.executeUpdate(sql);
      stmt.close();
      c.close();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
    }

    public static void main(String[] args) throws SQLException {
        new Main ();
        
       
        
    }

}
