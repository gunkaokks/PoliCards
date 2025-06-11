package crudFlashcards;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import persistencia.ConnectionFactory;
import persistencia.Sessao;
import sons.EfeitosSonoros;
import sons.Musicas;
import telas.TelaManterFlashcards;

public class TelaRemover extends javax.swing.JFrame {
    private int idAlunoLogado;

    public TelaRemover() {
        super ("Policards");
        initComponents();
        this.setLocationRelativeTo(null);
        this.idAlunoLogado = Sessao.getIdAluno();
        idComboBox.removeAllItems();
        getId();
        getMaterias();
        dificuldadeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Fácil", "Médio", "Difícil"}));
        telaOpcoesPanel.setVisible(false);
        telaSobreNosPanelTelaRemover.setVisible(false);
        telaCreditosPanel.setVisible(false);
        offMusicaTelaOpcoesButton.setEnabled(false);
        onMusicaTelaOpcoesButton.setEnabled(false);
        offEfeitoSonoroTelaOpcoesButton.setEnabled(false);
        onEfeitoSonoroTelaOpcoesButton.setEnabled(false);
        fecharTelaOpcoes.setEnabled(false);
        creditosTelaOpcoes.setEnabled(false);
        sobreNosTelaCreditos.setEnabled(false);
        voltarTelaSobreNosTelaRemover.setEnabled(false);
        offMusicaLabel.setVisible(false);
        onMusicaLabel.setVisible(false);
        offEfeitosSonorosLabel.setVisible(false);
        onEfeitosSonorosLabel.setVisible(false);
    }

    private void getId() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Obter conexão com o banco de dados
            connection = ConnectionFactory.getConnection();

            // Criar um PreparedStatement para executar a consulta SQL
            String query = "SELECT id_flashcard FROM flashcards  WHERE id_aluno = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, idAlunoLogado);

            // Executar a consulta SQL
            resultSet = preparedStatement.executeQuery();

            // Percorrer os resultados e adicionar ao JComboBox
            while (resultSet.next()) {
                int id_flashcard = resultSet.getInt("id_flashcard");
                idComboBox.addItem(String.valueOf(id_flashcard));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Fechar recursos
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void getDados(int idQuestoes) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = ConnectionFactory.getConnection();

            String query = "SELECT f.pergunta, f.resposta, f.dificuldade, m.materia FROM flashcards f JOIN materias m ON f.id_materia = m.id_materia WHERE f.id_flashcard = ? AND f.id_aluno = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, idQuestoes);
            preparedStatement.setInt(2, idAlunoLogado);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                perguntaTextField.setText(resultSet.getString("pergunta"));
                respostaTextField.setText(resultSet.getString("resposta"));
                String nomeMateria = resultSet.getString("materia");
                materiaComboBox.setSelectedItem(nomeMateria);
                dificuldadeComboBox.setSelectedItem(resultSet.getString("dificuldade"));
            } else {
                JOptionPane.showMessageDialog(this, "Flashcard não encontrado.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void getMaterias() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = ConnectionFactory.getConnection();

            String query = "SELECT DISTINCT materia FROM materias WHERE id_aluno = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, idAlunoLogado);
            resultSet = preparedStatement.executeQuery();

            materiaComboBox.removeAllItems();
            while (resultSet.next()) {
                materiaComboBox.addItem(resultSet.getString("materia"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar matérias: " + e.getMessage());
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaSobreNosPanelTelaRemover = new javax.swing.JPanel();
        voltarTelaSobreNosTelaRemover = new javax.swing.JButton();
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
        opcoesTelaRemover = new javax.swing.JButton();
        voltarTelaRemover = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();
        dificuldadeComboBox = new javax.swing.JComboBox<>();
        materiaComboBox = new javax.swing.JComboBox<>();
        respostaTextField = new javax.swing.JTextField();
        perguntaTextField = new javax.swing.JTextField();
        procurarButton = new javax.swing.JButton();
        idComboBox = new javax.swing.JComboBox<>();
        removerLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        telaSobreNosPanelTelaRemover.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        voltarTelaSobreNosTelaRemover.setBorder(null);
        voltarTelaSobreNosTelaRemover.setContentAreaFilled(false);
        voltarTelaSobreNosTelaRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTelaSobreNosTelaRemoverActionPerformed(evt);
            }
        });
        telaSobreNosPanelTelaRemover.add(voltarTelaSobreNosTelaRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        telaSobreNosLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_SOBRE_NOS.png"))); // NOI18N
        telaSobreNosPanelTelaRemover.add(telaSobreNosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(telaSobreNosPanelTelaRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

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

        opcoesTelaRemover.setBorder(null);
        opcoesTelaRemover.setContentAreaFilled(false);
        opcoesTelaRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcoesTelaRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(opcoesTelaRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 90, 30));

        voltarTelaRemover.setBorder(null);
        voltarTelaRemover.setContentAreaFilled(false);
        voltarTelaRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTelaRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(voltarTelaRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 20));

        removerButton.setBorder(null);
        removerButton.setContentAreaFilled(false);
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(removerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, 150, 30));

        dificuldadeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        dificuldadeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dificuldadeComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(dificuldadeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 120, 30));

        materiaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(materiaComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 210, 30));

        respostaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respostaTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(respostaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 295, 470, 30));

        perguntaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perguntaTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(perguntaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 219, 470, 30));

        procurarButton.setBorder(null);
        procurarButton.setContentAreaFilled(false);
        procurarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procurarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(procurarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 90, 30));

        idComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(idComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 150, 80, 30));

        removerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_REMOVER_FLASHCARD.png"))); // NOI18N
        getContentPane().add(removerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void perguntaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perguntaTextFieldActionPerformed
        EfeitosSonoros.Play("button.wav");
    }//GEN-LAST:event_perguntaTextFieldActionPerformed

    private void removerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerButtonActionPerformed
        EfeitosSonoros.Play("click.wav");
        boolean validacao = true;
        String sel = (String) idComboBox.getSelectedItem();
        if (sel == null) {
            JOptionPane.showMessageDialog(this, "Nenhum ID selecionado.", "Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int id = Integer.parseInt(sel);
        try {
            Flashcards f = new Flashcards(id);
            validacao = false;
            
            FlashcardService.remover(f);
            
            JOptionPane.showMessageDialog(this, "O flashcard foi removido com sucesso!", "Flashcard Removido", JOptionPane.INFORMATION_MESSAGE);
            this.limparcampos();
        }
        catch (Exception e)
        {
            String title = validacao ? "Validação" : "Erro";
            int pane = validacao ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.ERROR_MESSAGE;

            JOptionPane.showMessageDialog(this, e.getMessage(), title, pane);
        }
    }//GEN-LAST:event_removerButtonActionPerformed

    private void dificuldadeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dificuldadeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dificuldadeComboBoxActionPerformed

    private void procurarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procurarButtonActionPerformed
        EfeitosSonoros.Play("click.wav");
        String sel = (String) idComboBox.getSelectedItem();
        if (sel != null) {
            int selectedId = Integer.parseInt(sel);
            getDados(selectedId);
        }
    }//GEN-LAST:event_procurarButtonActionPerformed

    private void voltarTelaRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelaRemoverActionPerformed
        EfeitosSonoros.Play("back.wav");
        new TelaManterFlashcards().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarTelaRemoverActionPerformed

    private void respostaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respostaTextFieldActionPerformed
        EfeitosSonoros.Play("button.wav");
    }//GEN-LAST:event_respostaTextFieldActionPerformed

    private void voltarTelaSobreNosTelaRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelaSobreNosTelaRemoverActionPerformed
        EfeitosSonoros.Play("back.wav");
        telaSobreNosPanelTelaRemover.setVisible(false);
        telaSobreNosPanelTelaRemover.setEnabled(false);
        sobreNosTelaCreditos.setVisible(true);
    }//GEN-LAST:event_voltarTelaSobreNosTelaRemoverActionPerformed

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
        telaSobreNosPanelTelaRemover.setVisible(true);
        voltarTelaSobreNosTelaRemover.setEnabled(true);
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
        dificuldadeComboBox.setEnabled(true);
        materiaComboBox.setEnabled(true);
        respostaTextField.setEnabled(true);
        perguntaTextField.setEnabled(true);
        removerButton.setEnabled(true);
        idComboBox.setEnabled(true);
        telaOpcoesPanel.setVisible(false);
        offMusicaTelaOpcoesButton.setEnabled(false);
        onMusicaTelaOpcoesButton.setEnabled(false);
        offEfeitoSonoroTelaOpcoesButton.setEnabled(false);
        onEfeitoSonoroTelaOpcoesButton.setEnabled(false);
        fecharTelaOpcoes.setEnabled(false);
        creditosTelaOpcoes.setEnabled(false);
        opcoesTelaRemover.setEnabled(true);
        voltarTelaRemover.setEnabled(true);
        procurarButton.setEnabled(true);
    }//GEN-LAST:event_fecharTelaOpcoesActionPerformed

    private void opcoesTelaRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcoesTelaRemoverActionPerformed
        dificuldadeComboBox.setEnabled(false);
        materiaComboBox.setEnabled(false);
        respostaTextField.setEnabled(false);
        perguntaTextField.setEnabled(false);
        removerButton.setEnabled(false);
        idComboBox.setEnabled(false);
        telaOpcoesPanel.setVisible(true);
        offMusicaTelaOpcoesButton.setEnabled(true);
        onMusicaTelaOpcoesButton.setEnabled(true);
        offEfeitoSonoroTelaOpcoesButton.setEnabled(true);
        onEfeitoSonoroTelaOpcoesButton.setEnabled(true);
        fecharTelaOpcoes.setEnabled(true);
        creditosTelaOpcoes.setEnabled(true);
        opcoesTelaRemover.setEnabled(false);
        voltarTelaRemover.setEnabled(false);
        procurarButton.setEnabled(false);
    }//GEN-LAST:event_opcoesTelaRemoverActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRemover().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton creditosTelaOpcoes;
    private javax.swing.JComboBox<String> dificuldadeComboBox;
    private javax.swing.JButton fecharTelaOpcoes;
    private javax.swing.JComboBox<String> idComboBox;
    private javax.swing.JComboBox<String> materiaComboBox;
    private javax.swing.JButton offEfeitoSonoroTelaOpcoesButton;
    private javax.swing.JLabel offEfeitosSonorosLabel;
    private javax.swing.JLabel offMusicaLabel;
    private javax.swing.JButton offMusicaTelaOpcoesButton;
    private javax.swing.JButton onEfeitoSonoroTelaOpcoesButton;
    private javax.swing.JLabel onEfeitosSonorosLabel;
    private javax.swing.JLabel onMusicaLabel;
    private javax.swing.JButton onMusicaTelaOpcoesButton;
    private javax.swing.JButton opcoesTelaRemover;
    private javax.swing.JTextField perguntaTextField;
    private javax.swing.JButton procurarButton;
    private javax.swing.JButton removerButton;
    private javax.swing.JLabel removerLabel;
    private javax.swing.JTextField respostaTextField;
    private javax.swing.JButton sobreNosTelaCreditos;
    private javax.swing.JLabel telaCreditosLabelPanel;
    private javax.swing.JPanel telaCreditosPanel;
    private javax.swing.JLabel telaOpcoesLabelPanel;
    private javax.swing.JPanel telaOpcoesPanel;
    private javax.swing.JLabel telaSobreNosLabel;
    private javax.swing.JPanel telaSobreNosPanelTelaRemover;
    private javax.swing.JButton voltarTelaCreditos;
    private javax.swing.JButton voltarTelaRemover;
    private javax.swing.JButton voltarTelaSobreNosTelaRemover;
    // End of variables declaration//GEN-END:variables
    public void limparcampos() {
        perguntaTextField.setText("");
        respostaTextField.setText("");
        idComboBox.setSelectedIndex(0);
        materiaComboBox.setSelectedIndex(0);
        dificuldadeComboBox.setSelectedIndex(0);
    }
}
