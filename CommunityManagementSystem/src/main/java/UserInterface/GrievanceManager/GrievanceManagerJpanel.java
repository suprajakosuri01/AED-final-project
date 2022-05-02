/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.GrievanceManager;

import Business.Employee.Employee;
import Business.Organization.Organization;
import Business.Role.GarbageRemovalManRole;
import Business.Role.PoliceManRole;
import Business.Role.StreetLightingMaintenanceEmpRole;
import Business.Role.WaterSupplierRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Complaint;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class GrievanceManagerJpanel extends javax.swing.JPanel {

    /**
     * Creates new form GrievanceManagerJpanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Organization organization;
    DefaultTableModel dtm;
    int row,col;
    public GrievanceManagerJpanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.organization = organization;
        lblGrievenceManager.setText(userAccount.getEmployee().getOrg());
        lblManager.setText("Welcome Manager " + userAccount.getEmployee().getName() + ", please manage resident requests !!");
        dtm = (DefaultTableModel) tblOrganizationManager.getModel();
        displayEmployes();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        comboGrievanceEmploye = new javax.swing.JComboBox();
        lblGrievenceManager = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrganizationManager = new javax.swing.JTable();
        btnAcceptRequest = new javax.swing.JButton();
        btnDeclineRequest = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblManager = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Assign Employee");

        lblGrievenceManager.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblGrievenceManager.setForeground(new java.awt.Color(255, 51, 102));
        lblGrievenceManager.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGrievenceManager.setText(" ");

        tblOrganizationManager.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Resident Name", "Priority", "Message", "Status", "Employee", "Request Date", "Resolve Date"
            }
        ));
        tblOrganizationManager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrganizationManagerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOrganizationManager);

        btnAcceptRequest.setBackground(new java.awt.Color(204, 255, 255));
        btnAcceptRequest.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnAcceptRequest.setText("  Accept Request");
        btnAcceptRequest.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAcceptRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptRequestActionPerformed(evt);
            }
        });

        btnDeclineRequest.setBackground(new java.awt.Color(204, 255, 255));
        btnDeclineRequest.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnDeclineRequest.setText("  Decline Request");
        btnDeclineRequest.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDeclineRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeclineRequestActionPerformed(evt);
            }
        });

        btnAssign.setBackground(new java.awt.Color(204, 255, 255));
        btnAssign.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnAssign.setText("  Assign");
        btnAssign.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(204, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon("/Users/suprajakosuri/Desktop/Supraja AED_Final_Git_/AED-final-project/Images/icons8-back-arrow-64.png")); // NOI18N
        btnBack.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblManager.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblManager.setForeground(new java.awt.Color(255, 51, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/suprajakosuri/Desktop/Supraja AED_Final_Git_/AED-final-project/Images/WhatsApp Image 2022-04-30 at 6.22.22 PM.jpeg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(btnAcceptRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(btnDeclineRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(comboGrievanceEmploye, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(927, 927, 927))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(lblManager, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(lblGrievenceManager, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAcceptRequest, btnDeclineRequest});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAssign, comboGrievanceEmploye, jLabel3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblGrievenceManager, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblManager, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAcceptRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeclineRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboGrievanceEmploye, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAssign)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnBack)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAcceptRequest, btnDeclineRequest});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAssign, comboGrievanceEmploye, jLabel3});

    }// </editor-fold>//GEN-END:initComponents

    private void tblOrganizationManagerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrganizationManagerMouseClicked
        // TODO add your handling code here:
        
        row = tblOrganizationManager.getSelectedRow();
        col = tblOrganizationManager.getSelectedColumn();
        
    }//GEN-LAST:event_tblOrganizationManagerMouseClicked

    private void btnAcceptRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptRequestActionPerformed
        // TODO add your handling code here:
         
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
       
        
        
        
    }//GEN-LAST:event_btnAcceptRequestActionPerformed

    private void btnDeclineRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeclineRequestActionPerformed
        // TODO add your handling code here:
        
        row = tblOrganizationManager.getSelectedRow();
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
    }//GEN-LAST:event_btnDeclineRequestActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        
        UserAccount grievanceEmployeee =  (UserAccount) comboGrievanceEmploye.getSelectedItem();
        
        if(grievanceEmployeee.isEmployeeBusy())
        {
            
            JOptionPane.showMessageDialog(this, "Selected employee is busy please select other employee.", " Complaint not assigned", 1);
            return;
        }
        
        row = tblOrganizationManager.getSelectedRow();
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
        
        
        
        complaint.setReceiver(grievanceEmployeee);
        complaint.setStatus("Assigned to Employee");
        grievanceEmployeee.getWorkQueue().addWorkRequest(complaint);
        populateTable();
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceptRequest;
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeclineRequest;
    private javax.swing.JComboBox comboGrievanceEmploye;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGrievenceManager;
    private javax.swing.JLabel lblManager;
    private javax.swing.JTable tblOrganizationManager;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
      dtm.setRowCount(0);
  
      System.out.println("name of org" +organization.name);
      
        WorkQueue workQueue = organization.getWorkQueue();
        
        for(WorkRequest workRequest  : workQueue.getListOfWorkQueues() ){
            System.out.println("in populate - wq - org type" +workRequest.getOrganizationType());
            Complaint complaint = (Complaint) workRequest;
            
            String receiver = "Not yet Assigned"; 
            if( complaint.getReceiver() != null)
                receiver = complaint.getReceiver().getEmployee().getName();
            
            Date date = null;
       
            if(complaint.getStatus().equalsIgnoreCase("Complaint Resolved")) {
                  date = complaint.getResolveDate();
            }

            System.out.println("Assigned employee for work "+receiver);
            Object[] objs = {complaint.getSender().getResident().getName(),complaint.getPriority(), complaint.getMessage(), complaint.getStatus(), receiver, complaint.getRequestDate(),date};
            dtm.addRow(objs);
            
        }
    }
        
        private void displayEmployes() {
                
            
                for(UserAccount userAccount : organization.getUserAccountDirectory().getUserAccountList()){
                    System.out.println("employee"+ userAccount.getEmployee());
                    System.out.println("role" +userAccount.getRole());
                    System.out.println("username" +userAccount.getUsername());
                    System.out.println("employeeQueue" +userAccount.getWorkQueue());
                    if (userAccount.getRole() instanceof GarbageRemovalManRole) comboGrievanceEmploye.addItem(userAccount);
                    else if (userAccount.getRole() instanceof StreetLightingMaintenanceEmpRole) comboGrievanceEmploye.addItem(userAccount);
                    else if (userAccount.getRole() instanceof WaterSupplierRole) comboGrievanceEmploye.addItem(userAccount);
                    else if (userAccount.getRole() instanceof PoliceManRole) comboGrievanceEmploye.addItem(userAccount);
            }
        
        
        }

            
}
        
    









            
            