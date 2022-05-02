/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.CommunityResident;

import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.Safety;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Complaint;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author adepu
 */
public class SafetyRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RaiseSafetyRequest
     */
    private JPanel userProcessContainer;
    private Network network;
    private UserAccount userAccount;
    public SafetyRequestJPanel(JPanel userProcessContainer, UserAccount userAccount, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.userAccount = userAccount;
        //System.out.println( "hi");
        
            displaySafetyType();
        //System.out.println( "hi");
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
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComments = new javax.swing.JTextArea();
        btnRaiseEmergency = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        comboEmergencyType = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        comboPriority = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Safety Request");

        btnBack.setBackground(new java.awt.Color(204, 255, 255));
        btnBack.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtComments.setColumns(20);
        txtComments.setRows(5);
        jScrollPane1.setViewportView(txtComments);

        btnRaiseEmergency.setBackground(new java.awt.Color(204, 255, 255));
        btnRaiseEmergency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaiseEmergencyActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Emergency Type");

        comboEmergencyType.setBackground(new java.awt.Color(204, 255, 255));
        comboEmergencyType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Null" }));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Priority");

        comboPriority.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Null", "High Priority", "low priority" }));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Comments");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboEmergencyType, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboPriority, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(531, 531, 531)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(510, 510, 510)
                        .addComponent(btnRaiseEmergency, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(comboEmergencyType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboPriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(59, 59, 59)
                .addComponent(btnRaiseEmergency)
                .addContainerGap(145, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRaiseEmergencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaiseEmergencyActionPerformed
        // TODO add your handling code here:

        String emergencyType = comboEmergencyType.getSelectedItem().toString();
        String priority = comboPriority.getSelectedItem().toString();
        String comments = txtComments.getText();

        Complaint complaint = new Complaint();
        complaint.setOrganizationType(emergencyType);
        complaint.setPriority(priority);
        complaint.setMessage(comments);
        complaint.setSender(userAccount);
        complaint.setStatus("Complaint raised");
        complaint.setRequestType("Complaint");

        userAccount.getWorkQueue().addWorkAppeal(complaint);

        Organization organization = (Organization) comboEmergencyType.getSelectedItem();

        organization.getWorkQueue().addWorkAppeal((complaint));

        JOptionPane.showMessageDialog(this, "Request placed successfully !!", "Request", 1);

        comboEmergencyType.setSelectedIndex(0);
        comboPriority.setSelectedIndex(0);
        txtComments.setText("");
    }//GEN-LAST:event_btnRaiseEmergencyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRaiseEmergency;
    private javax.swing.JComboBox comboEmergencyType;
    private javax.swing.JComboBox<String> comboPriority;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtComments;
    // End of variables declaration//GEN-END:variables
private void displaySafetyType() {
        
//        comboEmergencyType.removeAllItems();
        System.out.println(network +"boom ");
        for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()){
           System.out.println(e.getEnterpriseType() + "  check");
           
            if(e.getEnterpriseType().equals(Safety)){
                for(Organization org : e.getOrganizationDirectory().getOrganizationList())
                    comboEmergencyType.addItem(org);
            }
   
            }
        }
}