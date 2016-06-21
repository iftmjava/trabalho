/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDB;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Evento;

/**
 *
 * @author Aluno
 */
public class AdministraDAO {
    
AdministraDAO.EVENTO
    /**
     *
     */
    public static Dao<Evento, String> EVENTO = DaoManager.createDao(new JdbcConnectionSource("jdbc:sqlite:test.db"), Evento.class);

}
