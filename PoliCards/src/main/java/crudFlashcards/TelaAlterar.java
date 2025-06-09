package crudFlashcards;

import java.awt.Cursor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import persistencia.ConnectionFactory;

public class TelaAlterar extends javax.swing.JFrame {
    private int idAlunoLogado;
    
    public TelaAlterar(int id_aluno) {
        this.idAlunoLogado = id_aluno;
        initComponents();
        getId();
        getMaterias(id_aluno); 
        dificuldadeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{
            "Fácil", "Médio", "Difícil"
        }));
    }
    
    private void getId() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        
        try {
            // Obter conexão com o banco de dados
            connection = ConnectionFactory.getConnection();

            // Criar um PreparedStatement para executar a consulta SQL
            String query = "SELECT id_flashcard FROM flashcards";
            preparedStatement = connection.prepareStatement(query);

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

            String query = "SELECT id_flashcard, id_materia, dificuldade, pergunta, resposta FROM flashcards WHERE id_flashcard = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, idQuestoes);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                perguntaTextField.setText(resultSet.getString("pergunta"));
                respostaTextField.setText(resultSet.getString("resposta"));
                materiaComboBox.setSelectedItem(resultSet.getString("id_materia")); 
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
    
    private void getMaterias(int idAluno) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = ConnectionFactory.getConnection();

            String query = "SELECT DISTINCT materia FROM materias WHERE id_aluno = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, idAluno);
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

        prucurarButton = new javax.swing.JButton();
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        prucurarButton.setBorder(null);
        prucurarButton.setContentAreaFilled(false);
        prucurarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prucurarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(prucurarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 90, 30));

        opcoesButton.setBorder(null);
        opcoesButton.setContentAreaFilled(false);
        getContentPane().add(opcoesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 100, 40));

        voltarButton.setBorder(null);
        voltarButton.setContentAreaFilled(false);
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
        getContentPane().add(perguntaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 218, 470, 30));

        idComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(idComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 150, 80, 30));

        telaConsultarLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_EDITAR_FLASHCARD (1).png"))); // NOI18N
        telaConsultarLabel.setToolTipText("");
        getContentPane().add(telaConsultarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void respostaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respostaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respostaTextFieldActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        boolean validacao = true;
        int id = Integer.parseInt((String) idComboBox.getSelectedItem()); 
        String dificuldade = (String) dificuldadeComboBox.getSelectedItem();
        String materia = (String) materiaComboBox.getSelectedItem();
        String pergunta = perguntaTextField.getText();
        String resposta = respostaTextField.getText();

        try {
            editarButton.setCursor(new Cursor(Cursor.WAIT_CURSOR));
            Flashcards f = new Flashcards(id, dificuldade, materia, pergunta, resposta);
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

    private void prucurarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prucurarButtonActionPerformed
        Integer selectedId = (Integer) idComboBox.getSelectedItem();
        if (selectedId != null) {
            getDados(selectedId);
        }
    }//GEN-LAST:event_prucurarButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> dificuldadeComboBox;
    private javax.swing.JButton editarButton;
    private javax.swing.JComboBox<String> idComboBox;
    private javax.swing.JComboBox<String> materiaComboBox;
    private javax.swing.JButton opcoesButton;
    private javax.swing.JTextField perguntaTextField;
    private javax.swing.JButton prucurarButton;
    private javax.swing.JTextField respostaTextField;
    private javax.swing.JLabel telaConsultarLabel;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
