/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Resident;


import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Complaint;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ResidentCheckStatusJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ResidentCheckStatusJPanel
     */
    private JPanel userProcessContainer;
    private Network network;
    private final UserAccount userAccount;
    private DefaultTableModel dtm;
    int row,col;
    public ResidentCheckStatusJPanel(JPanel userProcessContainer,UserAccount userAccount, Network network  ) {
        
        initComponents();
        this.userAccount = userAccount;
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        
        dtm = (DefaultTableModel) tableResidentWorkStatus.getModel();
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableResidentWorkStatus = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setBackground(new java.awt.Color(255, 51, 102));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("  Requests Status");

        tableResidentWorkStatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type of support", "Priority", "Comments", "Status", "Employee", "Request Date", "Resolve Date"
            }
        ));
        jScrollPane1.setViewportView(tableResidentWorkStatus);

        btnBack.setBackground(new java.awt.Color(204, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon("/Users/suprajakosuri/Desktop/Supraja AED_Final_Git_/AED-final-project/Images/icons8-go-back-48.png")); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/suprajakosuri/Desktop/Supraja AED_Final_Git_/AED-final-project/Images/WhatsApp Image 2022-04-30 at 6.52.37 PM.jpeg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(219, 219, 219))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(435, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(11, 11, 11))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(163, 163, 163)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableResidentWorkStatus;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        dtm.setRowCount(0);
  
        WorkQueue workQueue = userAccount.getWorkQueue();
        
        for(WorkRequest workRequest  : workQueue.getListOfWorkQueues() ){
            if (workRequest.getRequestType().equalsIgnoreCase("Complaint"))
            {
                Complaint complaint = (Complaint) workRequest;

                String receiver = "Not yet Assigned"; 
                if( complaint.getReceiver() != null)
                    receiver = complaint.getReceiver().getEmployee().getName();

                Date date = null;

                if(complaint.getStatus().equalsIgnoreCase("Complaint Resolved")) {
                      date = complaint.getResolveDate();
                }

                Object[] objs = {complaint.getOrganizationType(),complaint.getPriority(), complaint.getMessage(), complaint.getStatus(),receiver, complaint.getRequestDate(),date};
                dtm.addRow(objs);
            }
            
        }
        

    }
}
