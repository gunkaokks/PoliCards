package telas;

public class TelaMenu extends javax.swing.JFrame {
    public TelaMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        telaOpcoesPanelTelaMenu.setVisible(false);
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaOpcoesPanelTelaMenu = new javax.swing.JPanel();
        offMusicaTelaOpcoesButton = new javax.swing.JButton();
        onMusicaTelaOpcoesButton = new javax.swing.JButton();
        offEfeitoSonoroTelaOpcoesButton = new javax.swing.JButton();
        creditosTelaOpcoes = new javax.swing.JButton();
        onEfeitoSonoroTelaOpcoesButton1 = new javax.swing.JButton();
        fecharTelaOpcoes = new javax.swing.JButton();
        telaOpcoesLabelPanel = new javax.swing.JLabel();
        iniciarJogoTelaMenuButton = new javax.swing.JButton();
        flashcardsTelaMenu = new javax.swing.JButton();
        sairTelaMenu = new javax.swing.JButton();
        opcoesTelaMenuButton = new javax.swing.JButton();
        telaMenuLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PoliCards");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        telaOpcoesPanelTelaMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        offMusicaTelaOpcoesButton.setBorder(null);
        offMusicaTelaOpcoesButton.setContentAreaFilled(false);
        telaOpcoesPanelTelaMenu.add(offMusicaTelaOpcoesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 70, 50));

        onMusicaTelaOpcoesButton.setBorder(null);
        onMusicaTelaOpcoesButton.setContentAreaFilled(false);
        onMusicaTelaOpcoesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onMusicaTelaOpcoesButtonActionPerformed(evt);
            }
        });
        telaOpcoesPanelTelaMenu.add(onMusicaTelaOpcoesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 70, 50));

        offEfeitoSonoroTelaOpcoesButton.setBorder(null);
        offEfeitoSonoroTelaOpcoesButton.setContentAreaFilled(false);
        telaOpcoesPanelTelaMenu.add(offEfeitoSonoroTelaOpcoesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 70, 40));

        creditosTelaOpcoes.setBorder(null);
        creditosTelaOpcoes.setContentAreaFilled(false);
        telaOpcoesPanelTelaMenu.add(creditosTelaOpcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 110, 40));

        onEfeitoSonoroTelaOpcoesButton1.setBorder(null);
        onEfeitoSonoroTelaOpcoesButton1.setContentAreaFilled(false);
        telaOpcoesPanelTelaMenu.add(onEfeitoSonoroTelaOpcoesButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 70, 50));

        fecharTelaOpcoes.setBorder(null);
        fecharTelaOpcoes.setContentAreaFilled(false);
        fecharTelaOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharTelaOpcoesActionPerformed(evt);
            }
        });
        telaOpcoesPanelTelaMenu.add(fecharTelaOpcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        telaOpcoesLabelPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_OPCOES.png"))); // NOI18N
        telaOpcoesPanelTelaMenu.add(telaOpcoesLabelPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(telaOpcoesPanelTelaMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        iniciarJogoTelaMenuButton.setBorder(null);
        iniciarJogoTelaMenuButton.setContentAreaFilled(false);
        getContentPane().add(iniciarJogoTelaMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 290, 70));

        flashcardsTelaMenu.setBorder(null);
        flashcardsTelaMenu.setContentAreaFilled(false);
        getContentPane().add(flashcardsTelaMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 290, 70));

        sairTelaMenu.setBorder(null);
        sairTelaMenu.setContentAreaFilled(false);
        sairTelaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairTelaMenuActionPerformed(evt);
            }
        });
        getContentPane().add(sairTelaMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 300, 70));

        opcoesTelaMenuButton.setBorder(null);
        opcoesTelaMenuButton.setContentAreaFilled(false);
        opcoesTelaMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcoesTelaMenuButtonActionPerformed(evt);
            }
        });
        getContentPane().add(opcoesTelaMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 13, 110, 30));

        telaMenuLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_MENU.png"))); // NOI18N
        getContentPane().add(telaMenuLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcoesTelaMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcoesTelaMenuButtonActionPerformed
        telaOpcoesPanelTelaMenu.setVisible(true);
        
    }//GEN-LAST:event_opcoesTelaMenuButtonActionPerformed

    private void sairTelaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairTelaMenuActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairTelaMenuActionPerformed

    private void fecharTelaOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharTelaOpcoesActionPerformed
        telaOpcoesPanelTelaMenu.setVisible(false);
    }//GEN-LAST:event_fecharTelaOpcoesActionPerformed

    private void onMusicaTelaOpcoesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onMusicaTelaOpcoesButtonActionPerformed

    }//GEN-LAST:event_onMusicaTelaOpcoesButtonActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton creditosTelaOpcoes;
    private javax.swing.JButton fecharTelaOpcoes;
    private javax.swing.JButton flashcardsTelaMenu;
    private javax.swing.JButton iniciarJogoTelaMenuButton;
    private javax.swing.JButton offEfeitoSonoroTelaOpcoesButton;
    private javax.swing.JButton offMusicaTelaOpcoesButton;
    private javax.swing.JButton onEfeitoSonoroTelaOpcoesButton1;
    private javax.swing.JButton onMusicaTelaOpcoesButton;
    private javax.swing.JButton opcoesTelaMenuButton;
    private javax.swing.JButton sairTelaMenu;
    private javax.swing.JLabel telaMenuLabel;
    private javax.swing.JLabel telaOpcoesLabelPanel;
    private javax.swing.JPanel telaOpcoesPanelTelaMenu;
    // End of variables declaration//GEN-END:variables
}
