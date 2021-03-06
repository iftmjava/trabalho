/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import model.Artigo;
import model.Usuarios;
import modelDB.ArtigoDAO;
import modelDB.UsuarioDAO;

/**
 *
 * @author Euclebio
 */
public class ExcluirContaAutor extends javax.swing.JDialog {

    /**
     * Creates new form ExcluirContaAutor
     */
    Usuarios x = new Usuarios();

    public ExcluirContaAutor(java.awt.Frame parent, boolean modal, Usuarios temp) {
        super(parent, modal);
        initComponents();
        x = temp;
    }
    UsuarioDAO Udao = new UsuarioDAO();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Yes = new javax.swing.JButton();
        NO = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Excluir Conta?");

        jPanel2.setLayout(new java.awt.GridLayout());

        Yes.setText("Sim");
        Yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YesActionPerformed(evt);
            }
        });
        jPanel2.add(Yes);

        NO.setText("Nao");
        NO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOActionPerformed(evt);
            }
        });
        jPanel2.add(NO);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(96, 96, 96)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(96, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(328, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(119, 119, 119)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(158, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void YesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesActionPerformed
        ArtigoDAO dao = new ArtigoDAO();
        List<Artigo> artigos = null;
        try {
            artigos = dao.listar();
        } catch (SQLException ex) {
            Logger.getLogger(ExcluirContaAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
        Artigo temp2 = new Artigo();
        
        temp2 = null;
        for (int i = 0;i<artigos.size();i++){
            if(artigos.get(i) != null){
            temp2 = artigos.get(i);
            if(temp2 != null && temp2.getAutor().equals(x)){
                try {
                    dao.delete(temp2);
                } catch (SQLException ex) {
                    Logger.getLogger(ExcluirContaAutor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
        }
        try {
            
            Udao.delete(x);
        } catch (SQLException ex) {
            Logger.getLogger(ExcluirContaAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
            dispose();
            Menu2 menu = new Menu2();
            menu.setVisible(true);
            menu.setDefaultCloseOperation(EXIT_ON_CLOSE);
            menu.setLocationRelativeTo(null);

    


    }//GEN-LAST:event_YesActionPerformed

    private void NOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOActionPerformed
                dispose();
                MenuAutor autor = new MenuAutor(x);
                autor.setSize(500, 500);
                autor.setDefaultCloseOperation(EXIT_ON_CLOSE);
                autor.setLocationRelativeTo(null);
                autor.setVisible(true);
    }//GEN-LAST:event_NOActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NO;
    private javax.swing.JButton Yes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

