/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuarios;

/**
 *
 * @author Aluno
 */
public class MenuAutor extends javax.swing.JFrame {

    /**
     * Creates new form MenuAutor
     */
    public Usuarios x = new Usuarios();
    public MenuAutor(Usuarios x) {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipalAutor = new javax.swing.JPanel();
        BotaoEnviarArtigo = new javax.swing.JButton();
        BotaoNotas = new javax.swing.JButton();
        BotaoLogoutAutor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotaoEnviarArtigo.setText("Enviar artigo");
        BotaoEnviarArtigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEnviarArtigoActionPerformed(evt);
            }
        });

        BotaoNotas.setText("Notas");
        BotaoNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNotasActionPerformed(evt);
            }
        });

        BotaoLogoutAutor.setText("Logout");
        BotaoLogoutAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLogoutAutorActionPerformed(evt);
            }
        });

        jLabel1.setText("Menu do Autor");

        javax.swing.GroupLayout PanelPrincipalAutorLayout = new javax.swing.GroupLayout(PanelPrincipalAutor);
        PanelPrincipalAutor.setLayout(PanelPrincipalAutorLayout);
        PanelPrincipalAutorLayout.setHorizontalGroup(
            PanelPrincipalAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalAutorLayout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addGroup(PanelPrincipalAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotaoNotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoLogoutAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoEnviarArtigo, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap(150, Short.MAX_VALUE))
            .addGroup(PanelPrincipalAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelPrincipalAutorLayout.setVerticalGroup(
            PanelPrincipalAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(88, 88, 88)
                .addComponent(BotaoEnviarArtigo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoLogoutAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(225, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipalAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipalAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoEnviarArtigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEnviarArtigoActionPerformed
        CadastrarArtigo cadastro = null;
        try {
            cadastro = new CadastrarArtigo(this, true, x);
        } catch (SQLException ex) {
            Logger.getLogger(MenuAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
        cadastro.setSize(700,600);
        cadastro.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        cadastro.setLocationRelativeTo(null);
        cadastro.setVisible(true);
    }//GEN-LAST:event_BotaoEnviarArtigoActionPerformed

    private void BotaoNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNotasActionPerformed
        VerNotas cadastro = null;
        try {
            cadastro = new VerNotas(this, true, x);
        } catch (SQLException ex) {
            Logger.getLogger(MenuAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
        cadastro.setSize(800,500);
        cadastro.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        cadastro.setLocationRelativeTo(null);
        cadastro.setVisible(true);
    }//GEN-LAST:event_BotaoNotasActionPerformed

    private void BotaoLogoutAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLogoutAutorActionPerformed
        this.dispose();
        Menu2 menu = new Menu2();
        menu.setVisible(true);
        menu.setDefaultCloseOperation(EXIT_ON_CLOSE);
        menu.setLocationRelativeTo(null);
    }//GEN-LAST:event_BotaoLogoutAutorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MenuAutor menu = new MenuAutor(null);
                menu.setVisible(true);
                menu.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                menu.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoEnviarArtigo;
    private javax.swing.JButton BotaoLogoutAutor;
    private javax.swing.JButton BotaoNotas;
    private javax.swing.JPanel PanelPrincipalAutor;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
