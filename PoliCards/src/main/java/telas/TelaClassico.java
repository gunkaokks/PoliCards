package telas;

import crudMaterias.Materias;
import crudMaterias.MateriasDAO;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class TelaClassico extends javax.swing.JFrame {
    private void materiasComboBox() {
        try {
            MateriasDAO dao = new MateriasDAO();
            List<Materias> materias = dao.listarTodasMaterias();
            DefaultComboBoxModel<Materias> modelo = new DefaultComboBoxModel<>();

            Materias aleatorio = new Materias(-1, "Aleatório");
            modelo.addElement(aleatorio);

            for (Materias materia : materias) {
                modelo.addElement(materia);
            }
            materiaComboBox.setModel(modelo);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Tente novamente mais tarde");
            e.printStackTrace();
        }
    }
    
    public TelaClassico() {
        initComponents();
        materiasComboBox();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selecioneDificuldade = new javax.swing.JLabel();
        selecioneMateria = new javax.swing.JLabel();
        materiaComboBox = new javax.swing.JComboBox<>();
        dificuldadeComboBox = new javax.swing.JComboBox<>();
        telaClassicoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selecioneDificuldade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selecioneDificuldade.setForeground(new java.awt.Color(51, 51, 51));
        selecioneDificuldade.setText("Selecione a dificuldade");
        getContentPane().add(selecioneDificuldade, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 357, 210, -1));

        selecioneMateria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selecioneMateria.setForeground(new java.awt.Color(51, 51, 51));
        selecioneMateria.setText("Selecione a matéria");
        getContentPane().add(selecioneMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 278, 210, -1));

        materiaComboBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        materiaComboBox.setSelectedItem(materiaComboBox);
        materiaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materiaComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(materiaComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 220, 30));

        dificuldadeComboBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        dificuldadeComboBox.setMaximumRowCount(4);
        dificuldadeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aleatório", "Fácil", "Médio", "Difícil" }));
        getContentPane().add(dificuldadeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 220, 30));

        telaClassicoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_CLASSICO.png"))); // NOI18N
        getContentPane().add(telaClassicoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaClassico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaClassico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaClassico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaClassico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaClassico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> dificuldadeComboBox;
    private javax.swing.JComboBox<Materias> materiaComboBox;
    private javax.swing.JLabel selecioneDificuldade;
    private javax.swing.JLabel selecioneMateria;
    private javax.swing.JLabel telaClassicoLabel;
    // End of variables declaration//GEN-END:variables
}
