/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

/**
 *
 * @author ak200458
 */
public class enterAsAdmin extends javax.swing.JFrame {

    /**
     * Creates new form enterAsAdmin
     */
    public enterAsAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterAsAdminPanel = new javax.swing.JPanel();
        enterAsAdminLabel = new javax.swing.JLabel();
        enterAsAdminYesButton = new javax.swing.JButton();
        enterAsAdminNoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        enterAsAdminPanel.setBackground(new java.awt.Color(255, 204, 255));
        enterAsAdminPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        enterAsAdminLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        enterAsAdminLabel.setText("Enter as Admin?");

        enterAsAdminYesButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        enterAsAdminYesButton.setText("Yes");
        enterAsAdminYesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterAsAdminYesButtonActionPerformed(evt);
            }
        });

        enterAsAdminNoButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        enterAsAdminNoButton.setText("No");
        enterAsAdminNoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterAsAdminNoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout enterAsAdminPanelLayout = new javax.swing.GroupLayout(enterAsAdminPanel);
        enterAsAdminPanel.setLayout(enterAsAdminPanelLayout);
        enterAsAdminPanelLayout.setHorizontalGroup(
            enterAsAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enterAsAdminPanelLayout.createSequentialGroup()
                .addGroup(enterAsAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(enterAsAdminPanelLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(enterAsAdminLabel))
                    .addGroup(enterAsAdminPanelLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(enterAsAdminYesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(enterAsAdminNoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        enterAsAdminPanelLayout.setVerticalGroup(
            enterAsAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enterAsAdminPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(enterAsAdminLabel)
                .addGap(65, 65, 65)
                .addGroup(enterAsAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterAsAdminYesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterAsAdminNoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(enterAsAdminPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(enterAsAdminPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterAsAdminYesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterAsAdminYesButtonActionPerformed
        adminMenu am = new adminMenu();
        am.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_enterAsAdminYesButtonActionPerformed

    private void enterAsAdminNoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterAsAdminNoButtonActionPerformed
        userMenu um = new userMenu();
        um.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_enterAsAdminNoButtonActionPerformed
  
    
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
            java.util.logging.Logger.getLogger(enterAsAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(enterAsAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(enterAsAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(enterAsAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new enterAsAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterAsAdminLabel;
    private javax.swing.JButton enterAsAdminNoButton;
    private javax.swing.JPanel enterAsAdminPanel;
    private javax.swing.JButton enterAsAdminYesButton;
    // End of variables declaration//GEN-END:variables
}
