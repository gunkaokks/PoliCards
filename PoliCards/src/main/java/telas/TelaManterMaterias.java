package telas;

public class TelaManterMaterias extends javax.swing.JFrame {

    public TelaManterMaterias() {
        super ("Policards");
        initComponents();
        this.setLocationRelativeTo(null);
        telaOpcoesPanelTelaManterMaterias.setVisible(false);
        telaSobreNosPanelTelaManterMaterias.setVisible(false);
        telaCreditosPanelTelaManterMaterias.setVisible(false);
        offMusicaTelaOpcoesButton.setEnabled(false);
        onMusicaTelaOpcoesButton.setEnabled(false);
        offEfeitoSonoroTelaOpcoesButton.setEnabled(false);
        onEfeitoSonoroTelaOpcoesButton.setEnabled(false);
        fecharTelaOpcoes.setEnabled(false);
        creditosTelaOpcoes.setEnabled(false);
        sobreNosTelaCreditos.setEnabled(false);
        voltarTelaSobreNosTelaManterMaterias.setEnabled(false);
        opcoesTelaManterMaterias.setEnabled(true);
        voltarTelaManterMaterias.setEnabled(true);
        criarTelaManterMaterias.setEnabled(true);
        deletarTelaManterMaterias.setEnabled(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaSobreNosPanelTelaManterMaterias = new javax.swing.JPanel();
        voltarTelaSobreNosTelaManterMaterias = new javax.swing.JButton();
        telaSobreNosLabel = new javax.swing.JLabel();
        telaCreditosPanelTelaManterMaterias = new javax.swing.JPanel();
        voltarTelaCreditos = new javax.swing.JButton();
        sobreNosTelaCreditos = new javax.swing.JButton();
        telaCreditosLabelPanel = new javax.swing.JLabel();
        telaOpcoesPanelTelaManterMaterias = new javax.swing.JPanel();
        offMusicaTelaOpcoesButton = new javax.swing.JButton();
        onMusicaTelaOpcoesButton = new javax.swing.JButton();
        offEfeitoSonoroTelaOpcoesButton = new javax.swing.JButton();
        creditosTelaOpcoes = new javax.swing.JButton();
        onEfeitoSonoroTelaOpcoesButton = new javax.swing.JButton();
        fecharTelaOpcoes = new javax.swing.JButton();
        telaOpcoesLabelPanel = new javax.swing.JLabel();
        opcoesTelaManterMaterias = new javax.swing.JButton();
        voltarTelaManterMaterias = new javax.swing.JButton();
        deletarTelaManterMaterias = new javax.swing.JButton();
        criarTelaManterMaterias = new javax.swing.JButton();
        telaManterMateriasLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        telaSobreNosPanelTelaManterMaterias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        voltarTelaSobreNosTelaManterMaterias.setBorder(null);
        voltarTelaSobreNosTelaManterMaterias.setContentAreaFilled(false);
        voltarTelaSobreNosTelaManterMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTelaSobreNosTelaManterMateriasActionPerformed(evt);
            }
        });
        telaSobreNosPanelTelaManterMaterias.add(voltarTelaSobreNosTelaManterMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        telaSobreNosLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_SOBRE_NOS.png"))); // NOI18N
        telaSobreNosPanelTelaManterMaterias.add(telaSobreNosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(telaSobreNosPanelTelaManterMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        telaCreditosPanelTelaManterMaterias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        voltarTelaCreditos.setBorder(null);
        voltarTelaCreditos.setContentAreaFilled(false);
        voltarTelaCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTelaCreditosActionPerformed(evt);
            }
        });
        telaCreditosPanelTelaManterMaterias.add(voltarTelaCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 104, 26));

        sobreNosTelaCreditos.setBorder(null);
        sobreNosTelaCreditos.setContentAreaFilled(false);
        sobreNosTelaCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreNosTelaCreditosActionPerformed(evt);
            }
        });
        telaCreditosPanelTelaManterMaterias.add(sobreNosTelaCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 451, 148, 39));

        telaCreditosLabelPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        telaCreditosLabelPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_CREDITOS.png"))); // NOI18N
        telaCreditosPanelTelaManterMaterias.add(telaCreditosLabelPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(telaCreditosPanelTelaManterMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        telaOpcoesPanelTelaManterMaterias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        offMusicaTelaOpcoesButton.setBorder(null);
        offMusicaTelaOpcoesButton.setContentAreaFilled(false);
        telaOpcoesPanelTelaManterMaterias.add(offMusicaTelaOpcoesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 70, 50));

        onMusicaTelaOpcoesButton.setBorder(null);
        onMusicaTelaOpcoesButton.setContentAreaFilled(false);
        onMusicaTelaOpcoesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onMusicaTelaOpcoesButtonActionPerformed(evt);
            }
        });
        telaOpcoesPanelTelaManterMaterias.add(onMusicaTelaOpcoesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 70, 50));

        offEfeitoSonoroTelaOpcoesButton.setBorder(null);
        offEfeitoSonoroTelaOpcoesButton.setContentAreaFilled(false);
        telaOpcoesPanelTelaManterMaterias.add(offEfeitoSonoroTelaOpcoesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 70, 40));

        creditosTelaOpcoes.setBorder(null);
        creditosTelaOpcoes.setContentAreaFilled(false);
        creditosTelaOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditosTelaOpcoesActionPerformed(evt);
            }
        });
        telaOpcoesPanelTelaManterMaterias.add(creditosTelaOpcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 130, 50));

        onEfeitoSonoroTelaOpcoesButton.setBorder(null);
        onEfeitoSonoroTelaOpcoesButton.setContentAreaFilled(false);
        telaOpcoesPanelTelaManterMaterias.add(onEfeitoSonoroTelaOpcoesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 70, 50));

        fecharTelaOpcoes.setBorder(null);
        fecharTelaOpcoes.setContentAreaFilled(false);
        fecharTelaOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharTelaOpcoesActionPerformed(evt);
            }
        });
        telaOpcoesPanelTelaManterMaterias.add(fecharTelaOpcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        telaOpcoesLabelPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_OPCOES.png"))); // NOI18N
        telaOpcoesPanelTelaManterMaterias.add(telaOpcoesLabelPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(telaOpcoesPanelTelaManterMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        opcoesTelaManterMaterias.setBorder(null);
        opcoesTelaManterMaterias.setContentAreaFilled(false);
        opcoesTelaManterMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcoesTelaManterMateriasActionPerformed(evt);
            }
        });
        getContentPane().add(opcoesTelaManterMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, 120, 30));

        voltarTelaManterMaterias.setBorder(null);
        voltarTelaManterMaterias.setContentAreaFilled(false);
        voltarTelaManterMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTelaManterMateriasActionPerformed(evt);
            }
        });
        getContentPane().add(voltarTelaManterMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 120, 50));

        deletarTelaManterMaterias.setBorder(null);
        deletarTelaManterMaterias.setContentAreaFilled(false);
        getContentPane().add(deletarTelaManterMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 380, 90));

        criarTelaManterMaterias.setBorder(null);
        criarTelaManterMaterias.setContentAreaFilled(false);
        criarTelaManterMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarTelaManterMateriasActionPerformed(evt);
            }
        });
        getContentPane().add(criarTelaManterMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 380, 90));

        telaManterMateriasLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_MANTER_MATERIAS.png"))); // NOI18N
        getContentPane().add(telaManterMateriasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarTelaSobreNosTelaManterMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelaSobreNosTelaManterMateriasActionPerformed
        telaSobreNosPanelTelaManterMaterias.setVisible(false);
        voltarTelaSobreNosTelaManterMaterias.setEnabled(false);
        sobreNosTelaCreditos.setVisible(true);
    }//GEN-LAST:event_voltarTelaSobreNosTelaManterMateriasActionPerformed

    private void voltarTelaCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelaCreditosActionPerformed
        telaCreditosPanelTelaManterMaterias.setVisible(false);
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
        telaSobreNosPanelTelaManterMaterias.setVisible(true);
        voltarTelaSobreNosTelaManterMaterias.setEnabled(true);
        sobreNosTelaCreditos.setVisible(false);
    }//GEN-LAST:event_sobreNosTelaCreditosActionPerformed

    private void onMusicaTelaOpcoesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onMusicaTelaOpcoesButtonActionPerformed

    }//GEN-LAST:event_onMusicaTelaOpcoesButtonActionPerformed

    private void creditosTelaOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditosTelaOpcoesActionPerformed
        telaCreditosPanelTelaManterMaterias.setVisible(true);
        offMusicaTelaOpcoesButton.setEnabled(false);
        onMusicaTelaOpcoesButton.setEnabled(false);
        offEfeitoSonoroTelaOpcoesButton.setEnabled(false);
        onEfeitoSonoroTelaOpcoesButton.setEnabled(false);
        fecharTelaOpcoes.setEnabled(false);
        creditosTelaOpcoes.setVisible(false);
        sobreNosTelaCreditos.setEnabled(true);
    }//GEN-LAST:event_creditosTelaOpcoesActionPerformed

    private void fecharTelaOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharTelaOpcoesActionPerformed
        telaOpcoesPanelTelaManterMaterias.setVisible(false);
        offMusicaTelaOpcoesButton.setEnabled(false);
        onMusicaTelaOpcoesButton.setEnabled(false);
        offEfeitoSonoroTelaOpcoesButton.setEnabled(false);
        onEfeitoSonoroTelaOpcoesButton.setEnabled(false);
        fecharTelaOpcoes.setEnabled(false);
        creditosTelaOpcoes.setEnabled(false);
        opcoesTelaManterMaterias.setEnabled(true);
        voltarTelaManterMaterias.setEnabled(true);
        criarTelaManterMaterias.setEnabled(true);
        deletarTelaManterMaterias.setEnabled(true);

    }//GEN-LAST:event_fecharTelaOpcoesActionPerformed

    private void opcoesTelaManterMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcoesTelaManterMateriasActionPerformed
        telaOpcoesPanelTelaManterMaterias.setVisible(true);
        offMusicaTelaOpcoesButton.setEnabled(true);
        onMusicaTelaOpcoesButton.setEnabled(true);
        offEfeitoSonoroTelaOpcoesButton.setEnabled(true);
        onEfeitoSonoroTelaOpcoesButton.setEnabled(true);
        fecharTelaOpcoes.setEnabled(true);
        creditosTelaOpcoes.setEnabled(true);
        opcoesTelaManterMaterias.setEnabled(false);
        voltarTelaManterMaterias.setEnabled(false);
        criarTelaManterMaterias.setEnabled(false);
        deletarTelaManterMaterias.setEnabled(false);
    }//GEN-LAST:event_opcoesTelaManterMateriasActionPerformed

    private void voltarTelaManterMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelaManterMateriasActionPerformed
        new TelaMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarTelaManterMateriasActionPerformed

    private void criarTelaManterMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarTelaManterMateriasActionPerformed
        new TelaCriarMaterias().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_criarTelaManterMateriasActionPerformed
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
            java.util.logging.Logger.getLogger(TelaManterMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaManterMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaManterMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaManterMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaManterMaterias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton creditosTelaOpcoes;
    private javax.swing.JButton criarTelaManterMaterias;
    private javax.swing.JButton deletarTelaManterMaterias;
    private javax.swing.JButton fecharTelaOpcoes;
    private javax.swing.JButton offEfeitoSonoroTelaOpcoesButton;
    private javax.swing.JButton offMusicaTelaOpcoesButton;
    private javax.swing.JButton onEfeitoSonoroTelaOpcoesButton;
    private javax.swing.JButton onMusicaTelaOpcoesButton;
    private javax.swing.JButton opcoesTelaManterMaterias;
    private javax.swing.JButton sobreNosTelaCreditos;
    private javax.swing.JLabel telaCreditosLabelPanel;
    private javax.swing.JPanel telaCreditosPanelTelaManterMaterias;
    private javax.swing.JLabel telaManterMateriasLabel;
    private javax.swing.JLabel telaOpcoesLabelPanel;
    private javax.swing.JPanel telaOpcoesPanelTelaManterMaterias;
    private javax.swing.JLabel telaSobreNosLabel;
    private javax.swing.JPanel telaSobreNosPanelTelaCriarFlashcards;
    private javax.swing.JPanel telaSobreNosPanelTelaCriarFlashcards1;
    private javax.swing.JPanel telaSobreNosPanelTelaManterMaterias;
    private javax.swing.JButton voltarTelaCreditos;
    private javax.swing.JButton voltarTelaManterMaterias;
    private javax.swing.JButton voltarTelaSobreNos;
    private javax.swing.JButton voltarTelaSobreNos1;
    private javax.swing.JButton voltarTelaSobreNosTelaManterMaterias;
    // End of variables declaration//GEN-END:variables
}
