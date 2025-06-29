// Samuel Ueno Fernandes - RA: 2678314
import javax.swing.JOptionPane;

public class FormCadAcessorio extends javax.swing.JFrame {

    private static FormCadAcessorio instancia;

    private FormCadAcessorio() {
        initComponents();
    }

    //MÉTODO SINGLETON
    public static FormCadAcessorio getInstancia() {
        if (instancia == null) {
            instancia = new FormCadAcessorio();
        }
        return instancia;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLCodigo = new javax.swing.JLabel();
        cxCodigoAces = new javax.swing.JTextField();
        jLNome = new javax.swing.JLabel();
        cxNomeAces = new javax.swing.JTextField();
        jLPreco = new javax.swing.JLabel();
        cxPrecoAces = new javax.swing.JTextField();
        btSair = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLCodigo.setText("Codigo ");

        jLNome.setText("Nome");

        jLPreco.setText("Preço");

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
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
                            .addComponent(jLPreco)
                            .addComponent(jLNome)
                            .addComponent(jLCodigo))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cxCodigoAces)
                            .addComponent(cxNomeAces)
                            .addComponent(cxPrecoAces, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(btLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btSair)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodigo)
                    .addComponent(cxCodigoAces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(cxNomeAces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPreco)
                    .addComponent(cxPrecoAces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btLimpar)
                    .addComponent(btSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente sair do cadastro?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            dispose();
        }
    }//GEN-LAST:event_btSairActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        try {
            Acessorio acessorio = new Acessorio();
            acessorio.setCodigo(cxCodigoAces.getText());
            acessorio.setNome(cxNomeAces.getText());
            acessorio.setPreco(Double.parseDouble(cxPrecoAces.getText()));

            BDAcessorios.getInstancia().cadastrarAcessorio(acessorio);
            
            JOptionPane.showMessageDialog(null, "Acessório cadastrado com sucesso!", "Cadastro Realizado", JOptionPane.INFORMATION_MESSAGE);
            limparCampos();

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Preço deve ser um número.", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException | AcessorioInvalidoException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e.getMessage(), "Erro de Validação", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            System.getLogger(FormCadAcessorio.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btLimparActionPerformed

   public void limparCampos() {
        cxCodigoAces.setText("");
        cxNomeAces.setText("");
        cxPrecoAces.setText("");
        cxCodigoAces.requestFocus();
    }
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new FormCadAcessorio().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField cxCodigoAces;
    private javax.swing.JTextField cxNomeAces;
    private javax.swing.JTextField cxPrecoAces;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLPreco;
    // End of variables declaration//GEN-END:variables
}
