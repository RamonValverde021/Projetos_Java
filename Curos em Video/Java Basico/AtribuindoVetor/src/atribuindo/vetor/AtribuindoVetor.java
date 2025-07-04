/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atribuindo.vetor;

import java.util.Arrays;
import javax.swing.DefaultListModel;

/**
 *
 * @author LABORATORIO
 */

public class AtribuindoVetor extends javax.swing.JFrame {

    int vetor[] = new int[10];
    DefaultListModel lista = new DefaultListModel();
    int selecionado = 0;

    private void refazerLista() {
        lista.removeAllElements();
        for (int c = 0; c < vetor.length; c++) {
            lista.addElement(vetor[c]);
        }
    }

    public AtribuindoVetor() {
        initComponents();
        refazerLista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spn_Numero = new javax.swing.JSpinner();
        btn_Adicionar = new javax.swing.JButton();
        btn_Remover = new javax.swing.JButton();
        btn_Organizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lts_Lista = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        lbl_IndexVetor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        spn_Numero.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        spn_Numero.setModel(new javax.swing.SpinnerNumberModel());

        btn_Adicionar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_Adicionar.setText("Adicionar");
        btn_Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdicionarActionPerformed(evt);
            }
        });

        btn_Remover.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_Remover.setText("Remover");
        btn_Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RemoverActionPerformed(evt);
            }
        });

        btn_Organizar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_Organizar.setText("Organizar");
        btn_Organizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OrganizarActionPerformed(evt);
            }
        });

        lts_Lista.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lts_Lista.setModel(lista);
        lts_Lista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lts_Lista.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lts_ListaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        lts_Lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lts_ListaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lts_Lista);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Vetor");

        lbl_IndexVetor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_IndexVetor.setText("[0]");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spn_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Adicionar)
                    .addComponent(btn_Remover)
                    .addComponent(btn_Organizar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_IndexVetor))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Adicionar)
                            .addComponent(spn_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Remover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Organizar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lbl_IndexVetor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lts_ListaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lts_ListaAncestorAdded

    }//GEN-LAST:event_lts_ListaAncestorAdded

    private void btn_RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RemoverActionPerformed
        vetor[selecionado] = 0;
        refazerLista();
    }//GEN-LAST:event_btn_RemoverActionPerformed

    private void btn_OrganizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OrganizarActionPerformed
        Arrays.sort(vetor);
        refazerLista();
    }//GEN-LAST:event_btn_OrganizarActionPerformed

    private void lts_ListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lts_ListaMouseClicked
        selecionado = lts_Lista.getSelectedIndex();
        lbl_IndexVetor.setText("[" + Integer.toString(selecionado) + "]");
    }//GEN-LAST:event_lts_ListaMouseClicked

    private void btn_AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdicionarActionPerformed
        vetor[selecionado] = (int) spn_Numero.getValue();
        refazerLista();
    }//GEN-LAST:event_btn_AdicionarActionPerformed

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
            java.util.logging.Logger.getLogger(AtribuindoVetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtribuindoVetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtribuindoVetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtribuindoVetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtribuindoVetor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Adicionar;
    private javax.swing.JButton btn_Organizar;
    private javax.swing.JButton btn_Remover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_IndexVetor;
    private javax.swing.JList<String> lts_Lista;
    private javax.swing.JSpinner spn_Numero;
    // End of variables declaration//GEN-END:variables
}
