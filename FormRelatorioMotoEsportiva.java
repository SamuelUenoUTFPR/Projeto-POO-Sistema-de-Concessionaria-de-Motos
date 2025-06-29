// Samuel Ueno Fernandes - RA: 2678314
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class FormRelatorioMotoEsportiva extends javax.swing.JFrame {

    private static FormRelatorioMotoEsportiva instancia;
    private DefaultTableModel tableModel = new DefaultTableModel();

    private FormRelatorioMotoEsportiva() {
        initComponents();
        montarTabela();
    }

    //MÉTODO SINGLETON
    public static FormRelatorioMotoEsportiva getInstancia() {
        if (instancia == null) {
            instancia = new FormRelatorioMotoEsportiva();
        }
        instancia.popularTabela(); 
        return instancia;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabMotosEsportivas = new javax.swing.JTable();
        btSairRel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabMotosEsportivas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Marca", "Modelo", "Preço (R$)", "Cilindradas", "Tempo de Aceleração"
            }
        ));
        jScrollPane1.setViewportView(tabMotosEsportivas);

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        tableModel.addColumn("Marca");
        tableModel.addColumn("Modelo");
        tableModel.addColumn("Preço (R$)");
        tableModel.addColumn("Cilindradas");
        tableModel.addColumn("Tempo de Aceleração");
        tabMotosEsportivas.setModel(tableModel);
    }
    
    public void popularTabela() {
        tableModel.setRowCount(0); // Limpa a tabela
        List<Motocicleta> listaMotos = BDMotos.getInstancia().getBdMotos();

        for (Motocicleta moto : listaMotos) {
            // AQUI ESTÁ O FILTRO!
            if (moto instanceof MotoEsportiva) {
                MotoEsportiva mn = (MotoEsportiva) moto; // Cast para acessar os dados específicos
                
                tableModel.addRow(new Object[]{
                    mn.getCodigo(),
                    mn.getMarca(),
                    mn.getModelo(),
                    mn.getPreco(),
                    mn.getCilindradas(),
                    mn.getTempoAceleracao()
                });
            }
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new FormRelatorioMotoEsportiva().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSairRel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabMotosEsportivas;
    // End of variables declaration//GEN-END:variables
}
