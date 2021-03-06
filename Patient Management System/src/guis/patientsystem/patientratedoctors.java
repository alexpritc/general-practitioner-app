/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Package and imports.
package guis.patientsystem;

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
public class patientratedoctors extends javax.swing.JFrame {

    /**
     * Creates new form patientratedoctors.
     */
    // Displays all of the doctors.
    public patientratedoctors() {
        initComponents();
        
        String[] accountData = new String[systemdatabase.doctors.size()];
        int i = 0;
        
        for (doctor d : systemdatabase.doctors){
            String name = d.getName();
            accountData[i] = "Dr " + name.charAt(0) + ". " + d.getSurname();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        lstDoctors = new javax.swing.JList<>();
        btnRate = new javax.swing.JButton();
        lblRating = new javax.swing.JLabel();
        txtRating = new javax.swing.JTextField();
        lblNewRating = new javax.swing.JLabel();
        txtNumberOfRates = new javax.swing.JTextField();
        txtNewRating = new javax.swing.JTextField();
        lblNumberOfRates = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtComment = new javax.swing.JTextArea();
        lblNumberOfRates1 = new javax.swing.JLabel();
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
        lblTitle.setText("Rate doctors");

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

        lstDoctors.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        lstDoctors.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstDoctors.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstDoctorsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstDoctors);

        btnRate.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        btnRate.setText("Rate Doctor");
        btnRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRateActionPerformed(evt);
            }
        });

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
        lblNewRating.setText("New Rating (/100)");

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

        txtNewRating.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N

        lblNumberOfRates.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lblNumberOfRates.setText("Number of Rates");

        txtComment.setColumns(20);
        txtComment.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        txtComment.setRows(5);
        jScrollPane2.setViewportView(txtComment);

        lblNumberOfRates1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lblNumberOfRates1.setText("Comment:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNewRating)
                        .addGap(18, 18, 18)
                        .addComponent(txtNewRating, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                        .addComponent(btnRate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(119, 119, 119)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblName)
                                .addComponent(lblID))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                                .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(lblNumberOfRates1)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblNumberOfRates)
                                .addComponent(lblRating))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNumberOfRates, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                                .addComponent(txtRating, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
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
                            .addComponent(lblRating)
                            .addComponent(txtRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumberOfRates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumberOfRates))
                        .addGap(36, 36, 36)
                        .addComponent(lblNumberOfRates1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNewRating, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnRate, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNewRating))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 678, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
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
                    .addContainerGap(95, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(166, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Takes the patient back to their homepage.
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new patienthome().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    // Rates a doctor and saves this rating.
    private void btnRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRateActionPerformed
        // TODO add your handling code here
        if (!lstDoctors.isSelectionEmpty()){
            
            if (txtComment.getText() != null && txtNewRating.getText() != null){
                
                if (isInteger(txtNewRating.getText())){
                    
                    int newRating = Integer.parseInt(txtNewRating.getText());
                    if (newRating >= 0 && newRating <= 100){
                        
                        String numberOfRates = systemdatabase.doctors.get((lstDoctors.getSelectedIndex())).getNumberOfRates();
                        int noOfRates = Integer.parseInt(numberOfRates);
                        noOfRates++;
                        numberOfRates = Integer.toString(noOfRates);
                
                        systemdatabase.doctors.get((lstDoctors.getSelectedIndex())).setNumberOfRates(numberOfRates);
                
                        String rating = systemdatabase.doctors.get((lstDoctors.getSelectedIndex())).getRating();
                        float fRating = Float.parseFloat(rating);
                        fRating = fRating + newRating;
                        rating = Float.toString(fRating);
              
                        systemdatabase.doctors.get((lstDoctors.getSelectedIndex())).setRating(rating);
                        
                        String comment = txtComment.getText();
                        char[] splitComment = new char[comment.length()];
                        
                        for (int i = 0; i < comment.length(); i++){
                            if (!(comment.charAt(i) == '\n')){
                                splitComment[i] = comment.charAt(i);
                            }
                        }
                        comment = systemdatabase.doctors.get((lstDoctors.getSelectedIndex())).getId();
                        
                        for (char c : splitComment){
                            comment += c;
                        }
                        
                        try {
                            systemdatabase.saveFeedback(comment);
                        } catch (Exception ex) {
                            Logger.getLogger(patientratedoctors.class.getName()).log(Level.SEVERE, null, ex);
                        }
               
                        try {
                            systemdatabase.saveDoctors();
                        } catch (Exception ex) {
                            Logger.getLogger(patientratedoctors.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        txtComment.setText("");
                        txtNewRating.setText("");
                        float total = Float.parseFloat(systemdatabase.doctors.get(
                                lstDoctors.getSelectedIndex()).getRating()) 
                                / Float.parseFloat(systemdatabase.doctors.get(
                                lstDoctors.getSelectedIndex()).getNumberOfRates());
                        txtRating.setText(Float.toString(total));
                        txtNumberOfRates.setText(systemdatabase.doctors.get(lstDoctors.getSelectedIndex()).getNumberOfRates());
                        
                        notification newNotif = new notification(1, "New patient feedback.");
                        systemdatabase.notifications.add(newNotif);
            
                        try {
                        systemdatabase.saveNotifications();
                        } catch (Exception ex) {
                            Logger.getLogger(patientratedoctors.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }                      
                    else{
                        JOptionPane.showMessageDialog(null, 
                            "Please enter an integer between 0 and 100", "" + "", 
                            JOptionPane.INFORMATION_MESSAGE);
                    return;
                    }

                }
                else{
                     JOptionPane.showMessageDialog(null, 
                            "Please enter an integer between 0 and 100", "" + "", 
                            JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
            else{
                JOptionPane.showMessageDialog(null, 
                            "Please enter a comment and rating (out of 100).", "" + "", 
                            JOptionPane.INFORMATION_MESSAGE);
                    return;
            }
        }
    }//GEN-LAST:event_btnRateActionPerformed

    // Updates the on screen information to that of the selected doctor.
    private void lstDoctorsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstDoctorsValueChanged
        // TODO add your handling code here:
        int index = lstDoctors.getSelectedIndex();
        txtComment.setText("");
        txtNewRating.setText("");      
        
        if (lstDoctors.isSelectionEmpty() || "No entries.".equals(lstDoctors.getSelectedValue())){
        txtID.setText("");
        txtName.setText("");
        txtRating.setText("");
        txtNumberOfRates.setText("");

        btnRate.setEnabled(false);
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

        btnRate.setEnabled(true);
        }
        
    }//GEN-LAST:event_lstDoctorsValueChanged

    private void txtRatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRatingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRatingActionPerformed

    private void txtNumberOfRatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberOfRatesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberOfRatesActionPerformed

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
            java.util.logging.Logger.getLogger(patientratedoctors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(patientratedoctors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(patientratedoctors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(patientratedoctors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new patientratedoctors().setVisible(true);
            }
        });
    }
    
    // A method that returns true if the inputted string is also an integer.
    public static boolean isInteger(String s) {
    try { 
        Integer.parseInt(s); 
    } catch(NumberFormatException e) { 
        return false; 
    } catch(NullPointerException e) {
        return false;
    }
    // Only got here if we didn't return false.
    return true;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRate;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNewRating;
    private javax.swing.JLabel lblNumberOfRates;
    private javax.swing.JLabel lblNumberOfRates1;
    private javax.swing.JLabel lblRating;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JList<String> lstDoctors;
    private javax.swing.JTextArea txtComment;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNewRating;
    private javax.swing.JTextField txtNumberOfRates;
    private javax.swing.JTextField txtRating;
    // End of variables declaration//GEN-END:variables
}
