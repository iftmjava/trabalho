package control;


import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;
import model.Artigo;
import model.Evento;
import model.Usuarios;


public class Main {

    public Main() throws SQLException {
        TableUtils.createTable(new JdbcConnectionSource("jdbc:sqlite:banco.db"), Usuarios.class);
        TableUtils.createTable(new JdbcConnectionSource("jdbc:sqlite:banco.db"), Artigo.class);
        TableUtils.createTable(new JdbcConnectionSource("jdbc:sqlite:banco.db"), Evento.class);
        /*
        TableUtils.createTable(new JdbcConnectionSource("jdbc:sqlite:banco.db"), Usuarios.class);
        TableUtils.createTable(new JdbcConnectionSource("jdbc:sqlite:banco.db"), Artigo.class);
        TableUtils.createTable(new JdbcConnectionSource("jdbc:sqlite:banco.db"), Evento.class);
        */
      
    }

    public static void main(String[] args) throws SQLException {
        new Main ();
        
       
        
    }

}
