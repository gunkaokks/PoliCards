package telas;

public class TelaJogoClassico extends javax.swing.JFrame {
    
    
    public TelaJogoClassico() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        voltarTelaJogoClassico = new javax.swing.JButton();
        opcoesTelaJogoClassico = new javax.swing.JButton();
        verRespostaButton = new javax.swing.JButton();
        dificuldadeLabel = new javax.swing.JLabel();
        perguntaLabel = new javax.swing.JLabel();
        telaJogoClassicoLabel = new javax.swing.JLabel();
        materiaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        voltarTelaJogoClassico.setBorder(null);
        voltarTelaJogoClassico.setContentAreaFilled(false);
        getContentPane().add(voltarTelaJogoClassico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

        opcoesTelaJogoClassico.setBorder(null);
        opcoesTelaJogoClassico.setContentAreaFilled(false);
        getContentPane().add(opcoesTelaJogoClassico, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 120, 40));

        verRespostaButton.setBorder(null);
        verRespostaButton.setContentAreaFilled(false);
        getContentPane().add(verRespostaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, 180, 40));
        getContentPane().add(dificuldadeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 190, 30));
        getContentPane().add(perguntaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 630, 260));

        telaJogoClassicoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_JOGO_CLASSICO.png"))); // NOI18N
        getContentPane().add(telaJogoClassicoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));
        getContentPane().add(materiaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 220, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents
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
            java.util.logging.Logger.getLogger(TelaJogoClassico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogoClassico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogoClassico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogoClassico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaJogoClassico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dificuldadeLabel;
    private javax.swing.JLabel materiaLabel;
    private javax.swing.JButton opcoesTelaJogoClassico;
    private javax.swing.JLabel perguntaLabel;
    private javax.swing.JLabel telaJogoClassicoLabel;
    private javax.swing.JButton verRespostaButton;
    private javax.swing.JButton voltarTelaJogoClassico;
    // End of variables declaration//GEN-END:variables
}
