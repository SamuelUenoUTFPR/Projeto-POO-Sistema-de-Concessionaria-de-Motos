// Versão do NetBeans: Apache NetBeans IDE 26
// Samuel Ueno Fernandes - RA: 2678314
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class FormPrincipal extends javax.swing.JFrame {

    private static FormPrincipal instancia;
    
    private FormPrincipal() {
        initComponents();
    }
    
    //MÉTODO SINGLETON
    public static FormPrincipal getInstancia(){
        if(instancia == null){
            instancia = new FormPrincipal();
        }
        return instancia;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btGestaoMotos = new javax.swing.JButton();
        btGestaoAcessorios = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        btCadastroAcessorios2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btCadastroMotoNac2 = new javax.swing.JButton();
        btRelatorioAcessorios2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btRelatorioGeral2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        barMenuPrinc = new javax.swing.JMenuBar();
        mnCad = new javax.swing.JMenu();
        itMnCadAces = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        itMnCadMotoEsp = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        itMnCadMotoImp = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        itMnCadMotoNac = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        itMnSair = new javax.swing.JMenuItem();
        MnRel = new javax.swing.JMenu();
        itMnRelAces = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itMnRelMotoEsp = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        itMnRelMotoImp = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        itMnRelMotoNac = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        itMnRelGeral = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        itMnGestaoMotos = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        ItMnGestaoAcessorios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setText("Sistema de Gestão - G-Motos");
        jLabel1.setToolTipText("");

        btGestaoMotos.setText("Gestão de Motos (CRUD)...");
        btGestaoMotos.setMaximumSize(new java.awt.Dimension(184, 23));
        btGestaoMotos.setMinimumSize(new java.awt.Dimension(184, 23));
        btGestaoMotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGestaoMotosActionPerformed(evt);
            }
        });

        btGestaoAcessorios.setText("Gestão de Acessórios (CRUD)...");
        btGestaoAcessorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGestaoAcessoriosActionPerformed(evt);
            }
        });

        jLabel2.setText("Serviços de Gestão/Consulta:");

        jLabel3.setText("Botões de Acesso Rápido");

        btCadastroAcessorios2.setText("Cadastro de Acessorios...");
        btCadastroAcessorios2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroAcessorios2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Serviços de Cadastro:");

        btCadastroMotoNac2.setText("Cadastro de Moto Nacional...");
        btCadastroMotoNac2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroMotoNac2ActionPerformed(evt);
            }
        });

        btRelatorioAcessorios2.setText("Relatorio de Acessorios...");
        btRelatorioAcessorios2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatorioAcessorios2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Serviços de Inspeção:");

        btRelatorioGeral2.setText("Relatorio Geral de Motos...");
        btRelatorioGeral2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatorioGeral2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        mnCad.setText("Cadastros");

        itMnCadAces.setText("Cadastro de Acessorios...");
        itMnCadAces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMnCadAcesActionPerformed(evt);
            }
        });
        mnCad.add(itMnCadAces);
        mnCad.add(jSeparator2);

        itMnCadMotoEsp.setText("Cadastro de Moto Esportiva...");
        itMnCadMotoEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMnCadMotoEspActionPerformed(evt);
            }
        });
        mnCad.add(itMnCadMotoEsp);
        mnCad.add(jSeparator3);

        itMnCadMotoImp.setText("Cadastro de Moto Importada...");
        itMnCadMotoImp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMnCadMotoImpActionPerformed(evt);
            }
        });
        mnCad.add(itMnCadMotoImp);
        mnCad.add(jSeparator4);

        itMnCadMotoNac.setText("Cadastro de Moto Nacional...");
        itMnCadMotoNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMnCadMotoNacActionPerformed(evt);
            }
        });
        mnCad.add(itMnCadMotoNac);
        mnCad.add(jSeparator9);

        itMnSair.setText("Sair");
        itMnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMnSairActionPerformed(evt);
            }
        });
        mnCad.add(itMnSair);

        barMenuPrinc.add(mnCad);

        MnRel.setText("Relatorios");

        itMnRelAces.setText("Relatorio dos Acessorios...");
        itMnRelAces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMnRelAcesActionPerformed(evt);
            }
        });
        MnRel.add(itMnRelAces);
        MnRel.add(jSeparator1);

        itMnRelMotoEsp.setText("Relatorio das Motos Esportivas...");
        itMnRelMotoEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMnRelMotoEspActionPerformed(evt);
            }
        });
        MnRel.add(itMnRelMotoEsp);
        MnRel.add(jSeparator5);

        itMnRelMotoImp.setText("Relatorio das Motos Importadas...");
        itMnRelMotoImp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMnRelMotoImpActionPerformed(evt);
            }
        });
        MnRel.add(itMnRelMotoImp);
        MnRel.add(jSeparator6);

        itMnRelMotoNac.setText("Relatorio das Motos Nacionais...");
        itMnRelMotoNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMnRelMotoNacActionPerformed(evt);
            }
        });
        MnRel.add(itMnRelMotoNac);
        MnRel.add(jSeparator7);

        itMnRelGeral.setText("Relatorio Geral de Motos...");
        itMnRelGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMnRelGeralActionPerformed(evt);
            }
        });
        MnRel.add(itMnRelGeral);

        barMenuPrinc.add(MnRel);

        jMenu1.setText("Gerenciar");

        itMnGestaoMotos.setText("Gestão de Motos (CRUD)...");
        itMnGestaoMotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMnGestaoMotosActionPerformed(evt);
            }
        });
        jMenu1.add(itMnGestaoMotos);
        jMenu1.add(jSeparator8);

        ItMnGestaoAcessorios.setText("Gestão de Acessórios (CRUD)...");
        ItMnGestaoAcessorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItMnGestaoAcessoriosActionPerformed(evt);
            }
        });
        jMenu1.add(ItMnGestaoAcessorios);

        barMenuPrinc.add(jMenu1);

        setJMenuBar(barMenuPrinc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btCadastroAcessorios2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(42, 42, 42))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(31, 31, 31)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(31, 31, 31)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btGestaoMotos, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btCadastroMotoNac2)
                                    .addComponent(btRelatorioGeral2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(btGestaoAcessorios))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btRelatorioAcessorios2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btGestaoMotos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btGestaoAcessorios)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btCadastroMotoNac2)
                    .addComponent(btCadastroAcessorios2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btRelatorioGeral2)
                    .addComponent(btRelatorioAcessorios2))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itMnCadAcesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnCadAcesActionPerformed
        FormCadAcessorio.getInstancia().setVisible(true);
    }//GEN-LAST:event_itMnCadAcesActionPerformed

    private void itMnCadMotoEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnCadMotoEspActionPerformed
        FormCadMotoEsportiva.getInstancia().setVisible(true);
    }//GEN-LAST:event_itMnCadMotoEspActionPerformed

    private void itMnCadMotoNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnCadMotoNacActionPerformed
        FormCadMotoNacional.getInstancia().setVisible(true);
    }//GEN-LAST:event_itMnCadMotoNacActionPerformed

    private void itMnCadMotoImpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnCadMotoImpActionPerformed
        FormCadMotoImportada.getInstancia().setVisible(true);
    }//GEN-LAST:event_itMnCadMotoImpActionPerformed

    private void itMnRelGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnRelGeralActionPerformed
        FormRelatorioGeral.getInstancia().setVisible(true);
    }//GEN-LAST:event_itMnRelGeralActionPerformed

    private void itMnRelAcesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnRelAcesActionPerformed
        FormRelatorioAcessorios.getInstancia().setVisible(true);
    }//GEN-LAST:event_itMnRelAcesActionPerformed

    private void itMnRelMotoEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnRelMotoEspActionPerformed
        FormRelatorioMotoEsportiva.getInstancia().setVisible(true);
    }//GEN-LAST:event_itMnRelMotoEspActionPerformed

    private void itMnRelMotoImpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnRelMotoImpActionPerformed
        FormRelatorioMotoImportada.getInstancia().setVisible(true);
    }//GEN-LAST:event_itMnRelMotoImpActionPerformed

    private void itMnRelMotoNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnRelMotoNacActionPerformed
        FormRelatorioMotoNacional.getInstancia().setVisible(true);
    }//GEN-LAST:event_itMnRelMotoNacActionPerformed

    private void btGestaoMotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGestaoMotosActionPerformed
        FormGestaoMotos.getInstancia().setVisible(true);
    }//GEN-LAST:event_btGestaoMotosActionPerformed

    private void btGestaoAcessoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGestaoAcessoriosActionPerformed
        FormGestaoAcessorios.getInstancia().setVisible(true);
    }//GEN-LAST:event_btGestaoAcessoriosActionPerformed

    private void itMnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnSairActionPerformed
        dispose();
    }//GEN-LAST:event_itMnSairActionPerformed

    private void itMnGestaoMotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnGestaoMotosActionPerformed
        FormGestaoMotos.getInstancia().setVisible(true);
    }//GEN-LAST:event_itMnGestaoMotosActionPerformed

    private void ItMnGestaoAcessoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItMnGestaoAcessoriosActionPerformed
        FormGestaoAcessorios.getInstancia().setVisible(true);
    }//GEN-LAST:event_ItMnGestaoAcessoriosActionPerformed

    private void btCadastroAcessorios2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroAcessorios2ActionPerformed
        FormCadAcessorio.getInstancia().setVisible(true);
    }//GEN-LAST:event_btCadastroAcessorios2ActionPerformed

    private void btCadastroMotoNac2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroMotoNac2ActionPerformed
        FormCadMotoNacional.getInstancia().setVisible(true);
    }//GEN-LAST:event_btCadastroMotoNac2ActionPerformed

    private void btRelatorioAcessorios2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatorioAcessorios2ActionPerformed
        FormRelatorioAcessorios.getInstancia().setVisible(true);
    }//GEN-LAST:event_btRelatorioAcessorios2ActionPerformed

    private void btRelatorioGeral2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatorioGeral2ActionPerformed
        FormRelatorioGeral.getInstancia().setVisible(true);
    }//GEN-LAST:event_btRelatorioGeral2ActionPerformed

    public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            FormPrincipal.getInstancia().setVisible(true);
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItMnGestaoAcessorios;
    private javax.swing.JMenu MnRel;
    private javax.swing.JMenuBar barMenuPrinc;
    private javax.swing.JButton btCadastroAcessorios2;
    private javax.swing.JButton btCadastroMotoNac2;
    private javax.swing.JButton btGestaoAcessorios;
    private javax.swing.JButton btGestaoMotos;
    private javax.swing.JButton btRelatorioAcessorios2;
    private javax.swing.JButton btRelatorioGeral2;
    private javax.swing.JMenuItem itMnCadAces;
    private javax.swing.JMenuItem itMnCadMotoEsp;
    private javax.swing.JMenuItem itMnCadMotoImp;
    private javax.swing.JMenuItem itMnCadMotoNac;
    private javax.swing.JMenuItem itMnGestaoMotos;
    private javax.swing.JMenuItem itMnRelAces;
    private javax.swing.JMenuItem itMnRelGeral;
    private javax.swing.JMenuItem itMnRelMotoEsp;
    private javax.swing.JMenuItem itMnRelMotoImp;
    private javax.swing.JMenuItem itMnRelMotoNac;
    private javax.swing.JMenuItem itMnSair;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenu mnCad;
    // End of variables declaration//GEN-END:variables
}
