package crudFlashcards;

import java.awt.Cursor;
import javax.swing.JOptionPane;
import persistencia.Sessao;
import sons.EfeitosSonoros;
import sons.Musicas;
import telas.TelaManterFlashcards;

public class TelaConsultar extends javax.swing.JFrame {

    private FlashcardTableModel tabelaFlashcards = new FlashcardTableModel();
    private int idAlunoLogado;

    public TelaConsultar() {
        super ("Policards");
        initComponents();
        this.setLocationRelativeTo(null);
        this.idAlunoLogado = Sessao.getIdAluno();
        flashcardsTable.setModel(tabelaFlashcards);
        telaOpcoesPanel.setVisible(false);
        telaSobreNosPanelTelaConsultar.setVisible(false);
        telaCreditosPanel.setVisible(false);
        offMusicaTelaOpcoesButton.setEnabled(false);
        onMusicaTelaOpcoesButton.setEnabled(false);
        offEfeitoSonoroTelaOpcoesButton.setEnabled(false);
        onEfeitoSonoroTelaOpcoesButton.setEnabled(false);
        fecharTelaOpcoes.setEnabled(false);
        creditosTelaOpcoes.setEnabled(false);
        sobreNosTelaCreditos.setEnabled(false);
        voltarTelaSobreNosTelaConsultar.setEnabled(false);
        offMusicaLabel.setVisible(false);
        onMusicaLabel.setVisible(false);
        offEfeitosSonorosLabel.setVisible(false);
        onEfeitosSonorosLabel.setVisible(false);

        try {
            idComboBox.removeAllItems();
            for (FlashcardResposta f : FlashcardService.get(idAlunoLogado)) {
                idComboBox.addItem(String.valueOf(f.getId_flashcard()));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar Flashcards:");
            e.printStackTrace();
        }
   
    }
    
    private void getFlashcards(int idQuestao) {
        try {
            while (this.tabelaFlashcards.getRowCount() > 0) {
                this.tabelaFlashcards.removeRow(0);
            }

            for (FlashcardResposta flashcard : FlashcardService.get(idAlunoLogado)) {
                if (flashcard.getId_flashcard() == idQuestao) {
                    this.tabelaFlashcards.addRow(flashcard);
                    break; 
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro ao carregar flashcards", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaSobreNosPanelTelaConsultar = new javax.swing.JPanel();
        voltarTelaSobreNosTelaConsultar = new javax.swing.JButton();
        telaSobreNosLabel = new javax.swing.JLabel();
        telaCreditosPanel = new javax.swing.JPanel();
        voltarTelaCreditos = new javax.swing.JButton();
        sobreNosTelaCreditos = new javax.swing.JButton();
        telaCreditosLabelPanel = new javax.swing.JLabel();
        telaOpcoesPanel = new javax.swing.JPanel();
        offMusicaLabel = new javax.swing.JLabel();
        onMusicaLabel = new javax.swing.JLabel();
        offEfeitosSonorosLabel = new javax.swing.JLabel();
        onEfeitosSonorosLabel = new javax.swing.JLabel();
        offMusicaTelaOpcoesButton = new javax.swing.JButton();
        onMusicaTelaOpcoesButton = new javax.swing.JButton();
        offEfeitoSonoroTelaOpcoesButton = new javax.swing.JButton();
        creditosTelaOpcoes = new javax.swing.JButton();
        onEfeitoSonoroTelaOpcoesButton = new javax.swing.JButton();
        fecharTelaOpcoes = new javax.swing.JButton();
        telaOpcoesLabelPanel = new javax.swing.JLabel();
        opcoesTelaConsultar = new javax.swing.JButton();
        voltarTelaConsultar = new javax.swing.JButton();
        flashcardsScrollPane = new javax.swing.JScrollPane();
        flashcardsTable = new javax.swing.JTable();
        procurarButton = new javax.swing.JButton();
        idComboBox = new javax.swing.JComboBox<>();
        telaConsultarLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        telaSobreNosPanelTelaConsultar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        voltarTelaSobreNosTelaConsultar.setBorder(null);
        voltarTelaSobreNosTelaConsultar.setContentAreaFilled(false);
        voltarTelaSobreNosTelaConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTelaSobreNosTelaConsultarActionPerformed(evt);
            }
        });
        telaSobreNosPanelTelaConsultar.add(voltarTelaSobreNosTelaConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        telaSobreNosLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_SOBRE_NOS.png"))); // NOI18N
        telaSobreNosPanelTelaConsultar.add(telaSobreNosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(telaSobreNosPanelTelaConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        telaCreditosPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        voltarTelaCreditos.setBorder(null);
        voltarTelaCreditos.setContentAreaFilled(false);
        voltarTelaCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTelaCreditosActionPerformed(evt);
            }
        });
        telaCreditosPanel.add(voltarTelaCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 104, 26));

        sobreNosTelaCreditos.setBorder(null);
        sobreNosTelaCreditos.setContentAreaFilled(false);
        sobreNosTelaCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreNosTelaCreditosActionPerformed(evt);
            }
        });
        telaCreditosPanel.add(sobreNosTelaCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 451, 148, 39));

        telaCreditosLabelPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        telaCreditosLabelPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_CREDITOS.png"))); // NOI18N
        telaCreditosPanel.add(telaCreditosLabelPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(telaCreditosPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        telaOpcoesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        offMusicaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OFF.png"))); // NOI18N
        offMusicaLabel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                offMusicaLabelAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        telaOpcoesPanel.add(offMusicaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 188, 70, 60));

        onMusicaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ON.png"))); // NOI18N
        telaOpcoesPanel.add(onMusicaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 189, 70, 60));

        offEfeitosSonorosLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OFF.png"))); // NOI18N
        offEfeitosSonorosLabel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                offEfeitosSonorosLabelAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        telaOpcoesPanel.add(offEfeitosSonorosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 312, 70, 60));

        onEfeitosSonorosLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ON.png"))); // NOI18N
        telaOpcoesPanel.add(onEfeitosSonorosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 318, 70, 50));

        offMusicaTelaOpcoesButton.setBorder(null);
        offMusicaTelaOpcoesButton.setContentAreaFilled(false);
        offMusicaTelaOpcoesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offMusicaTelaOpcoesButtonActionPerformed(evt);
            }
        });
        telaOpcoesPanel.add(offMusicaTelaOpcoesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 70, 50));

        onMusicaTelaOpcoesButton.setBorder(null);
        onMusicaTelaOpcoesButton.setContentAreaFilled(false);
        onMusicaTelaOpcoesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onMusicaTelaOpcoesButtonActionPerformed(evt);
            }
        });
        telaOpcoesPanel.add(onMusicaTelaOpcoesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 70, 50));

        offEfeitoSonoroTelaOpcoesButton.setBorder(null);
        offEfeitoSonoroTelaOpcoesButton.setContentAreaFilled(false);
        offEfeitoSonoroTelaOpcoesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offEfeitoSonoroTelaOpcoesButtonActionPerformed(evt);
            }
        });
        telaOpcoesPanel.add(offEfeitoSonoroTelaOpcoesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 70, 40));

        creditosTelaOpcoes.setBorder(null);
        creditosTelaOpcoes.setContentAreaFilled(false);
        creditosTelaOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditosTelaOpcoesActionPerformed(evt);
            }
        });
        telaOpcoesPanel.add(creditosTelaOpcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 130, 50));

        onEfeitoSonoroTelaOpcoesButton.setBorder(null);
        onEfeitoSonoroTelaOpcoesButton.setContentAreaFilled(false);
        onEfeitoSonoroTelaOpcoesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onEfeitoSonoroTelaOpcoesButtonActionPerformed(evt);
            }
        });
        telaOpcoesPanel.add(onEfeitoSonoroTelaOpcoesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 70, 50));

        fecharTelaOpcoes.setBorder(null);
        fecharTelaOpcoes.setContentAreaFilled(false);
        fecharTelaOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharTelaOpcoesActionPerformed(evt);
            }
        });
        telaOpcoesPanel.add(fecharTelaOpcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        telaOpcoesLabelPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_OPCOES.png"))); // NOI18N
        telaOpcoesPanel.add(telaOpcoesLabelPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(telaOpcoesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        opcoesTelaConsultar.setBorder(null);
        opcoesTelaConsultar.setContentAreaFilled(false);
        opcoesTelaConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcoesTelaConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(opcoesTelaConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 100, 30));

        voltarTelaConsultar.setBorder(null);
        voltarTelaConsultar.setContentAreaFilled(false);
        voltarTelaConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTelaConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(voltarTelaConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 20));

        flashcardsScrollPane.setFocusable(false);

        flashcardsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        flashcardsTable.setEnabled(false);
        flashcardsScrollPane.setViewportView(flashcardsTable);

        getContentPane().add(flashcardsScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 780, 330));

        procurarButton.setBorder(null);
        procurarButton.setContentAreaFilled(false);
        procurarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procurarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(procurarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 100, 40));

        idComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        idComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(idComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 127, 90, 30));

        telaConsultarLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_CULSULTAR_FLASHCARD.png"))); // NOI18N
        getContentPane().add(telaConsultarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idComboBoxActionPerformed

    private void procurarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procurarButtonActionPerformed
        EfeitosSonoros.Play("click.wav");
        procurarButton.setCursor(new Cursor(Cursor.WAIT_CURSOR));
        String selecionado = String.valueOf(idComboBox.getSelectedItem());
        int idSelecionado = Integer.parseInt(selecionado);
        getFlashcards(idSelecionado);
        procurarButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_procurarButtonActionPerformed

    private void voltarTelaConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelaConsultarActionPerformed
        EfeitosSonoros.Play("back.wav");
        new TelaManterFlashcards().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarTelaConsultarActionPerformed

    private void voltarTelaSobreNosTelaConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelaSobreNosTelaConsultarActionPerformed
        EfeitosSonoros.Play("back.wav");
        telaSobreNosPanelTelaConsultar.setVisible(false);
        telaSobreNosPanelTelaConsultar.setEnabled(false);
        sobreNosTelaCreditos.setVisible(true);
    }//GEN-LAST:event_voltarTelaSobreNosTelaConsultarActionPerformed

    private void voltarTelaCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelaCreditosActionPerformed
        EfeitosSonoros.Play("back.wav");
        telaCreditosPanel.setVisible(false);
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
        EfeitosSonoros.Play("click.wav");
        telaSobreNosPanelTelaConsultar.setVisible(true);
        voltarTelaSobreNosTelaConsultar.setEnabled(true);
        sobreNosTelaCreditos.setVisible(false);
    }//GEN-LAST:event_sobreNosTelaCreditosActionPerformed

    private void offMusicaLabelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_offMusicaLabelAncestorAdded

    }//GEN-LAST:event_offMusicaLabelAncestorAdded

    private void offEfeitosSonorosLabelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_offEfeitosSonorosLabelAncestorAdded

    }//GEN-LAST:event_offEfeitosSonorosLabelAncestorAdded

    private void offMusicaTelaOpcoesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offMusicaTelaOpcoesButtonActionPerformed
        EfeitosSonoros.Play("back.wav");
        Musicas.Stop();
        offMusicaLabel.setVisible(true);
        onMusicaLabel.setVisible(false);
    }//GEN-LAST:event_offMusicaTelaOpcoesButtonActionPerformed

    private void onMusicaTelaOpcoesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onMusicaTelaOpcoesButtonActionPerformed
        EfeitosSonoros.Play("click.wav");
        Musicas.Play("inicio.wav");
        offMusicaLabel.setVisible(false);
        onMusicaLabel.setVisible(true);
    }//GEN-LAST:event_onMusicaTelaOpcoesButtonActionPerformed

    private void offEfeitoSonoroTelaOpcoesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offEfeitoSonoroTelaOpcoesButtonActionPerformed
        EfeitosSonoros.Play("back.wav");
        EfeitosSonoros.setLigado(false);
        offEfeitosSonorosLabel.setVisible(true);
        onEfeitosSonorosLabel.setVisible(false);
    }//GEN-LAST:event_offEfeitoSonoroTelaOpcoesButtonActionPerformed

    private void creditosTelaOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditosTelaOpcoesActionPerformed
        EfeitosSonoros.Play("click.wav");
        telaCreditosPanel.setVisible(true);
        offMusicaTelaOpcoesButton.setEnabled(false);
        onMusicaTelaOpcoesButton.setEnabled(false);
        offEfeitoSonoroTelaOpcoesButton.setEnabled(false);
        onEfeitoSonoroTelaOpcoesButton.setEnabled(false);
        fecharTelaOpcoes.setEnabled(false);
        creditosTelaOpcoes.setVisible(false);
        sobreNosTelaCreditos.setEnabled(true);
    }//GEN-LAST:event_creditosTelaOpcoesActionPerformed

    private void onEfeitoSonoroTelaOpcoesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onEfeitoSonoroTelaOpcoesButtonActionPerformed
        EfeitosSonoros.setLigado(true);
        EfeitosSonoros.Play("click.wav");
        offEfeitosSonorosLabel.setVisible(false);
        onEfeitosSonorosLabel.setVisible(true);
    }//GEN-LAST:event_onEfeitoSonoroTelaOpcoesButtonActionPerformed

    private void fecharTelaOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharTelaOpcoesActionPerformed
        EfeitosSonoros.Play("back.wav");
        flashcardsScrollPane.setVisible(true);
        flashcardsTable.setVisible(true);
        idComboBox.setEnabled(true);
        telaOpcoesPanel.setVisible(false);
        offMusicaTelaOpcoesButton.setEnabled(false);
        onMusicaTelaOpcoesButton.setEnabled(false);
        offEfeitoSonoroTelaOpcoesButton.setEnabled(false);
        onEfeitoSonoroTelaOpcoesButton.setEnabled(false);
        fecharTelaOpcoes.setEnabled(false);
        creditosTelaOpcoes.setEnabled(false);
        opcoesTelaConsultar.setEnabled(true);
        voltarTelaConsultar.setEnabled(true);
        procurarButton.setEnabled(true);
    }//GEN-LAST:event_fecharTelaOpcoesActionPerformed

    private void opcoesTelaConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcoesTelaConsultarActionPerformed
        EfeitosSonoros.Play("click.wav");
        flashcardsScrollPane.setVisible(false);
        flashcardsTable.setVisible(false);
        idComboBox.setEnabled(false);
        telaOpcoesPanel.setVisible(true);
        offMusicaTelaOpcoesButton.setEnabled(true);
        onMusicaTelaOpcoesButton.setEnabled(true);
        offEfeitoSonoroTelaOpcoesButton.setEnabled(true);
        onEfeitoSonoroTelaOpcoesButton.setEnabled(true);
        fecharTelaOpcoes.setEnabled(true);
        creditosTelaOpcoes.setEnabled(true);
        opcoesTelaConsultar.setEnabled(false);
        voltarTelaConsultar.setEnabled(false);
        procurarButton.setEnabled(false);
    }//GEN-LAST:event_opcoesTelaConsultarActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton creditosTelaOpcoes;
    private javax.swing.JButton fecharTelaOpcoes;
    private javax.swing.JScrollPane flashcardsScrollPane;
    private javax.swing.JTable flashcardsTable;
    private javax.swing.JComboBox<String> idComboBox;
    private javax.swing.JButton offEfeitoSonoroTelaOpcoesButton;
    private javax.swing.JLabel offEfeitosSonorosLabel;
    private javax.swing.JLabel offMusicaLabel;
    private javax.swing.JButton offMusicaTelaOpcoesButton;
    private javax.swing.JButton onEfeitoSonoroTelaOpcoesButton;
    private javax.swing.JLabel onEfeitosSonorosLabel;
    private javax.swing.JLabel onMusicaLabel;
    private javax.swing.JButton onMusicaTelaOpcoesButton;
    private javax.swing.JButton opcoesTelaConsultar;
    private javax.swing.JButton procurarButton;
    private javax.swing.JButton sobreNosTelaCreditos;
    private javax.swing.JLabel telaConsultarLabel;
    private javax.swing.JLabel telaCreditosLabelPanel;
    private javax.swing.JPanel telaCreditosPanel;
    private javax.swing.JLabel telaOpcoesLabelPanel;
    private javax.swing.JPanel telaOpcoesPanel;
    private javax.swing.JLabel telaSobreNosLabel;
    private javax.swing.JPanel telaSobreNosPanel;
    private javax.swing.JPanel telaSobreNosPanelTelaConsultar;
    private javax.swing.JButton voltarTelaConsultar;
    private javax.swing.JButton voltarTelaCreditos;
    private javax.swing.JButton voltarTelaSobreNos;
    private javax.swing.JButton voltarTelaSobreNosTelaConsultar;
    // End of variables declaration//GEN-END:variables
}
