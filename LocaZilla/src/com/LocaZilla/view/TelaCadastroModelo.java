/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.LocaZilla.view;

import com.LocaZilla.DAO.marca.MarcaDAO;
import com.LocaZilla.DAO.modelo.ModeloDAO;
import com.LocaZilla.control.marca.MarcaControle;
import com.LocaZilla.control.modelo.ModeloControle;
import com.LocaZilla.Tools.modelo.TabelaimagemModelo;
import com.LocaZilla.control.marca.IMarcaControle;
import com.LocaZilla.control.marca.MarcaControle;
import com.LocaZilla.control.modelo.IModeloControle;
import com.LocaZilla.control.modelo.ModeloControle;
import com.LocaZilla.model.marca.Marca;
import com.LocaZilla.model.modelo.Modelo;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Action;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pedro
 */
public class TelaCadastroModelo extends javax.swing.JFrame {
    IMarcaControle objetoMarca = new MarcaControle();
    IModeloControle modeloControle = new ModeloControle();
    
    String urlMarca;
    int idListagem =0; 
    /**
     * Creates new form TelaCadastroModelo
     */
    
    
    
    
    public TelaCadastroModelo() {
        
        
        MarcaControle conferirBanco = new MarcaControle();
        
        conferirBanco.conferirBancoDeIDMarca();
        
        ModeloControle bancoDeDadosModelo = new ModeloControle();
        bancoDeDadosModelo.conferirBancoDeDados();
        
        
        
        initComponents();
        jTextFieldDescricaoModelo.setEditable(true);
        jTextFieldDescricaoModelo.requestFocusInWindow();
        jTextFieldUrlModelo.setEditable(false);
        jTextFieldIDOModelo.setEnabled(false);
        
        
        
        preencherCombobox();
        
        
        
        this.setLocationRelativeTo(null);
        
        
        
        
        try {
            imprimirDadosNaGrid(modeloControle.listagemModelo());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }
    }
    
    
    public static void preencherCombobox(){
        String caminhoArquivo = "./src/com/LocaZilla/Dados/marca/Marca.txt";
        File arquivo = new File(caminhoArquivo);
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(arquivo));
            Object[] linhas = br.lines().toArray();
            jComboBoxMarca.removeAllItems();
            
            for (int i = 0; i < linhas.length; i++) {
                String linha = linhas[i].toString();
                String vetorString [] = linha.split(";");
                String marca = vetorString[1];
                jComboBoxMarca.addItem(marca);
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaInicialOperador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void imprimirDadosNaGrid(ArrayList<Modelo>  listaDeModelos) {
            DefaultTableModel model = (DefaultTableModel) jTableModelos.getModel();
            TabelaimagemModelo JtableRenderer = new TabelaimagemModelo();
            jTableModelos.getColumnModel().getColumn(3).setCellRenderer(JtableRenderer);
            jTableModelos.getColumnModel().getColumn(4).setCellRenderer(JtableRenderer);
            
            Collections.sort(listaDeModelos);
            model.setNumRows(0);
            Iterator<Modelo> lista = listaDeModelos.iterator();               
            
            while (lista.hasNext()) {
                try {
                    String[] saida = new String[5];
                    Modelo aux = lista.next();
                    saida[0] = "" + aux.getIdModelo();
                    saida[1] = aux.getDescricao();
                    saida[2] = aux.getUrl();
                    saida[3]= "";
                    saida [4] = objetoMarca.buscar(aux.getMarca().getId()).getUrl();
//                    
//
//                    
//Incluir nova linha na Tabela
                    //Object[] dados = {saida[0], saida[1], saida[2],saida[3],iconlogo};
                    model.addRow(saida);
                    
                } catch (Exception ex) {
                    Logger.getLogger(TelaCadastroModelo.class.getName()).log(Level.SEVERE, null, ex);
                }
        
            }
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButtonVoltarTelaMarcas = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldIDOModelo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDescricaoModelo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldUrlModelo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableModelos = new javax.swing.JTable();
        JLabelModelo = new javax.swing.JLabel();
        jComboBoxMarca = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButtonAlterar = new javax.swing.JButton();
        jButtonIncluir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButtonUpload = new javax.swing.JButton();
        jToggleButtonAbrirCadastrar = new javax.swing.JToggleButton();
        jLabelMarca = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Modelo");
        setIconImage(img.getImage());
        setPreferredSize(new java.awt.Dimension(800, 700));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 188, 69));
        jLabel2.setText("Cadastro de Modelo");

        jButtonVoltarTelaMarcas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/LocaZilla/imagens/funcoes/Voltar.png"))); // NOI18N
        jButtonVoltarTelaMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarTelaMarcasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButtonVoltarTelaMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158)
                .addComponent(jLabel2)
                .addContainerGap(171, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jButtonVoltarTelaMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Id");

        jTextFieldIDOModelo.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Descrição");

        jTextFieldDescricaoModelo.setToolTipText("");
        jTextFieldDescricaoModelo.setPreferredSize(new java.awt.Dimension(60, 30));
        jTextFieldDescricaoModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldDescricaoModeloKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDescricaoModeloKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("URL");

        jTextFieldUrlModelo.setEditable(false);
        jTextFieldUrlModelo.setFocusable(false);
        jTextFieldUrlModelo.setPreferredSize(new java.awt.Dimension(60, 30));
        jTextFieldUrlModelo.setVerifyInputWhenFocusTarget(false);
        jTextFieldUrlModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUrlModeloActionPerformed(evt);
            }
        });

        jTableModelos.setBackground(new java.awt.Color(51, 51, 51));
        jTableModelos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(240, 188, 69)));
        jTableModelos.setForeground(new java.awt.Color(240, 188, 69));
        jTableModelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDENTIFICADOR", "NOME", "URL", "MODELO", "MARCA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableModelos.setAlignmentX(5.0F);
        jTableModelos.setColumnSelectionAllowed(true);
        jTableModelos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableModelos.setFillsViewportHeight(true);
        jTableModelos.setFocusCycleRoot(true);
        jTableModelos.setGridColor(new java.awt.Color(240, 188, 69));
        jTableModelos.setRowHeight(100);
        jTableModelos.setShowGrid(false);
        jTableModelos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTableModelosFocusGained(evt);
            }
        });
        jTableModelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableModelosMouseClicked(evt);
            }
        });
        jTableModelos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableModelosKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTableModelos);
        if (jTableModelos.getColumnModel().getColumnCount() > 0) {
            jTableModelos.getColumnModel().getColumn(4).setCellRenderer(new com.LocaZilla.Tools.modelo.TabelaimagemModelo());
        }
        jTableModelos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        JLabelModelo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(240, 188, 69), new java.awt.Color(240, 188, 69)));

        jComboBoxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        jComboBoxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMarcaActionPerformed(evt);
            }
        });
        jComboBoxMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBoxMarcaKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Marca");

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inserir/Alterar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 3, 12), new java.awt.Color(240, 188, 69))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(240, 188, 69));

        jButtonAlterar.setBackground(new java.awt.Color(240, 188, 69));
        jButtonAlterar.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jButtonAlterar.setForeground(new java.awt.Color(102, 102, 102));
        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/LocaZilla/imagens/funcoes/Alterar.png"))); // NOI18N
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonIncluir.setBackground(new java.awt.Color(240, 188, 69));
        jButtonIncluir.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jButtonIncluir.setForeground(new java.awt.Color(240, 188, 69));
        jButtonIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/LocaZilla/imagens/funcoes/Mais.png"))); // NOI18N
        jButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirActionPerformed(evt);
            }
        });
        jButtonIncluir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonIncluirKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Modelo");

        jButtonUpload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/LocaZilla/imagens/operador/uploadicon_1.png"))); // NOI18N
        jButtonUpload.setEnabled(false);
        jButtonUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUploadActionPerformed(evt);
            }
        });

        jToggleButtonAbrirCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jToggleButtonAbrirCadastrar.setText("Cadastrar Marca");
        jToggleButtonAbrirCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonAbrirCadastrarActionPerformed(evt);
            }
        });
        jToggleButtonAbrirCadastrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jToggleButtonAbrirCadastrarKeyPressed(evt);
            }
        });

        jLabelMarca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Marca");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButtonAbrirCadastrar)
                            .addComponent(jTextFieldIDOModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldDescricaoModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldUrlModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBoxMarca, 0, 235, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonUpload)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabelModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldIDOModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldDescricaoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldUrlModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBoxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(15, 15, 15)
                                .addComponent(jToggleButtonAbrirCadastrar))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JLabelModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarTelaMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarTelaMarcasActionPerformed
        // TODO add your handling code here:

        super.dispose();
        
    }//GEN-LAST:event_jButtonVoltarTelaMarcasActionPerformed

    private void jTextFieldUrlModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUrlModeloActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextFieldUrlModeloActionPerformed

    private void jTableModelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableModelosMouseClicked
        // TODO add your handling code here:
        try {

            this.jTextFieldIDOModelo.setText((String) this.jTableModelos.getValueAt(jTableModelos.getSelectedRow(), 0));
            this.jTextFieldDescricaoModelo.setText((String) this.jTableModelos.getValueAt(jTableModelos.getSelectedRow(), 1));
            this.jTextFieldUrlModelo.setText((String) this.jTableModelos.getValueAt(jTableModelos.getSelectedRow(), 2));
            
            String nomeArquivo = (String) this.jTableModelos.getValueAt(jTableModelos.getSelectedRow(), 2);

            jTextFieldUrlModelo.setText(nomeArquivo);
            ImageIcon iconLogo = new ImageIcon(nomeArquivo);
            iconLogo.setImage(iconLogo.getImage().getScaledInstance(JLabelModelo.getWidth(), JLabelModelo.getHeight(), java.awt.Image.SCALE_SMOOTH));
            JLabelModelo.setIcon(iconLogo);

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Selecione um modelo válido já cadastrado!");
        }
    }//GEN-LAST:event_jTableModelosMouseClicked

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:
        if(jTextFieldIDOModelo.getText().equals("")){
               JOptionPane.showMessageDialog(this, "Selecione uma modelo antes de alterar.");
           }else{
        try {
            int idMarca = 0;
            Modelo obj = new Modelo(Integer.parseInt(jTextFieldIDOModelo.getText()), 
                    jTextFieldDescricaoModelo.getText(), 
                    jTextFieldUrlModelo.getText(), objetoMarca.buscar(jComboBoxMarca.getSelectedItem().toString()));
             ArrayList<Marca> lista = objetoMarca.listagem();
            for (int i = 0; i < lista.size(); i++) {
                if (jComboBoxMarca.getSelectedItem().equals(lista.get(i).getDescricao())) {
                    obj.setMarca(lista.get(i));
                }
            }
                    
            modeloControle.alterarModelo(obj);
            imprimirDadosNaGrid(modeloControle.listagemModelo());
            jTextFieldIDOModelo.setText("");
            jTextFieldDescricaoModelo.setText("");
            jTextFieldUrlModelo.setText("");
            JLabelModelo.setIcon(null);

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
            
            }
        }

    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
        // TODO add your handling code here:

         try {
           
            int idMarca = 0;
            objetoMarca.buscar(idMarca);
            
            Modelo objeto = new Modelo(0, jTextFieldDescricaoModelo.getText().trim(), jTextFieldUrlModelo.getText(), 
                    objetoMarca.buscar(jComboBoxMarca.getSelectedItem().toString()));
            ArrayList<Marca> lista = objetoMarca.listagem();
            for(int i = 0; i < lista.size(); i++){
                if(jComboBoxMarca.getSelectedItem().equals(lista.get(i).getDescricao())){
                    objeto.setMarca(lista.get(i));
                }
            }
            
            modeloControle.vazio(objeto);
            modeloControle.semFoto(objeto);
            modeloControle.mesmaFoto(objeto);       
            modeloControle.incluirModelo(objeto);
            imprimirDadosNaGrid(modeloControle.listagemModelo());
            
            
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
         jTextFieldIDOModelo.setText("");
         jTextFieldDescricaoModelo.setText("");
         jTextFieldUrlModelo.setText("");
         JLabelModelo.setIcon(null);
    }//GEN-LAST:event_jButtonIncluirActionPerformed

    private void jButtonUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUploadActionPerformed
        // TODO add your handling code here:

        //Ao apertar UPLOAD, isso acontece.
        try {
            JFileChooser fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fc.addChoosableFileFilter(new FileNameExtensionFilter("Image files",new String[] { "png", "jpg", "jpeg", "gif" }));
            fc.setCurrentDirectory(new File("C:\\"));
                Action details = fc.getActionMap().get("Go Up");
                details.actionPerformed(null);
                details.actionPerformed(null);
                fc.showOpenDialog(this);
                File arquivo = fc.getSelectedFile();
                if(arquivo != null){

                    String nomeDoArquivo = arquivo.getPath();
                    jTextFieldUrlModelo.setText(nomeDoArquivo);
                    ImageIcon iconLogo = new ImageIcon(nomeDoArquivo);
                    iconLogo.setImage(iconLogo.getImage().getScaledInstance(
                        JLabelModelo.getWidth(),JLabelModelo.getHeight(),1));
                JLabelModelo.setIcon(iconLogo);
                File origemArquivo = new File(nomeDoArquivo);
                File destinoArquivo = new File("./src/com/LocaZilla/Dados/modelo/ImagemModelo/"+arquivo.getName());

                String saidaMascara = destinoArquivo+"";    

                jTextFieldUrlModelo.setText(saidaMascara.replace(".JPEG",""));

                try {

                    Files.copy(origemArquivo.toPath(), destinoArquivo.toPath(),StandardCopyOption.REPLACE_EXISTING);

                } catch (Exception e) {
                }

            }

        }    catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }

    }//GEN-LAST:event_jButtonUploadActionPerformed

    private void jToggleButtonAbrirCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonAbrirCadastrarActionPerformed
        // TODO add your handling code here:
        TelaDasMarcas telaDasMarcas = new TelaDasMarcas();
        telaDasMarcas.setVisible(true);
        
    }//GEN-LAST:event_jToggleButtonAbrirCadastrarActionPerformed

    private void jTextFieldDescricaoModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoModeloKeyTyped
        // TODO add your handling code here:
        char e = evt.getKeyChar();
        evt.setKeyChar(Character.toUpperCase(e));
        
        if(Character.isLetter(e)) {
                jButtonUpload.setEnabled(true);
        } else {
                jButtonUpload.setEnabled(false);
        }

    }//GEN-LAST:event_jTextFieldDescricaoModeloKeyTyped

    private void jComboBoxMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMarcaActionPerformed
        // TODO add your handling code here:
        ImageIcon imagem = new ImageIcon("./src/com/LocaZilla/Dados/marca/ImagemMarca/" + 
                jComboBoxMarca.getSelectedItem().toString() + ".png");
                imagem.setImage(imagem.getImage().getScaledInstance(114, 120, 0));
                jLabelMarca.setIcon(imagem);
        
        
    }//GEN-LAST:event_jComboBoxMarcaActionPerformed

    private void jTextFieldDescricaoModeloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoModeloKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            super.dispose();
        }
    }//GEN-LAST:event_jTextFieldDescricaoModeloKeyPressed

    private void jButtonIncluirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonIncluirKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            super.dispose();
        }
    }//GEN-LAST:event_jButtonIncluirKeyPressed

    private void jToggleButtonAbrirCadastrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jToggleButtonAbrirCadastrarKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            super.dispose();
        }
    }//GEN-LAST:event_jToggleButtonAbrirCadastrarKeyPressed

    private void jComboBoxMarcaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxMarcaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            super.dispose();
        }
    }//GEN-LAST:event_jComboBoxMarcaKeyPressed

    private void jTableModelosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableModelosKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            super.dispose();
        }
    }//GEN-LAST:event_jTableModelosKeyPressed

    private void jTableModelosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTableModelosFocusGained
        // TODO add your handling code here:
        jButtonUpload.setEnabled(true);
    }//GEN-LAST:event_jTableModelosFocusGained

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
            java.util.logging.Logger.getLogger(TelaCadastroModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroModelo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelModelo;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JButton jButtonUpload;
    private javax.swing.JButton jButtonVoltarTelaMarcas;
    public static javax.swing.JComboBox<String> jComboBoxMarca;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableModelos;
    private javax.swing.JTextField jTextFieldDescricaoModelo;
    private javax.swing.JTextField jTextFieldIDOModelo;
    private javax.swing.JTextField jTextFieldUrlModelo;
    private javax.swing.JToggleButton jToggleButtonAbrirCadastrar;
    // End of variables declaration//GEN-END:variables
}
