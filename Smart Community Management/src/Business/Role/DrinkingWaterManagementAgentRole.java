/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.UtilityComplaintSupervisor.UtilityComplaintSupervisorJPanel;
import javax.swing.JPanel;
//import Business.role.Role;
//import javax.swing.JPanel;

/**
 *
 * @author vivek
 */
public class DrinkingWaterManagementAgentRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new UtilityComplaintSupervisorJPanel (userProcessContainer, userAccount, organization);
    }   
}
