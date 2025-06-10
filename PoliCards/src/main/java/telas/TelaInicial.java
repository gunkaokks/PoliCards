package telas;

import sons.EfeitosSonoros;
import sons.Musicas;

public class TelaInicial extends javax.swing.JFrame {
    public TelaInicial() {
        super("Policards");
        initComponents();
        Musicas.Play("inicio.wav");
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inicialButton = new javax.swing.JButton();
        admTelaInicialButton = new javax.swing.JButton();
        telaInicialLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PoliCards");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inicialButton.setBorder(null);
        inicialButton.setContentAreaFilled(false);
        inicialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicialButtonActionPerformed(evt);
            }
        });
        getContentPane().add(inicialButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 610, 230));
        inicialButton.getAccessibleContext().setAccessibleDescription("");

        admTelaInicialButton.setBorder(null);
        admTelaInicialButton.setContentAreaFilled(false);
        admTelaInicialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admTelaInicialButtonActionPerformed(evt);
            }
        });
        getContentPane().add(admTelaInicialButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 200, 30));

        telaInicialLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_INICIAL.png"))); // NOI18N
        getContentPane().add(telaInicialLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicialButtonActionPerformed
        EfeitosSonoros.Play("click.wav");
        new TelaLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_inicialButtonActionPerformed

    private void admTelaInicialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admTelaInicialButtonActionPerformed
        EfeitosSonoros.Play("click.wav");
        Musicas.Stop();
        new TelaLoginAdm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_admTelaInicialButtonActionPerformed
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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admTelaInicialButton;
    private javax.swing.JButton inicialButton;
    private javax.swing.JLabel telaInicialLabel;
    // End of variables declaration//GEN-END:variables
}
