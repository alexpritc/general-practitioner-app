/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guis;

import accounts.*;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import other.data;

/**
 *
 * @author Alex Pritchard
 */
public class adminremoveaccounts extends javax.swing.JFrame {

    /**
     * Creates new form patientmedicalhistory
     */
    public adminremoveaccounts() {
        initComponents();
        
        String[] accountData = new String[data.doctors.size() + data.secretaries.size()];
        int i = 0;
        
        for (doctor d : data.doctors){
            accountData[i] = d.getId() + ", " + d.getSurname();
            i++;
        }
        for (secretary s : data.secretaries){
            accountData[i] = s.getId() + ", " + s.getSurname();
            i++;
        }
        lstAccounts.setListData(accountData);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        btnBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cmboxAccounts = new javax.swing.JComboBox<>();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstAccounts = new javax.swing.JList<>();
        btnRemove = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBack.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 36)); // NOI18N
        lblTitle.setText("Remove accounts");

        cmboxAccounts.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        cmboxAccounts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "View all accounts", "View all doctors", "View all secretaries" }));
        cmboxAccounts.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmboxAccountsItemStateChanged(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lblName.setText("Full Name");

        txtName.setEditable(false);
        txtName.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtName.setMaximumSize(new java.awt.Dimension(40, 249));
        txtName.setMinimumSize(new java.awt.Dimension(40, 249));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblAddress.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lblAddress.setText("Address");

        txtID.setEditable(false);
        txtID.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        txtID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        lblID.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lblID.setText("ID");

        txtAddress.setEditable(false);
        txtAddress.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        txtAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtAddress.setMaximumSize(new java.awt.Dimension(40, 249));
        txtAddress.setMinimumSize(new java.awt.Dimension(40, 249));
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        lstAccounts.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        lstAccounts.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstAccounts.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstAccountsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstAccounts);

        btnRemove.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        btnRemove.setText("Remove account");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                    .addComponent(cmboxAccounts, 0, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmboxAccounts, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAddress))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 589, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(54, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 600, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(94, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(188, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        new adminhome().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here
        if (!lstAccounts.isSelectionEmpty()){
            
            if (lstAccounts.getSelectedValue().startsWith("D")){
            doctor tempDr = data.doctors.get(lstAccounts.getSelectedIndex());
            
            for (doctor d : data.doctors){
            if (tempDr.getId().equals(d.getId())){
                data.doctors.remove(d);
                return;
            }
        }
           
        try {
            data.saveDoctors();
        } catch (Exception ex) {
            Logger.getLogger(adminremoveaccounts.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
            else if (lstAccounts.getSelectedValue().startsWith("S")){
            secretary tempSec = data.secretaries.get(lstAccounts.getSelectedIndex());
            
            for (secretary s : data.secretaries){
            if (tempSec.getId().equals(s.getId())){
                data.secretaries.remove(s);
                return;
            }
        }
           
        try {
            data.saveSecretaries();
        } catch (Exception ex) {
            Logger.getLogger(adminremoveaccounts.class.getName()).log(Level.SEVERE, null, ex);
        }
            }

        } 
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void cmboxAccountsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmboxAccountsItemStateChanged
        // TODO add your handling code here:
        lstAccounts.setSelectedIndex(-1);
        btnRemove.setEnabled(false);
        
        if (cmboxAccounts.getSelectedIndex() == 0){
   
        if (data.doctors.isEmpty() && data.secretaries.isEmpty()){
        String[] accountData = new String[1];
        accountData[0] = "No entries.";
        lstAccounts.setListData(accountData);
        }
        else{
            if (data.doctors.isEmpty()){
            String[] accountData = new String[data.secretaries.size()];
        int i = 0;
        for (secretary s : data.secretaries){
            accountData[i] = s.getId() + ", " + s.getSurname();
            i++;
        }
        lstAccounts.setListData(accountData);
            }
            else if (data.secretaries.isEmpty()){
            String[] accountData = new String[data.doctors.size()];
        int i = 0;
        
        for (doctor d : data.doctors){
            accountData[i] = d.getId() + ", " + d.getSurname();
            i++;
        }
        lstAccounts.setListData(accountData);
            }
            else{
             String[] accountData = new String[data.doctors.size() + data.secretaries.size()];
        int i = 0;
        
        for (doctor d : data.doctors){
            accountData[i] = d.getId() + ", " + d.getSurname();
            i++;
        }
        for (secretary s : data.secretaries){
            accountData[i] = s.getId() + ", " + s.getSurname();
            i++;
        }
        lstAccounts.setListData(accountData);
            }
       
        }
        }
        else if (cmboxAccounts.getSelectedIndex() == 1){
            
            if (!data.doctors.isEmpty()){
            String[] accountData = new String[data.doctors.size()];
            int i = 0;
        
            for (doctor d : data.doctors){
            accountData[i] = d.getId() + ", " + d.getSurname();
            i++;
            }
            lstAccounts.setListData(accountData);
            }
            else{
            String[] accountData = new String[1];
            accountData[0] = "No entries.";
            lstAccounts.setListData(accountData);
            }
        }
        else if (cmboxAccounts.getSelectedIndex() == 2){
            
            if (!data.secretaries.isEmpty()){
            String[] accountData = new String[data.secretaries.size()];
            int i = 0;
        
            for (secretary s : data.secretaries){
            accountData[i] = s.getId() + ", " + s.getSurname();
            i++;
        }
            lstAccounts.setListData(accountData);
            }
            else{
            String[] accountData = new String[1];
            accountData[0] = "No entries.";
            lstAccounts.setListData(accountData);
            }
        }
    }//GEN-LAST:event_cmboxAccountsItemStateChanged

    private void lstAccountsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstAccountsValueChanged
        // TODO add your handling code here:
        int index = lstAccounts.getSelectedIndex();
        
        if (lstAccounts.isSelectionEmpty() || "No entries.".equals(lstAccounts.getSelectedValue())){
        txtID.setText("");
        txtName.setText("");
        txtAddress.setText("");

        btnRemove.setEnabled(true);
        }
        else{
        if (cmboxAccounts.getSelectedIndex() == 0){
            
        btnRemove.setEnabled(true);
        
        if (lstAccounts.getSelectedValue().startsWith("D")){
        txtID.setText(data.doctors.get(index).getId());
        txtName.setText(data.doctors.get(index).getName() 
                        + " " + data.doctors.get(index).getSurname());
        txtAddress.setText(data.doctors.get(index).getAddress());
        }
        else{
        txtID.setText(data.secretaries.get(index-data.doctors.size()).getId());
        txtName.setText(data.secretaries.get(index-data.doctors.size()).getName() 
                        + " " + data.secretaries.get(index-data.doctors.size()).getSurname());
        txtAddress.setText(data.secretaries.get(index-data.doctors.size()).getAddress());
        }
        
        }
        else if (cmboxAccounts.getSelectedIndex() == 1){
        btnRemove.setEnabled(true);
        
        txtID.setText(data.doctors.get(index).getId());
        txtName.setText(data.doctors.get(index).getName() 
                        + " " + data.doctors.get(index).getSurname());
        txtAddress.setText(data.doctors.get(index).getAddress());
        }
        else if (cmboxAccounts.getSelectedIndex() == 2){
        btnRemove.setEnabled(true);
        
        txtID.setText(data.secretaries.get(index).getId());
        txtName.setText(data.secretaries.get(index).getName() 
                        + " " + data.secretaries.get(index).getSurname());
        txtAddress.setText(data.secretaries.get(index).getAddress());
        }
        }
    }//GEN-LAST:event_lstAccountsValueChanged

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
            java.util.logging.Logger.getLogger(adminremoveaccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminremoveaccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminremoveaccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminremoveaccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new adminremoveaccounts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemove;
    private javax.swing.JComboBox<String> cmboxAccounts;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JList<String> lstAccounts;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
