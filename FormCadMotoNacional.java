// Samuel Ueno Fernandes - RA: 2678314
import javax.swing.JOptionPane;

public class FormCadMotoNacional extends javax.swing.JFrame {

    private static FormCadMotoNacional instancia;
    
    private FormCadMotoNacional() {
        initComponents();
    }
    
    //MÉTODO SINGLETON
    public static FormCadMotoNacional getInstancia(){
        if(instancia == null){
            instancia = new FormCadMotoNacional();
        }
        return instancia;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLCodigo = new javax.swing.JLabel();
        cxCodigo = new javax.swing.JTextField();
        jLMarca = new javax.swing.JLabel();
        cxMarca = new javax.swing.JTextField();
        jLModelo = new javax.swing.JLabel();
        cxModelo = new javax.swing.JTextField();
        jLPreco = new javax.swing.JLabel();
        cxPreco = new javax.swing.JTextField();
        jLNome = new javax.swing.JLabel();
        cxNomeProp = new javax.swing.JTextField();
        jLCpf = new javax.swing.JLabel();
        cxCpf = new javax.swing.JTextField();
        jLTelefone = new javax.swing.JLabel();
        cxTelefone = new javax.swing.JTextField();
        jLRua = new javax.swing.JLabel();
        cxRua = new javax.swing.JTextField();
        jLNumero = new javax.swing.JLabel();
        cxNumero = new javax.swing.JTextField();
        jLEstado = new javax.swing.JLabel();
        cxEstado = new javax.swing.JTextField();
        jLIncentivoFiscal = new javax.swing.JLabel();
        cxIncentivo = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLCodigo.setText("Codigo da Moto");

        jLMarca.setText("Marca");

        jLModelo.setText("Modelo");

        jLPreco.setText("Preço (ex: 15000.50)");

        jLNome.setText("Nome do Proprietario");

        jLCpf.setText("CPF (11 Digitos)");

        jLTelefone.setText("Telefone (8 a 14 digitos)");

        jLRua.setText("Rua do Proprietario");

        jLNumero.setText("Numero do Proprietario");

        jLEstado.setText("Estado de Origem");

        jLIncentivoFiscal.setText("Tem incentivo? (S/N)");

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

        btSair.setText("Sair");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLEstado)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(btLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btSair))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLTelefone)
                        .addGap(18, 18, 18)
                        .addComponent(cxTelefone))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLRua)
                            .addComponent(jLNumero))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cxRua, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLCpf)
                            .addComponent(jLNome)
                            .addComponent(jLPreco)
                            .addComponent(jLModelo)
                            .addComponent(jLMarca)
                            .addComponent(jLCodigo))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cxCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(cxMarca)
                            .addComponent(cxModelo)
                            .addComponent(cxPreco)
                            .addComponent(cxNomeProp)
                            .addComponent(cxCpf)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLIncentivoFiscal)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxIncentivo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodigo)
                    .addComponent(cxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLMarca)
                    .addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLModelo)
                    .addComponent(cxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPreco)
                    .addComponent(cxPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(cxNomeProp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCpf)
                    .addComponent(cxCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTelefone)
                    .addComponent(cxTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLRua)
                    .addComponent(cxRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNumero)
                    .addComponent(cxNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEstado)
                    .addComponent(cxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxIncentivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLIncentivoFiscal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btLimpar)
                    .addComponent(btSair))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
           try {
            MotoNacional moto = new MotoNacional();
            Proprietario prop = new Proprietario();
            Endereco end = new Endereco();

            end.setRua(cxRua.getText());
            end.setNumero(cxNumero.getText());

            prop.setNome(cxNomeProp.getText());
            prop.setCpf(cxCpf.getText());
            prop.setTelefone(cxTelefone.getText());
            prop.setEnder(end);

            moto.setCodigo(cxCodigo.getText());
            moto.setMarca(cxMarca.getText());
            moto.setModelo(cxModelo.getText());
            moto.setPreco(Double.parseDouble(cxPreco.getText()));
            moto.setProprietario(prop);

            moto.setEstadoDeOrigem(cxEstado.getText());
            
            String incentivo = cxIncentivo.getText();
            if(incentivo.equalsIgnoreCase("S") || incentivo.equalsIgnoreCase("SIM")){
                moto.setTemIncentivoFiscal(true);
            } else {
                moto.setTemIncentivoFiscal(false);
            }

            BDMotos.getInstancia().cadastrarMoto(moto);

            JOptionPane.showMessageDialog(null, "Moto Nacional cadastrada com sucesso!", "Cadastro Realizado", JOptionPane.INFORMATION_MESSAGE);
            limparCampos();

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O preço deve ser um número válido.", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException | MotoJaCadastradaException | MotoSemProprietarioException | MotoSemPrecoException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente sair do cadastro?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            dispose();
        }
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btLimparActionPerformed

    public void limparCampos(){
        cxCodigo.setText("");
        cxMarca.setText("");
        cxModelo.setText("");
        cxPreco.setText("");
        cxNomeProp.setText("");
        cxCpf.setText("");
        cxTelefone.setText("");
        cxRua.setText("");
        cxNumero.setText("");
        cxEstado.setText("");
        cxIncentivo.setText("");
        cxCodigo.requestFocus();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new FormCadMotoNacional().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField cxCodigo;
    private javax.swing.JTextField cxCpf;
    private javax.swing.JTextField cxEstado;
    private javax.swing.JTextField cxIncentivo;
    private javax.swing.JTextField cxMarca;
    private javax.swing.JTextField cxModelo;
    private javax.swing.JTextField cxNomeProp;
    private javax.swing.JTextField cxNumero;
    private javax.swing.JTextField cxPreco;
    private javax.swing.JTextField cxRua;
    private javax.swing.JTextField cxTelefone;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLCpf;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLIncentivoFiscal;
    private javax.swing.JLabel jLMarca;
    private javax.swing.JLabel jLModelo;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLNumero;
    private javax.swing.JLabel jLPreco;
    private javax.swing.JLabel jLRua;
    private javax.swing.JLabel jLTelefone;
    // End of variables declaration//GEN-END:variables
}
