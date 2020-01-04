/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guis.secretarysystem;

import accounts.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import other.appointment;
import other.data;
import other.notification;

/**
 *
 * @author Alex Pritchard
 */
public class secretarymanageappointments extends javax.swing.JFrame {

    /**
     * Creates new form patientmedicalhistory
     */
    public secretarymanageappointments() {
        initComponents();
        
        if (!data.appointmentRequests.isEmpty()){
            String[] appointmentData = new String[data.appointmentRequests.size()];
            int i = 0;
        
            for (appointment a : data.appointmentRequests){
                appointmentData[i] = a.getPatient() + ", " + a.getDoctor();
                i++;
            }
            lstAppointments.setListData(appointmentData);
        }
        else{
            String[] appointmentData = new String[1];
            appointmentData[0] = "No entries.";
            
            lstAppointments.setListData(appointmentData);
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

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        btnBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblDoctor = new javax.swing.JLabel();
        txtDoctor = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        txtPatient = new javax.swing.JTextField();
        txtTime = new javax.swing.JTextField();
        lblPatient = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstAppointments = new javax.swing.JList<>();
        btnApprove = new javax.swing.JButton();
        btnCreateNewAppointment = new javax.swing.JButton();
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
        lblTitle.setText("Manage appointment requests");

        lblDoctor.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lblDoctor.setText("Doctor");

        txtDoctor.setEditable(false);
        txtDoctor.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        txtDoctor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDoctor.setMaximumSize(new java.awt.Dimension(40, 249));
        txtDoctor.setMinimumSize(new java.awt.Dimension(40, 249));
        txtDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorActionPerformed(evt);
            }
        });

        lblDate.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lblDate.setText("Date");

        lblTime.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lblTime.setText("Time");

        txtPatient.setEditable(false);
        txtPatient.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        txtPatient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientActionPerformed(evt);
            }
        });

        txtTime.setEditable(false);
        txtTime.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        txtTime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTime.setMaximumSize(new java.awt.Dimension(40, 249));
        txtTime.setMinimumSize(new java.awt.Dimension(40, 249));
        txtTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeActionPerformed(evt);
            }
        });

        lblPatient.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lblPatient.setText("Patient");

        txtDate.setEditable(false);
        txtDate.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        txtDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDate.setMaximumSize(new java.awt.Dimension(40, 249));
        txtDate.setMinimumSize(new java.awt.Dimension(40, 249));
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        lstAppointments.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        lstAppointments.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstAppointments.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstAppointmentsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstAppointments);

        btnApprove.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        btnApprove.setText("Approve appointment request");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnCreateNewAppointment.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        btnCreateNewAppointment.setText("Create new appointment");
        btnCreateNewAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateNewAppointmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDoctor, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblPatient, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblDate, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblTime, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPatient, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                                .addComponent(txtDoctor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTime, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCreateNewAppointment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPatient))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDoctor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTime))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                        .addComponent(btnCreateNewAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 339, Short.MAX_VALUE)
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
                    .addContainerGap(86, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(179, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        new secretaryhome().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorActionPerformed

    private void txtPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientActionPerformed

    private void txtTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimeActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here
        if (!lstAppointments.isSelectionEmpty()){
            
            data.appointments.add(data.appointmentRequests.get(lstAppointments.getSelectedIndex()));
            
            try {
                data.saveAppointments();
            } catch (Exception ex) {
                Logger.getLogger(secretarymanageappointments.class.getName()).log(Level.SEVERE, null, ex);
            }
            
//            for (doctor d : data.doctors){
//                if (d.getId().equals(data.appointmentRequests.get(lstAppointments.getSelectedIndex()).getDoctor())){
//                    notification tempNotif = new notification(d, 
//                        "You have a new appointment scheduled.");
//                    
//                    data.notifications.add(tempNotif);
//                
//                    try {
//                        data.saveNotifications();
//                    } catch (Exception ex) {
//                        Logger.getLogger(secretarymanageappointments.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                }
//                
//                return;
//            }
//            
//            for (patient p : data.patients){
//                if (p.getId().equals(data.appointmentRequests.get(lstAppointments.getSelectedIndex()).getPatient())){
//                    notification tempNotif = new notification(p, 
//                        "You have a new appointment scheduled.");
//                    
//                    data.notifications.add(tempNotif);
//                
//                    try {
//                        data.saveNotifications();
//                    } catch (Exception ex) {
//                        Logger.getLogger(secretarymanageappointments.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                }
//                
//                return;
//            }
            
            data.appointmentRequests.remove(data.appointmentRequests.get(lstAppointments.getSelectedIndex()));
            
            try {
                data.saveAppointmentRequests();
            } catch (Exception ex) {
                Logger.getLogger(secretarymanageappointments.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            this.setVisible(false);
            new secretarymanageappointments().setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, 
                            "Please select an appointment.", "" + "", 
                            JOptionPane.INFORMATION_MESSAGE);
            return;        
        }
    }//GEN-LAST:event_btnApproveActionPerformed

    private void lstAppointmentsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstAppointmentsValueChanged
        // TODO add your handling code here:
        int index = lstAppointments.getSelectedIndex();
        
        if (lstAppointments.isSelectionEmpty() || "No entries.".equals(lstAppointments.getSelectedValue())){
        txtPatient.setText("");
        txtDoctor.setText("");
        txtDate.setText("");
        txtTime.setText("");
        
        btnApprove.setEnabled(false);
        }
        else{
            txtPatient.setText(data.appointmentRequests.get(index).getPatient());
            txtDoctor.setText(data.appointmentRequests.get(index).getDoctor());
            txtDate.setText(data.appointmentRequests.get(index).getDate().substring(0, 10));
            txtTime.setText(data.appointmentRequests.get(index).getTime());
        
            btnApprove.setEnabled(true);
        }
    }//GEN-LAST:event_lstAppointmentsValueChanged

    private void btnCreateNewAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateNewAppointmentActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new secretarynewappointment().setVisible(true);
    }//GEN-LAST:event_btnCreateNewAppointmentActionPerformed

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
            java.util.logging.Logger.getLogger(secretarymanageappointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(secretarymanageappointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(secretarymanageappointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(secretarymanageappointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new secretarymanageappointments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateNewAppointment;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblPatient;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JList<String> lstAppointments;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDoctor;
    private javax.swing.JTextField txtPatient;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables
}