/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.LocaZilla.view;

import com.LocaZilla.control.categoria.CategoriaControle;
import com.LocaZilla.control.categoria.ICategoriaControle;
import com.LocaZilla.model.veiculo.Categoria;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Avell
 */
public class TelaCategoria extends javax.swing.JFrame {

    /**
     * Creates new form TelaCategoria
     */
    ICategoriaControle categoriaControle = new CategoriaControle();

    public TelaCategoria() throws Exception {

        initComponents();

        this.setLocationRelativeTo(null);
        imprimirDadosNaGrid(categoriaControle.listagem());

    }

    ImageIcon img = new ImageIcon("./src/com/LocaZilla/imagens/operador/LocaMini.png");

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonVoltarTelaMarcas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldIdentificador = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jTextFieldVALOR = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCategoria = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jButtonAlterar5 = new javax.swing.JButton();
        jButtonIncluir5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(img.getImage());

        jPanel1.setBackground(java.awt.SystemColor.control);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 188, 69));
        jLabel1.setText("Cadastro de categoria");

        jButtonVoltarTelaMarcas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/LocaZilla/imagens/funcoes/Voltar.png"))); // NOI18N
        jButtonVoltarTelaMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarTelaMarcasActionPerformed(evt);
            }
        });
        jButtonVoltarTelaMarcas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonVoltarTelaMarcasKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButtonVoltarTelaMarcas)
                .addGap(131, 131, 131)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonVoltarTelaMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Id");

        jTextFieldIdentificador.setEnabled(false);
        jTextFieldIdentificador.setPreferredSize(new java.awt.Dimension(60, 30));
        jTextFieldIdentificador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdentificadorActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Descrição");

        jTextFieldDescricao.setToolTipText("");
        jTextFieldDescricao.setPreferredSize(new java.awt.Dimension(60, 30));
        jTextFieldDescricao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldDescricaoFocusGained(evt);
            }
        });
        jTextFieldDescricao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldDescricaoMouseClicked(evt);
            }
        });
        jTextFieldDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldDescricaoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDescricaoKeyTyped(evt);
            }
        });

        jTextFieldVALOR.setPreferredSize(new java.awt.Dimension(60, 30));
        jTextFieldVALOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVALORActionPerformed(evt);
            }
        });
        jTextFieldVALOR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldVALORKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Valor da locação");

        jTableCategoria.setBackground(new java.awt.Color(51, 51, 51));
        jTableCategoria.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(240, 188, 69)));
        jTableCategoria.setForeground(new java.awt.Color(240, 188, 69));
        jTableCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDENTIFICADOR", "DESCRIÇÃO", "VALOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCategoria.setAlignmentX(5.0F);
        jTableCategoria.setColumnSelectionAllowed(true);
        jTableCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableCategoria.setFillsViewportHeight(true);
        jTableCategoria.setFocusCycleRoot(true);
        jTableCategoria.setGridColor(new java.awt.Color(240, 188, 69));
        jTableCategoria.setRowHeight(15);
        jTableCategoria.setShowGrid(false);
        jTableCategoria.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTableCategoriaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTableCategoriaFocusLost(evt);
            }
        });
        jTableCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCategoriaMouseClicked(evt);
            }
        });
        jTableCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableCategoriaKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTableCategoria);
        jTableCategoria.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inserir/Alterar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 3, 12), new java.awt.Color(240, 188, 69))); // NOI18N
        jPanel8.setForeground(new java.awt.Color(240, 188, 69));

        jButtonAlterar5.setBackground(new java.awt.Color(240, 188, 69));
        jButtonAlterar5.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jButtonAlterar5.setForeground(new java.awt.Color(102, 102, 102));
        jButtonAlterar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/LocaZilla/imagens/funcoes/Alterar.png"))); // NOI18N
        jButtonAlterar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterar5ActionPerformed(evt);
            }
        });

        jButtonIncluir5.setBackground(new java.awt.Color(240, 188, 69));
        jButtonIncluir5.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jButtonIncluir5.setForeground(new java.awt.Color(240, 188, 69));
        jButtonIncluir5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/LocaZilla/imagens/funcoes/Mais.png"))); // NOI18N
        jButtonIncluir5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluir5ActionPerformed(evt);
            }
        });
        jButtonIncluir5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonIncluir5KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonIncluir5, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(jButtonAlterar5, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonIncluir5, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAlterar5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldVALOR, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldVALOR, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarTelaMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarTelaMarcasActionPerformed
        // TODO add your handling code here:

        try {

        } catch (Exception e) {

        }

        this.dispose();

    }//GEN-LAST:event_jButtonVoltarTelaMarcasActionPerformed

    private void jButtonVoltarTelaMarcasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonVoltarTelaMarcasKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            super.dispose();
        }
    }//GEN-LAST:event_jButtonVoltarTelaMarcasKeyPressed

    private void jTextFieldIdentificadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdentificadorActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextFieldIdentificadorActionPerformed

    private void jTextFieldDescricaoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoFocusGained
        // TODO add your handling code here:
        //jButtonUpload.setEnabled(true);
    }//GEN-LAST:event_jTextFieldDescricaoFocusGained

    private void jTextFieldDescricaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescricaoMouseClicked

    private void jTextFieldDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            super.dispose();
        }

    }//GEN-LAST:event_jTextFieldDescricaoKeyPressed

    private void jTextFieldDescricaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoKeyTyped
        // TODO add your handling code here:
        char e = evt.getKeyChar();
        evt.setKeyChar(Character.toUpperCase(e));
        if (Character.isDigit(e)) {
            evt.consume();
        }

        //            if (Character.isLowerCase(e)) {
        //            evt.setKeyChar(Character.toUpperCase(e));
        //            }
    }//GEN-LAST:event_jTextFieldDescricaoKeyTyped

    private void jTextFieldVALORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVALORActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextFieldVALORActionPerformed

    private void jTableCategoriaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTableCategoriaFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_jTableCategoriaFocusGained

    private void jTableCategoriaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTableCategoriaFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_jTableCategoriaFocusLost

    private void jTableCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCategoriaMouseClicked
        // TODO add your handling code here:

        try {

            jTextFieldIdentificador.setText(jTableCategoria.getValueAt(jTableCategoria.getSelectedRow(), 0).toString());
            jTextFieldDescricao.setText(jTableCategoria.getValueAt(jTableCategoria.getSelectedRow(), 1).toString());
            jTextFieldVALOR.setText(jTableCategoria.getValueAt(jTableCategoria.getSelectedRow(), 2).toString());

        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jTableCategoriaMouseClicked

    private void jTableCategoriaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableCategoriaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            super.dispose();
        }
    }//GEN-LAST:event_jTableCategoriaKeyPressed

    private void jButtonIncluir5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluir5ActionPerformed
        // TODO add your handling code here:

        try {

            Categoria objeto = new Categoria(0,
                    jTextFieldDescricao.getText(),
                    Float.parseFloat(jTextFieldVALOR.getText()));

            categoriaControle.incluir(objeto);

            imprimirDadosNaGrid(categoriaControle.listagem());

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(this, erro.getMessage());

        }

    }//GEN-LAST:event_jButtonIncluir5ActionPerformed

    private void imprimirDadosNaGrid(ArrayList<Categoria> listaCategoria) {

        try {

            DefaultTableModel model = (DefaultTableModel) jTableCategoria.getModel();

            model.setNumRows(0);

            Iterator<Categoria> lista = listaCategoria.iterator();

            while (lista.hasNext()) {

                String[] saida = new String[3];
                Categoria aux = lista.next();
                saida[0] = aux.getId() + "";
                saida[1] = aux.getDescricao();
                saida[2] = aux.getValorDaLocacao() + "";

                model.addRow(saida);
            }

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }

    private void jButtonIncluir5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonIncluir5KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            super.dispose();
        }
    }//GEN-LAST:event_jButtonIncluir5KeyPressed

    private void jButtonAlterar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterar5ActionPerformed
        // TODO add your handling code here:

        try {

            ICategoriaControle objCategoria = new CategoriaControle();

            Categoria objeto = new Categoria(Integer.parseInt(jTextFieldIdentificador.getText()),
                    jTextFieldDescricao.getText(),
                    Float.parseFloat(jTextFieldVALOR.getText()));

            categoriaControle.alterar(objeto);

            imprimirDadosNaGrid(objCategoria.listagem());

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(this, erro.getMessage());

        }
    }//GEN-LAST:event_jButtonAlterar5ActionPerformed

    private void jTextFieldVALORKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldVALORKeyTyped
        // TODO add your handling code here:
        char e = evt.getKeyChar();
        if (!Character.isDigit(e)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldVALORKeyTyped

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
            java.util.logging.Logger.getLogger(TelaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaCategoria().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(TelaCategoria.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar5;
    private javax.swing.JButton jButtonIncluir5;
    private javax.swing.JButton jButtonVoltarTelaMarcas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCategoria;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldIdentificador;
    private javax.swing.JTextField jTextFieldVALOR;
    // End of variables declaration//GEN-END:variables
}
