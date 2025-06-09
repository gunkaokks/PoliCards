package crudFlashcards;

import javax.swing.JOptionPane;


public class TelaConsultar extends javax.swing.JFrame {
    private int indexSelecionado = -1;
    private FlashcardTableModel tabelaFlashcards = new FlashcardTableModel();
    private int idAlunoLogado;
   
    public TelaConsultar(int idAluno) {
        this.idAlunoLogado = idAluno;
        initComponents();
        flashcardsTable.setModel(tabelaFlashcards);
        
        try {
            idComboBox.removeAllItems();
            for (FlashcardResposta f : FlashcardService.get(idAlunoLogado)) {
                idComboBox.addItem(String.valueOf(f.getId_flashcard()));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar IDs no ComboBox");
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

        opcoesButton = new javax.swing.JButton();
        voltarButton = new javax.swing.JButton();
        flashcardsScrollPane = new javax.swing.JScrollPane();
        flashcardsTable = new javax.swing.JTable();
        procurarButton = new javax.swing.JButton();
        idComboBox = new javax.swing.JComboBox<>();
        telaConsultarLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        opcoesButton.setBorder(null);
        opcoesButton.setContentAreaFilled(false);
        getContentPane().add(opcoesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 100, 30));

        voltarButton.setBorder(null);
        voltarButton.setContentAreaFilled(false);
        getContentPane().add(voltarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 20));

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
        String selecionado = String.valueOf(idComboBox.getSelectedItem());
        int idSelecionado = Integer.parseInt(selecionado);
        getFlashcards(idSelecionado);
    }//GEN-LAST:event_procurarButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane flashcardsScrollPane;
    private javax.swing.JTable flashcardsTable;
    private javax.swing.JComboBox<String> idComboBox;
    private javax.swing.JButton opcoesButton;
    private javax.swing.JButton procurarButton;
    private javax.swing.JLabel telaConsultarLabel;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
