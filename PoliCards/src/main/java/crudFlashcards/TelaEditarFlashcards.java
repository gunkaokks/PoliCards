package crudFlashcards;

import java.awt.Cursor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import persistencia.ConnectionFactory;


public class TelaEditarFlashcards extends javax.swing.JFrame {
    private int indexSelecionado = -1;
    private FlashcardTableModel tabelaFlashcard = new FlashcardTableModel();
    private int idAlunoLogado;

    public TelaEditarFlashcards(int idAluno) {
        this.idAlunoLogado = idAluno;
        initComponents();
        preencherComboBoxes();
        carregarMaterias();
        getFlashcards();
        flashcardTable.setModel(tabelaFlashcard); 
        setLocationRelativeTo(null);
        flashcardScrollPane.setViewportView(flashcardTable);
    }

    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        flashcardScrollPane = new javax.swing.JScrollPane();
        flashcardTable = new javax.swing.JTable();
        voltarButton1 = new javax.swing.JButton();
        voltarButton = new javax.swing.JButton();
        IdComboBox = new javax.swing.JComboBox<>();
        atualizarButton = new javax.swing.JButton();
        excluirButton = new javax.swing.JButton();
        dificuldadeComboBox = new javax.swing.JComboBox<>();
        materiaComboBox = new javax.swing.JComboBox<>();
        respostaTextField = new javax.swing.JTextField();
        perguntaTextField = new javax.swing.JTextField();
        telaEditarFlashcardsLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        flashcardTable.setModel(new javax.swing.table.DefaultTableModel(
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
        flashcardScrollPane.setViewportView(flashcardTable);

        getContentPane().add(flashcardScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 590, 210));

        voltarButton1.setBorder(null);
        voltarButton1.setContentAreaFilled(false);
        getContentPane().add(voltarButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 110, 30));

        voltarButton.setBorder(null);
        voltarButton.setContentAreaFilled(false);
        getContentPane().add(voltarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 30));

        IdComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(IdComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 90, 30));

        atualizarButton.setBorder(null);
        atualizarButton.setContentAreaFilled(false);
        atualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(atualizarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, 140, 30));

        excluirButton.setBorder(null);
        excluirButton.setContentAreaFilled(false);
        excluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirButtonActionPerformed(evt);
            }
        });
        getContentPane().add(excluirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 140, 30));

        dificuldadeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(dificuldadeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, 90, 30));

        materiaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(materiaComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 90, 30));

        respostaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respostaTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(respostaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 182, 470, 30));

        perguntaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perguntaTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(perguntaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 470, 30));

        telaEditarFlashcardsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_EDITAR_FLASHCARD.png"))); // NOI18N
        getContentPane().add(telaEditarFlashcardsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void perguntaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perguntaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perguntaTextFieldActionPerformed

    private void respostaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respostaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respostaTextFieldActionPerformed

    private void excluirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirButtonActionPerformed
        if (this.indexSelecionado == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um flashcard para remover.", "Nenhuma seleção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            excluirButton.setCursor(new Cursor(Cursor.WAIT_CURSOR));

            FlashcardResposta f = this.tabelaFlashcard.getFlashcard(this.indexSelecionado);
            FlashcardService.remover(f);

            this.tabelaFlashcard.removeRow(this.indexSelecionado); 
            this.indexSelecionado = -1; 
            JOptionPane.showMessageDialog(this, "Flashcard removido com sucesso.", "Remoção", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro ao remover flashcard", JOptionPane.ERROR_MESSAGE);
        } finally {
            excluirButton.setCursor(Cursor.getDefaultCursor());
        }

    }//GEN-LAST:event_excluirButtonActionPerformed

    private void atualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarButtonActionPerformed
        if (indexSelecionado == -1) {
            atualizarButton.setCursor(new Cursor(Cursor.WAIT_CURSOR));
            return;
        }

        boolean validacao = true;
        try {
            atualizarButton.setCursor(new Cursor(Cursor.WAIT_CURSOR));

            FlashcardResposta f = this.tabelaFlashcard.getFlashcard(indexSelecionado);

            String pergunta = perguntaTextField.getText();
            String resposta = respostaTextField.getText();
            String dificuldade = (String) dificuldadeComboBox.getSelectedItem();
            String materiaSelecionada = (String) materiaComboBox.getSelectedItem();

            if (pergunta.isEmpty() || resposta.isEmpty() || dificuldade == null || materiaSelecionada == null) {
                throw new Exception("Todos os campos devem estar preenchidos.");
            }

            int idMateria = Integer.parseInt(materiaSelecionada.split(" - ")[1]);

            f.setPergunta(pergunta);
            f.setResposta(resposta);
            f.setDificuldade(dificuldade);
            f.setId_materia(idMateria);

            validacao = false;

            FlashcardService.atualizar(f);
            this.tabelaFlashcard.atualizar(f, indexSelecionado);

            JOptionPane.showMessageDialog(this, "Flashcard atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

            this.limparCampos();
            indexSelecionado = -1;

        } catch (Exception e) {
            String title = validacao ? "Validação" : "Erro";
            int pane = validacao ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.ERROR_MESSAGE;
            JOptionPane.showMessageDialog(this, e.getMessage(), title, pane);
        } finally {
            atualizarButton.setCursor(Cursor.getDefaultCursor());
        }
    }//GEN-LAST:event_atualizarButtonActionPerformed

    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new TelaEditarFlashcards(1).setVisible(true); // ID fictício para teste
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> IdComboBox;
    private javax.swing.JButton atualizarButton;
    private javax.swing.JComboBox<String> dificuldadeComboBox;
    private javax.swing.JButton excluirButton;
    private javax.swing.JScrollPane flashcardScrollPane;
    private javax.swing.JTable flashcardTable;
    private javax.swing.JComboBox<String> materiaComboBox;
    private javax.swing.JTextField perguntaTextField;
    private javax.swing.JTextField respostaTextField;
    private javax.swing.JLabel telaEditarFlashcardsLabel;
    private javax.swing.JButton voltarButton;
    private javax.swing.JButton voltarButton1;
    // End of variables declaration//GEN-END:variables

    private void getFlashcards() {
        try {
            tabelaFlashcard.limparDados();
            ArrayList<FlashcardResposta> flashcards = FlashcardService.get(idAlunoLogado);

            for (FlashcardResposta flashcard : flashcards) {
                tabelaFlashcard.addRow(flashcard);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro ao carregar flashcards", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void preencherComboBoxes() {
        dificuldadeComboBox.removeAllItems();
        dificuldadeComboBox.addItem("Fácil");
        dificuldadeComboBox.addItem("Médio");
        dificuldadeComboBox.addItem("Difícil");
    }

    private void carregarMaterias() {
        try {
            Connection c = ConnectionFactory.getConnection();
            PreparedStatement stmt = c.prepareStatement("SELECT id_materia, materia FROM materias WHERE id_aluno = ?");
            stmt.setInt(1, idAlunoLogado);
            ResultSet rs = stmt.executeQuery();

            materiaComboBox.removeAllItems();
            while (rs.next()) {
                int id = rs.getInt("id_materia");
                String nome = rs.getString("materia");
                materiaComboBox.addItem(nome + " - " + id);
            }

            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar matérias: " + e.getMessage());
        }
    }
    private void limparCampos() {
        perguntaTextField.setText("");
        respostaTextField.setText("");
    }
}




