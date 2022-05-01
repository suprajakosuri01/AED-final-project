/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Businesss.EcoSystem;
import Business.UserAccount.UserAccount;
import UserInterface.SafetyEmployee.SafetyEmployeeJPanel;
import javax.swing.JPanel;

/**
 *
 * @author vivek
 */
public class ClinicManagerRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new SafetyEmployeeJPanel(userProcessContainer, account, organization);
    }
    
}
