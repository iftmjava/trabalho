package modelDB;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import control.ConnectionFactory;
import model.Usuarios;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class UsuarioDAO implements DAO<Usuarios>{

    private Connection connection = null;
    //METODOS DO USUARIO

        public UsuarioDAO() {
            this.connection = new ConnectionFactory().getConnection();
        }
    
    @Override
    public void insert(Usuarios a) throws SQLException {
        Dao<Usuarios, String> accountDao =
                DaoManager.createDao(new JdbcConnectionSource("jdbc:sqlite:test.db"), Usuarios.class);
      
        accountDao.create(a);
    }

    @Override
    public void delete(Usuarios a) throws SQLException {
        Dao<Usuarios, String> accountDao =
                DaoManager.createDao(new JdbcConnectionSource("jdbc:sqlite:test.db"), Usuarios.class);
       
        accountDao.delete(a);
    }

    @Override
    public void alterar(Usuarios a) throws SQLException {
        Dao<Usuarios, String> accountDao =
                DaoManager.createDao(new JdbcConnectionSource("jdbc:sqlite:test.db"), Usuarios.class);
   
        accountDao.update(a);
    }

    @Override
    public List<Usuarios> listar(Usuarios a) throws SQLException {
       Dao<Usuarios, String> DADAO =
            DaoManager.createDao(new JdbcConnectionSource("jdbc:sqlite:test.db"), Usuarios.class);
        
        List<Usuarios> Usuarios = DADAO.queryForAll();
        
            return Usuarios;
    }
 
   

   


  

   
}
