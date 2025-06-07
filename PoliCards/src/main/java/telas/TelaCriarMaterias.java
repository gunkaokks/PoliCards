package telas;

import crudMaterias.Materias;
import crudMaterias.MateriasDAO;
import crudMaterias.MateriasTableModel;
import java.awt.Cursor;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import sons.EfeitosSonoros;
import sons.Musicas;

public class TelaCriarMaterias extends javax.swing.JFrame {

    private int indexSelecionado = -1;
    private MateriasTableModel tabelaMaterias = new MateriasTableModel();

    public TelaCriarMaterias() {
        super("Policards");
        initComponents();
        materiasTable.setModel((TableModel) tabelaMaterias);
        getMaterias();
        setLocationRelativeTo(null);
        erroPreenchaCamposLabel.setVisible(false);
        telaOpcoesPanel.setVisible(false);
        telaSobreNosPanel.setVisible(false);
        telaCreditosPanel.setVisible(false);
        offMusicaTelaOpcoesButton.setEnabled(false);
        onMusicaTelaOpcoesButton.setEnabled(false);
        offEfeitoSonoroTelaOpcoesButton.setEnabled(false);
        onEfeitoSonoroTelaOpcoesButton.setEnabled(false);
        fecharTelaOpcoes.setEnabled(false);
        creditosTelaOpcoes.setEnabled(false);
        sobreNosTelaCreditos.setEnabled(false);
        voltarTelaSobreNos.setEnabled(false);
        offMusicaLabel.setVisible(false);
        onMusicaLabel.setVisible(false);
        offEfeitosSonorosLabel.setVisible(false);
        onEfeitosSonorosLabel.setVisible(false);
    }

    private void getMaterias() {
        try {
            tabelaMaterias.getDados().clear();

            MateriasDAO dao = new MateriasDAO();
            var materias = dao.listarTodasMaterias();
            dao.close();

            for (var materia : materias) {
                tabelaMaterias.addRow(materia);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar matérias: " + e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaSobreNosPanel = new javax.swing.JPanel();
        voltarTelaSobreNos = new javax.swing.JButton();
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
        materiasScrollPane = new javax.swing.JScrollPane();
        materiasTable = new javax.swing.JTable();
        erroPreenchaCamposLabel = new javax.swing.JLabel();
        voltarTelaCriarMaterias = new javax.swing.JButton();
        opcoesTelaCriarMaterias = new javax.swing.JButton();
        materiaTextField = new javax.swing.JTextField();
        removerButton = new javax.swing.JButton();
        atualizarButton = new javax.swing.JButton();
        salvarButton = new javax.swing.JButton();
        telaCriarMateriasLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        telaSobreNosPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        voltarTelaSobreNos.setBorder(null);
        voltarTelaSobreNos.setContentAreaFilled(false);
        voltarTelaSobreNos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTelaSobreNosActionPerformed(evt);
            }
        });
        telaSobreNosPanel.add(voltarTelaSobreNos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        telaSobreNosLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_SOBRE_NOS.png"))); // NOI18N
        telaSobreNosPanel.add(telaSobreNosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(telaSobreNosPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

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

        materiasTable.setModel(new javax.swing.table.DefaultTableModel(
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
        materiasTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                materiasTableMouseClicked(evt);
            }
        });
        materiasScrollPane.setViewportView(materiasTable);

        getContentPane().add(materiasScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 690, 190));

        erroPreenchaCamposLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        erroPreenchaCamposLabel.setForeground(new java.awt.Color(255, 29, 51));
        erroPreenchaCamposLabel.setText("Preencha o campo!");
        getContentPane().add(erroPreenchaCamposLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 170, -1));

        voltarTelaCriarMaterias.setToolTipText("");
        voltarTelaCriarMaterias.setBorder(null);
        voltarTelaCriarMaterias.setContentAreaFilled(false);
        voltarTelaCriarMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTelaCriarMateriasActionPerformed(evt);
            }
        });
        getContentPane().add(voltarTelaCriarMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 40));

        opcoesTelaCriarMaterias.setToolTipText("");
        opcoesTelaCriarMaterias.setBorder(null);
        opcoesTelaCriarMaterias.setContentAreaFilled(false);
        opcoesTelaCriarMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcoesTelaCriarMateriasActionPerformed(evt);
            }
        });
        getContentPane().add(opcoesTelaCriarMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 110, 40));

        materiaTextField.setBackground(new java.awt.Color(193, 193, 193));
        materiaTextField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        materiaTextField.setBorder(null);
        getContentPane().add(materiaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 174, 510, 30));

        removerButton.setBorder(null);
        removerButton.setContentAreaFilled(false);
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(removerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, 120, 50));

        atualizarButton.setBorder(null);
        atualizarButton.setContentAreaFilled(false);
        atualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(atualizarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 120, 50));

        salvarButton.setBorder(null);
        salvarButton.setContentAreaFilled(false);
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(salvarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 120, 50));

        telaCriarMateriasLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_CRIAR_MATERIAS.png"))); // NOI18N
        getContentPane().add(telaCriarMateriasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        String materia = materiaTextField.getText().trim();
        
        if (materia.isEmpty()) {
            erroPreenchaCamposLabel.setVisible(true);
        } else {
            erroPreenchaCamposLabel.setVisible(false);
            salvarButton.setCursor(new Cursor(Cursor.WAIT_CURSOR));
            try {
                salvarButton.setCursor(new Cursor(Cursor.WAIT_CURSOR));
                MateriasDAO dao = new MateriasDAO();
                int salvou = dao.salvarMateria(materia);
                if (salvou != -1) {
                    JOptionPane.showMessageDialog(this, "Matéria criada com sucesso!");
                    materiaTextField.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Falha ao criar matéria");
                    salvarButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                }
                dao.close();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Erro ao conectar com o banco de dados.");
                e.printStackTrace();
            }
            salvarButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_salvarButtonActionPerformed

    private void materiasTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materiasTableMouseClicked
        indexSelecionado = materiasTable.getSelectedRow();
        if (indexSelecionado != -1) {
            Materias materiaSelecionada = tabelaMaterias.getMateria(indexSelecionado);
            materiaTextField.setText(materiaSelecionada.getMateria());
        }
    }//GEN-LAST:event_materiasTableMouseClicked

    private void atualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarButtonActionPerformed
        String materia = materiaTextField.getText().trim();
        
        if (materia.isEmpty()) {
            erroPreenchaCamposLabel.setVisible(true);
        } else {
            erroPreenchaCamposLabel.setVisible(false);
            atualizarButton.setCursor(new Cursor(Cursor.WAIT_CURSOR));
            try {
                Materias materiaSelecionada = tabelaMaterias.getMateria(indexSelecionado);
                materiaSelecionada.setMateria(materia);

                MateriasDAO dao = new MateriasDAO();
                boolean atualizado = dao.atualizarMateria(materiaSelecionada);
                dao.close();

                if (atualizado) {
                    tabelaMaterias.fireTableRowsUpdated(indexSelecionado, indexSelecionado);
                    JOptionPane.showMessageDialog(this, "Matéria atualizada com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(this, "Falha ao atualizar matéria.");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Erro ao conectar com o banco de dados.");
                e.printStackTrace();
            }
            atualizarButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_atualizarButtonActionPerformed

    private void removerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerButtonActionPerformed
        String materia = materiaTextField.getText().trim();

        if (materia.isEmpty()) {
            erroPreenchaCamposLabel.setVisible(true);
        } else {
            erroPreenchaCamposLabel.setVisible(false);
            removerButton.setCursor(new Cursor(Cursor.WAIT_CURSOR));
            try {
                Materias materiaSelecionada = tabelaMaterias.getMateria(indexSelecionado);
                MateriasDAO dao = new MateriasDAO();
                boolean removido = dao.deletarMateria(materiaSelecionada.getId_materia());
                dao.close();

                if (removido) {
                    tabelaMaterias.getDados().remove(indexSelecionado);
                    tabelaMaterias.fireTableRowsDeleted(indexSelecionado, indexSelecionado);
                    materiaTextField.setText("");
                    indexSelecionado = -1;
                    JOptionPane.showMessageDialog(this, "Matéria removida com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(this, "Falha ao remover matéria.");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Erro ao conectar com o banco de dados.");
                e.printStackTrace();
            }
            removerButton.setCursor(new Cursor(Cursor.WAIT_CURSOR));
        }
    }//GEN-LAST:event_removerButtonActionPerformed

    private void opcoesTelaCriarMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcoesTelaCriarMateriasActionPerformed
        telaOpcoesPanel.setVisible(true);
        offMusicaTelaOpcoesButton.setEnabled(true);
        onMusicaTelaOpcoesButton.setEnabled(true);
        offEfeitoSonoroTelaOpcoesButton.setEnabled(true);
        onEfeitoSonoroTelaOpcoesButton.setEnabled(true);
        fecharTelaOpcoes.setEnabled(true);
        creditosTelaOpcoes.setEnabled(true);
        opcoesTelaCriarMaterias.setEnabled(false);
        voltarTelaCriarMaterias.setEnabled(false);
        materiaTextField.setEnabled(false);
        salvarButton.setEnabled(false);
        atualizarButton.setEnabled(false);
        removerButton.setEnabled(false);
        materiasScrollPane.setEnabled(false);
        materiasTable.setEnabled(false);
        materiasScrollPane.setVisible(false);
        materiasTable.setVisible(false);
    }//GEN-LAST:event_opcoesTelaCriarMateriasActionPerformed

    private void voltarTelaSobreNosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelaSobreNosActionPerformed
        EfeitosSonoros.Play("back.wav");
        telaSobreNosPanel.setVisible(false);
        voltarTelaSobreNos.setEnabled(false);
        sobreNosTelaCreditos.setVisible(true);
    }//GEN-LAST:event_voltarTelaSobreNosActionPerformed

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
        telaSobreNosPanel.setVisible(true);
        voltarTelaSobreNos.setEnabled(true);
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
        opcoesTelaCriarMaterias.setEnabled(false);
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
        telaOpcoesPanel.setVisible(false);
        offMusicaTelaOpcoesButton.setEnabled(false);
        onMusicaTelaOpcoesButton.setEnabled(false);
        offEfeitoSonoroTelaOpcoesButton.setEnabled(false);
        onEfeitoSonoroTelaOpcoesButton.setEnabled(false);
        fecharTelaOpcoes.setEnabled(false);
        creditosTelaOpcoes.setEnabled(false);
        opcoesTelaCriarMaterias.setEnabled(true);
        voltarTelaCriarMaterias.setEnabled(true);
        materiaTextField.setEnabled(true);
        salvarButton.setEnabled(true);
        atualizarButton.setEnabled(true);
        removerButton.setEnabled(true);
        materiasScrollPane.setEnabled(true);
        materiasTable.setEnabled(true);
        materiasScrollPane.setVisible(true);
        materiasTable.setVisible(true);
    }//GEN-LAST:event_fecharTelaOpcoesActionPerformed

    private void voltarTelaCriarMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelaCriarMateriasActionPerformed
        new TelaManterFlashcards().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarTelaCriarMateriasActionPerformed
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
            java.util.logging.Logger.getLogger(TelaCriarMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCriarMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCriarMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCriarMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCriarMaterias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarButton;
    private javax.swing.JButton creditosTelaOpcoes;
    private javax.swing.JLabel erroPreenchaCamposLabel;
    private javax.swing.JButton fecharTelaOpcoes;
    private javax.swing.JTextField materiaTextField;
    private javax.swing.JScrollPane materiasScrollPane;
    private javax.swing.JTable materiasTable;
    private javax.swing.JButton offEfeitoSonoroTelaOpcoesButton;
    private javax.swing.JLabel offEfeitosSonorosLabel;
    private javax.swing.JLabel offMusicaLabel;
    private javax.swing.JButton offMusicaTelaOpcoesButton;
    private javax.swing.JButton onEfeitoSonoroTelaOpcoesButton;
    private javax.swing.JLabel onEfeitosSonorosLabel;
    private javax.swing.JLabel onMusicaLabel;
    private javax.swing.JButton onMusicaTelaOpcoesButton;
    private javax.swing.JButton opcoesTelaCriarMaterias;
    private javax.swing.JButton removerButton;
    private javax.swing.JButton salvarButton;
    private javax.swing.JButton sobreNosTelaCreditos;
    private javax.swing.JLabel telaCreditosLabelPanel;
    private javax.swing.JPanel telaCreditosPanel;
    private javax.swing.JLabel telaCriarMateriasLabel;
    private javax.swing.JLabel telaOpcoesLabelPanel;
    private javax.swing.JPanel telaOpcoesPanel;
    private javax.swing.JLabel telaSobreNosLabel;
    private javax.swing.JPanel telaSobreNosPanel;
    private javax.swing.JButton voltarTelaCreditos;
    private javax.swing.JButton voltarTelaCriarMaterias;
    private javax.swing.JButton voltarTelaSobreNos;
    // End of variables declaration//GEN-END:variables
}
