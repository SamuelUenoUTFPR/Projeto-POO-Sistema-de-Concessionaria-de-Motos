// Samuel Ueno Fernandes - RA: 2678314
import javax.swing.JOptionPane;

public class FormGestaoMotos extends javax.swing.JFrame {

    private static FormGestaoMotos instancia;
    private Motocicleta motoEncontrada = null; // Guarda a moto encontrada na busca

    private FormGestaoMotos() {
        initComponents();
        setLocationRelativeTo(null); // Centraliza a janela
        resetarFormulario();
    }

    //MÉTODO SINGLETON
    public static FormGestaoMotos getInstancia() {
        if (instancia == null) {
            instancia = new FormGestaoMotos();
        }
        instancia.resetarFormulario(); // Garante que o form esteja limpo ao ser reaberto
        return instancia;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cxBuscaCodigo = new javax.swing.JTextField();
        jLCodigo = new javax.swing.JLabel();
        cxCodigo = new javax.swing.JTextField();
        jLMarca = new javax.swing.JLabel();
        cxMarca = new javax.swing.JTextField();
        jLModelo = new javax.swing.JLabel();
        cxModelo = new javax.swing.JTextField();
        jLPreco = new javax.swing.JLabel();
        cxPreco = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        cxTempoAceleracao = new javax.swing.JTextField();
        cxCilindradas = new javax.swing.JTextField();
        jLCilindradas = new javax.swing.JLabel();
        jLAceleração = new javax.swing.JLabel();
        cxEstado = new javax.swing.JTextField();
        jLIncentivoFiscal = new javax.swing.JLabel();
        cxIncentivo = new javax.swing.JTextField();
        jLEstado = new javax.swing.JLabel();
        jLPaís = new javax.swing.JLabel();
        cxPaisOrigem = new javax.swing.JTextField();
        jLTaxaImport = new javax.swing.JLabel();
        cxTaxaImportacao = new javax.swing.JTextField();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cxBuscaCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxBuscaCodigoActionPerformed(evt);
            }
        });

        jLCodigo.setText("Codigo da Moto");

        cxCodigo.setEditable(false);

        jLMarca.setText("Marca");

        cxMarca.setEditable(false);

        jLModelo.setText("Modelo");

        cxModelo.setEditable(false);

        jLPreco.setText("Preço (ex: 15000.50)");

        cxPreco.setEditable(false);

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        cxTempoAceleracao.setEditable(false);

        cxCilindradas.setEditable(false);

        jLCilindradas.setText("Cilindradas (cc)");

        jLAceleração.setText("Aceleração (0-100s)");

        cxEstado.setEditable(false);

        jLIncentivoFiscal.setText("Tem incentivo? (S/N)");

        cxIncentivo.setEditable(false);

        jLEstado.setText("Estado de Origem");

        jLPaís.setText("País de Origem");

        cxPaisOrigem.setEditable(false);

        jLTaxaImport.setText("Taxa de Importação");

        cxTaxaImportacao.setEditable(false);

        btAlterar.setText("Alterar");
        btAlterar.setEnabled(false);
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.setEnabled(false);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        jLabel1.setText("Digite o Código:");

        btSair.setText("Sair");
        btSair.setEnabled(false);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLAceleração)
                            .addComponent(jLEstado)
                            .addComponent(jLPaís)
                            .addComponent(jLIncentivoFiscal)
                            .addComponent(jLTaxaImport))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 66, Short.MAX_VALUE))
                            .addComponent(cxPaisOrigem)
                            .addComponent(cxIncentivo)
                            .addComponent(cxEstado)
                            .addComponent(cxTempoAceleracao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cxTaxaImportacao)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLMarca)
                            .addComponent(jLModelo)
                            .addComponent(jLPreco)
                            .addComponent(jLCilindradas)
                            .addComponent(jLCodigo)
                            .addComponent(jLabel1))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cxBuscaCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btBuscar))
                            .addComponent(cxMarca, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cxModelo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cxCilindradas)
                            .addComponent(cxPreco)
                            .addComponent(cxCodigo))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxBuscaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodigo)
                    .addComponent(cxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLMarca)
                    .addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLModelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPreco)
                    .addComponent(cxPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCilindradas)
                    .addComponent(cxCilindradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxTempoAceleracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLAceleração))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEstado)
                    .addComponent(cxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxIncentivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLIncentivoFiscal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxPaisOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLPaís))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxTaxaImportacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTaxaImport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAlterar)
                    .addComponent(btExcluir)
                    .addComponent(btSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxBuscaCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxBuscaCodigoActionPerformed
        
    }//GEN-LAST:event_cxBuscaCodigoActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        motoEncontrada = BDMotos.getInstancia().buscarMoto(cxBuscaCodigo.getText());

        if (motoEncontrada != null) {
            // Preenche os campos comuns
            cxCodigo.setText(motoEncontrada.getCodigo());
            cxMarca.setText(motoEncontrada.getMarca());
            cxModelo.setText(motoEncontrada.getModelo());
            cxPreco.setText(String.valueOf(motoEncontrada.getPreco()));

            // Esconde todos os campos e labels específicos para começar do zero
            esconderCamposEspecificos();

            // Usa 'instanceof' para descobrir o tipo da moto e mostrar os campos corretos
            if (motoEncontrada instanceof MotoNacional) {
                MotoNacional mn = (MotoNacional) motoEncontrada;
                jLEstado.setVisible(true);
                cxEstado.setVisible(true);
                cxEstado.setText(mn.getEstadoDeOrigem());
                jLIncentivoFiscal.setVisible(true);
                cxIncentivo.setVisible(true);
                cxIncentivo.setText(mn.isTemIncentivoFiscal() ? "S" : "N");
            } else if (motoEncontrada instanceof MotoImportada) {
                MotoImportada mi = (MotoImportada) motoEncontrada;
                jLPaís.setVisible(true);
                cxPaisOrigem.setVisible(true);
                cxPaisOrigem.setText(mi.getPaisDeOrigem());
                jLTaxaImport.setVisible(true);
                cxTaxaImportacao.setVisible(true);
                cxTaxaImportacao.setText(String.valueOf(mi.getTaxaImportacao()));
            } else if (motoEncontrada instanceof MotoEsportiva) {
                MotoEsportiva me = (MotoEsportiva) motoEncontrada;
                jLCilindradas.setVisible(true);
                cxCilindradas.setVisible(true);
                cxCilindradas.setText(String.valueOf(me.getCilindradas()));
                jLAceleração.setVisible(true);
                cxTempoAceleracao.setVisible(true);
                cxTempoAceleracao.setText(String.valueOf(me.getTempoAceleracao()));
            }

            habilitarEdicao(true);
        } else {
            JOptionPane.showMessageDialog(null, "Moto não encontrada!", "Erro de Busca", JOptionPane.ERROR_MESSAGE);
            resetarFormulario();
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        if (motoEncontrada == null) {
            JOptionPane.showMessageDialog(null, "Nenhuma moto foi buscada para excluir.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int resp = JOptionPane.showConfirmDialog(null, "Confirmar a exclusão da moto '" + motoEncontrada.getModelo() + "'?", "Exclusão", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            try {
                BDMotos.getInstancia().excluirMoto(motoEncontrada.getCodigo());
                JOptionPane.showMessageDialog(null, "Moto excluída com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                resetarFormulario();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Falha na exclusão: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        if(motoEncontrada == null) {
            JOptionPane.showMessageDialog(null, "Nenhuma moto foi buscada para alterar.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int resp = JOptionPane.showConfirmDialog(null, "Confirmar a alteração dos dados?", "Alteração", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            try {
                // Atualiza os dados comuns
                motoEncontrada.setMarca(cxMarca.getText());
                motoEncontrada.setModelo(cxModelo.getText());
                motoEncontrada.setPreco(Double.parseDouble(cxPreco.getText()));

                // Atualiza os dados específicos
                if (motoEncontrada instanceof MotoNacional) {
                    MotoNacional mn = (MotoNacional) motoEncontrada;
                    mn.setEstadoDeOrigem(cxEstado.getText());
                    mn.setTemIncentivoFiscal(cxIncentivo.getText().equalsIgnoreCase("S"));
                } else if (motoEncontrada instanceof MotoImportada) {
                    MotoImportada mi = (MotoImportada) motoEncontrada;
                    mi.setPaisDeOrigem(cxPaisOrigem.getText());
                    mi.setTaxaImportacao(Double.parseDouble(cxTaxaImportacao.getText()));
                } else if (motoEncontrada instanceof MotoEsportiva) {
                    MotoEsportiva me = (MotoEsportiva) motoEncontrada;
                    me.setCilindradas(Integer.parseInt(cxCilindradas.getText()));
                    me.setTempoAceleracao(Double.parseDouble(cxTempoAceleracao.getText()));
                }
                
                //BDMotos.getInstancia().alterarMoto(motoEncontrada); // (O método alterarMoto que criamos não existe no BDMotos que te passei antes, vamos corrigir)
                
                JOptionPane.showMessageDialog(null, "Moto alterada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                resetarFormulario();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao alterar: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void habilitarEdicao(boolean enabled) {
        // Habilita/desabilita os campos para edição (código nunca é editável)
        cxMarca.setEditable(enabled);
        cxModelo.setEditable(enabled);
        cxPreco.setEditable(enabled);
        cxEstado.setEditable(enabled);
        cxIncentivo.setEditable(enabled);
        cxPaisOrigem.setEditable(enabled);
        cxTaxaImportacao.setEditable(enabled);
        cxCilindradas.setEditable(enabled);
        cxTempoAceleracao.setEditable(enabled);
        
        // Habilita/desabilita os botões de ação
        btAlterar.setEnabled(enabled);
        btExcluir.setEnabled(enabled);
    }
    
    private void esconderCamposEspecificos() {
        // Esconde todos os labels e campos específicos
        jLEstado.setVisible(false);
        cxEstado.setVisible(false);
        jLIncentivoFiscal.setVisible(false);
        cxIncentivo.setVisible(false);
        jLPaís.setVisible(false);
        cxPaisOrigem.setVisible(false);
        jLTaxaImport.setVisible(false);
        cxTaxaImportacao.setVisible(false);
        jLCilindradas.setVisible(false);
        cxCilindradas.setVisible(false);
        jLAceleração.setVisible(false);
        cxTempoAceleracao.setVisible(false);
    }

    public final void resetarFormulario() {
        // Limpa todos os campos
        cxBuscaCodigo.setText("");
        cxCodigo.setText("");
        cxMarca.setText("");
        cxModelo.setText("");
        cxPreco.setText("");
        cxEstado.setText("");
        cxIncentivo.setText("");
        cxPaisOrigem.setText("");
        cxTaxaImportacao.setText("");
        cxCilindradas.setText("");
        cxTempoAceleracao.setText("");
        
        // Desabilita a edição e os botões
        habilitarEdicao(false);
        
        // Esconde os campos específicos até que uma busca seja feita
        esconderCamposEspecificos();
        
        motoEncontrada = null; // Limpa a moto em memória
        cxBuscaCodigo.requestFocus(); // Foco no campo de busca
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new FormGestaoMotos().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxBuscaCodigo;
    private javax.swing.JTextField cxCilindradas;
    private javax.swing.JTextField cxCodigo;
    private javax.swing.JTextField cxEstado;
    private javax.swing.JTextField cxIncentivo;
    private javax.swing.JTextField cxMarca;
    private javax.swing.JTextField cxModelo;
    private javax.swing.JTextField cxPaisOrigem;
    private javax.swing.JTextField cxPreco;
    private javax.swing.JTextField cxTaxaImportacao;
    private javax.swing.JTextField cxTempoAceleracao;
    private javax.swing.JLabel jLAceleração;
    private javax.swing.JLabel jLCilindradas;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLIncentivoFiscal;
    private javax.swing.JLabel jLMarca;
    private javax.swing.JLabel jLModelo;
    private javax.swing.JLabel jLPaís;
    private javax.swing.JLabel jLPreco;
    private javax.swing.JLabel jLTaxaImport;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

