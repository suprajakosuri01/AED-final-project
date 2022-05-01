/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.GovernmentEmployee;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HelpRequest;
import Business.WorkQueue.WorkAppeal;
import Business.WorkQueue.WorkQueue;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vivek
 */
public class GovernmentManagerJpanel extends javax.swing.JPanel {

    /**
     * Creates new form GovernmentManagerJpanel
     */
     JPanel userProcessContainer;
    Enterprise enterprise;
    DefaultTableModel dtm;
    UserAccount userAccount;
    Organization organization;
    int row, col;
    
    public GovernmentManagerJpanel(JPanel userProcessContainer,UserAccount userAccount, Organization organization, Enterprise enterprise) {
        initComponents();
    this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = organization;
        
        dtm = (DefaultTableModel) tblGovtmgr.getModel();
        lbgovtname.setText("Welcome Manager" + userAccount.getEmployee().getName()+" , please manage government organization requests!! ");
        
        PopulateTable();
        populateAmountField();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblGovtmgr = new javax.swing.JTable();
        lbgovtname = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtamm = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        tblGovtmgr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Resident Name", "Comments", "Ammount", "Bank Account Number", "Status", "Request Date", "Resolve Date"
            }
        ));
        jScrollPane1.setViewportView(tblGovtmgr);

        lbgovtname.setText("jLabel1");

        jButton1.setText("Accept");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Decline");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Send Ammount");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter Ammount");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(56, 56, 56)
                                .addComponent(txtamm, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(82, 82, 82)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(lbgovtname, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(lbgovtname, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtamm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         row = tblGovtmgr.getSelectedRow();

        String currentStatus = dtm.getValueAt(row, 4).toString();

        if(currentStatus.equalsIgnoreCase("Amount requested"))
        {

            organization.getWorkQueue().getListOfWorkQueues().get(row).setStatus("Request for money is Accepted");

            JOptionPane.showMessageDialog(this, "Money request is Accepted", " money request Accepted", 1);

        }

        else if(currentStatus.equalsIgnoreCase("Amount request Declined")){

            JOptionPane.showMessageDialog(this, "This request is Already declined earlier", " Complaint declined", 1);

        }
        else{
            JOptionPane.showMessageDialog(this, "Amount request is already accepted", " amount request Accepted", 1);

        }
        PopulateTable();

                                          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         row = tblGovtmgr.getSelectedRow();

        String currentStatus = dtm.getValueAt(row, 4).toString();

        if(currentStatus.equalsIgnoreCase("Amount requested"))
        {

            organization.getWorkQueue().getListOfWorkQueues().get(row).setStatus("Amount request Declined");

            JOptionPane.showMessageDialog(this, "Money request is Declined", " money request declined", 1);

        }

        else if(currentStatus.equalsIgnoreCase("Amount request Declined")){

            JOptionPane.showMessageDialog(this, "This request is Already declined earlier", " Complaint declined", 1);

        }
        else{
            JOptionPane.showMessageDialog(this, "Amount request is already accepted", " amount request Accepted", 1);

        }
        PopulateTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         row = tblGovtmgr.getSelectedRow();

        
        
        row = tblGovtmgr.getSelectedRow();

        String currentStatus = dtm.getValueAt(row, 4).toString();

        if(currentStatus.equalsIgnoreCase("Request for money is Accepted"))
        {
            String amount = dtm.getValueAt(row, 2).toString();

            double amountasked = Double.parseDouble(amount);

            String ngoAmount = txtamm.getText();

            double ngoAmountInDouble = Double.parseDouble(ngoAmount);
            double finalAmount = ngoAmountInDouble-amountasked;

            this.organization.setAvailableFunds((int) finalAmount);
            txtamm.setText(Double.toString(finalAmount));
            organization.getWorkQueue().getListOfWorkQueues().get(row).setStatus("Money sent successfully");
            organization.getWorkQueue().getListOfWorkQueues().get(row).setResolveDate(new Date());

            JOptionPane.showMessageDialog(this, "Money sent successfully", "Money Sent", 1);
        }
        
        else if (currentStatus.equalsIgnoreCase("Money sent sucessfully"))
        {
            JOptionPane.showMessageDialog(this, "Money already sent", " Already sent", 1);
        }

        else if(currentStatus.equalsIgnoreCase("Amount request Declined")){

            JOptionPane.showMessageDialog(this, "This request is Already declined earlier", " Complaint declined", 1);

        }
        
        PopulateTable();

                                          
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbgovtname;
    private javax.swing.JTable tblGovtmgr;
    private javax.swing.JTextField txtamm;
    // End of variables declaration//GEN-END:variables




 private void PopulateTable() {
        dtm.setRowCount(0);
        
        WorkQueue workQueue = organization.getWorkQueue();
        
        for(WorkAppeal workRequest  : workQueue.getListOfWorkQueues() ){
            HelpRequest helpRequest = (HelpRequest) workRequest;

            Date date = null;
            if(helpRequest.getStatus().equalsIgnoreCase("Money sent successfully")) {
                  date = helpRequest.getResolveDate();
            }

            Object[] objs = {helpRequest.getSender().getResident().getName(), helpRequest.getHelpComments(), helpRequest.getAmount(), helpRequest.getAccountNumber(), helpRequest.getStatus(), helpRequest.getRequestDate(),helpRequest.getResolveDate()};
            dtm.addRow(objs);
            
        }
       
    }

    private void populateAmountField() {
        
        txtamm.setText(String.valueOf(this.organization.getAvailableFunds()));
        
    }}