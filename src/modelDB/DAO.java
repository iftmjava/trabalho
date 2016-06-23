/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDB;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Aluno
 */
public interface DAO<T>  {
    public void insert(T a) throws SQLException;
    public void delete(T a) throws SQLException;
    public void alterar(T a) throws SQLException;
    public List<T> listar() throws SQLException;
}
