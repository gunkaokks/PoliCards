package telas;

public class TelaManterFlashcards extends javax.swing.JFrame {

    public TelaManterFlashcards() {
        initComponents();
        this.setLocationRelativeTo(null);
        telaOpcoesPanelTelaManterFlashcards.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaOpcoesPanelTelaManterFlashcards = new javax.swing.JPanel();
        offMusicaTelaOpcoesButton = new javax.swing.JButton();
        onMusicaTelaOpcoesButton = new javax.swing.JButton();
        offEfeitoSonoroTelaOpcoesButton = new javax.swing.JButton();
        creditosTelaOpcoes = new javax.swing.JButton();
        onEfeitoSonoroTelaOpcoesButton1 = new javax.swing.JButton();
        fecharTelaOpcoes = new javax.swing.JButton();
        telaOpcoesLabelPanel = new javax.swing.JLabel();
        opcoesTelaManterFlashcards = new javax.swing.JButton();
        voltarTelaManterFlashcards = new javax.swing.JButton();
        criarTelaManterFlashcards = new javax.swing.JButton();
        editarTelaManterFlashcards = new javax.swing.JButton();
        visualizarTelaManterFlashcards = new javax.swing.JButton();
        deletarTelaManterFlashcards = new javax.swing.JButton();
        telaManterFlashcardsLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PoliCards");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        telaOpcoesPanelTelaManterFlashcards.add(creditosTelaOpcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 110, 40));

        onEfeitoSonoroTelaOpcoesButton1.setBorder(null);
        onEfeitoSonoroTelaOpcoesButton1.setContentAreaFilled(false);
        telaOpcoesPanelTelaManterFlashcards.add(onEfeitoSonoroTelaOpcoesButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 70, 50));

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

        criarTelaManterFlashcards.setBorder(null);
        criarTelaManterFlashcards.setContentAreaFilled(false);
        getContentPane().add(criarTelaManterFlashcards, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 240, 60));

        editarTelaManterFlashcards.setBorder(null);
        editarTelaManterFlashcards.setContentAreaFilled(false);
        getContentPane().add(editarTelaManterFlashcards, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 240, 50));

        visualizarTelaManterFlashcards.setBorder(null);
        visualizarTelaManterFlashcards.setContentAreaFilled(false);
        getContentPane().add(visualizarTelaManterFlashcards, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 240, 60));

        deletarTelaManterFlashcards.setBorder(null);
        deletarTelaManterFlashcards.setContentAreaFilled(false);
        getContentPane().add(deletarTelaManterFlashcards, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 240, 60));

        telaManterFlashcardsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA MANTER_FLASHCARDS.png"))); // NOI18N
        getContentPane().add(telaManterFlashcardsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onMusicaTelaOpcoesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onMusicaTelaOpcoesButtonActionPerformed

    }//GEN-LAST:event_onMusicaTelaOpcoesButtonActionPerformed

    private void fecharTelaOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharTelaOpcoesActionPerformed
        telaOpcoesPanelTelaManterFlashcards.setVisible(false);
    }//GEN-LAST:event_fecharTelaOpcoesActionPerformed

    private void opcoesTelaManterFlashcardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcoesTelaManterFlashcardsActionPerformed
        telaOpcoesPanelTelaManterFlashcards.setVisible(true);
    }//GEN-LAST:event_opcoesTelaManterFlashcardsActionPerformed

    private void voltarTelaManterFlashcardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelaManterFlashcardsActionPerformed
        new TelaMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarTelaManterFlashcardsActionPerformed
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
    private javax.swing.JButton criarTelaManterFlashcards;
    private javax.swing.JButton deletarTelaManterFlashcards;
    private javax.swing.JButton editarTelaManterFlashcards;
    private javax.swing.JButton fecharTelaOpcoes;
    private javax.swing.JButton offEfeitoSonoroTelaOpcoesButton;
    private javax.swing.JButton offMusicaTelaOpcoesButton;
    private javax.swing.JButton onEfeitoSonoroTelaOpcoesButton1;
    private javax.swing.JButton onMusicaTelaOpcoesButton;
    private javax.swing.JButton opcoesTelaManterFlashcards;
    private javax.swing.JLabel telaManterFlashcardsLabel;
    private javax.swing.JLabel telaOpcoesLabelPanel;
    private javax.swing.JPanel telaOpcoesPanelTelaManterFlashcards;
    private javax.swing.JButton visualizarTelaManterFlashcards;
    private javax.swing.JButton voltarTelaManterFlashcards;
    // End of variables declaration//GEN-END:variables
}
