package telas;

import static java.awt.GridBagConstraints.BOTH;
import javax.swing.JFrame;

public class TelaModos extends javax.swing.JFrame {
    public TelaModos() {
        initComponents();
        this.setLocationRelativeTo(null);
        telaOpcoesPanelTelaModos.setVisible(false);
        telaCreditosPanelTelaModos.setVisible(false);
        telaSobreNosPanelTelaModos.setVisible(false);
        offMusicaTelaOpcoesButton.setEnabled(false);
        onMusicaTelaOpcoesButton.setEnabled(false);
        offEfeitoSonoroTelaOpcoesButton.setEnabled(false);
        onEfeitoSonoroTelaOpcoesButton.setEnabled(false);
        fecharTelaOpcoes.setEnabled(false);
        creditosTelaOpcoes.setEnabled(false);
        sobreNosTelaCreditos.setEnabled(false);
        voltarTelaSobreNos.setEnabled(false);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaSobreNosPanelTelaModos = new javax.swing.JPanel();
        voltarTelaSobreNos = new javax.swing.JButton();
        telaSobreNosLabel = new javax.swing.JLabel();
        telaCreditosPanelTelaModos = new javax.swing.JPanel();
        voltarTelaCreditos = new javax.swing.JButton();
        sobreNosTelaCreditos = new javax.swing.JButton();
        telaCreditosLabelPanel = new javax.swing.JLabel();
        telaOpcoesPanelTelaModos = new javax.swing.JPanel();
        offMusicaTelaOpcoesButton = new javax.swing.JButton();
        onMusicaTelaOpcoesButton = new javax.swing.JButton();
        offEfeitoSonoroTelaOpcoesButton = new javax.swing.JButton();
        creditosTelaOpcoes = new javax.swing.JButton();
        onEfeitoSonoroTelaOpcoesButton = new javax.swing.JButton();
        fecharTelaOpcoes = new javax.swing.JButton();
        telaOpcoesLabelPanel = new javax.swing.JLabel();
        opcoesTelaModosButton = new javax.swing.JButton();
        voltarTelaModosButton = new javax.swing.JButton();
        telaModosLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PoliCards");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        telaSobreNosPanelTelaModos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        voltarTelaSobreNos.setBorder(null);
        voltarTelaSobreNos.setContentAreaFilled(false);
        voltarTelaSobreNos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTelaSobreNosActionPerformed(evt);
            }
        });
        telaSobreNosPanelTelaModos.add(voltarTelaSobreNos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        telaSobreNosLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_SOBRE_NOS.png"))); // NOI18N
        telaSobreNosPanelTelaModos.add(telaSobreNosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(telaSobreNosPanelTelaModos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        telaCreditosPanelTelaModos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        voltarTelaCreditos.setBorder(null);
        voltarTelaCreditos.setContentAreaFilled(false);
        voltarTelaCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTelaCreditosActionPerformed(evt);
            }
        });
        telaCreditosPanelTelaModos.add(voltarTelaCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 104, 26));

        sobreNosTelaCreditos.setBorder(null);
        sobreNosTelaCreditos.setContentAreaFilled(false);
        sobreNosTelaCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreNosTelaCreditosActionPerformed(evt);
            }
        });
        telaCreditosPanelTelaModos.add(sobreNosTelaCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 451, 148, 39));

        telaCreditosLabelPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        telaCreditosLabelPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_CREDITOS.png"))); // NOI18N
        telaCreditosPanelTelaModos.add(telaCreditosLabelPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(telaCreditosPanelTelaModos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        telaOpcoesPanelTelaModos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        offMusicaTelaOpcoesButton.setBorder(null);
        offMusicaTelaOpcoesButton.setContentAreaFilled(false);
        telaOpcoesPanelTelaModos.add(offMusicaTelaOpcoesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 70, 50));

        onMusicaTelaOpcoesButton.setBorder(null);
        onMusicaTelaOpcoesButton.setContentAreaFilled(false);
        onMusicaTelaOpcoesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onMusicaTelaOpcoesButtonActionPerformed(evt);
            }
        });
        telaOpcoesPanelTelaModos.add(onMusicaTelaOpcoesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 70, 50));

        offEfeitoSonoroTelaOpcoesButton.setBorder(null);
        offEfeitoSonoroTelaOpcoesButton.setContentAreaFilled(false);
        telaOpcoesPanelTelaModos.add(offEfeitoSonoroTelaOpcoesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 70, 40));

        creditosTelaOpcoes.setBorder(null);
        creditosTelaOpcoes.setContentAreaFilled(false);
        creditosTelaOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditosTelaOpcoesActionPerformed(evt);
            }
        });
        telaOpcoesPanelTelaModos.add(creditosTelaOpcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 130, 50));

        onEfeitoSonoroTelaOpcoesButton.setBorder(null);
        onEfeitoSonoroTelaOpcoesButton.setContentAreaFilled(false);
        telaOpcoesPanelTelaModos.add(onEfeitoSonoroTelaOpcoesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 70, 50));

        fecharTelaOpcoes.setBorder(null);
        fecharTelaOpcoes.setContentAreaFilled(false);
        fecharTelaOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharTelaOpcoesActionPerformed(evt);
            }
        });
        telaOpcoesPanelTelaModos.add(fecharTelaOpcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        telaOpcoesLabelPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_OPCOES.png"))); // NOI18N
        telaOpcoesPanelTelaModos.add(telaOpcoesLabelPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(telaOpcoesPanelTelaModos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        opcoesTelaModosButton.setBorder(null);
        opcoesTelaModosButton.setContentAreaFilled(false);
        opcoesTelaModosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcoesTelaModosButtonActionPerformed(evt);
            }
        });
        getContentPane().add(opcoesTelaModosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 13, 120, 30));

        voltarTelaModosButton.setBorder(null);
        voltarTelaModosButton.setContentAreaFilled(false);
        voltarTelaModosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTelaModosButtonActionPerformed(evt);
            }
        });
        getContentPane().add(voltarTelaModosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 30));

        telaModosLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_MODOS.png"))); // NOI18N
        getContentPane().add(telaModosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcoesTelaModosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcoesTelaModosButtonActionPerformed
        telaOpcoesPanelTelaModos.setVisible(true);
        offMusicaTelaOpcoesButton.setEnabled(true);
        onMusicaTelaOpcoesButton.setEnabled(true);
        offEfeitoSonoroTelaOpcoesButton.setEnabled(true);
        onEfeitoSonoroTelaOpcoesButton.setEnabled(true);
        fecharTelaOpcoes.setEnabled(true);
        creditosTelaOpcoes.setEnabled(true);
        opcoesTelaModosButton.setEnabled(false);
        voltarTelaModosButton.setEnabled(false);
    }//GEN-LAST:event_opcoesTelaModosButtonActionPerformed

    private void voltarTelaModosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelaModosButtonActionPerformed
        new TelaMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarTelaModosButtonActionPerformed

    private void voltarTelaSobreNosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelaSobreNosActionPerformed
        telaSobreNosPanelTelaModos.setVisible(false);
        voltarTelaSobreNos.setEnabled(false);
        sobreNosTelaCreditos.setVisible(true);
    }//GEN-LAST:event_voltarTelaSobreNosActionPerformed

    private void voltarTelaCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelaCreditosActionPerformed
        telaCreditosPanelTelaModos.setVisible(false);
        offMusicaTelaOpcoesButton.setEnabled(true);
        onMusicaTelaOpcoesButton.setEnabled(true);
        offEfeitoSonoroTelaOpcoesButton.setEnabled(true);
        onEfeitoSonoroTelaOpcoesButton.setEnabled(true);
        fecharTelaOpcoes.setEnabled(true);
        creditosTelaOpcoes.setVisible(true);
        creditosTelaOpcoes.setEnabled(true);
        sobreNosTelaCreditos.setEnabled(false);
    }//GEN-LAST:event_voltarTelaCreditosActionPerformed

    private void sobreNosTelaCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreNosTelaCreditosActionPerformed
        telaSobreNosPanelTelaModos.setVisible(true);
        voltarTelaSobreNos.setEnabled(true);
        sobreNosTelaCreditos.setVisible(false);
    }//GEN-LAST:event_sobreNosTelaCreditosActionPerformed

    private void onMusicaTelaOpcoesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onMusicaTelaOpcoesButtonActionPerformed

    }//GEN-LAST:event_onMusicaTelaOpcoesButtonActionPerformed

    private void creditosTelaOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditosTelaOpcoesActionPerformed
        telaCreditosPanelTelaModos.setVisible(true);
        offMusicaTelaOpcoesButton.setEnabled(false);
        onMusicaTelaOpcoesButton.setEnabled(false);
        offEfeitoSonoroTelaOpcoesButton.setEnabled(false);
        onEfeitoSonoroTelaOpcoesButton.setEnabled(false);
        fecharTelaOpcoes.setEnabled(false);
        creditosTelaOpcoes.setVisible(false);
        sobreNosTelaCreditos.setEnabled(true);
    }//GEN-LAST:event_creditosTelaOpcoesActionPerformed

    private void fecharTelaOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharTelaOpcoesActionPerformed
        telaOpcoesPanelTelaModos.setVisible(false);
        offMusicaTelaOpcoesButton.setEnabled(false);
        onMusicaTelaOpcoesButton.setEnabled(false);
        offEfeitoSonoroTelaOpcoesButton.setEnabled(false);
        onEfeitoSonoroTelaOpcoesButton.setEnabled(false);
        fecharTelaOpcoes.setEnabled(false);
        creditosTelaOpcoes.setEnabled(false);
        opcoesTelaModosButton.setEnabled(true);
        voltarTelaModosButton.setEnabled(true);
    }//GEN-LAST:event_fecharTelaOpcoesActionPerformed
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
            java.util.logging.Logger.getLogger(TelaModos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaModos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaModos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaModos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaModos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton creditosTelaOpcoes;
    private javax.swing.JButton fecharTelaOpcoes;
    private javax.swing.JButton offEfeitoSonoroTelaOpcoesButton;
    private javax.swing.JButton offMusicaTelaOpcoesButton;
    private javax.swing.JButton onEfeitoSonoroTelaOpcoesButton;
    private javax.swing.JButton onMusicaTelaOpcoesButton;
    private javax.swing.JButton opcoesTelaModosButton;
    private javax.swing.JButton sobreNosTelaCreditos;
    private javax.swing.JLabel telaCreditosLabelPanel;
    private javax.swing.JPanel telaCreditosPanelTelaModos;
    private javax.swing.JLabel telaModosLabel;
    private javax.swing.JLabel telaOpcoesLabelPanel;
    private javax.swing.JPanel telaOpcoesPanelTelaModos;
    private javax.swing.JLabel telaSobreNosLabel;
    private javax.swing.JPanel telaSobreNosPanelTelaModos;
    private javax.swing.JButton voltarTelaCreditos;
    private javax.swing.JButton voltarTelaModosButton;
    private javax.swing.JButton voltarTelaSobreNos;
    // End of variables declaration//GEN-END:variables
}
