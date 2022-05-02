/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.CommunityResident;

import Business.Network.Network;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author adepu
 */
public class CommunityResidentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CommunityResident
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Network network;
    
    public CommunityResidentJPanel(JPanel userProcessContainer, UserAccount userAccount, Network network) {
        initComponents();
        this.userAccount = userAccount;
        this.network = network;
        this.userProcessContainer = userProcessContainer;
        lblResident.setText("Hello, "+userAccount.getResident().getName()+" !!");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnutcomplaint = new javax.swing.JButton();
        btnemereq = new javax.swing.JButton();
        btnstatuscheck = new javax.swing.JButton();
        btnutcomplaint2 = new javax.swing.JButton();
        lblResident = new javax.swing.JLabel();

        btnutcomplaint.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnutcomplaint.setText("UTILITY COMPLAINT");
        btnutcomplaint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnutcomplaintActionPerformed(evt);
            }
        });

        btnemereq.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnemereq.setText("SAFETY REQUEST");
        btnemereq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnemereqActionPerformed(evt);
            }
        });

        btnstatuscheck.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnstatuscheck.setText("STATUS CHECK");
        btnstatuscheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstatuscheckActionPerformed(evt);
            }
        });

        btnutcomplaint2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnutcomplaint2.setText("HELP REQUEST");
        btnutcomplaint2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnutcomplaint2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(275, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnutcomplaint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnemereq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnstatuscheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnutcomplaint2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(219, 219, 219))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(lblResident, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(lblResident, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnutcomplaint)
                .addGap(55, 55, 55)
                .addComponent(btnemereq)
                .addGap(59, 59, 59)
                .addComponent(btnutcomplaint2)
                .addGap(65, 65, 65)
                .addComponent(btnstatuscheck)
                .addContainerGap(163, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnutcomplaintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnutcomplaintActionPerformed
        // TODO add your handling code here:
        UtilityComplaintJPanel utilityComplaintJPanel =new UtilityComplaintJPanel(userProcessContainer,userAccount, network);
        userProcessContainer.add("UtilityComplaintJPanel",utilityComplaintJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnutcomplaintActionPerformed

    private void btnemereqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnemereqActionPerformed
        // TODO add your handling code here:
        System.out.println(network + "boom");
       SafetyRequestJPanel safetyRequestJPanel =new SafetyRequestJPanel(userProcessContainer,userAccount, network);
        userProcessContainer.add("SafetyRequestJPanel",safetyRequestJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnemereqActionPerformed

    private void btnutcomplaint2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnutcomplaint2ActionPerformed
        // TODO add your handling code here:
         System.out.println(network + "boom");
        HelpRequestJpanel helpRequestJPanel = new HelpRequestJpanel(userProcessContainer,userAccount, network);
        userProcessContainer.add("helpRequestJPanel",helpRequestJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnutcomplaint2ActionPerformed

    private void btnstatuscheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstatuscheckActionPerformed
        // TODO add your handling code here
         ResidentStatusCheckJPanel  residentStatusCheckJPanel = new  ResidentStatusCheckJPanel(userProcessContainer,userAccount, network);
        userProcessContainer.add("residentCheckStatusJPanel", residentStatusCheckJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnstatuscheckActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnemereq;
    private javax.swing.JButton btnstatuscheck;
    private javax.swing.JButton btnutcomplaint;
    private javax.swing.JButton btnutcomplaint2;
    private javax.swing.JLabel lblResident;
    // End of variables declaration//GEN-END:variables
}