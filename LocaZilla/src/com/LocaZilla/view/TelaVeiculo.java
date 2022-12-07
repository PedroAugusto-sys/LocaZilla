/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.LocaZilla.view;

/**
 *
 * @author hugo_
 */
public class TelaVeiculo extends javax.swing.JFrame {

    /**
     * Creates new form TelaVeiculo
     */
    public TelaVeiculo() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFundo = new javax.swing.JPanel();
        jPanelCadastroVeiculo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonVoltarTelaVeiculo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVeiculo = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButtonCadastrarModelo = new javax.swing.JButton();
        jLabelFotoModelo = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldPLACA = new javax.swing.JTextField();
        jComboBoxSITUACAO = new javax.swing.JComboBox<>();
        jTextFieldANOFabricacao = new javax.swing.JTextField();
        jTextFieldANOModelo = new javax.swing.JTextField();
        jComboBoxMODELO = new javax.swing.JComboBox<>();
        jTextFieldKM = new javax.swing.JTextField();
        jComboBoxCOMBUSTIVEL = new javax.swing.JComboBox<>();
        jComboBoxTIPOVeiculo = new javax.swing.JComboBox<>();
        jTextFieldPRECOcompra = new javax.swing.JTextField();
        jTextFieldPRECOvenda = new javax.swing.JTextField();
        jTextFieldRENAVAM = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButtonAlterar = new javax.swing.JButton();
        jButtonIncluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelFundo.setBackground(java.awt.SystemColor.control);

        jPanelCadastroVeiculo.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 188, 69));
        jLabel1.setText("Cadastro de Veículos");

        jButtonVoltarTelaVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/LocaZilla/imagens/funcoes/Voltar.png"))); // NOI18N
        jButtonVoltarTelaVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarTelaVeiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCadastroVeiculoLayout = new javax.swing.GroupLayout(jPanelCadastroVeiculo);
        jPanelCadastroVeiculo.setLayout(jPanelCadastroVeiculoLayout);
        jPanelCadastroVeiculoLayout.setHorizontalGroup(
            jPanelCadastroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroVeiculoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButtonVoltarTelaVeiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(226, 226, 226))
        );
        jPanelCadastroVeiculoLayout.setVerticalGroup(
            jPanelCadastroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroVeiculoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jButtonVoltarTelaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTableVeiculo.setBackground(new java.awt.Color(51, 51, 51));
        jTableVeiculo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(240, 188, 69)));
        jTableVeiculo.setForeground(new java.awt.Color(240, 188, 69));
        jTableVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "PLACA", "SITUAÇÃO", "ANO Fabricação", "ANO Modelo", "MODELO", "ODÔMETRO", "COMBUSTIVEL", "TIPO", "$ COMPRA", "$ VENDA", "RENAVAM"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableVeiculo.setColumnSelectionAllowed(true);
        jTableVeiculo.setFillsViewportHeight(true);
        jTableVeiculo.setFocusCycleRoot(true);
        jTableVeiculo.setGridColor(new java.awt.Color(240, 188, 69));
        jTableVeiculo.setMaximumSize(new java.awt.Dimension(2147483647, 0));
        jTableVeiculo.setMinimumSize(new java.awt.Dimension(75, 0));
        jTableVeiculo.setName(""); // NOI18N
        jTableVeiculo.setPreferredSize(new java.awt.Dimension(300, 0));
        jTableVeiculo.setRowHeight(100);
        jScrollPane1.setViewportView(jTableVeiculo);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Id");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Placa");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Situação");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Fabricação");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Ano Modelo");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Modelo");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Quilometragem");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Tipo Combustível");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Tipo do Veículo");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Preço de Compra");

        jLabel14.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Renavam");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText(" Preço de Venda");

        jButtonCadastrarModelo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonCadastrarModelo.setText("Cadastrar Modelo");
        jButtonCadastrarModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarModeloActionPerformed(evt);
            }
        });

        jLabelFotoModelo.setText("MODELO AQUI");
        jLabelFotoModelo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(240, 188, 69), new java.awt.Color(240, 188, 69)));

        jTextFieldID.setText("0001");
        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });

        jTextFieldPLACA.setText("EQS-9292");

        jComboBoxSITUACAO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextFieldANOFabricacao.setText("2010");

        jTextFieldANOModelo.setText("2011");

        jComboBoxMODELO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Traz os modelos" }));

        jTextFieldKM.setText("100.000");

        jComboBoxCOMBUSTIVEL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxTIPOVeiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextFieldPRECOcompra.setText("55.000,00");

        jTextFieldPRECOvenda.setText("35.000,00");

        jTextFieldRENAVAM.setText("34819430");

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

        javax.swing.GroupLayout jPanelFundoLayout = new javax.swing.GroupLayout(jPanelFundo);
        jPanelFundo.setLayout(jPanelFundoLayout);
        jPanelFundoLayout.setHorizontalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCadastroVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(jPanelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFundoLayout.createSequentialGroup()
                        .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxMODELO, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCadastrarModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelFotoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFundoLayout.createSequentialGroup()
                        .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldANOFabricacao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPLACA, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldANOModelo)
                            .addComponent(jComboBoxSITUACAO, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelFundoLayout.createSequentialGroup()
                                    .addGap(123, 123, 123)
                                    .addComponent(jLabel14))
                                .addGroup(jPanelFundoLayout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel15)
                                        .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel13)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFundoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldRENAVAM, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPRECOvenda, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPRECOcompra, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTIPOVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCOMBUSTIVEL, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldKM, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFundoLayout.setVerticalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoLayout.createSequentialGroup()
                .addComponent(jPanelCadastroVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelFundoLayout.createSequentialGroup()
                        .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11)
                            .addComponent(jTextFieldPLACA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxCOMBUSTIVEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBoxSITUACAO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBoxTIPOVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(jTextFieldPRECOcompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldANOFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldANOModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16)
                                .addComponent(jLabel8)
                                .addComponent(jTextFieldPRECOvenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(jTextFieldRENAVAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelFotoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelFundoLayout.createSequentialGroup()
                                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBoxMODELO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCadastrarModelo))))
                    .addGroup(jPanelFundoLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarTelaVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarTelaVeiculoActionPerformed
        // TODO add your handling code here:
        super.dispose();
    }//GEN-LAST:event_jButtonVoltarTelaVeiculoActionPerformed

    private void jButtonCadastrarModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarModeloActionPerformed
        // TODO add your handling code here:
        TelaCadastroModelo telaModelo = new TelaCadastroModelo();
        telaModelo.setVisible(true);
    }//GEN-LAST:event_jButtonCadastrarModeloActionPerformed

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:
        //        if(jTextFieldIDOModelo.getText().equals("")){
            //            JOptionPane.showMessageDialog(this, "Selecione uma modelo antes de alterar.");
            //        }else{
            //            try {
                //                int idMarca = 0;
                //                Modelo obj = new Modelo(Integer.parseInt(jTextFieldIDOModelo.getText()),
                    //                    jTextFieldDescricaoModelo.getText(),
                    //                    jTextFieldUrlModelo.getText(), objetoMarca.buscar(jComboBoxMarca.getSelectedItem().toString()));
                //                ArrayList<Marca> lista = objetoMarca.listagem();
                //                for (int i = 0; i < lista.size(); i++) {
                    //                    if (jComboBoxMarca.getSelectedItem().equals(lista.get(i).getDescricao())) {
                        //                        obj.setMarca(lista.get(i));
                        //                    }
                    //                }
                //
                //                modeloControle.alterarModelo(obj);
                //                imprimirDadosNaGrid(modeloControle.listagemModelo());
                //                jTextFieldIDOModelo.setText("");
                //                jTextFieldDescricaoModelo.setText("");
                //                jTextFieldUrlModelo.setText("");
                //                JLabelModelo.setIcon(null);
                //
                //            } catch (Exception erro) {
                //                JOptionPane.showMessageDialog(this, erro.getMessage());
                //
                //            }
            //        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
        // TODO add your handling code here:
        //
        //        try {
            //
            //            int idMarca = 0;
            //            objetoMarca.buscar(idMarca);
            //
            //            Modelo objeto = new Modelo(0, jTextFieldDescricaoModelo.getText().trim(), jTextFieldUrlModelo.getText(),
                //                objetoMarca.buscar(jComboBoxMarca.getSelectedItem().toString()));
            //            ArrayList<Marca> lista = objetoMarca.listagem();
            //            for(int i = 0; i < lista.size(); i++){
                //                if(jComboBoxMarca.getSelectedItem().equals(lista.get(i).getDescricao())){
                    //                    objeto.setMarca(lista.get(i));
                    //                }
                //            }
            //
            //            modeloControle.vazio(objeto);
            //            modeloControle.semFoto(objeto);
            //            modeloControle.mesmaFoto(objeto);
            //            modeloControle.incluirModelo(objeto);
            //            imprimirDadosNaGrid(modeloControle.listagemModelo());
            //
            //        } catch (Exception erro) {
            //            JOptionPane.showMessageDialog(this, erro.getMessage());
            //        }
        //        jTextFieldIDOModelo.setText("");
        //        jTextFieldDescricaoModelo.setText("");
        //        jTextFieldUrlModelo.setText("");
        //        JLabelModelo.setIcon(null);
    }//GEN-LAST:event_jButtonIncluirActionPerformed

    private void jButtonIncluirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonIncluirKeyPressed
        // TODO add your handling code here:
        //        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            //            super.dispose();
            //        }
    }//GEN-LAST:event_jButtonIncluirKeyPressed

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
            java.util.logging.Logger.getLogger(TelaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVeiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCadastrarModelo;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JButton jButtonVoltarTelaVeiculo;
    private javax.swing.JComboBox<String> jComboBoxCOMBUSTIVEL;
    private javax.swing.JComboBox<String> jComboBoxMODELO;
    private javax.swing.JComboBox<String> jComboBoxSITUACAO;
    private javax.swing.JComboBox<String> jComboBoxTIPOVeiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFotoModelo;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelCadastroVeiculo;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableVeiculo;
    private javax.swing.JTextField jTextFieldANOFabricacao;
    private javax.swing.JTextField jTextFieldANOModelo;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldKM;
    private javax.swing.JTextField jTextFieldPLACA;
    private javax.swing.JTextField jTextFieldPRECOcompra;
    private javax.swing.JTextField jTextFieldPRECOvenda;
    private javax.swing.JTextField jTextFieldRENAVAM;
    // End of variables declaration//GEN-END:variables
}