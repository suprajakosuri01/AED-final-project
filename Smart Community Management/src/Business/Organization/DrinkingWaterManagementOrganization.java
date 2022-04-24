/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author suprajakosuri
 */
public class DrinkingWaterManagementOrganization extends Organization{
    
     public  DrinkingWaterManagementOrganization(){
         super(Organization.Type. DrinkingWaterManagement.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new  DrinkingWaterManagementAgentRole());
        return roles;
    }
    
}
