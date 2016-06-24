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
                DaoManager.createDao(new JdbcConnectionSource("jdbc:sqlite:banco.db"), Usuarios.class);
      
        accountDao.createOrUpdate(a);
    }

    @Override
    public void delete(Usuarios a) throws SQLException {
        Dao<Usuarios, String> accountDao =
                DaoManager.createDao(new JdbcConnectionSource("jdbc:sqlite:banco.db"), Usuarios.class);
       
        accountDao.delete(a);
    }

    @Override
    public void alterar(Usuarios a) throws SQLException {
        Dao<Usuarios, String> accountDao =
                DaoManager.createDao(new JdbcConnectionSource("jdbc:sqlite:banco.db"), Usuarios.class);
   
        accountDao.update(a);
    }

    @Override
    public List<Usuarios> listar() throws SQLException {
        try {
            Dao<Usuarios, String> DADAO =
            DaoManager.createDao(new JdbcConnectionSource("jdbc:sqlite:banco.db"), Usuarios.class);
        
        List<Usuarios> Usuarios = DADAO.queryForAll();
        return Usuarios;
            
        } catch (Exception e) {
            
        }
        return null;
    }
    
 
   public Usuarios target(String Login) throws SQLException{
        Dao<Usuarios, String> DADAO =
            DaoManager.createDao(new JdbcConnectionSource("jdbc:sqlite:banco.db"), Usuarios.class);
        try {
            List<Usuarios> logins = DADAO.query(
             DADAO.queryBuilder().where().eq(Usuarios.Confere, Login) 
                    .prepare());
            return logins.get(0);
            
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Login Invalido");
        }
       
               
       return null;
   }
   /*
   public static boolean login(String user, String tsenha) {
       DAOManager DAO = new DAOManager("usuario");
       
   }
   */


  

   
}
