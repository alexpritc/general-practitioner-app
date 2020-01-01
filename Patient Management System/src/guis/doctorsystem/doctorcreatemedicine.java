/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guis.doctorsystem;
import accounts.*;
import guis.alert;
import guis.login;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import other.data;
import other.medicine;
import other.notification;

/**
 *
 * @author Alex Pritchard
 */
public class doctorcreatemedicine extends javax.swing.JFrame {
    
    public static doctor dr;
    
    /**
     * Creates new form patienthome
     */
    public doctorcreatemedicine() {
        initComponents();
        
        lblTitle.setText("Welcome back, " + dr.getName());
        txtDosage.setText(dr.getId());
        txtMedicine.setText(dr.getName() + " " + dr.getSurname());
        txtStock.setText(dr.getAddress());
        
        for (other.notification n : data.notifications){
            if (n.getUser() == dr){
                alert.notification = n;
                new alert().setVisible(true);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        lblMedicine = new javax.swing.JLabel();
        txtMedicine = new javax.swing.JTextField();
        lblStock = new javax.swing.JLabel();
        txtDosage = new javax.swing.JTextField();
        lblDosage = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        btnCreateMedicine = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(900, 733));

        btnBack.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 36)); // NOI18N
        lblTitle.setText("Create medicine");

        lblMedicine.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lblMedicine.setText("Medicine");

        txtMedicine.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        txtMedicine.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMedicine.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtMedicine.setMaximumSize(new java.awt.Dimension(40, 249));
        txtMedicine.setMinimumSize(new java.awt.Dimension(40, 249));
        txtMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicineActionPerformed(evt);
            }
        });

        lblStock.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lblStock.setText("Stock");

        txtDosage.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        txtDosage.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDosage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDosage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDosageActionPerformed(evt);
            }
        });

        lblDosage.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lblDosage.setText("Dosage");

        txtStock.setEditable(false);
        txtStock.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        txtStock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStock.setText("0");
        txtStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtStock.setMaximumSize(new java.awt.Dimension(40, 249));
        txtStock.setMinimumSize(new java.awt.Dimension(40, 249));
        txtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActionPerformed(evt);
            }
        });

        btnCreateMedicine.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        btnCreateMedicine.setText("Request new medicine");
        btnCreateMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateMedicineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblDosage)
                        .addGap(29, 29, 29)
                        .addComponent(txtDosage, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblMedicine)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblStock)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCreateMedicine, javax.swing.GroupLayout.DEFAULT_SIZE, 882, Short.MAX_VALUE)
                            .addComponent(txtStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDosage, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDosage))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMedicine))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStock)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(btnCreateMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(64, 64, 64)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicineActionPerformed

    private void txtDosageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDosageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDosageActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        new doctorhome().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActionPerformed

    private void btnCreateMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateMedicineActionPerformed
        // TODO add your handling code here:
       
        String name, dosage;
        
        if (!txtMedicine.getText().isEmpty() && !txtDosage.getText().isEmpty()){
            name = txtMedicine.getText();
            dosage = txtDosage.getText();
        
            medicine tempMedicine = new medicine(name, dosage, 0);
        
            data.medicines.add(tempMedicine);
        
            try {
                data.saveMedicines();
            } catch (Exception ex) {
                Logger.getLogger(doctorcreatemedicine.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            notification tempNotif = new notification(3, "A Doctor has requested a new medicine be stocked.");
            
            data.notifications.add(tempNotif);
            
            try {
                data.saveNotifications();
            } catch (Exception ex) {
                Logger.getLogger(doctorcreatemedicine.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, 
                    "Please enter both fields.", "" + "", 
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnCreateMedicineActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])throws Exception {
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
            java.util.logging.Logger.getLogger(doctorcreatemedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doctorcreatemedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doctorcreatemedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doctorcreatemedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doctorcreatemedicine().setVisible(true);
            }
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateMedicine;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDosage;
    private javax.swing.JLabel lblMedicine;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtDosage;
    private javax.swing.JTextField txtMedicine;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
