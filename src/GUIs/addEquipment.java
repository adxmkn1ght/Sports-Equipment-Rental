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
public class addEquipment extends javax.swing.JFrame {

    /**
     * Creates new form addEquipment
     */
    public addEquipment() {
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

        addEquipmentPanel = new javax.swing.JPanel();
        addEquipmentLabel = new javax.swing.JLabel();
        nameOfEquipmentInput = new javax.swing.JTextField();
        pricePerHourInput = new javax.swing.JTextField();
        quantityInStockInput = new javax.swing.JTextField();
        confirmAddEquipmentButton = new javax.swing.JButton();
        backButtonAddEquipment = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addEquipmentPanel.setBackground(new java.awt.Color(204, 255, 204));
        addEquipmentPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        addEquipmentLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        addEquipmentLabel.setText("Add Equipment");

        nameOfEquipmentInput.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameOfEquipmentInput.setText("Name of Equipment");
        nameOfEquipmentInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameOfEquipmentInputActionPerformed(evt);
            }
        });

        pricePerHourInput.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pricePerHourInput.setText("Price Per Hour");
        pricePerHourInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pricePerHourInputActionPerformed(evt);
            }
        });

        quantityInStockInput.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        quantityInStockInput.setText("Quantity In Stock");
        quantityInStockInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityInStockInputActionPerformed(evt);
            }
        });

        confirmAddEquipmentButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        confirmAddEquipmentButton.setText("Confirm");
        confirmAddEquipmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmAddEquipmentButtonActionPerformed(evt);
            }
        });

        backButtonAddEquipment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backButtonAddEquipment.setText("Back");
        backButtonAddEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonAddEquipmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addEquipmentPanelLayout = new javax.swing.GroupLayout(addEquipmentPanel);
        addEquipmentPanel.setLayout(addEquipmentPanelLayout);
        addEquipmentPanelLayout.setHorizontalGroup(
            addEquipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEquipmentPanelLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(addEquipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(quantityInStockInput, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pricePerHourInput, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameOfEquipmentInput, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addEquipmentLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addEquipmentPanelLayout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(backButtonAddEquipment)
                .addGap(61, 61, 61)
                .addComponent(confirmAddEquipmentButton)
                .addGap(109, 109, 109))
        );
        addEquipmentPanelLayout.setVerticalGroup(
            addEquipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEquipmentPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(addEquipmentLabel)
                .addGap(29, 29, 29)
                .addComponent(nameOfEquipmentInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pricePerHourInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(quantityInStockInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(addEquipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmAddEquipmentButton)
                    .addComponent(backButtonAddEquipment))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addEquipmentPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addEquipmentPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pricePerHourInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pricePerHourInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pricePerHourInputActionPerformed

    private void quantityInStockInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityInStockInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityInStockInputActionPerformed

    
    private void backButtonAddEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonAddEquipmentActionPerformed
        adminMenu am = new adminMenu();
        am.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonAddEquipmentActionPerformed

    private void confirmAddEquipmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmAddEquipmentButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmAddEquipmentButtonActionPerformed

    private void nameOfEquipmentInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameOfEquipmentInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameOfEquipmentInputActionPerformed

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
            java.util.logging.Logger.getLogger(addEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addEquipment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addEquipmentLabel;
    private javax.swing.JPanel addEquipmentPanel;
    private javax.swing.JButton backButtonAddEquipment;
    private javax.swing.JButton confirmAddEquipmentButton;
    private javax.swing.JTextField nameOfEquipmentInput;
    private javax.swing.JTextField pricePerHourInput;
    private javax.swing.JTextField quantityInStockInput;
    // End of variables declaration//GEN-END:variables
}
