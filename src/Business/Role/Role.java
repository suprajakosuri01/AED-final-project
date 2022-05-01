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
import javax.swing.JPanel;

/**
 *
 * @author vivek
 */
public abstract class Role {
    
     public enum RoleType{
        
        Resident("Resident"),
        Admin("Admin"),
        TrashRemovalMan("TrashRemovalMan"),
        TrashRemovalManager("TrashRemovalManager"),
        DrinkingWaterSuppplyWorker("DrinkingWaterSuppplyWorker"),
        DrinkingWaterManager("DrinkingWaterManager"),
        ElectricityMaintenanceEmployee("ElectricityMaintenanceEmployee"),
        ElectricityMaintenanceManager("ElectricityMaintenanceManager"),
        SecurityGuard("SecurityGuard"),
        SecurityDepartmentHead("SecurityDepartmentHead"),
        FileControlEmployee("FileControlEmployee"),
        FireControlManager("FireControlManager"),
        ClinicManager("ClinicManager"),
        Doctor("Doctor"),
        GovernmentOrganizationManager("GovernmentOrganizationManager"),
        NGOManager("NGOManager"),
        SysAdmin("Sysadmin");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
       public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business,Network network);
    
    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
