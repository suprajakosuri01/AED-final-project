/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vivek
 */
public class UtilityManagementEnterprise extends Enterprise{
    
    
     public UtilityManagementEnterprise(String name){
        
        super(name,EnterpriseType.UtilityManagement);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        
        return null;
    }
    
}
