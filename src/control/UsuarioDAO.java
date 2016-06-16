package control;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import view.Menu;
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
        Usuarios z = new Usuarios();
        z.setLogin(a.getLogin());
        z.setSenha(a.getSenha());
        z.setNome(a.getNome());
        z.setCpf(a.getCpf());
        z.setTipo(a.getTipo());
        accountDao.create(a);
    }

    @Override
    public void delete(Usuarios a) throws SQLException {
        Dao<Usuarios, String> accountDao =
                DaoManager.createDao(new JdbcConnectionSource("jdbc:sqlite:test.db"), Usuarios.class);
        a.getId();
        accountDao.delete(a);
    }

    @Override
    public void alterar(Usuarios a) throws SQLException {
        Dao<Usuarios, String> accountDao =
                DaoManager.createDao(new JdbcConnectionSource("jdbc:sqlite:test.db"), Usuarios.class);
        Usuarios z = new Usuarios();
        z.setLogin(a.getLogin());
        z.setSenha(a.getSenha());
        z.setNome(a.getNome());
        z.setCpf(a.getCpf());
        z.setTipo(a.getTipo());
        accountDao.update(a);
    }

    @Override
    public List<Usuarios> listar(Usuarios a) throws SQLException {
        List<Usuarios> Usuarios = new ArrayList<>();
            try {   PreparedStatement stmt;
                    stmt = connection.prepareStatement("select * from Usuarios");
                    // executa um select
                    ResultSet rs = stmt.executeQuery();
                    // itera no ResultSet
                    while (rs.next()) {
                        int id = rs.getInt("Id");
                        String nome = rs.getString("nome");
                        Usuarios usuarios = new Usuarios();
                        usuarios.setId(id);
                        usuarios.setNome(nome);
                        
                    }
                    rs.close();
                    stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return Usuarios;
    }
 
   

   


  

   
}
