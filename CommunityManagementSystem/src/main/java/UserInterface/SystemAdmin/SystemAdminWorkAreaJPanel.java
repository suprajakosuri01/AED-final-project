/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin;

import Business.EcoSystem;
import javax.swing.JPanel;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Resident.Resident;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

 
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAccount;
    
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = userAccount;
        populateTree();
        jTree1.setName("SmartCity");
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
        jTree1 = new javax.swing.JTree();
        btnManageNetwork = new javax.swing.JButton();
        btnManageEnterprise = new javax.swing.JButton();
        btnManageEnterpriseAdmin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));

        jTree1.setBackground(new java.awt.Color(204, 255, 255));
        jTree1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(jTree1);

        btnManageNetwork.setBackground(new java.awt.Color(204, 255, 255));
        btnManageNetwork.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnManageNetwork.setIcon(new javax.swing.ImageIcon("/Users/mohithparvataneni/Downloads/icons8-america-48.png")); // NOI18N
        btnManageNetwork.setText("    Manage Network");
        btnManageNetwork.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetworkActionPerformed(evt);
            }
        });

        btnManageEnterprise.setBackground(new java.awt.Color(204, 255, 255));
        btnManageEnterprise.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnManageEnterprise.setIcon(new javax.swing.ImageIcon("/Users/mohithparvataneni/Downloads/icons8-enterprise-64.png")); // NOI18N
        btnManageEnterprise.setText("Manage Enetrprise");
        btnManageEnterprise.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseActionPerformed(evt);
            }
        });

        btnManageEnterpriseAdmin.setBackground(new java.awt.Color(204, 255, 255));
        btnManageEnterpriseAdmin.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnManageEnterpriseAdmin.setIcon(new javax.swing.ImageIcon("/Users/mohithparvataneni/Downloads/icons8-admin-50.png")); // NOI18N
        btnManageEnterpriseAdmin.setText("   Manage Enterprise Admin ");
        btnManageEnterpriseAdmin.setToolTipText("");
        btnManageEnterpriseAdmin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageEnterpriseAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseAdminActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/mohithparvataneni/Downloads/icons8-admin-settings-male-48.png")); // NOI18N
        jLabel1.setText("System Admin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnManageNetwork, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManageEnterprise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManageEnterpriseAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
                        .addContainerGap(458, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(btnManageNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnManageEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addComponent(btnManageEnterpriseAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetworkActionPerformed
        
        ManageNetworkJPanel manageNetworkJPanel=new ManageNetworkJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("manageNetworkJPanel",manageNetworkJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageNetworkActionPerformed

    private void btnManageEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseActionPerformed
        
        if(ecosystem.getNetworkList().size()<=0)
        {
          JOptionPane.showMessageDialog(null,"No network available to create a enterprise");
          return;
        }
        else
        {
            ManageEnterpriseJPanel manageEnterpriseJPanel = new ManageEnterpriseJPanel(userProcessContainer, ecosystem);
            userProcessContainer.add("manageEnterpriseJPanel",manageEnterpriseJPanel);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnManageEnterpriseActionPerformed

    private void btnManageEnterpriseAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseAdminActionPerformed
        
        int countEnterprise = 0;
        for(Network network:ecosystem.getNetworkList() )
        {
            for(Enterprise enterprise :network.getEnterpriseDirectory().getEnterpriseList())
            {
                countEnterprise++;
            }
        }
        if(countEnterprise<=0)
        {
            JOptionPane.showMessageDialog(null,"No enterprise is available to create a admin for a enterprise");
            return;
        }
        ManageEnterpriseAdminJPanel manageEnterpriseAdminJPanel = new ManageEnterpriseAdminJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("manageEnterpriseAdminJPanel",manageEnterpriseAdminJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEnterpriseAdminActionPerformed
    
    public void populateTree(){
        
        DefaultTreeModel dtm=(DefaultTreeModel)jTree1.getModel();
        ArrayList<Network> networkList = ecosystem.getNetworkList();
        ArrayList<Enterprise> enterpriseList;
        ArrayList<Organization> organizationList;
        
        Network network;
        Enterprise enterprise;
        Organization organization;
        
        DefaultMutableTreeNode networks = new DefaultMutableTreeNode("Networks");
        DefaultMutableTreeNode root = (DefaultMutableTreeNode)dtm.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);
        
        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;
        
        for(int i=0;i<networkList.size();i++){
            network=networkList.get(i);
            networkNode = new DefaultMutableTreeNode(network.getName());
            networks.insert(networkNode, i);
            
            enterpriseList=network.getEnterpriseDirectory().getEnterpriseList();
            for(int j=0; j<enterpriseList.size();j++){
                enterprise=enterpriseList.get(j);
                enterpriseNode=new DefaultMutableTreeNode(enterprise.getName());
                networkNode.insert(enterpriseNode, j);
                
                organizationList=enterprise.getOrganizationDirectory().getOrganizationList();
                for(int k=0;k<organizationList.size();k++){
                    organization=organizationList.get(k);
                    organizationNode=new DefaultMutableTreeNode(organization.getName());
                    enterpriseNode.insert(organizationNode, k);
                }
            }
        }
        dtm.reload();
    }
    
    public Resident getResident(){

            for(Network network : ecosystem.getNetworkList()){
                
                for(Resident resident : network.getResidentDirectory().getResidentList()){
                    
                //if(resident.getUserAccount() == userAccount){
                    System.out.println(resident);
                    return resident;
                }
            }
        //return null;
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageEnterprise;
    private javax.swing.JButton btnManageEnterpriseAdmin;
    private javax.swing.JButton btnManageNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
