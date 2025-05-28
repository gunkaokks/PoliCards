package telas;

import crudFlashcards.Flashcards;
import crudFlashcards.FlashcardsDAO;
import crudMaterias.Materias;
import crudMaterias.MateriasDAO;
import java.awt.Cursor;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class TelaCriarFlashcards extends javax.swing.JFrame {
    private void materiasComboBox() {
        try {
            MateriasDAO dao = new MateriasDAO();
            List<Materias> materias = dao.listarTodasMaterias();
            DefaultComboBoxModel<Materias> modelo = new DefaultComboBoxModel<>();

            for (Materias materia : materias) {
                modelo.addElement(materia);
            }
            materiaComboBox.setModel(modelo);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas técnicos. Tente novamente mais tarde");
            e.printStackTrace();
        }
    }
    
    private int idAluno;
    public TelaCriarFlashcards() {
        super("Policards");
        initComponents();
        materiasComboBox();
        erroPreenchaCamposLabel.setVisible(false);
        this.setLocationRelativeTo(null);
        telaCreditosPanelTelaCriarFlashcards.setVisible(false);
        telaOpcoesPanelTelaCriarFlashcards.setVisible(false);
        telaSobreNosPanelTelaCriarFlashcards.setVisible(false);
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

        telaSobreNosPanelTelaCriarFlashcards = new javax.swing.JPanel();
        voltarTelaSobreNos = new javax.swing.JButton();
        telaSobreNosLabel = new javax.swing.JLabel();
        telaCreditosPanelTelaCriarFlashcards = new javax.swing.JPanel();
        voltarTelaCreditos = new javax.swing.JButton();
        sobreNosTelaCreditos = new javax.swing.JButton();
        telaCreditosLabelPanel = new javax.swing.JLabel();
        telaOpcoesPanelTelaCriarFlashcards = new javax.swing.JPanel();
        offMusicaTelaOpcoesButton = new javax.swing.JButton();
        onMusicaTelaOpcoesButton = new javax.swing.JButton();
        offEfeitoSonoroTelaOpcoesButton = new javax.swing.JButton();
        creditosTelaOpcoes = new javax.swing.JButton();
        onEfeitoSonoroTelaOpcoesButton = new javax.swing.JButton();
        fecharTelaOpcoes = new javax.swing.JButton();
        telaOpcoesLabelPanel = new javax.swing.JLabel();
        erroPreenchaCamposLabel = new javax.swing.JLabel();
        dificuldadeComboBox = new javax.swing.JComboBox<>();
        materiaComboBox = new javax.swing.JComboBox<>();
        respostaTextArea = new javax.swing.JTextArea();
        perguntaTextArea = new javax.swing.JTextArea();
        finalizarTelaCriarFlashcards = new javax.swing.JButton();
        voltarTelaCriarFlashcards = new javax.swing.JButton();
        opcoesTelaCriarFlashcards = new javax.swing.JButton();
        telaCriarFlashcardsLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        telaSobreNosPanelTelaCriarFlashcards.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        voltarTelaSobreNos.setBorder(null);
        voltarTelaSobreNos.setContentAreaFilled(false);
        voltarTelaSobreNos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTelaSobreNosActionPerformed(evt);
            }
        });
        telaSobreNosPanelTelaCriarFlashcards.add(voltarTelaSobreNos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        telaSobreNosLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_SOBRE_NOS.png"))); // NOI18N
        telaSobreNosPanelTelaCriarFlashcards.add(telaSobreNosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(telaSobreNosPanelTelaCriarFlashcards, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        telaCreditosPanelTelaCriarFlashcards.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        voltarTelaCreditos.setBorder(null);
        voltarTelaCreditos.setContentAreaFilled(false);
        voltarTelaCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTelaCreditosActionPerformed(evt);
            }
        });
        telaCreditosPanelTelaCriarFlashcards.add(voltarTelaCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 104, 26));

        sobreNosTelaCreditos.setBorder(null);
        sobreNosTelaCreditos.setContentAreaFilled(false);
        sobreNosTelaCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreNosTelaCreditosActionPerformed(evt);
            }
        });
        telaCreditosPanelTelaCriarFlashcards.add(sobreNosTelaCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 451, 148, 39));

        telaCreditosLabelPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        telaCreditosLabelPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_CREDITOS.png"))); // NOI18N
        telaCreditosPanelTelaCriarFlashcards.add(telaCreditosLabelPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(telaCreditosPanelTelaCriarFlashcards, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        telaOpcoesPanelTelaCriarFlashcards.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        offMusicaTelaOpcoesButton.setBorder(null);
        offMusicaTelaOpcoesButton.setContentAreaFilled(false);
        telaOpcoesPanelTelaCriarFlashcards.add(offMusicaTelaOpcoesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 70, 50));

        onMusicaTelaOpcoesButton.setBorder(null);
        onMusicaTelaOpcoesButton.setContentAreaFilled(false);
        onMusicaTelaOpcoesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onMusicaTelaOpcoesButtonActionPerformed(evt);
            }
        });
        telaOpcoesPanelTelaCriarFlashcards.add(onMusicaTelaOpcoesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 70, 50));

        offEfeitoSonoroTelaOpcoesButton.setBorder(null);
        offEfeitoSonoroTelaOpcoesButton.setContentAreaFilled(false);
        telaOpcoesPanelTelaCriarFlashcards.add(offEfeitoSonoroTelaOpcoesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 70, 40));

        creditosTelaOpcoes.setBorder(null);
        creditosTelaOpcoes.setContentAreaFilled(false);
        creditosTelaOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditosTelaOpcoesActionPerformed(evt);
            }
        });
        telaOpcoesPanelTelaCriarFlashcards.add(creditosTelaOpcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 130, 50));

        onEfeitoSonoroTelaOpcoesButton.setBorder(null);
        onEfeitoSonoroTelaOpcoesButton.setContentAreaFilled(false);
        telaOpcoesPanelTelaCriarFlashcards.add(onEfeitoSonoroTelaOpcoesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 70, 50));

        fecharTelaOpcoes.setBorder(null);
        fecharTelaOpcoes.setContentAreaFilled(false);
        fecharTelaOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharTelaOpcoesActionPerformed(evt);
            }
        });
        telaOpcoesPanelTelaCriarFlashcards.add(fecharTelaOpcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        telaOpcoesLabelPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_OPCOES.png"))); // NOI18N
        telaOpcoesPanelTelaCriarFlashcards.add(telaOpcoesLabelPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(telaOpcoesPanelTelaCriarFlashcards, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        erroPreenchaCamposLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        erroPreenchaCamposLabel.setForeground(new java.awt.Color(255, 29, 51));
        erroPreenchaCamposLabel.setText("Preencha todos os campos!");
        getContentPane().add(erroPreenchaCamposLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 190, -1));

        dificuldadeComboBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        dificuldadeComboBox.setMaximumRowCount(3);
        dificuldadeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fácil", "Médio", "Difícil" }));
        getContentPane().add(dificuldadeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 180, 30));

        materiaComboBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        materiaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materiaComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(materiaComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 220, 30));

        respostaTextArea.setColumns(20);
        respostaTextArea.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        respostaTextArea.setLineWrap(true);
        respostaTextArea.setRows(5);
        respostaTextArea.setWrapStyleWord(true);
        respostaTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        respostaTextArea.setMargin(new java.awt.Insets(5, 5, 5, 5));
        getContentPane().add(respostaTextArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 230, 357, 200));

        perguntaTextArea.setColumns(1);
        perguntaTextArea.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        perguntaTextArea.setLineWrap(true);
        perguntaTextArea.setRows(5);
        perguntaTextArea.setWrapStyleWord(true);
        perguntaTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        perguntaTextArea.setMargin(new java.awt.Insets(5, 5, 5, 5));
        getContentPane().add(perguntaTextArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 230, 357, 200));

        finalizarTelaCriarFlashcards.setBorder(null);
        finalizarTelaCriarFlashcards.setContentAreaFilled(false);
        finalizarTelaCriarFlashcards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarTelaCriarFlashcardsActionPerformed(evt);
            }
        });
        getContentPane().add(finalizarTelaCriarFlashcards, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, 230, 40));

        voltarTelaCriarFlashcards.setBorder(null);
        voltarTelaCriarFlashcards.setContentAreaFilled(false);
        voltarTelaCriarFlashcards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTelaCriarFlashcardsActionPerformed(evt);
            }
        });
        getContentPane().add(voltarTelaCriarFlashcards, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 50));

        opcoesTelaCriarFlashcards.setBorder(null);
        opcoesTelaCriarFlashcards.setContentAreaFilled(false);
        opcoesTelaCriarFlashcards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcoesTelaCriarFlashcardsActionPerformed(evt);
            }
        });
        getContentPane().add(opcoesTelaCriarFlashcards, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 100, 50));

        telaCriarFlashcardsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_CRIAR_FLASHCARDS.png"))); // NOI18N
        getContentPane().add(telaCriarFlashcardsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onMusicaTelaOpcoesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onMusicaTelaOpcoesButtonActionPerformed

    }//GEN-LAST:event_onMusicaTelaOpcoesButtonActionPerformed

    private void fecharTelaOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharTelaOpcoesActionPerformed
        telaOpcoesPanelTelaCriarFlashcards.setVisible(false);
        offMusicaTelaOpcoesButton.setEnabled(false);
        onMusicaTelaOpcoesButton.setEnabled(false);
        offEfeitoSonoroTelaOpcoesButton.setEnabled(false);
        onEfeitoSonoroTelaOpcoesButton.setEnabled(false);
        fecharTelaOpcoes.setEnabled(false);
        creditosTelaOpcoes.setEnabled(false);
        respostaTextArea.setEnabled(true);
        perguntaTextArea.setEnabled(true);
        finalizarTelaCriarFlashcards.setEnabled(true);
        voltarTelaCriarFlashcards.setEnabled(true);
        opcoesTelaCriarFlashcards.setEnabled(true);
        dificuldadeComboBox.setEnabled(true);
        materiaComboBox.setEnabled(true);
    }//GEN-LAST:event_fecharTelaOpcoesActionPerformed

    private void voltarTelaCriarFlashcardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelaCriarFlashcardsActionPerformed
        new TelaManterFlashcards().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarTelaCriarFlashcardsActionPerformed

    private void opcoesTelaCriarFlashcardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcoesTelaCriarFlashcardsActionPerformed
        telaOpcoesPanelTelaCriarFlashcards.setVisible(true);
        respostaTextArea.setEnabled(false);
        perguntaTextArea.setEnabled(false);
        finalizarTelaCriarFlashcards.setEnabled(false);
        voltarTelaCriarFlashcards.setEnabled(false);
        opcoesTelaCriarFlashcards.setEnabled(false);
        sobreNosTelaCreditos.setEnabled(false);
        creditosTelaOpcoes.setEnabled(true);
        fecharTelaOpcoes.setEnabled(true);
        dificuldadeComboBox.setEnabled(false);
        materiaComboBox.setEnabled(false);
    }//GEN-LAST:event_opcoesTelaCriarFlashcardsActionPerformed

    private void creditosTelaOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditosTelaOpcoesActionPerformed
        telaCreditosPanelTelaCriarFlashcards.setVisible(true);
        offMusicaTelaOpcoesButton.setEnabled(false);
        onMusicaTelaOpcoesButton.setEnabled(false);
        offEfeitoSonoroTelaOpcoesButton.setEnabled(false);
        onEfeitoSonoroTelaOpcoesButton.setEnabled(false);
        fecharTelaOpcoes.setEnabled(false);
        creditosTelaOpcoes.setVisible(false);
        respostaTextArea.setEnabled(false);
        perguntaTextArea.setEnabled(false);
        finalizarTelaCriarFlashcards.setEnabled(false);
        voltarTelaCriarFlashcards.setEnabled(false);
        opcoesTelaCriarFlashcards.setEnabled(false);
        sobreNosTelaCreditos.setEnabled(true);
    }//GEN-LAST:event_creditosTelaOpcoesActionPerformed

    private void voltarTelaCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelaCreditosActionPerformed
        telaCreditosPanelTelaCriarFlashcards.setVisible(false);
        offMusicaTelaOpcoesButton.setEnabled(true);
        onMusicaTelaOpcoesButton.setEnabled(true);
        offEfeitoSonoroTelaOpcoesButton.setEnabled(true);
        onEfeitoSonoroTelaOpcoesButton.setEnabled(true);
        fecharTelaOpcoes.setEnabled(true);
        creditosTelaOpcoes.setVisible(true);
        creditosTelaOpcoes.setEnabled(true);
        sobreNosTelaCreditos.setEnabled(false);
    }//GEN-LAST:event_voltarTelaCreditosActionPerformed

    private void voltarTelaSobreNosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelaSobreNosActionPerformed
        telaSobreNosPanelTelaCriarFlashcards.setVisible(false);
        voltarTelaSobreNos.setEnabled(false);
        sobreNosTelaCreditos.setVisible(true);
    }//GEN-LAST:event_voltarTelaSobreNosActionPerformed

    private void sobreNosTelaCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreNosTelaCreditosActionPerformed
        telaSobreNosPanelTelaCriarFlashcards.setVisible(true);
        voltarTelaSobreNos.setEnabled(true);
        sobreNosTelaCreditos.setVisible(false);
    }//GEN-LAST:event_sobreNosTelaCreditosActionPerformed

    private void finalizarTelaCriarFlashcardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarTelaCriarFlashcardsActionPerformed
        Materias materiaSelecionada = (Materias) materiaComboBox.getSelectedItem();
        String pergunta = perguntaTextArea.getText();
        String resposta = respostaTextArea.getText();
        String dificuldade = (String) dificuldadeComboBox.getSelectedItem();
        

        if (materiaSelecionada == null || dificuldade == null || pergunta.isEmpty() || resposta.isEmpty()) {
            erroPreenchaCamposLabel.setVisible(true);
        }
        else {
            finalizarTelaCriarFlashcards.setCursor(new Cursor(Cursor.WAIT_CURSOR));
            try {
                FlashcardsDAO flashcardsDAO = new FlashcardsDAO();
                Flashcards novoFlashcard = new Flashcards(this.idAluno, materiaSelecionada.getId(), pergunta, resposta, dificuldade);
                boolean salvou = flashcardsDAO.criarFlashcards(novoFlashcard);

                if (salvou) {
                    JOptionPane.showMessageDialog(this, "Flashcard criado com sucesso!");
                    perguntaTextArea.setText("");
                    respostaTextArea.setText("");
                    finalizarTelaCriarFlashcards.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                } else {
                    JOptionPane.showMessageDialog(this, "Falha ao criar flashcard. Tente novamente.");
                    finalizarTelaCriarFlashcards.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Problemas técnicos. Tente novamente mais tarde");
                e.printStackTrace();
                finalizarTelaCriarFlashcards.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        }
    }//GEN-LAST:event_finalizarTelaCriarFlashcardsActionPerformed

    private void materiaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materiaComboBoxActionPerformed

    }//GEN-LAST:event_materiaComboBoxActionPerformed
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
            java.util.logging.Logger.getLogger(TelaCriarFlashcards.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCriarFlashcards.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCriarFlashcards.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCriarFlashcards.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCriarFlashcards().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton creditosTelaOpcoes;
    private javax.swing.JComboBox<String> dificuldadeComboBox;
    private javax.swing.JLabel erroPreenchaCamposLabel;
    private javax.swing.JButton fecharTelaOpcoes;
    private javax.swing.JButton finalizarTelaCriarFlashcards;
    private javax.swing.JComboBox<Materias> materiaComboBox;
    private javax.swing.JButton offEfeitoSonoroTelaOpcoesButton;
    private javax.swing.JButton offMusicaTelaOpcoesButton;
    private javax.swing.JButton onEfeitoSonoroTelaOpcoesButton;
    private javax.swing.JButton onMusicaTelaOpcoesButton;
    private javax.swing.JButton opcoesTelaCriarFlashcards;
    private javax.swing.JTextArea perguntaTextArea;
    private javax.swing.JTextArea respostaTextArea;
    private javax.swing.JButton sobreNosTelaCreditos;
    private javax.swing.JLabel telaCreditosLabelPanel;
    private javax.swing.JPanel telaCreditosPanelTelaCriarFlashcards;
    private javax.swing.JLabel telaCriarFlashcardsLabel;
    private javax.swing.JLabel telaOpcoesLabelPanel;
    private javax.swing.JPanel telaOpcoesPanelTelaCriarFlashcards;
    private javax.swing.JLabel telaSobreNosLabel;
    private javax.swing.JPanel telaSobreNosPanelTelaCriarFlashcards;
    private javax.swing.JButton voltarTelaCreditos;
    private javax.swing.JButton voltarTelaCriarFlashcards;
    private javax.swing.JButton voltarTelaSobreNos;
    // End of variables declaration//GEN-END:variables
}
