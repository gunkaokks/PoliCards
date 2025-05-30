package usuario;

import com.mycompany.policards.Usuario;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

public class CrudUsuarios extends javax.swing.JFrame {
    private int indexSelecionado = -1;
    private UsuarioTableModel tabelaUsuario = new UsuarioTableModel();
    
    public CrudUsuarios() {
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
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro ao carregar usuários", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        removerButton = new javax.swing.JButton();
        atualizarButton = new javax.swing.JButton();
        salvarButton = new javax.swing.JButton();
        usuariosScrollPane = new javax.swing.JScrollPane();
        usuariosTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        removerButton.setBorder(null);
        removerButton.setContentAreaFilled(false);
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TELA_CONTROLAR_USUARIOS.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 999, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atualizarButtonActionPerformed

    private void usuariosTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuariosTableMouseClicked
        Usuario u = tabelaUsuario.getUsuario(usuariosTable.getSelectedRow());
        indexSelecionado = usuariosTable.getSelectedRow();
    }//GEN-LAST:event_usuariosTableMouseClicked

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salvarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CrudUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton removerButton;
    private javax.swing.JButton salvarButton;
    private javax.swing.JScrollPane usuariosScrollPane;
    private javax.swing.JTable usuariosTable;
    // End of variables declaration//GEN-END:variables
}
