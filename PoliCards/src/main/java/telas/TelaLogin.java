package telas;

import com.mycompany.policards.Usuario;
import java.awt.Cursor;
import javax.swing.JOptionPane;
import persistencia.Sessao;
import persistencia.UsuarioDAO;

public class TelaLogin extends javax.swing.JFrame {
    public TelaLogin() {
        super ("Policards");
        initComponents();
        this.setLocationRelativeTo(null);
        erroLoginInvalidoLabel.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        voltarTelaLogin = new javax.swing.JButton();
        erroLoginInvalidoLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        emailTextField = new javax.swing.JTextField();
        senhaPasswordField = new javax.swing.JPasswordField();
        registrarButton = new javax.swing.JButton();
        esqueciSenhaButton = new javax.swing.JButton();
        telaLoginLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PoliCards");
        setResizable(false);
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        voltarTelaLogin.setBorder(null);
        voltarTelaLogin.setContentAreaFilled(false);
        voltarTelaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTelaLoginActionPerformed(evt);
            }
        });
        getContentPane().add(voltarTelaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 40));

        erroLoginInvalidoLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        erroLoginInvalidoLabel.setForeground(new java.awt.Color(255, 29, 51));
        erroLoginInvalidoLabel.setText("E-mail ou senha inválidos!");
        getContentPane().add(erroLoginInvalidoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 190, -1));

        loginButton.setBorder(null);
        loginButton.setContentAreaFilled(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 380, 450, 30));

        emailTextField.setBackground(new java.awt.Color(196, 196, 196));
        emailTextField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        emailTextField.setForeground(new java.awt.Color(51, 51, 51));
        emailTextField.setBorder(null);
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 218, 400, 30));

        senhaPasswordField.setBackground(new java.awt.Color(196, 196, 196));
        senhaPasswordField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        senhaPasswordField.setForeground(new java.awt.Color(51, 51, 51));
        senhaPasswordField.setBorder(null);
        senhaPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaPasswordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(senhaPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 295, 400, 30));

        registrarButton.setBorder(null);
        registrarButton.setContentAreaFilled(false);
        registrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(registrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 350, 30));

        esqueciSenhaButton.setBorder(null);
        esqueciSenhaButton.setContentAreaFilled(false);
        getContentPane().add(esqueciSenhaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, 130, 30));

        telaLoginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        telaLoginLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_LOGIN.png"))); // NOI18N
        telaLoginLabel.setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().add(telaLoginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void senhaPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaPasswordFieldActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed
    
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String emailAluno = emailTextField.getText().trim();
        String senhaAluno = new String(senhaPasswordField.getPassword());

        try {
            loginButton.setCursor(new Cursor(Cursor.WAIT_CURSOR));
            UsuarioDAO dao = new UsuarioDAO();
            Usuario usuarioAutenticado = dao.autenticar(emailAluno, senhaAluno);
            loginButton.setEnabled(false);
            
            if (usuarioAutenticado != null) {
                Sessao.iniciarSessao(
                    usuarioAutenticado.getId_aluno(),
                    usuarioAutenticado.getEmailAluno());
                new TelaMenu().setVisible(true);
                this.dispose();
            }
            else {
                loginButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                erroLoginInvalidoLabel.setVisible(true);
                senhaPasswordField.setText("");
                loginButton.setEnabled(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas técnicos. Tente novamente mais tarde");
            e.printStackTrace();
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void registrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarButtonActionPerformed
        new TelaCadastro().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registrarButtonActionPerformed

    private void voltarTelaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelaLoginActionPerformed
        new TelaInicial().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarTelaLoginActionPerformed
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel erroLoginInvalidoLabel;
    private javax.swing.JButton esqueciSenhaButton;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton registrarButton;
    private javax.swing.JPasswordField senhaPasswordField;
    private javax.swing.JLabel telaLoginLabel;
    private javax.swing.JButton voltarTelaLogin;
    // End of variables declaration//GEN-END:variables
}
