/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.GovernmentOrganizationManager;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HelpRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class GovernmentOrganizationManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form GovernmentOrganizationManagerWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    DefaultTableModel dtm;
    UserAccount userAccount;
    Organization organization;
    int row, col;
    public GovernmentOrganizationManagerWorkAreaJPanel(JPanel userProcessContainer,UserAccount userAccount, Organization organization, Enterprise enterprise) {
        initComponents();
       
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = organization;
        
        dtm = (DefaultTableModel) tblGovernmentManager.getModel();
        lblGovManagerName.setText("Welcome Manager" + userAccount.getEmployee().getName()+" , please manage government organization requests!! ");
        
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

        lblGovManagerName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAmmount = new javax.swing.JTextField();
        btnAccept = new javax.swing.JButton();
        btnSend = new javax.swing.JButton();
        btnDecline = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGovernmentManager = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        lblGovManagerName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblGovManagerName.setForeground(new java.awt.Color(255, 51, 102));
        lblGovManagerName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Total Amount");

        txtAmmount.setEditable(false);
        txtAmmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmmountActionPerformed(evt);
            }
        });

        btnAccept.setBackground(new java.awt.Color(204, 255, 255));
        btnAccept.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnAccept.setText("  Accept ");
        btnAccept.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        btnSend.setBackground(new java.awt.Color(204, 255, 255));
        btnSend.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnSend.setText(" Send Amount");
        btnSend.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        btnDecline.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnDecline.setText("  Decline");
        btnDecline.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDecline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeclineActionPerformed(evt);
            }
        });

        tblGovernmentManager.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Resident Name", "Comments", "Amount", "Bank Account Number", "Status", "Request date", "Resolve date"
            }
        ));
        jScrollPane1.setViewportView(tblGovernmentManager);

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/suprajakosuri/Desktop/Supraja AED_Final_Git_/AED-final-project/Images/WhatsApp Image 2022-04-30 at 6.13.34 PM.jpeg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGovManagerName, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(btnDecline, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel2)
                        .addGap(111, 111, 111)
                        .addComponent(txtAmmount, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 941, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1117, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAccept, btnDecline});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblGovManagerName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDecline))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAmmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAccept, btnDecline});

    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:

        row = tblGovernmentManager.getSelectedRow();

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

    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:

        row = tblGovernmentManager.getSelectedRow();

        
        
        row = tblGovernmentManager.getSelectedRow();

        String currentStatus = dtm.getValueAt(row, 4).toString();

        if(currentStatus.equalsIgnoreCase("Request for money is Accepted"))
        {
            String amount = dtm.getValueAt(row, 2).toString();

            double amountasked = Double.parseDouble(amount);

            String ngoAmount = txtAmmount.getText();

            double ngoAmountInDouble = Double.parseDouble(ngoAmount);
            double finalAmount = ngoAmountInDouble-amountasked;

            this.organization.setAvailableFunds((int) finalAmount);
            txtAmmount.setText(Double.toString(finalAmount));
            organization.getWorkQueue().getListOfWorkQueues().get(row).setStatus("Money sent successfully");
            organization.getWorkQueue().getListOfWorkQueues().get(row).setResolveDate(new Date());

            JOptionPane.showMessageDialog(this, "Money sent successfully", "Money Sent", 1);
        }
        
        else if(currentStatus.equalsIgnoreCase("Amount request Declined")){

            JOptionPane.showMessageDialog(this, "This request is Already declined earlier", " Complaint declined", 1);

        }
        else 
        {
            JOptionPane.showMessageDialog(this, "Money already sent", " Already sent", 1);
        }
        
        PopulateTable();

    }//GEN-LAST:event_btnSendActionPerformed

    private void btnDeclineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeclineActionPerformed

        row = tblGovernmentManager.getSelectedRow();

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
    }//GEN-LAST:event_btnDeclineActionPerformed

    private void txtAmmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmmountActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnDecline;
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGovManagerName;
    private javax.swing.JTable tblGovernmentManager;
    private javax.swing.JTextField txtAmmount;
    // End of variables declaration//GEN-END:variables

    private void PopulateTable() {
        dtm.setRowCount(0);
        
        WorkQueue workQueue = organization.getWorkQueue();
        
        for(WorkRequest workRequest  : workQueue.getListOfWorkQueues() ){
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
        
        txtAmmount.setText(String.valueOf(this.organization.getAvailableFunds()));
        
    }
    
}
