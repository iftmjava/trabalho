package view;

import javax.swing.JOptionPane;

public class Util {

    public static int gm(String[] botoes, String msg, String titulo) {
        return JOptionPane.showOptionDialog(null, msg, titulo, 0, 2, null, botoes, botoes[0]) + 1;
    }
}
