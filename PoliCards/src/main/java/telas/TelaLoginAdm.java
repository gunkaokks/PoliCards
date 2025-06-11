package telas;

import com.mycompany.policards.Usuario;
import java.awt.Cursor;
import javax.swing.JOptionPane;
import persistencia.UsuarioDAO;
import sons.EfeitosSonoros;

public class TelaLoginAdm extends javax.swing.JFrame {
    public TelaLoginAdm() {
        super("Policards");
        initComponents();
        this.setLocationRelativeTo(null);
        erroLoginAdmInvalidoLabel.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        voltarTelaLoginAdmButton = new javax.swing.JButton();
        erroLoginAdmInvalidoLabel = new javax.swing.JLabel();
        senhaAdmPasswordField = new javax.swing.JPasswordField();
        emailAdmTextField = new javax.swing.JTextField();
        loginAdmButton = new javax.swing.JButton();
        telaLoginAdmLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        voltarTelaLoginAdmButton.setBorder(null);
        voltarTelaLoginAdmButton.setContentAreaFilled(false);
        voltarTelaLoginAdmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTelaLoginAdmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(voltarTelaLoginAdmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 130, 40));

        erroLoginAdmInvalidoLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        erroLoginAdmInvalidoLabel.setForeground(new java.awt.Color(255, 29, 51));
        erroLoginAdmInvalidoLabel.setText("E-mail ou senha inválidos!");
        getContentPane().add(erroLoginAdmInvalidoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 390, -1));

        senhaAdmPasswordField.setBackground(new java.awt.Color(196, 196, 196));
        senhaAdmPasswordField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        senhaAdmPasswordField.setForeground(new java.awt.Color(51, 51, 51));
        senhaAdmPasswordField.setBorder(null);
        senhaAdmPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaAdmPasswordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(senhaAdmPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 327, 400, 30));

        emailAdmTextField.setBackground(new java.awt.Color(196, 196, 196));
        emailAdmTextField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        emailAdmTextField.setForeground(new java.awt.Color(51, 51, 51));
        emailAdmTextField.setBorder(null);
        emailAdmTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailAdmTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(emailAdmTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 400, 30));

        loginAdmButton.setBorder(null);
        loginAdmButton.setContentAreaFilled(false);
        loginAdmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginAdmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginAdmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 470, 50));

        telaLoginAdmLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_LOGIN_ADM.png"))); // NOI18N
        getContentPane().add(telaLoginAdmLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailAdmTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailAdmTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailAdmTextFieldActionPerformed

    private void senhaAdmPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaAdmPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaAdmPasswordFieldActionPerformed

    private void loginAdmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginAdmButtonActionPerformed
        String emailAdm = emailAdmTextField.getText().trim();
        String senhaAdm = new String(senhaAdmPasswordField.getPassword());

        try {
            loginAdmButton.setCursor(new Cursor(Cursor.WAIT_CURSOR));
            UsuarioDAO dao = new UsuarioDAO();
            Usuario usuario = dao.autenticarAdm(emailAdm, senhaAdm);
            loginAdmButton.setEnabled(false);

            if (usuario != null) {
                new TelaMenuAdm().setVisible(true);
                this.dispose();
            } else {
                erroLoginAdmInvalidoLabel.setVisible(true);
                senhaAdmPasswordField.setText("");
                loginAdmButton.setEnabled(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas técnicos. Tente novamente mais tarde");
            e.printStackTrace();
        }
    }//GEN-LAST:event_loginAdmButtonActionPerformed

    private void voltarTelaLoginAdmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelaLoginAdmButtonActionPerformed
        new TelaInicial().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarTelaLoginAdmButtonActionPerformed
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
            java.util.logging.Logger.getLogger(TelaLoginAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLoginAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLoginAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLoginAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLoginAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailAdmTextField;
    private javax.swing.JLabel erroLoginAdmInvalidoLabel;
    private javax.swing.JButton loginAdmButton;
    private javax.swing.JPasswordField senhaAdmPasswordField;
    private javax.swing.JLabel telaLoginAdmLabel;
    private javax.swing.JButton voltarTelaLoginAdmButton;
    // End of variables declaration//GEN-END:variables
}
