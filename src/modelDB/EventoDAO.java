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
            DaoManager.createDao(new JdbcConnectionSource("jdbc:sqlite:test.db"), Evento.class);
        Evento y = new Evento();
        y.setNome(a.getNome());
        y.setArea(a.getArea());
        y.setData(a.getData());
        y.setDataLimite(a.getData());
        y.setEdicao(a.getEdicao());
        y.setEventoCriado(a.getEventoCriado());
        y.setLimiteArtigos(a.getLimiteArtigos());
        y.setPeriodoEvento(a.getPeriodoEvento());
        y.setnArtigosAceitos(a.getnArtigosAceitos());
        accountDao.create(a);
    }

    @Override
    public void delete(Evento a) throws SQLException {
        Dao<Evento, String> accountDao =
            DaoManager.createDao(new JdbcConnectionSource("jdbc:sqlite:test.db"), Evento.class);
    a.getId();
    accountDao.delete(a);
    }

    @Override
    public void alterar(Evento a) throws SQLException {
        Dao<Evento, String> accountDao =
            DaoManager.createDao(new JdbcConnectionSource("jdbc:sqlite:test.db"), Evento.class);
        Evento y = new Evento();
        y.setNome(a.getNome());
        y.setArea(a.getArea());
        y.setData(a.getData());
        y.setDataLimite(a.getData());
        y.setEdicao(a.getEdicao());
        y.setEventoCriado(a.getEventoCriado());
        y.setLimiteArtigos(a.getLimiteArtigos());
        y.setPeriodoEvento(a.getPeriodoEvento());
        y.setnArtigosAceitos(a.getnArtigosAceitos());
        accountDao.update(y);
    }

    @Override
    public List<Evento> listar(Evento a) throws SQLException {
        Dao<Evento, String> DADAO =
            DaoManager.createDao(new JdbcConnectionSource("jdbc:sqlite:test.db"), Evento.class);
        
        List<Evento> Eventos = DADAO.queryForAll();
        
            return Eventos;
    }
}
