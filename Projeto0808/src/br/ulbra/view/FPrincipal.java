/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.view;

import br.ulbra.dao.Tarefas;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author s.lucas
 */
public class FPrincipal extends javax.swing.JFrame {
    
    /**
     * Creates new form FPrincipal
     */
    public FPrincipal() {
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

        lbListaTarefas = new javax.swing.JLabel();
        lbTarefa = new javax.swing.JLabel();
        txtTarefa = new javax.swing.JTextField();
        lbLista = new javax.swing.JLabel();
        btExcluir = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaLista = new javax.swing.JTextArea();
        btLimpar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbListaTarefas.setBackground(new java.awt.Color(153, 0, 153));
        lbListaTarefas.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lbListaTarefas.setForeground(new java.awt.Color(0, 204, 51));
        lbListaTarefas.setText("LISTA PARA AS TAREFAS");
        getContentPane().add(lbListaTarefas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, -10, 520, 150));

        lbTarefa.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lbTarefa.setForeground(new java.awt.Color(51, 153, 255));
        lbTarefa.setText("Tarefa:");
        getContentPane().add(lbTarefa, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));

        txtTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTarefaActionPerformed(evt);
            }
        });
        getContentPane().add(txtTarefa, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 180, 40));

        lbLista.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lbLista.setForeground(new java.awt.Color(255, 255, 51));
        lbLista.setText("Lista:");
        getContentPane().add(lbLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, -1, -1));

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 69, -1));

        txtAreaLista.setColumns(20);
        txtAreaLista.setRows(5);
        jScrollPane1.setViewportView(txtAreaLista);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 720, 128));

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(365, Short.MAX_VALUE)
                .addComponent(btSalvar)
                .addGap(349, 349, 349))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(btSalvar)
                .addContainerGap(257, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void txtTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTarefaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTarefaActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        lista.alterar(Integer.parseInt(JOptionPane.showInputDialog("Informe o número do item")),
        JOptionPane.showInputDialog("Renomeiar a tarefa:"));
        txtAreaLista.setText(lista.listar());
    }//GEN-LAST:event_btEditarActionPerformed
    Tarefas lista = new Tarefas();
    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        lista.salvar(txtTarefa.getText());
        txtAreaLista.setText(lista.listar());
        txtTarefa.setText(null);
        txtTarefa.requestFocus();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        lista.remover(Integer.parseInt(JOptionPane.showInputDialog("Informe o número do item:")));
        txtAreaLista.setText(lista.listar());
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        txtAreaLista.setText(null);
        JOptionPane.showMessageDialog(null, "Lista zerada!");
    }//GEN-LAST:event_btLimparActionPerformed

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
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbLista;
    private javax.swing.JLabel lbListaTarefas;
    private javax.swing.JLabel lbTarefa;
    private javax.swing.JTextArea txtAreaLista;
    private javax.swing.JTextField txtTarefa;
    // End of variables declaration//GEN-END:variables
}