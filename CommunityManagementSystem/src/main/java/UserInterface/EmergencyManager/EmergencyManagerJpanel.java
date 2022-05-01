/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.EmergencyManager;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.GrievanceManagement;
import Business.Organization.Organization;
import Business.Role.DoctorRole;
import Business.Role.FireControlEmployeeRole;
import Business.Role.FireControlManagerRole;
import Business.Role.HospitalManagerRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Complaint;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class EmergencyManagerJpanel extends javax.swing.JPanel {

    /**
     * Creates new form EmergencyManagerJpanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Organization organization;
    DefaultTableModel dtm;
    int row,col;
    public EmergencyManagerJpanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization ) {
        initComponents();
        this.userProcessContainer= userProcessContainer;
        this.userAccount = userAccount;
        this.organization = organization;
        
        lblOrgName.setText(userAccount.getEmployee().getOrg());
        lblmanagerName.setText("Welcome Manager " + userAccount.getEmployee().getName()+", please manage residents requests");
        dtm = (DefaultTableModel) tblEmergencyOrganization.getModel();
        populateTable();
        displayEmployes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOrgName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmergencyOrganization = new javax.swing.JTable();
        btnAccept = new javax.swing.JButton();
        btnDecline = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        comboEmergencyEmploye = new javax.swing.JComboBox();
        btnAssign = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblmanagerName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        lblOrgName.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblOrgName.setForeground(new java.awt.Color(255, 51, 102));
        lblOrgName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tblEmergencyOrganization.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Resident Name", "Priority", "Message", "Status", "Employee", "Request Date", "Resolve Date"
            }
        ));
        jScrollPane1.setViewportView(tblEmergencyOrganization);

        btnAccept.setBackground(new java.awt.Color(204, 255, 255));
        btnAccept.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnAccept.setText("  Accept Request");
        btnAccept.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        btnDecline.setBackground(new java.awt.Color(204, 255, 255));
        btnDecline.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnDecline.setText("  Decline Request");
        btnDecline.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDecline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeclineActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Assign Employee");

        comboEmergencyEmploye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEmergencyEmployeActionPerformed(evt);
            }
        });

        btnAssign.setBackground(new java.awt.Color(204, 255, 255));
        btnAssign.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnAssign.setText("Assign");
        btnAssign.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("/Users/suprajakosuri/Desktop/Supraja AED_Final_Git_/AED-final-project/Images/icons8-go-back-48.png")); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblmanagerName.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblmanagerName.setForeground(new java.awt.Color(255, 51, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/suprajakosuri/Desktop/Supraja AED_Final_Git_/AED-final-project/Images/WhatsApp Image 2022-04-30 at 5.19.18 PM.jpeg")); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(465, 465, 465))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(lblOrgName, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(btnDecline, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblmanagerName, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 929, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(comboEmergencyEmploye, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(247, 523, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAccept, btnDecline});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOrgName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblmanagerName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDecline))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboEmergencyEmploye, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAccept, btnDecline});

    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        
        row = tblEmergencyOrganization.getSelectedRow();
        
        String currentStatus = dtm.getValueAt(row, 3).toString();
        
        if(currentStatus.equalsIgnoreCase("Complaint raised"))
        {

            organization.getWorkQueue().getListOfWorkQueues().get(row).setStatus("Complaint Accepted");
            
          
            JOptionPane.showMessageDialog(this, "Complaint is Accepted", " Complaint Accepted", 1);
           
        }
        
        else if(currentStatus.equalsIgnoreCase("Complaint Declined")){
            
            JOptionPane.showMessageDialog(this, "This complaint is Already declined earlier", " Complaint declined", 1);
            
            
        }
        else{
            JOptionPane.showMessageDialog(this, "Complaint is already accepted", " Complaint Accepted", 1);
            
        }
        populateTable();
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnDeclineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeclineActionPerformed
        // TODO add your handling code here:
        
        row = tblEmergencyOrganization.getSelectedRow();
        String currentStatus = dtm.getValueAt(row, 3).toString();
        if(currentStatus.equalsIgnoreCase("Complaint raised"))
        {
            userAccount.getWorkQueue().getListOfWorkQueues().get(row).setStatus("Comlplaint Declined");
            
        }
         else if(currentStatus.equalsIgnoreCase("Complaint Declined")){
            
            JOptionPane.showMessageDialog(this, "This complaint is Already declined earlier", " Complaint declined", 1);
            
            
        }
        else{
            JOptionPane.showMessageDialog(this, "Complaint is already accepted", " Complaint Accepted", 1);
            
        }
        populateTable();
    }//GEN-LAST:event_btnDeclineActionPerformed

    private void comboEmergencyEmployeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEmergencyEmployeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEmergencyEmployeActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        
        UserAccount emergencyEmployee = (UserAccount) comboEmergencyEmploye.getSelectedItem();
        
        if(emergencyEmployee.isEmployeeBusy())
        {
            JOptionPane.showMessageDialog(this, "Selected employee is busy please select other employee.", " Complaint not assigned", 1);
            return;
        }
        
        row = tblEmergencyOrganization.getSelectedRow();
        String currentStatus = dtm.getValueAt(row, 3).toString();
        
        Complaint complaint = (Complaint) organization.getWorkQueue().getListOfWorkQueues().get(row);
        
        if(!currentStatus.equalsIgnoreCase("Complaint Accepted"))
        {

            JOptionPane.showMessageDialog(this, "Please accept complaint to assign", " Complaint not accepted", 1);
            return;
        }
        
        if(currentStatus.equalsIgnoreCase("Complaint Accepted"))
        {

            organization.getWorkQueue().getListOfWorkQueues().get(row).setStatus("Assigned Employee");
            
          
            JOptionPane.showMessageDialog(this, "Complaint is Accepted and assigned to respective Employee", " Complaint is forwarded to employee", 1);
           
        }
        
        else if(currentStatus.equalsIgnoreCase("Complaint Declined")){
            
            JOptionPane.showMessageDialog(this, "This complaint is Already declined earlier", " Complaint declined", 1);
            
            
        }
        else{
            JOptionPane.showMessageDialog(this, "Complaint is already Assigend to Employee", " Complaint Accepted", 1);
            
        }
        
        userAccount.getWorkQueue().addWorkRequest(complaint);
        
        
        complaint.setReceiver(emergencyEmployee);
        complaint.setStatus("Assigned to Employee");
        emergencyEmployee.getWorkQueue().addWorkRequest(complaint);
        populateTable();

    }//GEN-LAST:event_btnAssignActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnDecline;
    private javax.swing.JComboBox comboEmergencyEmploye;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOrgName;
    private javax.swing.JLabel lblmanagerName;
    private javax.swing.JTable tblEmergencyOrganization;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        dtm.setRowCount(0);
  
        WorkQueue workQueue = organization.getWorkQueue();
        
        for(WorkRequest workRequest  : workQueue.getListOfWorkQueues() ){
            Complaint complaint = (Complaint) workRequest;
            
            String receiver = "Not yet Assigned";
            if( complaint.getReceiver() != null)
                receiver = complaint.getReceiver().getEmployee().getName();
            
            Date date = null;
            if(complaint.getStatus().equalsIgnoreCase("Complaint Resolved")) {
                  date = complaint.getResolveDate();
            }
            
            Object[] objs = {complaint.getSender().getResident().getName(),complaint.getPriority(), complaint.getMessage(), complaint.getStatus(),receiver, complaint.getRequestDate(),date};
            dtm.addRow(objs);
            
        }
    }

    private void displayEmployes() {
         
                for(UserAccount userAccount : organization.getUserAccountDirectory().getUserAccountList()){
                    if (userAccount.getRole() instanceof FireControlEmployeeRole) comboEmergencyEmploye.addItem(userAccount);
                    else if (userAccount.getRole() instanceof DoctorRole) comboEmergencyEmploye.addItem(userAccount);
            }
        
  
        }
}       
    
    
    
        

