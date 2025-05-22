package telas;

public class TelaModos extends javax.swing.JFrame {
    public TelaModos() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iniciarJogoTelaModos = new javax.swing.JButton();
        abrirFlashcardsTelaModos = new javax.swing.JButton();
        sairTelaModos = new javax.swing.JButton();
        telaModosLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iniciarJogoTelaModos.setBorder(null);
        iniciarJogoTelaModos.setContentAreaFilled(false);
        iniciarJogoTelaModos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarJogoTelaModosActionPerformed(evt);
            }
        });
        getContentPane().add(iniciarJogoTelaModos, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 480, 440, 110));

        abrirFlashcardsTelaModos.setBorder(null);
        abrirFlashcardsTelaModos.setContentAreaFilled(false);
        getContentPane().add(abrirFlashcardsTelaModos, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 630, 440, 110));

        sairTelaModos.setBorder(null);
        sairTelaModos.setContentAreaFilled(false);
        sairTelaModos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairTelaModosActionPerformed(evt);
            }
        });
        getContentPane().add(sairTelaModos, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 780, 440, 110));

        telaModosLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_MENU.png"))); // NOI18N
        getContentPane().add(telaModosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarJogoTelaModosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarJogoTelaModosActionPerformed
        
    }//GEN-LAST:event_iniciarJogoTelaModosActionPerformed

    private void sairTelaModosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairTelaModosActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairTelaModosActionPerformed
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
            java.util.logging.Logger.getLogger(TelaModos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaModos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaModos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaModos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaModos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abrirFlashcardsTelaModos;
    private javax.swing.JButton iniciarJogoTelaModos;
    private javax.swing.JButton sairTelaModos;
    private javax.swing.JLabel telaModosLabel;
    // End of variables declaration//GEN-END:variables
}
