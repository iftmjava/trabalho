package modelDB;

import modelDB.DAO;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import control.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Notas;

public class NotasDAO implements DAO<Notas> {
    private Connection connection = null;
    //Metodos da NotasDAO
    
    public NotasDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    @Override
    public void insert(Notas a) throws SQLException{
        Dao<Notas, String> accountDao =
        DaoManager.createDao(new JdbcConnectionSource("jdbc:sqlite:banco.db"), Notas.class);
        accountDao.createOrUpdate(a);
       }

    @Override
    public void delete(Notas a) throws SQLException{
        Dao<Notas, String> accountDao =
        DaoManager.createDao(new JdbcConnectionSource("jdbc:sqlite:banco.db"), Notas.class);
        accountDao.delete(a);
    }

    @Override
    public void alterar(Notas a) throws SQLException{
        Dao<Notas, String> accountDao =
        DaoManager.createDao(new JdbcConnectionSource("jdbc:sqlite:banco.db"), Notas.class);
        accountDao.update(a);
    }

    @Override
    public List<Notas> listar() throws SQLException{
        Dao<Notas, String> DADAO =
        DaoManager.createDao(new JdbcConnectionSource("jdbc:sqlite:banco.db"), Notas.class);
        List<Notas> Notas = DADAO.queryForAll();
        return Notas;
    }
}
