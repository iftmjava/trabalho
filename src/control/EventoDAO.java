package control;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
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
        accountDao.update(a);
    }

    @Override
    public List<Evento> listar(Evento a) throws SQLException {
        Dao<Evento, String> DADAO =
            DaoManager.createDao(new JdbcConnectionSource("jdbc:sqlite:test.db"), Evento.class);
        
        List<Evento> Eventos = DADAO.queryForAll();
        
        /*List<Evento> Eventos = new ArrayList<>();
            try { PreparedStatement stmt;
                    stmt = connection.prepareStatement("select * from Eventos");
                    // executa um select
                    ResultSet rs = stmt.executeQuery();
                    // itera no resultSet
                    while (rs.next()) {
                        int id = rs.getInt("Id");
                        String nome = rs.getString("nome");
                        Evento evento = new Evento();
                        evento.setId(id);
                        evento.setNome(nome);
                    }
                    rs.close();
                    stmt.close();
                 } catch (SQLException e) {
                     e.printStackTrace();
                 }*/
            return Eventos;
    }
}
