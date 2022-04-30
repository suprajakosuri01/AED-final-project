/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SystemAdmin;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import static UserInterface.ResidentRegisterJPanel.validUsername;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseAdminJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    DefaultTableModel dtm;
    int row,col;
    
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        dtm = (DefaultTableModel) tableEnterpriseAdmins.getModel();
        displayNetworkComboBox();
       //Network network = (Network) cbNetwork.getSelectedItem();
        //displayEnterpriseComboBox(network);
        displayTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNetwork = new javax.swing.JLabel();
        cbNetwork = new javax.swing.JComboBox();
        cbEnterprise = new javax.swing.JComboBox();
        btnAdd = new javax.swing.JButton();
        lblHeading = new javax.swing.JLabel();
        blbEnterpriseType = new javax.swing.JLabel();
        lblAdminName = new javax.swing.JLabel();
        txtAdminName = new javax.swing.JTextField();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEnterpriseAdmins = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        lblValidUser = new javax.swing.JLabel();
        lblValidPassword = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        lblNetwork.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblNetwork.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNetwork.setText("Choose Network");

        cbNetwork.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Null" }));
        cbNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNetworkActionPerformed(evt);
            }
        });

        cbEnterprise.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Null" }));
        cbEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEnterpriseActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(102, 255, 204));
        btnAdd.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAdd.setBorderPainted(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblHeading.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(255, 51, 102));
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("Create Enterprise Admins");

        blbEnterpriseType.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        blbEnterpriseType.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        blbEnterpriseType.setText("Enterprise");

        lblAdminName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblAdminName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAdminName.setText("Admin Name");

        lblUserName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUserName.setText("Username");

        lblPassword.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("Password");

        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserNameKeyTyped(evt);
            }
        });

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });

        tableEnterpriseAdmins.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Network", "Enterprise", "Admin name", "Username", "Password"
            }
        ));
        tableEnterpriseAdmins.setAutoscrolls(false);
        jScrollPane1.setViewportView(tableEnterpriseAdmins);

        btnBack.setBackground(new java.awt.Color(204, 255, 255));
        btnBack.setText(">>Back");
        btnBack.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBack.setBorderPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(204, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(blbEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtAdminName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbNetwork, javax.swing.GroupLayout.Alignment.LEADING, 0, 186, Short.MAX_VALUE)
                            .addComponent(cbEnterprise, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(txtUserName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValidPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValidUser, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(273, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blbEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                    .addComponent(txtPassword)
                                    .addComponent(lblValidPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblValidUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd)))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void displayNetworkComboBox(){
        cbNetwork.removeAllItems();
        
        for (Network network : ecosystem.getNetworkList()){
            cbNetwork.addItem(network);
        }
    }
    
    private void displayEnterpriseComboBox(Network network){
        cbEnterprise.removeAllItems();
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            cbEnterprise.addItem(enterprise);
        
        }
    }
    
    private void displayTable() {
        
        dtm.setRowCount(0);
        for(Network network : ecosystem.getNetworkList()){
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) 
                if (userAccount.getRole() instanceof AdminRole)
                {
                    userAccount.getEmployee().getName();
                    Object obj[] = {network.getName(),enterprise.getEnterpriseType().getValue(), userAccount.getEmployee().getName(), userAccount.getUsername(), userAccount.getPassword()};
                    dtm.addRow(obj);
                }
        }
        }
    }
    
    
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String networkName = cbNetwork.getSelectedItem().toString();
        String enterpriseType = cbEnterprise.getSelectedItem().toString();
        String adminName = txtAdminName.getText();
        String userName = txtUserName.getText().trim();
        String password = txtPassword.getText();
        
        if (networkName.isEmpty()||enterpriseType.isEmpty()||adminName.isEmpty()|| userName.isEmpty()
           || password.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "One or More fields are empty..!", "Empty Fields", 2);
            return;
        }
        
        
        Network network = (Network) cbNetwork.getSelectedItem();
        
        Enterprise enterprise = (Enterprise) cbEnterprise.getSelectedItem();
               
        ArrayList<String> uName= new ArrayList<String>();
        for(UserAccount u:enterprise.getUserAccountDirectory().getUserAccountList())
        {
            if (!uName.contains(userName))
                uName.add(u.getUsername());
            else
                JOptionPane.showMessageDialog(this, "Provided Username already exists. Please try with other Username", "User Exists", 1);
           
        }
        if(uName.contains(userName))
        {
            JOptionPane.showMessageDialog(this, "Provided Username already exists. Please try with other Username" ,"User Exists", 1);
            return;
        }
//        if (!ecosystem.checkIfUsernameIsUnique(txtUserName.getText())) {
//            JOptionPane.showMessageDialog(null, "User Already Exists");
//            return;
//        }
        Employee employee = enterprise.getEmployeeDirectory().createEmployee(adminName, 1);
        //System.out.println(network.getName() + " "+ enterprise.getName());
        UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(userName, password, employee, new AdminRole());
        displayTable();
        txtAdminName.setText("");
        txtUserName.setText("");
        txtPassword.setText("");
        //cbNetwork.setSelectedIndex(0);
        //cbEnterprise.setSelectedIndex(0);
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void cbNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNetworkActionPerformed
        // TODO add your handling code here:
        
        Network network = (Network) cbNetwork.getSelectedItem();
        if(network != null)
        displayEnterpriseComboBox(network);
    }//GEN-LAST:event_cbNetworkActionPerformed

    private void cbEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEnterpriseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEnterpriseActionPerformed

    private void txtUserNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyTyped
        
        if (!validUsername(txtUserName.getText())) {
            txtUserName.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtUserName.setForeground(Color.RED);
            lblValidUser.setText("Invalid UserName..Only letters allowed");
        } else {
            txtUserName.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txtUserName.setForeground(Color.BLACK);
            lblValidUser.setText("Valid UserName");
            int delay = 3000; //milliseconds
            ActionListener taskPerformer = new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    lblValidUser.setVisible(false);
                }  
            };
            javax.swing.Timer tick = new javax.swing.Timer(delay, taskPerformer);
            tick.setRepeats(false);
            tick.start();
        }
    }//GEN-LAST:event_txtUserNameKeyTyped

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        
        if (!validPassword(txtPassword.getText())) {
            txtPassword.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtPassword.setForeground(Color.RED);
            lblValidPassword.setText("8 characters, atleast 1 capital letter, one number, one special character");
            
        } else {
            txtPassword.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txtPassword.setForeground(Color.BLACK);
            lblValidPassword.setText("Valid Password");
            int delay = 3000; //milliseconds
            ActionListener taskPerformer = new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    lblValidPassword.setVisible(false);
                    
                }  
            };
            javax.swing.Timer tick = new javax.swing.Timer(delay, taskPerformer);
            tick.setRepeats(false);
            tick.start();
        }
    }//GEN-LAST:event_txtPasswordKeyTyped

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        int row = tableEnterpriseAdmins.getSelectedRow();
        
        if(row == -1)
        {
             JOptionPane.showMessageDialog(this, "Please select a admin!!" ,"Select user", 2);
            return;    
        }
        
        String userName = tableEnterpriseAdmins.getValueAt(row, 3).toString();
        String enterpriseName = tableEnterpriseAdmins.getValueAt(row, 1).toString();
        String NetworkName = tableEnterpriseAdmins.getValueAt(row, 0).toString();
        
        for(Network network : ecosystem.getNetworkList())
        {
           
            if(!network.getName().equalsIgnoreCase(NetworkName) )
                continue;
            
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
            {
                String enterpriseType = enterprise.getEnterpriseType().toString();
                
                if(!enterpriseType.equals(enterpriseName))
                    continue;
                
                UserAccount deleteAccount = null;
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList())
                {
                    
                   
                    if (userAccount.getRole() instanceof AdminRole && userAccount.getUsername().equalsIgnoreCase(userName))
                    {
                        
                        deleteAccount = userAccount;
                        break;
                    }
                }
                if(deleteAccount != null){
                    enterprise.getUserAccountDirectory().getUserAccountList().remove(deleteAccount);
                    JOptionPane.showMessageDialog(this, "Admin deleted successfully" ,"User deleted", 1);
                    displayTable();
                    return;
                }
            }
                        
        }
        
     
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    public static boolean validUsername(String name) {
        Pattern pattern;
        Matcher matcher;
        String NAME_PATTERN = "^[A-Za-z\\s]+$";
        pattern = Pattern.compile(NAME_PATTERN);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }
        

    public static boolean validPassword(String passwordValue) {
        Pattern pattern;
        Matcher matcher;
        String PASSWORD_PATTERN
                = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&+=~|?])(?=\\S+$).{8,}$";
        pattern = Pattern.compile(PASSWORD_PATTERN);
        matcher = pattern.matcher(passwordValue);
        return matcher.matches();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blbEnterpriseType;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox cbEnterprise;
    private javax.swing.JComboBox cbNetwork;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdminName;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblNetwork;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblValidPassword;
    private javax.swing.JLabel lblValidUser;
    private javax.swing.JTable tableEnterpriseAdmins;
    private javax.swing.JTextField txtAdminName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}