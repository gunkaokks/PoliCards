package telas;

import java.awt.Cursor;
import usuario.CrudUsuarios;

public class TelaMenuAdm extends javax.swing.JFrame {
    public TelaMenuAdm() {
        super("Policards");
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        voltarTelaMenuAdm = new javax.swing.JButton();
        iniciarJogoAdmButton = new javax.swing.JButton();
        controlarUsuariosButton = new javax.swing.JButton();
        telaMenuAdmLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        voltarTelaMenuAdm.setBorder(null);
        voltarTelaMenuAdm.setContentAreaFilled(false);
        voltarTelaMenuAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTelaMenuAdmActionPerformed(evt);
            }
        });
        getContentPane().add(voltarTelaMenuAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 30));

        iniciarJogoAdmButton.setBorder(null);
        iniciarJogoAdmButton.setContentAreaFilled(false);
        iniciarJogoAdmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarJogoAdmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(iniciarJogoAdmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 300, 60));

        controlarUsuariosButton.setBorder(null);
        controlarUsuariosButton.setContentAreaFilled(false);
        controlarUsuariosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controlarUsuariosButtonActionPerformed(evt);
            }
        });
        getContentPane().add(controlarUsuariosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 300, 60));

        telaMenuAdmLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_MENU_ADM.png"))); // NOI18N
        getContentPane().add(telaMenuAdmLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarTelaMenuAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelaMenuAdmActionPerformed
        new TelaInicial().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarTelaMenuAdmActionPerformed

    private void iniciarJogoAdmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarJogoAdmButtonActionPerformed
        new TelaMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_iniciarJogoAdmButtonActionPerformed

    private void controlarUsuariosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controlarUsuariosButtonActionPerformed
        controlarUsuariosButton.setCursor(new Cursor(Cursor.WAIT_CURSOR));
        new CrudUsuarios().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_controlarUsuariosButtonActionPerformed
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
            java.util.logging.Logger.getLogger(TelaMenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenuAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton controlarUsuariosButton;
    private javax.swing.JButton iniciarJogoAdmButton;
    private javax.swing.JLabel telaMenuAdmLabel;
    private javax.swing.JButton voltarTelaMenuAdm;
    // End of variables declaration//GEN-END:variables
}
