// Samuel Ueno Fernandes - RA: 2678314
import javax.swing.JOptionPane;

public class FormGestaoAcessorios extends javax.swing.JFrame {

    private static FormGestaoAcessorios instancia;
    private Acessorio acessorioEncontrado = null;

    private FormGestaoAcessorios() {
        initComponents();
        setLocationRelativeTo(null);
        resetarFormulario();
    }
    
    //MÉTODO SINGLETON
    public static FormGestaoAcessorios getInstancia() {
        if (instancia == null) {
            instancia = new FormGestaoAcessorios();
        }
        instancia.resetarFormulario();
        return instancia;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLModelo = new javax.swing.JLabel();
        cxPreco = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        cxBuscaCodigo = new javax.swing.JTextField();
        btAlterar = new javax.swing.JButton();
        jLCodigo = new javax.swing.JLabel();
        btExcluir = new javax.swing.JButton();
        cxCodigo = new javax.swing.JTextField();
        jLMarca = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLModelo.setText("Preço");

        cxPreco.setEditable(false);

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        cxBuscaCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxBuscaCodigoActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.setEnabled(false);
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        jLCodigo.setText("Código");

        btExcluir.setText("Excluir");
        btExcluir.setEnabled(false);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        cxCodigo.setEditable(false);

        jLMarca.setText("Nome");

        cxNome.setEditable(false);

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
                    .addComponent(jLMarca)
                    .addComponent(jLModelo)
                    .addComponent(jLabel1)
                    .addComponent(jLCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cxBuscaCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btBuscar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cxCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cxNome, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cxPreco, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btAlterar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btExcluir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btSair))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLModelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btExcluir)
                    .addComponent(btAlterar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        acessorioEncontrado = BDAcessorios.getInstancia().buscarAcessorio(cxBuscaCodigo.getText());

        if (acessorioEncontrado != null) {
            cxCodigo.setText(acessorioEncontrado.getCodigo());
            cxNome.setText(acessorioEncontrado.getNome());
            cxPreco.setText(String.valueOf(acessorioEncontrado.getPreco()));

            habilitarEdicao(true);
        } else {
            JOptionPane.showMessageDialog(null, "Acessório não encontrado!", "Erro de Busca", JOptionPane.ERROR_MESSAGE);
            resetarFormulario();
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void cxBuscaCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxBuscaCodigoActionPerformed
        
    }//GEN-LAST:event_cxBuscaCodigoActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        if (acessorioEncontrado == null) return;

        int resp = JOptionPane.showConfirmDialog(null, "Confirmar a alteração dos dados?", "Alteração", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            try {
                acessorioEncontrado.setNome(cxNome.getText());
                acessorioEncontrado.setPreco(Double.parseDouble(cxPreco.getText()));
                
                BDAcessorios.getInstancia().alterarAcessorio(acessorioEncontrado);

                JOptionPane.showMessageDialog(null, "Acessório alterado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                resetarFormulario();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao alterar: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        if (acessorioEncontrado == null) return;
        
        int resp = JOptionPane.showConfirmDialog(null, "Confirmar a exclusão do acessório '" + acessorioEncontrado.getNome() + "'?", "Exclusão", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            try {
                BDAcessorios.getInstancia().excluirAcessorio(acessorioEncontrado.getCodigo());
                JOptionPane.showMessageDialog(null, "Acessório excluído com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                resetarFormulario();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Falha na exclusão: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void habilitarEdicao(boolean enabled) {
        cxNome.setEditable(enabled);
        cxPreco.setEditable(enabled);
        btAlterar.setEnabled(enabled);
        btExcluir.setEnabled(enabled);
    }

    public final void resetarFormulario() {
        cxBuscaCodigo.setText("");
        cxCodigo.setText("");
        cxNome.setText("");
        cxPreco.setText("");
        
        habilitarEdicao(false);
        
        acessorioEncontrado = null;
        cxBuscaCodigo.requestFocus();
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new FormGestaoAcessorios().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxBuscaCodigo;
    private javax.swing.JTextField cxCodigo;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxPreco;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLMarca;
    private javax.swing.JLabel jLModelo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
