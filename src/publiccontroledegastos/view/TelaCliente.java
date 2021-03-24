
package publiccontroledegastos.view;


public class TelaCliente extends javax.swing.JInternalFrame {

//    Connection conexao = null;
//    PreparedStatement pst = null;
//    ResultSet rs = null;

    /**
     * Creates new form TelaCliente
     */
    public TelaCliente() {
        initComponents();
//        conexao = ModuloConexao.conector();
    }

    //método para adicionar clientes
    private void adicionar() {

//        String sql = "insert into tbclientes(nomedocliente, endcli, fonecli,emailcli) values(?,?,?,?)";
//
//        try {
//            pst = conexao.prepareStatement(sql);
//            pst.setString(1, txtCliNome.getText());
//            pst.setString(2, txtCliEndereco.getText());
//            pst.setString(3, txtCliFone.getText());
//            pst.setString(4, txtCliEmail.getText());
//
//            //validação dos campos obrigatórios
//            if ((txtCliNome.getText().isEmpty()) || (txtCliFone.getText().isEmpty())) {
//                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
//            } else {
//
//                //a estrutura abixo é usada para confirmar a inserção dos dados na tabela
//                int adicionado = pst.executeUpdate();
//
//                if (adicionado > 0) {
//                    JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
//
//                    txtCliNome.setText(null);
//                    txtCliEndereco.setText(null);
//                    txtCliFone.setText(null);
//                    txtCliEmail.setText(null);
//
//                }
//            }
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }

    }

    //método para pesquisar clientes pelo nome com filtro
    private void pesquisar_cliente() {
//        String sql = "select * from tbclientes where nomedocliente like?";
//        try {
//
//            pst = conexao.prepareStatement(sql);
//            //passando o conteúdo da caixa de pesquisa para o ?
//            //atenção ao % que é a continuação da string sql
//            pst.setString(1, txtCliPesquisar.getText() + "%");
//            rs = pst.executeQuery();
//            //a linha abaixo usa a biblioteca es2xml.jar para preenchera tabela
//
//            tblClientes.setModel(DbUtils.resultSetToTableModel(rs));
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
    }

    //método para setar os campos do formulário com o conteúdo da tabela
    public void setar_campos() {
//        int setar = tblClientes.getSelectedRow();
//        txtCliId.setText(tblClientes.getModel().getValueAt(setar, 0).toString());
//        txtCliNome.setText(tblClientes.getModel().getValueAt(setar, 1).toString());
//        txtCliEndereco.setText(tblClientes.getModel().getValueAt(setar, 2).toString());
//        txtCliFone.setText(tblClientes.getModel().getValueAt(setar, 3).toString());
//        txtCliEmail.setText(tblClientes.getModel().getValueAt(setar, 4).toString());
//        
//        //a linha abaixo desabilita o botao adicionar
//        btnAdicionar.setEnabled(false);
        
    }

    //criando o metodo para alterar dados do cliente
    private void alterar() {
//        String sql = "update tbclientes set nomedocliente=?,endcli=?,fonecli=?,emailcli=? where idcli=?";
//        try {
//            
//            pst = conexao.prepareStatement(sql);
//
//            pst.setString(1, txtCliNome.getText());
//            pst.setString(2, txtCliEndereco.getText());
//            pst.setString(3, txtCliFone.getText());
//            pst.setString(4, txtCliEmail.getText());
//            pst.setString(5, txtCliId.getText());
//
//            //validação dos campos obrigatórios
//            if ((txtCliNome.getText().isEmpty()) || (txtCliFone.getText().isEmpty())) {
//                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
//            } else {
//
//                //a estrutura abixo é usada para confirmar a alteração dos dados do cliente na tabela
//                int adicionado = pst.executeUpdate();
//
//                if (adicionado > 0) {
//                    JOptionPane.showMessageDialog(null, "Dados do usuário alterados com sucesso!");
//
//                    txtCliId.setText(null);
//                    txtCliNome.setText(null);
//                    txtCliEndereco.setText(null);
//                    txtCliFone.setText(null);
//                    txtCliEmail.setText(null);
//                    btnAdicionar.setEnabled(true);
//                    
//                }
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
//    }
//    
//    //método responsável pela remoção de clientes
//    private void remover() {
//        //a estrutura abixo confirma a remoção do usuário
//        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover este cliente?", "Atenção", JOptionPane.YES_NO_OPTION);
//        if (confirma == JOptionPane.YES_OPTION) {
//            String sql = "delete from tbclientes where idcli=?";
//            try {
//                pst = conexao.prepareStatement(sql);
//                pst.setString(1, txtCliId.getText());
//                int apagado = pst.executeUpdate();
//                if (apagado > 0) {
//                    JOptionPane.showMessageDialog(null, "Cliente removido com sucesso!");
//                    
//                    txtCliId.setText(null);
//                    txtCliNome.setText(null);
//                    txtCliEndereco.setText(null);
//                    txtCliFone.setText(null);
//                    txtCliEmail.setText(null);
//                    btnAdicionar.setEnabled(true);
//                    
//                }
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, e);
//            }
//        }

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCliNome = new javax.swing.JTextField();
        txtCliEndereco = new javax.swing.JTextField();
        txtCliFone = new javax.swing.JTextField();
        txtCliEmail = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        txtCliPesquisar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtCliId = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Gestão de Clientes");
        setPreferredSize(new java.awt.Dimension(1000, 500));

        jLabel1.setText("Todos os Campos são Obrigatórios");

        jLabel2.setText("Nome");

        jLabel3.setText("Endereço");

        jLabel4.setText("Telefone");

        jLabel5.setText("Email");

        txtCliNome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtCliEndereco.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtCliFone.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtCliEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publiccontroledegastos/view/images/create.png"))); // NOI18N
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publiccontroledegastos/view/images/update.png"))); // NOI18N
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publiccontroledegastos/view/images/delete.png"))); // NOI18N
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        txtCliPesquisar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtCliPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCliPesquisarKeyReleased(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publiccontroledegastos/view/images/pesquisar.png"))); // NOI18N

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        jLabel7.setText("id Cliente");

        txtCliId.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCliId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCliId.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtCliId, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCliNome, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCliEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCliFone, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCliEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtCliPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(4, 4, 4)
                                    .addComponent(jLabel6))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 948, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txtCliPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCliId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCliNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCliEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCliFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCliEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(30, 30, 30)
                        .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdicionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        setLocation(new java.awt.Point(0, 0));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
//        // TODO add your handling code here:
//        adicionar();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void txtCliPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCliPesquisarKeyReleased
//        //o evento abixo é do tipo enquanto for digitando faça abaixo
//        pesquisar_cliente();

    }//GEN-LAST:event_txtCliPesquisarKeyReleased

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
//        // evento que será usado para setar os campos da tabela clicando com o mouse botão esquerdo
//        setar_campos();
    }//GEN-LAST:event_tblClientesMouseClicked

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
//        // chamando o metodo alterar clientes
//        alterar();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
//        // TODO add your handling code here:
//        remover();
        
    }//GEN-LAST:event_btnRemoverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtCliEmail;
    private javax.swing.JTextField txtCliEndereco;
    private javax.swing.JTextField txtCliFone;
    private javax.swing.JTextField txtCliId;
    private javax.swing.JTextField txtCliNome;
    private javax.swing.JTextField txtCliPesquisar;
    // End of variables declaration//GEN-END:variables
}
