package crudFlashcards;

import java.awt.Cursor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import persistencia.ConnectionFactory;
import persistencia.Sessao;
import sons.EfeitosSonoros;
import telas.TelaManterFlashcards;

public class TelaAlterar extends javax.swing.JFrame {
    private int idAlunoLogado;
    
    public TelaAlterar() {
        super ("Policards");
        initComponents();
        this.setLocationRelativeTo(null);
        this.idAlunoLogado = Sessao.getIdAluno();
        idComboBox.removeAllItems();
        getId();
        getMaterias(); 
        dificuldadeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{ "Fácil", "Médio", "Difícil"}));
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

        procurarButton = new javax.swing.JButton();
        opcoesButton = new javax.swing.JButton();
        voltarButton = new javax.swing.JButton();
        editarButton = new javax.swing.JButton();
        dificuldadeComboBox = new javax.swing.JComboBox<>();
        materiaComboBox = new javax.swing.JComboBox<>();
        respostaTextField = new javax.swing.JTextField();
        perguntaTextField = new javax.swing.JTextField();
        idComboBox = new javax.swing.JComboBox<>();
        telaConsultarLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        procurarButton.setBorder(null);
        procurarButton.setContentAreaFilled(false);
        procurarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procurarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(procurarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 90, 30));

        opcoesButton.setBorder(null);
        opcoesButton.setContentAreaFilled(false);
        getContentPane().add(opcoesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 100, 40));

        voltarButton.setBorder(null);
        voltarButton.setContentAreaFilled(false);
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(voltarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 40));

        editarButton.setBorder(null);
        editarButton.setContentAreaFilled(false);
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(editarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 140, 30));

        dificuldadeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(dificuldadeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 130, 30));

        materiaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(materiaComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 210, 30));

        respostaTextField.setToolTipText("");
        respostaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respostaTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(respostaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 295, 470, 30));

        perguntaTextField.setToolTipText("");
        perguntaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perguntaTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(perguntaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 218, 470, 30));

        idComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(idComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 150, 80, 30));

        telaConsultarLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_EDITAR_FLASHCARD (1).png"))); // NOI18N
        telaConsultarLabel.setToolTipText("");
        getContentPane().add(telaConsultarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void respostaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respostaTextFieldActionPerformed
        EfeitosSonoros.Play("button.wav");
    }//GEN-LAST:event_respostaTextFieldActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        EfeitosSonoros.Play("click.wav");
        boolean validacao = true;
        int id_flashcard = Integer.parseInt((String) idComboBox.getSelectedItem());
        String dificuldade = (String) dificuldadeComboBox.getSelectedItem();
        String materiaNome = (String) materiaComboBox.getSelectedItem();
        String pergunta = perguntaTextField.getText();
        String resposta = respostaTextField.getText();
        int id_aluno = Sessao.getIdAluno();
        
        int id_materia = 0;

        try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement ps = conn.prepareStatement("SELECT id_materia FROM materias WHERE materia = ? AND id_aluno = ?")) {
            ps.setString(1, materiaNome);
            ps.setInt(2, Sessao.getIdAluno());

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    id_materia = rs.getInt("id_materia");
                } else {
                    throw new Exception("Matéria não encontrada.");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

        try {
            editarButton.setCursor(new Cursor(Cursor.WAIT_CURSOR));
            Flashcards f = new Flashcards( id_flashcard, id_aluno, id_materia, pergunta, resposta, dificuldade);
            validacao = false;

            FlashcardService.atualizar(f);
            JOptionPane.showMessageDialog(this, "A questão foi alterada com sucesso!", "Questão Alterada", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            String title = validacao ? "Validação" : "Erro";
            int pane = validacao ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.ERROR_MESSAGE;

            JOptionPane.showMessageDialog(this, e.getMessage(), title, pane);
        } finally {
            editarButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }
    

    }//GEN-LAST:event_editarButtonActionPerformed

    private void procurarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procurarButtonActionPerformed
        EfeitosSonoros.Play("click.wav");
        String sel = (String) idComboBox.getSelectedItem();
        if (sel != null) {
            int selectedId = Integer.parseInt(sel);
            getDados(selectedId);
        }
    }//GEN-LAST:event_procurarButtonActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        EfeitosSonoros.Play("back.wav");
        new TelaManterFlashcards().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void perguntaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perguntaTextFieldActionPerformed
        EfeitosSonoros.Play("button.wav");
    }//GEN-LAST:event_perguntaTextFieldActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAlterar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> dificuldadeComboBox;
    private javax.swing.JButton editarButton;
    private javax.swing.JComboBox<String> idComboBox;
    private javax.swing.JComboBox<String> materiaComboBox;
    private javax.swing.JButton opcoesButton;
    private javax.swing.JTextField perguntaTextField;
    private javax.swing.JButton procurarButton;
    private javax.swing.JTextField respostaTextField;
    private javax.swing.JLabel telaConsultarLabel;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
