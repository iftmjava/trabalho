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
import model.Artigo;


public class ArtigoDAO implements DAO<Artigo>{

 private Connection connection = null;
    //Metodos do ArtigoDAO
    
    public ArtigoDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}
    
    
    
     @Override
    public void insert(Artigo a) throws SQLException{
         Dao<Artigo, String> accountDao =
            DaoManager.createDao(new JdbcConnectionSource("jdbc:sqlite:test.db"), Artigo.class);
         Artigo x = new Artigo();
         x.setNome(a.getNome());
         x.setArea(a.getArea());
         x.setAutor(a.getAutor());
         x.setComentario(a.getComentario());
         x.setResumo(a.getResumo());
         x.setAvaliador(a.getAvaliador());
         accountDao.create(a);
         
       }

    @Override
    public void delete(Artigo a) throws SQLException{
    Dao<Artigo, String> accountDao =
            DaoManager.createDao(new JdbcConnectionSource("jdbc:sqlite:test.db"), Artigo.class);
    a.getId();
    accountDao.delete(a);
    
       
    }

    @Override
    public void alterar(Artigo a) throws SQLException{
          Dao<Artigo, String> accountDao =
            DaoManager.createDao(new JdbcConnectionSource("jdbc:sqlite:test.db"), Artigo.class);
         Artigo x = new Artigo();
         x.setNome(a.getNome());
         x.setArea(a.getArea());
         x.setAutor(a.getAutor());
         x.setComentario(a.getComentario());
         x.setResumo(a.getResumo());
         x.setAvaliador(a.getAvaliador());
         accountDao.update(x);
       
         
    }

    @Override
    public List<Artigo> listar(Artigo a) throws SQLException{
     Dao<Artigo, String> DADAO =
            DaoManager.createDao(new JdbcConnectionSource("jdbc:sqlite:test.db"), Artigo.class);
        
        List<Artigo> Artigos = DADAO.queryForAll();
        
		return Artigos;
         
         
    }
   
}
