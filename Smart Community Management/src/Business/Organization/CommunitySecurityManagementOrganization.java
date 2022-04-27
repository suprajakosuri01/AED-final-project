/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Role.CommunitySecurityManagementSupervisorRole;
import Business.Role.Role;

import java.util.ArrayList;

/**
 *
 * @author suprajakosuri
 */
public class CommunitySecurityManagementOrganization extends Organization{ 
    
     public  CommunitySecurityManagementOrganization(){
         super(Organization.Type.CommunitySecurityManagement.getValue());
    }
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CommunitySecurityManagementSupervisorRole());
        return roles;
    }
    
    
}
