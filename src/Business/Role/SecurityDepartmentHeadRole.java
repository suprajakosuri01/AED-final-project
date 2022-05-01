/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Businesss.EcoSystem;
import UserInterface.UtilityManager.UtilityManagerJPanel;
import javax.swing.JPanel;

/**
 *
 * @author vivek
 */
public class SecurityDepartmentHeadRole  extends Role {
    
      @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new UtilityManagerJPanel(userProcessContainer, account, organization);
    }
    
}