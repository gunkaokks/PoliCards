package usuario;
public class CrudUsuarios extends javax.swing.JFrame {
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        removerButton = new javax.swing.JButton();
        atualizarButton = new javax.swing.JButton();
        salvarButton = new javax.swing.JButton();
        usuariosScrollPane = new javax.swing.JScrollPane();
        usuariosTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 214, 600, 30));

        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        jTextField1.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 620, 30));

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
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton removerButton;
    private javax.swing.JButton salvarButton;
    private javax.swing.JScrollPane usuariosScrollPane;
    private javax.swing.JTable usuariosTable;
    // End of variables declaration//GEN-END:variables
}
