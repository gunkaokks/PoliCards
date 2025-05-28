package telas;

import crudMaterias.MateriasDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TelaCriarMaterias extends javax.swing.JFrame {
    public TelaCriarMaterias() {
        initComponents();
        erroPreenchaCamposLabel.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        erroPreenchaCamposLabel = new javax.swing.JLabel();
        materiaTextField = new javax.swing.JTextField();
        adicionarMateriaButton = new javax.swing.JButton();
        telaCriarMateriasLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        erroPreenchaCamposLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        erroPreenchaCamposLabel.setForeground(new java.awt.Color(255, 29, 51));
        erroPreenchaCamposLabel.setText("Preencha todos os campos!");
        getContentPane().add(erroPreenchaCamposLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 190, -1));

        materiaTextField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(materiaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 410, 70));

        adicionarMateriaButton.setBorder(null);
        adicionarMateriaButton.setContentAreaFilled(false);
        adicionarMateriaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarMateriaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(adicionarMateriaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 440, 70));

        telaCriarMateriasLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_CRIAR_MATERIAS.png"))); // NOI18N
        telaCriarMateriasLabel.setText("jLabel1");
        getContentPane().add(telaCriarMateriasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarMateriaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarMateriaButtonActionPerformed
        String materia = materiaTextField.getText().trim();
        
        if (materia.isEmpty()) {
            erroPreenchaCamposLabel.setVisible(true);
            return;
        }
        
        try {
            MateriasDAO dao = new MateriasDAO();
            JOptionPane.showMessageDialog(this, "Matéria criada com sucesso!");
            new TelaCriarMaterias().setVisible(true);
            this.dispose();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas técnicos. Tente novamente mais tarde");
            e.printStackTrace();
        }
    }//GEN-LAST:event_adicionarMateriaButtonActionPerformed
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(TelaCriarMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCriarMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCriarMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCriarMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCriarMaterias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarMateriaButton;
    private javax.swing.JLabel erroPreenchaCamposLabel;
    private javax.swing.JTextField materiaTextField;
    private javax.swing.JLabel telaCriarMateriasLabel;
    // End of variables declaration//GEN-END:variables
}
