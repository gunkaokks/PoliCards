package telas;

import crudFlashcards.FlashcardResposta;
import crudFlashcards.FlashcardService;
import crudFlashcards.Flashcards;
import crudFlashcards.FlashcardsDAO;
import crudMaterias.MateriasDAO;
import java.awt.Cursor;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import persistencia.Sessao;
import sons.EfeitosSonoros;
import sons.Musicas;

public class TelaJogoClassico extends javax.swing.JFrame {
    
    
    public TelaJogoClassico() {
        super("Policards");
        initComponents();
        this.setLocationRelativeTo(null);   
        this.idAlunoLogado = Sessao.getIdAluno();
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
        offMusicaLabel.setVisible(false);
        onMusicaLabel.setVisible(false);
        offEfeitosSonorosLabel.setVisible(false);
        onEfeitosSonorosLabel.setVisible(false);
        telaRespostasPanel.setVisible(false);
        proximoFlashcardButton.setEnabled(false);
        erradoLabel.setVisible(false);
        corretoLabel.setVisible(false);
        proximoFlashcardLabel.setVisible(false);
        erradoButton.setEnabled(false);
        corretoButton.setEnabled(false);
    }
    
    private List<FlashcardResposta> flashcards;
    private int flashcardAtual = -1;
    private String dificuldadeSelecionada;
    private int idMateriaSelecionada;
    private int idAlunoLogado;
    
    public void setParametrosJogo(String materia, String dificuldade, int idMateria) {
        this.dificuldadeSelecionada = dificuldade;
        this.idMateriaSelecionada = idMateria;
        carregarFlashcards();
        mostrarProximoFlashcard();
    }

    private void carregarFlashcards() {
        try {
            Integer materiaId = (idMateriaSelecionada == -1) ? null : idMateriaSelecionada;
            String dificuldade = (dificuldadeSelecionada.equalsIgnoreCase("aleatório")) ? null : dificuldadeSelecionada;

            FlashcardsDAO dao = new FlashcardsDAO();
            List<Flashcards> flashcardsSimples = dao.listarFlashcardsFiltrados(materiaId, dificuldade);

            flashcards = new ArrayList<>();
            for (Flashcards f : flashcardsSimples) {
                String nomeMateria = obterNomeMateria(f.getId_materia());

                FlashcardResposta fr = new FlashcardResposta(
                        f.getId_flashcard(),
                        f.getPergunta(),
                        f.getResposta(),
                        f.getDificuldade(),
                        null,
                        f.getId_materia(),
                        nomeMateria
                );
                flashcards.add(fr);
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Não ha mais Flashcards com esses critérios disponíveis!");
            ex.printStackTrace();
        }
    }

    private String obterNomeMateria(int idMateria) throws SQLException {
        MateriasDAO dao = new MateriasDAO();
        return dao.getNomeMateria(idMateria);
    }
    
    private void registrarTentativa(boolean acertou) {
        if (flashcardAtual >= 0 && flashcardAtual < flashcards.size()) {
            FlashcardResposta atual = flashcards.get(flashcardAtual);
            try {
                FlashcardService.registrarTentativa(idAlunoLogado, atual.getId_flashcard(), acertou);

                atual.setAcertou(acertou);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao registrar tentativa");
                e.printStackTrace();
            }
        }
    }

    private void mostrarProximoFlashcard() {
        if (flashcards.isEmpty() || flashcardAtual >= flashcards.size() - 1) {
            JOptionPane.showMessageDialog(this, "Você completou todos os flashcards disponíveis!");
            new TelaClassico().setVisible(true);
            this.dispose();
        };
        
        flashcardAtual++;
        FlashcardResposta atual = flashcards.get(flashcardAtual);

        perguntaLabel.setText("<html>" + atual.getPergunta() + "</html>");
        respostaLabel.setText("<html>" + atual.getResposta() + "</html>");
        materiaLabel.setText(atual.getNomeMateria());
        dificuldadeLabel.setText(atual.getDificuldade());
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
        dificuldadeLabel = new javax.swing.JLabel();
        materiaLabel = new javax.swing.JLabel();
        telaRespostasPanel = new javax.swing.JPanel();
        respostaLabel = new javax.swing.JLabel();
        proximoFlashcardButton = new javax.swing.JButton();
        corretoButton = new javax.swing.JButton();
        erradoButton = new javax.swing.JButton();
        erradoLabel = new javax.swing.JLabel();
        corretoLabel = new javax.swing.JLabel();
        proximoFlashcardLabel = new javax.swing.JLabel();
        telaRespostasLabel = new javax.swing.JLabel();
        verRespostaButton = new javax.swing.JButton();
        voltarTelaJogoClassico = new javax.swing.JButton();
        opcoesTelaJogoClassico = new javax.swing.JButton();
        perguntaLabel = new javax.swing.JLabel();
        telaJogoClassicoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
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

        dificuldadeLabel.setFont(new java.awt.Font("Jersey 15", 0, 24)); // NOI18N
        getContentPane().add(dificuldadeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 190, 30));

        materiaLabel.setFont(new java.awt.Font("Jersey 15", 0, 24)); // NOI18N
        getContentPane().add(materiaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 220, 30));

        telaRespostasPanel.setOpaque(false);
        telaRespostasPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        respostaLabel.setFont(new java.awt.Font("Jersey 15", 0, 36)); // NOI18N
        respostaLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        respostaLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        respostaLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        telaRespostasPanel.add(respostaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 88, 630, 260));

        proximoFlashcardButton.setBorder(null);
        proximoFlashcardButton.setContentAreaFilled(false);
        proximoFlashcardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximoFlashcardButtonActionPerformed(evt);
            }
        });
        telaRespostasPanel.add(proximoFlashcardButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 240, 50));

        corretoButton.setBorder(null);
        corretoButton.setContentAreaFilled(false);
        corretoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corretoButtonActionPerformed(evt);
            }
        });
        telaRespostasPanel.add(corretoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 100, 70));

        erradoButton.setBorder(null);
        erradoButton.setContentAreaFilled(false);
        erradoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                erradoButtonActionPerformed(evt);
            }
        });
        telaRespostasPanel.add(erradoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 100, 70));

        erradoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ERRADO.png"))); // NOI18N
        telaRespostasPanel.add(erradoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 356, 100, -1));

        corretoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CORRETO.png"))); // NOI18N
        telaRespostasPanel.add(corretoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 366, 100, 70));

        proximoFlashcardLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PROXIMO_FLASHCARD.png"))); // NOI18N
        telaRespostasPanel.add(proximoFlashcardLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 373, 250, 50));

        telaRespostasLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_JOGO_CLASSICO_RESPOSTA.png"))); // NOI18N
        telaRespostasLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        telaRespostasPanel.add(telaRespostasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(telaRespostasPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 72, 780, 440));

        verRespostaButton.setBorder(null);
        verRespostaButton.setContentAreaFilled(false);
        verRespostaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verRespostaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(verRespostaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 180, 40));

        voltarTelaJogoClassico.setBorder(null);
        voltarTelaJogoClassico.setContentAreaFilled(false);
        voltarTelaJogoClassico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTelaJogoClassicoActionPerformed(evt);
            }
        });
        getContentPane().add(voltarTelaJogoClassico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 50));

        opcoesTelaJogoClassico.setBorder(null);
        opcoesTelaJogoClassico.setContentAreaFilled(false);
        opcoesTelaJogoClassico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcoesTelaJogoClassicoActionPerformed(evt);
            }
        });
        getContentPane().add(opcoesTelaJogoClassico, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 120, 50));

        perguntaLabel.setFont(new java.awt.Font("Jersey 15", 0, 36)); // NOI18N
        perguntaLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        perguntaLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        perguntaLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(perguntaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 630, 260));

        telaJogoClassicoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_JOGO_CLASSICO.png"))); // NOI18N
        getContentPane().add(telaJogoClassicoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcoesTelaJogoClassicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcoesTelaJogoClassicoActionPerformed
        EfeitosSonoros.Play("click.wav");
        telaOpcoesPanel.setVisible(true);
        offMusicaTelaOpcoesButton.setEnabled(true);
        onMusicaTelaOpcoesButton.setEnabled(true);
        offEfeitoSonoroTelaOpcoesButton.setEnabled(true);
        onEfeitoSonoroTelaOpcoesButton.setEnabled(true);
        fecharTelaOpcoes.setEnabled(true);
        creditosTelaOpcoes.setEnabled(true);
        opcoesTelaJogoClassico.setEnabled(false);
        voltarTelaJogoClassico.setEnabled(false);
        verRespostaButton.setEnabled(false);
    }//GEN-LAST:event_opcoesTelaJogoClassicoActionPerformed

    private void voltarTelaJogoClassicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelaJogoClassicoActionPerformed
        EfeitosSonoros.Play("back.wav");
        voltarTelaJogoClassico.setCursor(new Cursor(Cursor.WAIT_CURSOR));
        new TelaClassico().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarTelaJogoClassicoActionPerformed

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
        opcoesTelaJogoClassico.setEnabled(true);
        voltarTelaJogoClassico.setEnabled(true);
        verRespostaButton.setEnabled(true);
    }//GEN-LAST:event_fecharTelaOpcoesActionPerformed

    private void verRespostaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verRespostaButtonActionPerformed
        EfeitosSonoros.Play("click.wav");
        telaRespostasPanel.setVisible(true);
        proximoFlashcardButton.setEnabled(true);
        verRespostaButton.setEnabled(false);
        erradoButton.setEnabled(true);
        corretoButton.setEnabled(true);
    }//GEN-LAST:event_verRespostaButtonActionPerformed

    private void erradoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_erradoButtonActionPerformed
        EfeitosSonoros.Play("click.wav");
        registrarTentativa(false);
        erradoLabel.setVisible(true);
        proximoFlashcardLabel.setVisible(true);
        proximoFlashcardLabel.setEnabled(true);
        erradoButton.setEnabled(false);
        corretoButton.setEnabled(false);
    }//GEN-LAST:event_erradoButtonActionPerformed

    private void corretoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corretoButtonActionPerformed
        EfeitosSonoros.Play("click.wav");
        registrarTentativa(true);
        corretoLabel.setVisible(true);
        proximoFlashcardLabel.setVisible(true);
        proximoFlashcardLabel.setEnabled(true);
        erradoButton.setEnabled(false);
        corretoButton.setEnabled(false);
    }//GEN-LAST:event_corretoButtonActionPerformed

    private void proximoFlashcardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoFlashcardButtonActionPerformed
        EfeitosSonoros.Play("click.wav");
        mostrarProximoFlashcard();
        telaRespostasPanel.setVisible(false);
        corretoLabel.setVisible(false);
        erradoLabel.setVisible(false);
        erradoButton.setEnabled(false);
        corretoButton.setEnabled(false);
        proximoFlashcardLabel.setVisible(false);
        proximoFlashcardLabel.setEnabled(false);
        verRespostaButton.setEnabled(true);
        
    }//GEN-LAST:event_proximoFlashcardButtonActionPerformed
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
            java.util.logging.Logger.getLogger(TelaJogoClassico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogoClassico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogoClassico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogoClassico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaJogoClassico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton corretoButton;
    private javax.swing.JLabel corretoLabel;
    private javax.swing.JButton creditosTelaOpcoes;
    private javax.swing.JLabel dificuldadeLabel;
    private javax.swing.JButton erradoButton;
    private javax.swing.JLabel erradoLabel;
    private javax.swing.JButton fecharTelaOpcoes;
    private javax.swing.JLabel materiaLabel;
    private javax.swing.JButton offEfeitoSonoroTelaOpcoesButton;
    private javax.swing.JLabel offEfeitosSonorosLabel;
    private javax.swing.JLabel offMusicaLabel;
    private javax.swing.JButton offMusicaTelaOpcoesButton;
    private javax.swing.JButton onEfeitoSonoroTelaOpcoesButton;
    private javax.swing.JLabel onEfeitosSonorosLabel;
    private javax.swing.JLabel onMusicaLabel;
    private javax.swing.JButton onMusicaTelaOpcoesButton;
    private javax.swing.JButton opcoesTelaJogoClassico;
    private javax.swing.JLabel perguntaLabel;
    private javax.swing.JButton proximoFlashcardButton;
    private javax.swing.JLabel proximoFlashcardLabel;
    private javax.swing.JLabel respostaLabel;
    private javax.swing.JButton sobreNosTelaCreditos;
    private javax.swing.JLabel telaCreditosLabelPanel;
    private javax.swing.JPanel telaCreditosPanel;
    private javax.swing.JLabel telaJogoClassicoLabel;
    private javax.swing.JLabel telaOpcoesLabelPanel;
    private javax.swing.JPanel telaOpcoesPanel;
    private javax.swing.JLabel telaRespostasLabel;
    private javax.swing.JPanel telaRespostasPanel;
    private javax.swing.JLabel telaSobreNosLabel;
    private javax.swing.JPanel telaSobreNosPanel;
    private javax.swing.JButton verRespostaButton;
    private javax.swing.JButton voltarTelaCreditos;
    private javax.swing.JButton voltarTelaJogoClassico;
    private javax.swing.JButton voltarTelaSobreNos;
    // End of variables declaration//GEN-END:variables
}
