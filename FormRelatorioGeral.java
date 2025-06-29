// Samuel Ueno Fernandes - RA: 2678314
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class FormRelatorioGeral extends javax.swing.JFrame {

    private static FormRelatorioGeral instancia;
    private DefaultTableModel tableModel = new DefaultTableModel();

    private FormRelatorioGeral() {
        initComponents();
        montarTabela();
    }

    //MÉTODO SINGLETON
    public static FormRelatorioGeral getInstancia() {
        if (instancia == null) {
            instancia = new FormRelatorioGeral();
        }
        // Sempre que a janela for chamada, limpamos e populamos a tabela novamente
        instancia.popularTabela(); 
        return instancia;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabMotos = new javax.swing.JTable();
        btSairRel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabMotos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Tipo", "Marca", "Modelo", "Preço (R$)", "Proprietário", "Detalhe Específico"
            }
        ));
        tabMotos.setAutoscrolls(false);
        jScrollPane1.setViewportView(tabMotos);

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btSairRel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
        tableModel.addColumn("Tipo");
        tableModel.addColumn("Marca");
        tableModel.addColumn("Modelo");
        tableModel.addColumn("Preço (R$)");
        tableModel.addColumn("Proprietário");
        tableModel.addColumn("Detalhe Específico");
        tabMotos.setModel(tableModel);
    }
    
    private void popularTabela() {
        // 1. Limpa a tabela
        tableModel.setRowCount(0);

        // 2. Busca a lista de motos no "Banco"
        List<Motocicleta> listaMotos = BDMotos.getInstancia().getBdMotos();

        // 3. Itera sobre a lista e adiciona cada moto como uma nova linha
        for (Motocicleta moto : listaMotos) {
            String tipo = "";
            String detalhe = "";

            // POLIMORFISMO: Verificando o tipo de objeto para obter os detalhes corretos
            if (moto instanceof MotoNacional) {
                tipo = "Nacional";
                MotoNacional mn = (MotoNacional) moto; // Cast para acessar métodos específicos
                detalhe = "Origem: " + mn.getEstadoDeOrigem();
            } else if (moto instanceof MotoImportada) {
                tipo = "Importada";
                MotoImportada mi = (MotoImportada) moto;
                detalhe = "País: " + mi.getPaisDeOrigem();
            } else if (moto instanceof MotoEsportiva) {
                tipo = "Esportiva";
                MotoEsportiva me = (MotoEsportiva) moto;
                detalhe = me.getCilindradas() + "cc";
            }
            
            tableModel.addRow(new Object[]{
                moto.getCodigo(),
                tipo,
                moto.getMarca(),
                moto.getModelo(),
                moto.getPreco(),
                moto.getProprietario().getNome(),
                detalhe
            });
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new FormRelatorioGeral().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSairRel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabMotos;
    // End of variables declaration//GEN-END:variables
}
