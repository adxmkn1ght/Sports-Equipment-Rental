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
public class adminMenu extends javax.swing.JFrame {

    /**
     * Creates new form adminMenu
     */
    public adminMenu() {
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

        adminMenuPanel = new javax.swing.JPanel();
        adminMenuLabel = new javax.swing.JLabel();
        closeProgramButtonAdmin = new javax.swing.JButton();
        giveUserAdminButton = new javax.swing.JButton();
        removeUserButton = new javax.swing.JButton();
        removeEquipmentButton = new javax.swing.JButton();
        addEquipmentButton = new javax.swing.JButton();
        changeToUserButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));

        adminMenuPanel.setBackground(new java.awt.Color(255, 204, 204));
        adminMenuPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        adminMenuLabel.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        adminMenuLabel.setText("Admin Menu");

        closeProgramButtonAdmin.setText("Close Program");
        closeProgramButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeProgramButtonAdminActionPerformed(evt);
            }
        });

        giveUserAdminButton.setText("Give User Admin");
        giveUserAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giveUserAdminButtonActionPerformed(evt);
            }
        });

        removeUserButton.setText("Remove User");
        removeUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeUserButtonActionPerformed(evt);
            }
        });

        removeEquipmentButton.setText("Remove equipment");
        removeEquipmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeEquipmentButtonActionPerformed(evt);
            }
        });

        addEquipmentButton.setText("Add Equipment");
        addEquipmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEquipmentButtonActionPerformed(evt);
            }
        });

        changeToUserButton.setText("Change to User");
        changeToUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeToUserButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminMenuPanelLayout = new javax.swing.GroupLayout(adminMenuPanel);
        adminMenuPanel.setLayout(adminMenuPanelLayout);
        adminMenuPanelLayout.setHorizontalGroup(
            adminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminMenuPanelLayout.createSequentialGroup()
                .addGroup(adminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminMenuPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(adminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(giveUserAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addEquipmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(closeProgramButtonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(adminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(removeEquipmentButton)
                            .addComponent(changeToUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(adminMenuPanelLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(adminMenuLabel)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        adminMenuPanelLayout.setVerticalGroup(
            adminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminMenuLabel)
                .addGap(70, 70, 70)
                .addGroup(adminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeToUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeProgramButtonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(adminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addEquipmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeEquipmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(adminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(giveUserAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeProgramButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeProgramButtonAdminActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeProgramButtonAdminActionPerformed

    private void changeToUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeToUserButtonActionPerformed
        userMenu uMenu = new userMenu();
        uMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_changeToUserButtonActionPerformed

    private void addEquipmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEquipmentButtonActionPerformed
        addEquipment addEquip = new addEquipment();
        addEquip.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addEquipmentButtonActionPerformed

    private void removeEquipmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeEquipmentButtonActionPerformed
        removeEquipment remEquip = new removeEquipment();
        remEquip.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_removeEquipmentButtonActionPerformed

    private void giveUserAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giveUserAdminButtonActionPerformed
        giveUserAdmin giveAdmin = new giveUserAdmin();
        giveAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_giveUserAdminButtonActionPerformed

    private void removeUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeUserButtonActionPerformed
        removeUser remUser = new removeUser();
        remUser.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_removeUserButtonActionPerformed

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
            java.util.logging.Logger.getLogger(adminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminMenu().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEquipmentButton;
    private javax.swing.JLabel adminMenuLabel;
    private javax.swing.JPanel adminMenuPanel;
    private javax.swing.JButton changeToUserButton;
    private javax.swing.JButton closeProgramButtonAdmin;
    private javax.swing.JButton giveUserAdminButton;
    private javax.swing.JButton removeEquipmentButton;
    private javax.swing.JButton removeUserButton;
    // End of variables declaration//GEN-END:variables
}