package usuario;

import com.mycompany.policards.Usuario;
import java.awt.Cursor;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import telas.TelaMenuAdm;

public class CrudUsuarios extends javax.swing.JFrame {
    private int indexSelecionado = -1;
    private UsuarioTableModel tabelaUsuario = new UsuarioTableModel();
    
    public CrudUsuarios() {
        super("Policards");
        initComponents();
        usuariosTable.setModel((TableModel) tabelaUsuario);
        getUsuarios();
        setLocationRelativeTo(null);
        usuariosScrollPane.setViewportView(usuariosTable);
        
    }
    
    private void getUsuarios() {
        try
        {
            while (this.tabelaUsuario.getRowCount() > 0) {
                this.tabelaUsuario.removeRow(0);
            }

            for (Usuario usuario : UsuarioService.get()) {
                this.tabelaUsuario.addRow(usuario);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this,"Erro ao carregar usuários");
        }
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSenha = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        voltarButton = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();
        atualizarButton = new javax.swing.JButton();
        salvarButton = new javax.swing.JButton();
        usuariosScrollPane = new javax.swing.JScrollPane();
        usuariosTable = new javax.swing.JTable();
        crudUsuariosLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSenha.setBackground(new java.awt.Color(193, 193, 193));
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 212, 610, 30));

        txtEmail.setBackground(new java.awt.Color(193, 193, 193));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 610, 30));

        voltarButton.setBorder(null);
        voltarButton.setContentAreaFilled(false);
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(voltarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, 40));

        removerButton.setBorder(null);
        removerButton.setContentAreaFilled(false);
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(removerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 470, 130, 40));

        atualizarButton.setBorder(null);
        atualizarButton.setContentAreaFilled(false);
        atualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(atualizarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 130, 40));

        salvarButton.setBorder(null);
        salvarButton.setContentAreaFilled(false);
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(salvarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 130, 40));

        usuariosTable.setModel(new javax.swing.table.DefaultTableModel(
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
        usuariosTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuariosTableMouseClicked(evt);
            }
        });
        usuariosScrollPane.setViewportView(usuariosTable);

        getContentPane().add(usuariosScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 690, 190));

        crudUsuariosLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_CONTROLAR_USUARIOS.png"))); // NOI18N
        crudUsuariosLabel.setText("jLabel1");
        getContentPane().add(crudUsuariosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 999, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarButtonActionPerformed
        if (indexSelecionado == -1) {
            atualizarButton.setCursor(new Cursor(Cursor.WAIT_CURSOR));
            return;
        }

        boolean validacao = true;
        try {
            Usuario u = this.tabelaUsuario.getUsuario(this.indexSelecionado);
            u.setEmailAluno(this.txtEmail.getText());
            u.setSenhaAluno(this.txtSenha.getText());
            validacao = false;

            UsuarioService.atualizar(u);
            this.tabelaUsuario.atualizar(u, this.indexSelecionado);

            JOptionPane.showMessageDialog(this, "Usuário alterado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

            this.limparCampos();
        } catch (Exception e) {
            String title = validacao ? "Validação" : "Erro";
            int pane = validacao ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.ERROR_MESSAGE;

            JOptionPane.showMessageDialog(this, e.getMessage(), title, pane);
        }

    }//GEN-LAST:event_atualizarButtonActionPerformed

    private void usuariosTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuariosTableMouseClicked
        Usuario u = tabelaUsuario.getUsuario(usuariosTable.getSelectedRow());
        indexSelecionado = usuariosTable.getSelectedRow();
    }//GEN-LAST:event_usuariosTableMouseClicked

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        salvarButton.setCursor(new Cursor(Cursor.WAIT_CURSOR));
        boolean validacao = true;

        try {
            String email = txtEmail.getText();
            String senha = txtSenha.getText();

            if (!UsuarioService.usuarioExiste(email)) { 

                Usuario u = new Usuario(email, senha);
                validacao = false;

                UsuarioService.adicionar(u);

                JOptionPane.showMessageDialog(this, "Usuário criado com sucesso!");

                this.getUsuarios();
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Usuário já existe");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar usuário");
            e.printStackTrace();
        }

    }//GEN-LAST:event_salvarButtonActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        new TelaMenuAdm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void removerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerButtonActionPerformed
        if (this.indexSelecionado == -1)
            return;

        try {
            removerButton.setCursor(new Cursor(Cursor.WAIT_CURSOR));
            Usuario u = this.tabelaUsuario.getUsuario(this.indexSelecionado);
            UsuarioService.remover(u);

            this.tabelaUsuario.removeRow(this.indexSelecionado);
            this.limparCampos();

            JOptionPane.showMessageDialog(this, "O usuario foi removido com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao deletar usuário");
            e.printStackTrace();
        }
    }//GEN-LAST:event_removerButtonActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed
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
            java.util.logging.Logger.getLogger(CrudUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarButton;
    private javax.swing.JLabel crudUsuariosLabel;
    private javax.swing.JButton removerButton;
    private javax.swing.JButton salvarButton;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JScrollPane usuariosScrollPane;
    private javax.swing.JTable usuariosTable;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
private void limparCampos(){
        txtEmail.setText("");
        txtSenha.setText("");
    }
}
