/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.NGOManager;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Complaint;
import Business.WorkQueue.HelpRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class NGOManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NGOManagerWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    DefaultTableModel dtm;
    UserAccount userAccount;
    Organization organization;
    int row, col;
    
    public NGOManagerWorkAreaJPanel(JPanel userProcessContainer,UserAccount userAccount, Organization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = organization;
        
        dtm = (DefaultTableModel) tblNgoManager.getModel();
        lblNgoManagerName.setText("Welcome Manager " + userAccount.getEmployee().getName() + ", please manage NGO Organization requests !!" );
        
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
        tblNgoManager = new javax.swing.JTable();
        lblNgoManagerName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAmmount = new javax.swing.JTextField();
        btnAccept = new javax.swing.JButton();
        btnSend = new javax.swing.JButton();
        btnDecline = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        tblNgoManager.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Resident Name", "Comments", "Amount", "Bank Account Number", "Status", "Request date", "Resolve date"
            }
        ));
        jScrollPane1.setViewportView(tblNgoManager);

        lblNgoManagerName.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblNgoManagerName.setForeground(new java.awt.Color(255, 51, 102));
        lblNgoManagerName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Total Amount");

        txtAmmount.setEditable(false);

        btnAccept.setBackground(new java.awt.Color(204, 255, 255));
        btnAccept.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnAccept.setText("  Accept");
        btnAccept.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        btnSend.setBackground(new java.awt.Color(204, 255, 255));
        btnSend.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnSend.setText("  Send Amount");
        btnSend.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        btnDecline.setBackground(new java.awt.Color(204, 255, 255));
        btnDecline.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnDecline.setText("  Decline");
        btnDecline.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDecline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeclineActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/suprajakosuri/Desktop/Supraja AED_Final_Git_/AED-final-project/Images/WhatsApp Image 2022-04-30 at 6.44.51 PM.jpeg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNgoManagerName, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2)
                        .addGap(110, 110, 110)
                        .addComponent(txtAmmount, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136)
                        .addComponent(btnDecline, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblNgoManagerName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAccept)
                    .addComponent(btnDecline))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAmmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSend))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(62, 62, 62))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        
      row = tblNgoManager.getSelectedRow();
        
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
        
        row = tblNgoManager.getSelectedRow();
        
        String currentStatus = dtm.getValueAt(row, 4).toString();

        if(currentStatus.equalsIgnoreCase("Request for money is Accepted"))
        {
            String amount = dtm.getValueAt(row, 2).toString();
        
            double amountasked = Double.parseDouble(amount);

            String ngoAmount = txtAmmount.getText();

            double ngoAmountInDouble = Double.parseDouble(ngoAmount);
            double finalAmount = ngoAmountInDouble-amountasked;

            this.organization.setNgoAvailableFunds((int) finalAmount);
            txtAmmount.setText(Double.toString(finalAmount));
        
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

    }//GEN-LAST:event_btnSendActionPerformed

    private void btnDeclineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeclineActionPerformed
        
        
        row = tblNgoManager.getSelectedRow();
        
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnDecline;
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNgoManagerName;
    private javax.swing.JTable tblNgoManager;
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
       
        System.out.println(organization.getNgoAvailableFunds());
        txtAmmount.setText(String.valueOf(this.organization.getNgoAvailableFunds()));
        
    }
  
}
