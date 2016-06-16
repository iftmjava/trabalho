package control;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import control.Usuarios;
import control.UsuarioDAO;
import model.Main;
public class CRUD2 {
    private Connection connection = null;

    public CRUD2(){
        this.connection = new ConnectionFactory().getConnection();
    }
    //Metodos do CRUD
    public void cadastro(Usuarios usuario) {
     
   
        
            String nome = JOptionPane.showInputDialog("Digite o seu login");
           
                usuario = new Usuarios();
                usuario.setLogin(nome);
                usuario.setSenha(JOptionPane.showInputDialog("Digite sua senha"));
                usuario.setNome(JOptionPane.showInputDialog("Digite o seu nome"));
                usuario.setCpf(JOptionPane.showInputDialog("Digite o seu cpf"));
                Main.usuario.insert(usuario);
       
                JOptionPane.showMessageDialog(null, "O nome de login já existe");
           
        
            JOptionPane.showMessageDialog(null, "Não é possivel cadastrar mais usuarios");
        
    }

    public void criacaoEvento(EventoDAO evento) {
        if (evento.event.getEventoCriado() == false) {
            evento.event.setNome(JOptionPane.showInputDialog("Digite o nome do evento"));
            evento.event.setData(LocalDate.now());
            evento.event.setEdicao(Integer.parseInt(JOptionPane.showInputDialog("Digite a edição do evento")));
            evento.event.setArea(JOptionPane.showInputDialog("Digite a área do evento"));
            evento.event.setnArtigosAceitos(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de artigos que serão aceitos")));
            evento.event.setPeriodoEvento(Integer.parseInt(JOptionPane.showInputDialog("Digite quantos dias durará o evento")));
            evento.event.setDataLimite(evento.event.getData().plusDays(evento.event.getPeriodoEvento()));
            evento.event.setEventoCriado(true);
        } else {
            JOptionPane.showMessageDialog(null, "O evento já foi criado");
        }
    }
    
    
    
    public void criacaoArtigo(Artigo artigo, Usuarios usuario, EventoDAO evento) {
        artigo = new Artigo();
        //Criando artigo
        artigo.setNome(JOptionPane.showInputDialog("Digite o nome do artigo"));
       // artigo.setAutor(usuario.getNome());
        artigo.setArea(JOptionPane.showInputDialog("Digite a sua area"));
        artigo.setResumo(JOptionPane.showInputDialog("Escreva o resumo do seu artigo"));
        
        String sql = "insert into contatos " 
                + "(nome,autor,area,resumo,iduser,idartigo)" + " values (?,?,?,?,?,?)";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
                     
            stmt.setString(1, artigo.getNome());
           // stmt.setString(2, artigo.getAutor());
            stmt.setString(3, artigo.getArea());
            stmt.setString(4, artigo.getResumo());
            //stmt.setInt(6, artigo.getIdArtigo());
            
            stmt.execute();
            stmt.close();
            
            System.out.println("Elemento inserido com suscesso");
        }catch(SQLException e){
            throw new RuntimeException();
        }
        
        /*
        if (evento.event.getEventoCriado()) {
            int i;
            if (evento.event.getEventoCriado() == true) {
                i = artigo.verificaNulo(artigo);
                if (evento.validarData(artigo, evento)) {
                    if (i != -1) {
                        artigo.article[i] = new Artigo();
                        artigo.article[i].setNome(JOptionPane.showInputDialog("Digite o nome do artigo"));
                        artigo.article[i].setAutor(usuario.getNome());
                        artigo.article[i].setArea(JOptionPane.showInputDialog("Digite a sua area"));
                        artigo.article[i].setResumo(JOptionPane.showInputDialog("Escreva o resumo do seu artigo"));
                        artigo.article[i].setIdUser(usuario.getId());
                        artigo.article[i].setIdArtigo(i);
                    } else {
                        JOptionPane.showMessageDialog(null, "Não é possivel submeter mais artigos.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "O tempo limite para submeter artigos foi atingido.");
                }
            }
        } else { //CASO O CHAIR NÃO TENHA CRIADO O EVENTO
            JOptionPane.showMessageDialog(null, "O evento ainda não foi criado.");
        }*/
    }
}
