// Samuel Ueno Fernandes - RA: 2678314
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class FormRelatorioAcessorios extends javax.swing.JFrame {

    private static FormRelatorioAcessorios instancia;
    private DefaultTableModel tableModel = new DefaultTableModel();

    private FormRelatorioAcessorios() {
        initComponents();
        montarTabela();
    }

    //MÉTODO SINGLETON
    public static FormRelatorioAcessorios getInstancia() {
        if (instancia == null) {
            instancia = new FormRelatorioAcessorios();
        }
        instancia.popularTabela();
        return instancia;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabAcessorios = new javax.swing.JTable();
        btSairRel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabAcessorios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nome", "Preço (R$)"
            }
        ));
        jScrollPane1.setViewportView(tabAcessorios);

        btSairRel.setText("Sair");
        btSairRel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairRelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSairRel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSairRel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairRelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairRelActionPerformed
        dispose();
    }//GEN-LAST:event_btSairRelActionPerformed

    private void montarTabela() {
        tableModel.addColumn("Código");
        tableModel.addColumn("Nome");
        tableModel.addColumn("Preço (R$)");
        tabAcessorios.setModel(tableModel);
    }
    
    public void popularTabela() {
        tableModel.setRowCount(0); // Limpa a tabela
        List<Acessorio> listaAcessorios = BDAcessorios.getInstancia().getBdAcessorios();

        for (Acessorio acessorio : listaAcessorios) {
            tableModel.addRow(new Object[]{
                acessorio.getCodigo(),
                acessorio.getNome(),
                acessorio.getPreco()
            });
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new FormRelatorioAcessorios().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSairRel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabAcessorios;
    // End of variables declaration//GEN-END:variables
}
