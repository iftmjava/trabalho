package control;

import javax.swing.JOptionPane;
import java.time.LocalDate;

public class CRUD {

    //Metodos do CRUD
  /*  public void cadastro(UsuarioDAO usuario) {
        int i;
        i = usuario.verificaNulo(usuario);
        if (i != -1) {
            String nome = JOptionPane.showInputDialog("Digite o seu login");
            if (usuario.verificaLoginRepetido(nome, i, usuario)) {
                usuario.user[i] = new Usuarios();
                usuario.user[i].setLogin(nome);
                usuario.user[i].setSenha(JOptionPane.showInputDialog("Digite sua senha"));
                usuario.user[i].setNome(JOptionPane.showInputDialog("Digite o seu nome"));
                usuario.user[i].setCpf(JOptionPane.showInputDialog("Digite o seu cpf"));
                usuario.user[i].setId(i);
            } else {
                JOptionPane.showMessageDialog(null, "O nome de login já existe");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não é possivel cadastrar mais usuarios");
        }
    }
*/
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
    
    public void criacaoArtigo(ArtigoDAO artigo, Usuarios usuario, EventoDAO evento) {
        if (evento.event.getEventoCriado()) {
            int i;
            if (evento.event.getEventoCriado() == true) {
                i = artigo.verificaNulo(artigo);
                if (evento.validarData(artigo, evento)) {
                    if (i != -1) {
                        artigo.article[i] = new Artigo();
                        artigo.article[i].setNome(JOptionPane.showInputDialog("Digite o nome do artigo"));
      //                  artigo.article[i].setAutor(usuario.getNome());
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
        }
    }
}
