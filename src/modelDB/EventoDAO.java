package modelDB;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import control.ConnectionFactory;
import model.Evento;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EventoDAO implements DAO<Evento> {

    private Connection connection = null;
    //Metodos do EventoDAO
    public EventoDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    @Override
    public void insert(Evento a) throws SQLException {
        Dao<Evento, String> accountDao =
            DaoManager.createDao(new JdbcConnectionSource("jdbc:sqlite:banco.db"), Evento.class);
        
        accountDao.create(a);
    }

    @Override
    public void delete(Evento a) throws SQLException {
     Dao<Evento, String> accountDao =
            DaoManager.createDao(new JdbcConnectionSource("jdbc:sqlite:banco.db"), Evento.class);   
    accountDao.delete(a);
    }

    @Override
    public void alterar(Evento a) throws SQLException {
        Dao<Evento, String> accountDao =
            DaoManager.createDao(new JdbcConnectionSource("jdbc:sqlite:banco.db"), Evento.class);
        accountDao.update(a);
    }

    @Override
    public List<Evento> listar() throws SQLException {
        Dao<Evento, String> DADAO =
            DaoManager.createDao(new JdbcConnectionSource("jdbc:sqlite:banco.db"), Evento.class);
        
        List<Evento> Eventos = DADAO.queryForAll();
        
            return Eventos;
    }
    
  }
