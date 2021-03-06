/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Package and imports.
package guis.adminsystem;

import accounts.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import other.systemdatabase;
import other.notification;

/**
 *
 * @author Alex Pritchard
 */
public class admincontactdoctors extends javax.swing.JFrame {

    /**
     * Creates new form admincontactdoctors
     */
    // Fills the list with doctors immediately after the components have been
    // initialised.
    public admincontactdoctors() {
        initComponents();

        String[] accountData = new String[systemdatabase.doctors.size()];
        int i = 0;
        
        for (doctor d : systemdatabase.doctors){
            accountData[i] = d.getId() + ". " + d.getSurname();
            i++;
        }
        lstDoctors.setListData(accountData);
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
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        lblRating = new javax.swing.JLabel();
        txtRating = new javax.swing.JTextField();
        lblNewRating = new javax.swing.JLabel();
        txtNumberOfRates = new javax.swing.JTextField();
        txtMessage = new javax.swing.JTextField();
        lblNumberOfRates = new javax.swing.JLabel();
        lblComments = new javax.swing.JLabel();
        btnSend = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstDoctors = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstComments = new javax.swing.JList<>();
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
        lblTitle.setText("Contact doctors");

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

        lblRating.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lblRating.setText("Rating");

        txtRating.setEditable(false);
        txtRating.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        txtRating.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtRating.setMaximumSize(new java.awt.Dimension(40, 249));
        txtRating.setMinimumSize(new java.awt.Dimension(40, 249));
        txtRating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRatingActionPerformed(evt);
            }
        });

        lblNewRating.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lblNewRating.setText("Message:");

        txtNumberOfRates.setEditable(false);
        txtNumberOfRates.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        txtNumberOfRates.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNumberOfRates.setMaximumSize(new java.awt.Dimension(40, 249));
        txtNumberOfRates.setMinimumSize(new java.awt.Dimension(40, 249));
        txtNumberOfRates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberOfRatesActionPerformed(evt);
            }
        });

        txtMessage.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N

        lblNumberOfRates.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lblNumberOfRates.setText("Number of Rates");

        lblComments.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lblComments.setText("Comments");

        btnSend.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        lstDoctors.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        lstDoctors.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstDoctors.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstDoctorsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstDoctors);

        lstComments.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        lstComments.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstComments.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstCommentsValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstComments);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(590, 590, 590)
                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNewRating)
                            .addComponent(lblNumberOfRates)
                            .addComponent(lblID)
                            .addComponent(lblComments))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtNumberOfRates, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblRating))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblName)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRating, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2)
                                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblID))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblName)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblRating))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblNumberOfRates)
                                .addComponent(txtNumberOfRates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblComments))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNewRating)
                            .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle))
                .addGap(0, 44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Takes the admin back to their home page.
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

    // Sends a message (and potentially also a comment by a patient) to the
    // relevent doctor.
    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here
        if (!lstDoctors.isSelectionEmpty()){
            
            String message; 
            
            if (txtMessage.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, 
                            "Please enter a message to send.", "" + "", 
                            JOptionPane.INFORMATION_MESSAGE);
                    return;
            }
            else{
                if (lstComments.isSelectionEmpty()){
                    message = systemdatabase.doctors.get(lstDoctors.getSelectedIndex()).getId()
                            + " " + txtMessage.getText();
                }
                else{
                    message = systemdatabase.doctors.get(lstDoctors.getSelectedIndex()).getId()
                            + " '" + lstComments.getSelectedValue() + "': " + txtMessage.getText();
                }
                
                try {
                    systemdatabase.saveMessage(message);
                } catch (Exception ex) {
                    Logger.getLogger(admincontactdoctors.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                notification tempNotif = new notification(systemdatabase.doctors.get(lstDoctors.getSelectedIndex()), 
                        "You have a new message from an Admin.");
                
                systemdatabase.notifications.add(tempNotif);
                
                try {
                    systemdatabase.saveNotifications();
                } catch (Exception ex) {
                    Logger.getLogger(admincontactdoctors.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
        else{
                JOptionPane.showMessageDialog(null, 
                            "Please select a doctor to send the message to.", "" + "", 
                            JOptionPane.INFORMATION_MESSAGE);
                    return;
            }
    }//GEN-LAST:event_btnSendActionPerformed

    // Updates all of the information on screen to match the selected Doctor.
    private void lstDoctorsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstDoctorsValueChanged
        // TODO add your handling code here:
        int index = lstDoctors.getSelectedIndex();
        txtMessage.setText("");      
        
        if (lstDoctors.isSelectionEmpty() || "No entries.".equals(lstDoctors.getSelectedValue())){
        txtID.setText("");
        txtName.setText("");
        txtRating.setText("");
        txtNumberOfRates.setText("");

        btnSend.setEnabled(false);
        }
        else{
        txtID.setText(systemdatabase.doctors.get(index).getId());
        txtName.setText(systemdatabase.doctors.get(index).getName() + " " + systemdatabase.doctors.get(index).getSurname());
        
        if (!"0".equals(systemdatabase.doctors.get(index).getRating())){
            float total = Float.parseFloat(systemdatabase.doctors.get(
                                lstDoctors.getSelectedIndex()).getRating()) 
                                / Float.parseFloat(systemdatabase.doctors.get(
                                lstDoctors.getSelectedIndex()).getNumberOfRates());
            txtRating.setText(Float.toString(total));
        }
        else{
        txtRating.setText("0");
        }

        txtNumberOfRates.setText(systemdatabase.doctors.get(index).getNumberOfRates());

        btnSend.setEnabled(true);
        
        
        if (systemdatabase.feedback.isEmpty()){
            String[] commentData = new String[1];
            commentData[0] = "No entries.";
            lstComments.setListData(commentData);
        }
        else{
            
            String[] commentData = new String[systemdatabase.feedback.size()];
            int i = 0;
            for (Object o : systemdatabase.feedback){
                String comment = o.toString();
                
                if (comment.startsWith(systemdatabase.doctors.get(index).getId())){
                    String newComment = comment.substring(5);
                    commentData[i] = newComment;
                    i++;
                }
            }
            lstComments.setListData(commentData);
        }
        }
        
    }//GEN-LAST:event_lstDoctorsValueChanged

    private void txtRatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRatingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRatingActionPerformed

    private void txtNumberOfRatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberOfRatesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberOfRatesActionPerformed

    private void lstCommentsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstCommentsValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_lstCommentsValueChanged

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
            java.util.logging.Logger.getLogger(admincontactdoctors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admincontactdoctors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admincontactdoctors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admincontactdoctors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admincontactdoctors().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSend;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblComments;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNewRating;
    private javax.swing.JLabel lblNumberOfRates;
    private javax.swing.JLabel lblRating;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JList<String> lstComments;
    private javax.swing.JList<String> lstDoctors;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumberOfRates;
    private javax.swing.JTextField txtRating;
    // End of variables declaration//GEN-END:variables
}
