package telas;

import java.awt.Cursor;

public class TelaManterFlashcards extends javax.swing.JFrame {

    public TelaManterFlashcards() {
        super ("Policards");
        initComponents();
        this.setLocationRelativeTo(null);
        telaOpcoesPanelTelaManterFlashcards.setVisible(false);
        telaSobreNosPanelTelaManterFlashcards.setVisible(false);
        telaCreditosPanelTelaManterFlashcards.setVisible(false);
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

        opcoesTelaManterFlashcards = new javax.swing.JButton();
        voltarTelaManterFlashcards = new javax.swing.JButton();
        criarButton = new javax.swing.JButton();
        editarButton = new javax.swing.JButton();
        visualizarButton = new javax.swing.JButton();
        deletarButton = new javax.swing.JButton();
        telaManterFlashcardsLabel = new javax.swing.JLabel();
        telaSobreNosPanelTelaManterFlashcards = new javax.swing.JPanel();
        voltarTelaSobreNos = new javax.swing.JButton();
        telaSobreNosLabel = new javax.swing.JLabel();
        telaCreditosPanelTelaManterFlashcards = new javax.swing.JPanel();
        voltarTelaCreditos = new javax.swing.JButton();
        sobreNosTelaCreditos = new javax.swing.JButton();
        telaCreditosLabelPanel = new javax.swing.JLabel();
        telaOpcoesPanelTelaManterFlashcards = new javax.swing.JPanel();
        offMusicaTelaOpcoesButton = new javax.swing.JButton();
        onMusicaTelaOpcoesButton = new javax.swing.JButton();
        offEfeitoSonoroTelaOpcoesButton = new javax.swing.JButton();
        creditosTelaOpcoes = new javax.swing.JButton();
        onEfeitoSonoroTelaOpcoesButton = new javax.swing.JButton();
        fecharTelaOpcoes = new javax.swing.JButton();
        telaOpcoesLabelPanel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PoliCards");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        opcoesTelaManterFlashcards.setBorder(null);
        opcoesTelaManterFlashcards.setContentAreaFilled(false);
        opcoesTelaManterFlashcards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcoesTelaManterFlashcardsActionPerformed(evt);
            }
        });
        getContentPane().add(opcoesTelaManterFlashcards, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 130, 30));

        voltarTelaManterFlashcards.setBorder(null);
        voltarTelaManterFlashcards.setContentAreaFilled(false);
        voltarTelaManterFlashcards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTelaManterFlashcardsActionPerformed(evt);
            }
        });
        getContentPane().add(voltarTelaManterFlashcards, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 30));

        criarButton.setBorder(null);
        criarButton.setContentAreaFilled(false);
        criarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(criarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 240, 60));

        editarButton.setBorder(null);
        editarButton.setContentAreaFilled(false);
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(editarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 240, 50));

        visualizarButton.setBorder(null);
        visualizarButton.setContentAreaFilled(false);
        getContentPane().add(visualizarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 240, 60));

        deletarButton.setBorder(null);
        deletarButton.setContentAreaFilled(false);
        getContentPane().add(deletarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 240, 60));

        telaManterFlashcardsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA MANTER_FLASHCARDS.png"))); // NOI18N
        getContentPane().add(telaManterFlashcardsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        telaSobreNosPanelTelaManterFlashcards.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        voltarTelaSobreNos.setBorder(null);
        voltarTelaSobreNos.setContentAreaFilled(false);
        voltarTelaSobreNos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTelaSobreNosActionPerformed(evt);
            }
        });
        telaSobreNosPanelTelaManterFlashcards.add(voltarTelaSobreNos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        telaSobreNosLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_SOBRE_NOS.png"))); // NOI18N
        telaSobreNosPanelTelaManterFlashcards.add(telaSobreNosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(telaSobreNosPanelTelaManterFlashcards, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        telaCreditosPanelTelaManterFlashcards.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        voltarTelaCreditos.setBorder(null);
        voltarTelaCreditos.setContentAreaFilled(false);
        voltarTelaCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTelaCreditosActionPerformed(evt);
            }
        });
        telaCreditosPanelTelaManterFlashcards.add(voltarTelaCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 104, 26));

        sobreNosTelaCreditos.setBorder(null);
        sobreNosTelaCreditos.setContentAreaFilled(false);
        sobreNosTelaCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreNosTelaCreditosActionPerformed(evt);
            }
        });
        telaCreditosPanelTelaManterFlashcards.add(sobreNosTelaCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 451, 148, 39));

        telaCreditosLabelPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        telaCreditosLabelPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_CREDITOS.png"))); // NOI18N
        telaCreditosPanelTelaManterFlashcards.add(telaCreditosLabelPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(telaCreditosPanelTelaManterFlashcards, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        telaOpcoesPanelTelaManterFlashcards.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        offMusicaTelaOpcoesButton.setBorder(null);
        offMusicaTelaOpcoesButton.setContentAreaFilled(false);
        telaOpcoesPanelTelaManterFlashcards.add(offMusicaTelaOpcoesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 70, 50));

        onMusicaTelaOpcoesButton.setBorder(null);
        onMusicaTelaOpcoesButton.setContentAreaFilled(false);
        onMusicaTelaOpcoesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onMusicaTelaOpcoesButtonActionPerformed(evt);
            }
        });
        telaOpcoesPanelTelaManterFlashcards.add(onMusicaTelaOpcoesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 70, 50));

        offEfeitoSonoroTelaOpcoesButton.setBorder(null);
        offEfeitoSonoroTelaOpcoesButton.setContentAreaFilled(false);
        telaOpcoesPanelTelaManterFlashcards.add(offEfeitoSonoroTelaOpcoesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 70, 40));

        creditosTelaOpcoes.setBorder(null);
        creditosTelaOpcoes.setContentAreaFilled(false);
        creditosTelaOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditosTelaOpcoesActionPerformed(evt);
            }
        });
        telaOpcoesPanelTelaManterFlashcards.add(creditosTelaOpcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 130, 50));

        onEfeitoSonoroTelaOpcoesButton.setBorder(null);
        onEfeitoSonoroTelaOpcoesButton.setContentAreaFilled(false);
        telaOpcoesPanelTelaManterFlashcards.add(onEfeitoSonoroTelaOpcoesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 70, 50));

        fecharTelaOpcoes.setBorder(null);
        fecharTelaOpcoes.setContentAreaFilled(false);
        fecharTelaOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharTelaOpcoesActionPerformed(evt);
            }
        });
        telaOpcoesPanelTelaManterFlashcards.add(fecharTelaOpcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        telaOpcoesLabelPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_OPCOES.png"))); // NOI18N
        telaOpcoesPanelTelaManterFlashcards.add(telaOpcoesLabelPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(telaOpcoesPanelTelaManterFlashcards, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcoesTelaManterFlashcardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcoesTelaManterFlashcardsActionPerformed
        telaOpcoesPanelTelaManterFlashcards.setVisible(true);
        offMusicaTelaOpcoesButton.setEnabled(true);
        onMusicaTelaOpcoesButton.setEnabled(true);
        offEfeitoSonoroTelaOpcoesButton.setEnabled(true);
        onEfeitoSonoroTelaOpcoesButton.setEnabled(true);
        fecharTelaOpcoes.setEnabled(true);
        creditosTelaOpcoes.setEnabled(true);
        opcoesTelaManterFlashcards.setEnabled(false);
        voltarTelaManterFlashcards.setEnabled(false);
        criarButton.setEnabled(false);
        editarButton.setEnabled(false);
        visualizarButton.setEnabled(false);
        deletarButton.setEnabled(false);
        
    }//GEN-LAST:event_opcoesTelaManterFlashcardsActionPerformed

    private void voltarTelaManterFlashcardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelaManterFlashcardsActionPerformed
        new TelaMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarTelaManterFlashcardsActionPerformed

    private void voltarTelaCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelaCreditosActionPerformed
        telaCreditosPanelTelaManterFlashcards.setVisible(false);
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
        telaSobreNosPanelTelaManterFlashcards.setVisible(true);
        voltarTelaSobreNos.setEnabled(true);
        sobreNosTelaCreditos.setVisible(false);
    }//GEN-LAST:event_sobreNosTelaCreditosActionPerformed

    private void voltarTelaSobreNosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelaSobreNosActionPerformed
        telaSobreNosPanelTelaManterFlashcards.setVisible(false);
        voltarTelaSobreNos.setEnabled(false);
        sobreNosTelaCreditos.setVisible(true);
    }//GEN-LAST:event_voltarTelaSobreNosActionPerformed

    private void onMusicaTelaOpcoesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onMusicaTelaOpcoesButtonActionPerformed

    }//GEN-LAST:event_onMusicaTelaOpcoesButtonActionPerformed

    private void creditosTelaOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditosTelaOpcoesActionPerformed
        telaCreditosPanelTelaManterFlashcards.setVisible(true);
        offMusicaTelaOpcoesButton.setEnabled(false);
        onMusicaTelaOpcoesButton.setEnabled(false);
        offEfeitoSonoroTelaOpcoesButton.setEnabled(false);
        onEfeitoSonoroTelaOpcoesButton.setEnabled(false);
        fecharTelaOpcoes.setEnabled(false);
        creditosTelaOpcoes.setVisible(false);
        sobreNosTelaCreditos.setEnabled(true);
    }//GEN-LAST:event_creditosTelaOpcoesActionPerformed

    private void fecharTelaOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharTelaOpcoesActionPerformed
        telaOpcoesPanelTelaManterFlashcards.setVisible(false);
        offMusicaTelaOpcoesButton.setEnabled(false);
        onMusicaTelaOpcoesButton.setEnabled(false);
        offEfeitoSonoroTelaOpcoesButton.setEnabled(false);
        onEfeitoSonoroTelaOpcoesButton.setEnabled(false);
        fecharTelaOpcoes.setEnabled(false);
        creditosTelaOpcoes.setEnabled(false);
        opcoesTelaManterFlashcards.setEnabled(true);
        voltarTelaManterFlashcards.setEnabled(true);
        criarButton.setEnabled(true);
        editarButton.setEnabled(true);
        visualizarButton.setEnabled(true);
        deletarButton.setEnabled(true);
        
    }//GEN-LAST:event_fecharTelaOpcoesActionPerformed

    private void criarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarButtonActionPerformed
        criarButton.setCursor(new Cursor(Cursor.WAIT_CURSOR));
        new TelaCriarFlashcards().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_criarButtonActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editarButtonActionPerformed
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
            java.util.logging.Logger.getLogger(TelaManterFlashcards.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaManterFlashcards.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaManterFlashcards.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaManterFlashcards.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaManterFlashcards().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton creditosTelaOpcoes;
    private javax.swing.JButton criarButton;
    private javax.swing.JButton deletarButton;
    private javax.swing.JButton editarButton;
    private javax.swing.JButton fecharTelaOpcoes;
    private javax.swing.JButton offEfeitoSonoroTelaOpcoesButton;
    private javax.swing.JButton offMusicaTelaOpcoesButton;
    private javax.swing.JButton onEfeitoSonoroTelaOpcoesButton;
    private javax.swing.JButton onMusicaTelaOpcoesButton;
    private javax.swing.JButton opcoesTelaManterFlashcards;
    private javax.swing.JButton sobreNosTelaCreditos;
    private javax.swing.JLabel telaCreditosLabelPanel;
    private javax.swing.JPanel telaCreditosPanelTelaManterFlashcards;
    private javax.swing.JLabel telaManterFlashcardsLabel;
    private javax.swing.JLabel telaOpcoesLabelPanel;
    private javax.swing.JPanel telaOpcoesPanelTelaManterFlashcards;
    private javax.swing.JLabel telaSobreNosLabel;
    private javax.swing.JPanel telaSobreNosPanelTelaManterFlashcards;
    private javax.swing.JButton visualizarButton;
    private javax.swing.JButton voltarTelaCreditos;
    private javax.swing.JButton voltarTelaManterFlashcards;
    private javax.swing.JButton voltarTelaSobreNos;
    // End of variables declaration//GEN-END:variables
}
