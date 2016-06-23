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
import model.Evento;
import model.Notas;
import modelDB.ArtigoDAO;
import model.Usuarios;
import view.Menu2;

public class Main {

    public Main() throws SQLException {
        
        /*
        TableUtils.createTable(new JdbcConnectionSource("jdbc:sqlite:banco.db"), Usuarios.class);
        TableUtils.createTable(new JdbcConnectionSource("jdbc:sqlite:banco.db"), Artigo.class);
        TableUtils.createTable(new JdbcConnectionSource("jdbc:sqlite:banco.db"), Evento.class);
        TableUtils.createTable(new JdbcConnectionSource("jdbc:sqlite:banco.db"), Notas.class);
        */
      
    }

    public static void main(String[] args) throws SQLException {
        new Main ();
        
       
        
    }

}
