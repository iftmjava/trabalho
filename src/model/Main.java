package model;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.table.TableUtils;
import control.Artigo;
import view.Menu;
import javax.swing.JOptionPane;
import control.ArtigoDAO;
import control.CRUD;
import control.EventoDAO;
import control.SQLITE;
import control.UsuarioDAO;
import control.Usuarios;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
  public static UsuarioDAO usuario = new UsuarioDAO();
  
  
    public Main() throws SQLException {
        
         Connection c = SQLITE.conectar("test");
        
        Statement stmt;
        try {
            stmt = c.createStatement();
                  String sql = "CREATE TABLE COMPANY " +
                   "(ID INT PRIMARY KEY     NOT NULL," +
                   " NAME           TEXT    NOT NULL, " + 
                   " AGE            INT     NOT NULL, " + 
                   " ADDRESS        CHAR(50), " + 
                   " SALARY         REAL)"; 
      stmt.executeUpdate(sql);
      stmt.close();
      c.close();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

      
        CRUD crud = new CRUD();
        Menu menu = new Menu();
      
        EventoDAO evento = new EventoDAO();
        ArtigoDAO artigo = new ArtigoDAO();
        int opc = 0;
        while (opc != 3) {
            opc = menu.menuLogin(); //MENU PARA FAZER LOGIN OU CADASTRAR
            switch (opc) {
                case 1:
                    //Metodo de login
                    int logado; //VARIAVEL QUE GUARDARA A POSIÇÃO QUE O USUARIO SE ENCONTRA NO ARRAY
                    //Verifica se o nome de login existe.
                    logado = usuario.verificaLogin(JOptionPane.showInputDialog("Informe o seu login"), usuario);
                    if (logado != -1) {
                        boolean senhaCorreta;
                        //Compara se a senha digitada esta certa.
                        senhaCorreta = usuario.verificaSenha(JOptionPane.showInputDialog("Informe a sua senha"), usuario, logado);
                        if (senhaCorreta == true) {
                            //Caso a senha esteja correta, o usuario estará logado.
                            int x = 0;
                            switch (usuario.user[logado].getTipo()) { //Pega o tipo do usuario
                                case 0: //Menu do Chair
                                    while (x != 6) {
                                        x = menu.menuCHAIR();
                                        switch (x) {
                                            case 1:
                                                //CRIAR EVENTO
                                                crud.criacaoEvento(evento);
                                                break;
                                            case 2:
                                                //VERIFICAR AVALIAÇÃO FAZER DEPOIS..
                                                artigo.verificarAvaliacao(artigo);
                                                break;
                                            case 3:
                                                //PROMOVER AUTOR PARA AVALIADOR
                                                usuario.promoverUsuario(usuario, artigo);
                                                break;
                                            case 4:
                                                //VALIDAR ARTIGO
                                                artigo.validaArtigo(artigo);
                                                break;
                                            case 5:
                                                //ATRIBUIR ARTIGOS A AVALIADORES
                                                artigo.atribuirArtigo(artigo, usuario);
                                                break;
                                            case 6:
                                                JOptionPane.showMessageDialog(null, "Deslogando!!");
                                                break;
                                        }
                                    }
                                    break;
                                case 1: //Menu do Autor
                                    x = 0;
                                    while (x != 3) {
                                        x = menu.menuAutor();
                                        switch (x) {
                                            case 1:
                                                //ENVIAR ARTIGO
                                                crud.criacaoArtigo(artigo, usuario.user[logado], evento);
                                                break;
                                            case 2:
                                                //VER RESULTADO FINAL
                                                artigo.verificarNotaArtigo(artigo, usuario.user[logado]);
                                                break;
                                            case 3:
                                                JOptionPane.showMessageDialog(null, "Deslogando!!");
                                                break;
                                        }
                                    }
                                    break;
                                case 2: //Menu do Avaliador
                                    x = 0;
                                    while (x != 2) {
                                        x = menu.menuAvaliador();
                                        switch (x) {
                                            case 1:
                                                //AVALIAR ARTIGO
                                                artigo.avaliarArtigo(menu, usuario.user[logado], artigo);
                                                break;
                                            case 2:
                                                JOptionPane.showMessageDialog(null, "Deslogando!!");
                                                break;
                                        }
                                    }
                                    break;
                            }
                        } else {
                            //Caso ela esteja incorreta o usuario terá que 
                            JOptionPane.showMessageDialog(null, "Senha incorreta");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Nome de login não existe");
                    }
                    break;
                case 2:
                    //Metodo de cadastro
                    crud.cadastro();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Fechando o programa!!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }
        }
    }

    public static void main(String[] args) throws SQLException {
       Dao<Artigo, String> accountDao =
  DaoManager.createDao(new JdbcConnectionSource("jdbc:sqlite:test.db"), Artigo.class);
       /* TableUtils.createTable(new JdbcConnectionSource("jdbc:sqlite:test.db"), Artigo.class);
        */
       
       Dao<Usuarios, String> accountDao1 =
  DaoManager.createDao(new JdbcConnectionSource("jdbc:sqlite:test.db"), Usuarios.class);
        Artigo a = new Artigo();
        a.setNome("UPaDATE");
    //    a.setAutor("QQUM");
        Usuarios b = new Usuarios();
        
        b.setNome("LARRASD");
        accountDao1.create(b);
        accountDao.create(a);
        
       
        
        a.autor = b;
 
    }

}
