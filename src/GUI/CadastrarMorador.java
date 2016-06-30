/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.MoradorDAO;
import DAO.DivisaoDAO;
import Model.Morador;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ana
 */
public class CadastrarMorador extends javax.swing.JFrame {
    MoradorDAO dao = new MoradorDAO();
    DivisaoDAO daoDiv = new DivisaoDAO();
    /**
     * Creates new form CadastrarUsuario
     */
    public CadastrarMorador() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        salvar = new javax.swing.JButton();
        excluirMorador = new javax.swing.JButton();
        EditarMorador = new javax.swing.JButton();
        cadastrarTarefa = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        campoIdade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMorador = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel1.setText("Cadastrar Morador");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome");

        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });

        salvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        salvar.setText("Cadastrar Morador");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        excluirMorador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        excluirMorador.setText("Excluir Morador");
        excluirMorador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirMoradorActionPerformed(evt);
            }
        });

        EditarMorador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EditarMorador.setText("Editar Morador");
        EditarMorador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarMoradorActionPerformed(evt);
            }
        });

        cadastrarTarefa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cadastrarTarefa.setText("Proximo");
        cadastrarTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarTarefaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Idade");

        tabelaMorador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabelaMorador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Idade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaMorador.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabelaMoradorAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tabelaMorador);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(EditarMorador)
                        .addGap(18, 18, 18)
                        .addComponent(excluirMorador)
                        .addGap(18, 18, 18)
                        .addComponent(cadastrarTarefa)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(167, 167, 167)
                                        .addComponent(salvar))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoNome)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(campoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(salvar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditarMorador)
                    .addComponent(excluirMorador)
                    .addComponent(cadastrarTarefa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void EditarMoradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarMoradorActionPerformed
        new EditarMorador().setVisible(true);
        dispose();
    }//GEN-LAST:event_EditarMoradorActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        if(campoNome.getText().length() == 0 && campoIdade.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatorios!");
            return;
        }
             
        int idade = Integer.parseInt(campoIdade.getText());
        Morador modelMorador = new Morador(campoNome.getText(), idade);
        dao.insert(modelMorador);
        daoDiv.insertNome(campoNome.getText());
        
        DefaultTableModel tableModel = (DefaultTableModel)tabelaMorador.getModel();
        tableModel.addRow(modelMorador.obterDados());
       
        campoNome.setText("");
        campoIdade.setText("");
        
    }//GEN-LAST:event_salvarActionPerformed

    private void excluirMoradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirMoradorActionPerformed
        new ExcluirMorador().setVisible(true);
    }//GEN-LAST:event_excluirMoradorActionPerformed

    private void cadastrarTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarTarefaActionPerformed
        new CadastrarTarefa().setVisible(true);
        dispose();
    }//GEN-LAST:event_cadastrarTarefaActionPerformed

    private void tabelaMoradorAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabelaMoradorAncestorAdded
        
    }//GEN-LAST:event_tabelaMoradorAncestorAdded

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
            java.util.logging.Logger.getLogger(CadastrarMorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarMorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarMorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarMorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarMorador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditarMorador;
    private javax.swing.JButton cadastrarTarefa;
    private javax.swing.JTextField campoIdade;
    private javax.swing.JTextField campoNome;
    private javax.swing.JButton excluirMorador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton salvar;
    private javax.swing.JTable tabelaMorador;
    // End of variables declaration//GEN-END:variables

}
