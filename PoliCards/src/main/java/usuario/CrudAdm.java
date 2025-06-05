
package usuario;

import com.mycompany.policards.Administrador;
import java.awt.Cursor;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import telas.TelaMenuAdm;


public class CrudAdm extends javax.swing.JFrame {
    private int indexSelecionado = -1;
    private AdmTableModel tabelaAdministrador = new AdmTableModel();
  
    public CrudAdm() {
        initComponents();
        admTable.setModel((TableModel) tabelaAdministrador);
        getAdministradores();
        txtEmail.setOpaque(false);
        txtSenha.setOpaque(false);
        setLocationRelativeTo(null);
        admScroll.setViewportView(admTable);
    }
    
    private void getAdministradores() {
        try {
            while (this.tabelaAdministrador.getRowCount() > 0) {
                this.tabelaAdministrador.removeRow(0);
            }

            for (Administrador administrador : AdmService.get()) {
                this.tabelaAdministrador.addRow(administrador);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro ao carregar administradores", JOptionPane.ERROR_MESSAGE);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        admScroll = new javax.swing.JScrollPane();
        admTable = new javax.swing.JTable();
        txtSenha = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        voltarButton = new javax.swing.JButton();
        salvarButton = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();
        atualizarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        admTable.setModel(new javax.swing.table.DefaultTableModel(
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
        admTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admTableMouseClicked(evt);
            }
        });
        admScroll.setViewportView(admTable);

        getContentPane().add(admScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 700, 200));

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 214, 600, 30));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 166, 600, 30));

        voltarButton.setBorder(null);
        voltarButton.setContentAreaFilled(false);
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(voltarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 30));

        salvarButton.setBorder(null);
        salvarButton.setContentAreaFilled(false);
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(salvarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 110, 30));

        removerButton.setBorder(null);
        removerButton.setContentAreaFilled(false);
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(removerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 470, 110, 30));

        atualizarButton.setBorder(null);
        atualizarButton.setContentAreaFilled(false);
        atualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(atualizarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 110, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_ADM_ADICIONAR.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerButtonActionPerformed
        if (this.indexSelecionado == -1) {
            return;
        }

        try {
            removerButton.setCursor(new Cursor(Cursor.WAIT_CURSOR));
            Administrador a = this.tabelaAdministrador.getAdm(this.indexSelecionado);
            AdmService.remover(a);

            this.tabelaAdministrador.removeRow(this.indexSelecionado);
            this.limparCampos();

            JOptionPane.showMessageDialog(this, "O Administrador foi removido com sucesso.", "Administrador Removido", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro ao deletar Administrador", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_removerButtonActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        salvarButton.setCursor(new Cursor(Cursor.WAIT_CURSOR));
        boolean validacao = true;

        try {
            String email = txtEmail.getText();
            String senha = txtSenha.getText();

            if (!AdmService.administradorExiste(email)) {

                Administrador a = new Administrador(email, senha);
                validacao = false;

                AdmService.adicionar(a);

                JOptionPane.showMessageDialog(this, "Administrador criado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

                this.getAdministradores();
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Administrador já existe", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            String title = validacao ? "Validação" : "Erro";
            int pane = validacao ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.ERROR_MESSAGE;

            JOptionPane.showMessageDialog(this, e.getMessage(), title, pane);
        }
    }//GEN-LAST:event_salvarButtonActionPerformed

    private void atualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarButtonActionPerformed
        if (indexSelecionado == -1) {
            atualizarButton.setCursor(new Cursor(Cursor.WAIT_CURSOR));
            return;
        }

        boolean validacao = true;
        try {
            Administrador a = this.tabelaAdministrador.getAdm(this.indexSelecionado);
            a.setEmailAdm(this.txtEmail.getText());
            a.setSenhaAdm(this.txtSenha.getText());
            validacao = false;

            AdmService.atualizar(a);
            this.tabelaAdministrador.atualizar(a, this.indexSelecionado);

            JOptionPane.showMessageDialog(this, "Administrador alterado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

            this.limparCampos();
            
        } catch (Exception e) {
            String title = validacao ? "Validação" : "Erro";
            int pane = validacao ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.ERROR_MESSAGE;

            JOptionPane.showMessageDialog(this, e.getMessage(), title, pane);
        }
    }//GEN-LAST:event_atualizarButtonActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        new TelaMenuAdm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void admTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admTableMouseClicked
        Administrador a = tabelaAdministrador.getAdm(admTable.getSelectedRow());
        indexSelecionado = admTable.getSelectedRow();
    }//GEN-LAST:event_admTableMouseClicked
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
            java.util.logging.Logger.getLogger(CrudAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane admScroll;
    private javax.swing.JTable admTable;
    private javax.swing.JButton atualizarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton removerButton;
    private javax.swing.JButton salvarButton;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
    private void limparCampos() {
        txtEmail.setText("");
        txtSenha.setText("");
    }
}

