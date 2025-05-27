package telas;

import com.mycompany.policards.Usuario;
import java.awt.Cursor;
import javax.swing.JOptionPane;
import persistencia.UsuarioDAO;

public class TelaCadastro extends javax.swing.JFrame {
    public TelaCadastro() {
        initComponents();
        this.setLocationRelativeTo(null);
        erroSenhasDiferentesLabel.setVisible(false);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        erroSenhasDiferentesLabel = new javax.swing.JLabel();
        voltarTelaCadastro = new javax.swing.JButton();
        cadastroButton = new javax.swing.JButton();
        cadastroEmailTextField = new javax.swing.JTextField();
        cadastroConfirmeSenhaPasswordField = new javax.swing.JPasswordField();
        cadastroSenhaPasswordField = new javax.swing.JPasswordField();
        telaCadastroLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PoliCards");
        setResizable(false);
        setSize(new java.awt.Dimension(1440, 1024));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        erroSenhasDiferentesLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        erroSenhasDiferentesLabel.setForeground(new java.awt.Color(255, 29, 51));
        erroSenhasDiferentesLabel.setText("A senha deve ser a mesma nos dois campos!");
        getContentPane().add(erroSenhasDiferentesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 380, -1));

        voltarTelaCadastro.setBorder(null);
        voltarTelaCadastro.setContentAreaFilled(false);
        voltarTelaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTelaCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(voltarTelaCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 40));

        cadastroButton.setBorder(null);
        cadastroButton.setContentAreaFilled(false);
        cadastroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cadastroButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 447, 460, 40));

        cadastroEmailTextField.setBackground(new java.awt.Color(196, 196, 196));
        cadastroEmailTextField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cadastroEmailTextField.setForeground(new java.awt.Color(51, 51, 51));
        cadastroEmailTextField.setBorder(null);
        cadastroEmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroEmailTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(cadastroEmailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 226, 400, 30));

        cadastroConfirmeSenhaPasswordField.setBackground(new java.awt.Color(196, 196, 196));
        cadastroConfirmeSenhaPasswordField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cadastroConfirmeSenhaPasswordField.setBorder(null);
        cadastroConfirmeSenhaPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroConfirmeSenhaPasswordFieldActionPerformed(evt);
            }
        });
        cadastroConfirmeSenhaPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cadastroConfirmeSenhaPasswordFieldKeyReleased(evt);
            }
        });
        getContentPane().add(cadastroConfirmeSenhaPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 374, 400, 30));

        cadastroSenhaPasswordField.setBackground(new java.awt.Color(196, 196, 196));
        cadastroSenhaPasswordField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cadastroSenhaPasswordField.setBorder(null);
        getContentPane().add(cadastroSenhaPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 302, 400, 30));

        telaCadastroLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_CADASTRO.png"))); // NOI18N
        telaCadastroLabel.setToolTipText("");
        getContentPane().add(telaCadastroLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroEmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroEmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroEmailTextFieldActionPerformed

    private void cadastroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroButtonActionPerformed
        String email = cadastroEmailTextField.getText().trim();
        String senha = new String(cadastroSenhaPasswordField.getPassword()).trim();
        
        if (cadastroSenhaPasswordField.getPassword() != cadastroConfirmeSenhaPasswordField.getPassword());
            try {
            cadastroButton.setCursor(new Cursor(Cursor.WAIT_CURSOR));
            Usuario novoUsuario = new Usuario(email, senha);
            UsuarioDAO dao = new UsuarioDAO();

                if (dao.cadastrar(novoUsuario)) {
                    JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!");
                    this.dispose();
                    new TelaLogin().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao cadastrar. Tente outro e-mail.");
                    }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
                e.printStackTrace();
            }
    }//GEN-LAST:event_cadastroButtonActionPerformed

    private void cadastroConfirmeSenhaPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroConfirmeSenhaPasswordFieldActionPerformed

    }//GEN-LAST:event_cadastroConfirmeSenhaPasswordFieldActionPerformed

    private void cadastroConfirmeSenhaPasswordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cadastroConfirmeSenhaPasswordFieldKeyReleased
        String senha = new String(cadastroSenhaPasswordField.getPassword());
        String confirmacao = new String(cadastroConfirmeSenhaPasswordField.getPassword());
        
        if (!senha.equals(confirmacao)) {
            erroSenhasDiferentesLabel.setVisible(true);
        } else {
            erroSenhasDiferentesLabel.setVisible(false);
        }
    }//GEN-LAST:event_cadastroConfirmeSenhaPasswordFieldKeyReleased

    private void voltarTelaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelaCadastroActionPerformed
        new TelaInicial().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarTelaCadastroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastroButton;
    private javax.swing.JPasswordField cadastroConfirmeSenhaPasswordField;
    private javax.swing.JTextField cadastroEmailTextField;
    private javax.swing.JPasswordField cadastroSenhaPasswordField;
    private javax.swing.JLabel erroSenhasDiferentesLabel;
    private javax.swing.JLabel telaCadastroLabel;
    private javax.swing.JButton voltarTelaCadastro;
    // End of variables declaration//GEN-END:variables
}
