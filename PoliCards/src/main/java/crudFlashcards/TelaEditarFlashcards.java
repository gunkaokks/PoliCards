package crudFlashcards;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class TelaEditarFlashcards extends javax.swing.JFrame {
    private int indexSelecionado = -1;
    private FlashcardTableModel tabelaFlashcard = new FlashcardTableModel();
    private int idAlunoLogado;

    public TelaEditarFlashcards(int idAluno) {
        this.idAlunoLogado = idAluno;
        initComponents();
        getFlashcards();
        flashcardTable.setModel(tabelaFlashcard); 
        setLocationRelativeTo(null);
        flashcardScrollPane.setViewportView(flashcardTable);
    }

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
        respostaTextField1 = new javax.swing.JTextField();
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

        respostaTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respostaTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(respostaTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 182, 470, 30));

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

    private void respostaTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respostaTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respostaTextField1ActionPerformed

    private void excluirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirButtonActionPerformed

    }//GEN-LAST:event_excluirButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEditarFlashcards().setVisible(true);
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
    private javax.swing.JTextField respostaTextField1;
    private javax.swing.JLabel telaEditarFlashcardsLabel;
    private javax.swing.JButton voltarButton;
    private javax.swing.JButton voltarButton1;
    // End of variables declaration//GEN-END:variables
}
