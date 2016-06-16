package view;

import javax.swing.JOptionPane;
import control.UsuarioDAO;

public class Menu {

    //Metodos do Menu
    public int menuLogin() {
        // Util.gm({"Z","T"}, msg, titulo);
        return Util.gm(new String[]{"LOGIN", "CADASTRO", "SAIR"}, "O QUE DESEJA FAZER", "MENU LOGIN");
    }

    public int menuCHAIR() {
        return Util.gm(new String[]{"CRIAR EVENTO", "VERIFICAR AVALIAÇÃO", "PROMOVER USUARIO", "VALIDAR ARTIGO", "ATRIBUIR ARTIGO A AVALIADOR", "LOGOUT"}, "O QUE DESEJA FAZER", "MENU CHAIR");
    }

    public int menuAutor() {
        return Util.gm(new String[]{"ENVIAR ARTIGO", "VER RESULTADO DOS ARTIGOS", "LOGOUT"}, "O QUE DESEJA FAZER", "MENU AUTOR");
    }

    public int menuAvaliador() {
        return Util.gm(new String[]{"AVALIAR ARTIGO", "LOGOUT"}, "O QUE DESEJA FAZER", "MENU AVALIADOR");
    }

    public int menuMostraUsuario(UsuarioDAO usuario) { //Mostrara todos os usuarios
        int i;
        i = usuario.verificaNulo(usuario);
        if (i == -1) {
            i = usuario.user.length;
        }
        StringBuilder builder = new StringBuilder("");
        for (int j = 1; j < i; j++) {
            if (usuario.user[j].getTipo() == 1) {
                builder.append(j + " - " + usuario.user[j].getNome() + "\n");
            }
        }
        builder.append("Qual usuario será promovido");
        if (i != 0) {
            return Integer.parseInt(JOptionPane.showInputDialog(builder.toString()));
        } else {
            JOptionPane.showMessageDialog(null, "Não existe nenhum usuario cadastrado");
            return 0;
        }
        
    }

    public double menuPontuacao() {
        return Util.gm(new String[]{"1", "2", "3", "4", "5"}, "Escolha a nota do artigo", "MENU PONTUAÇÃO");
    }
}
