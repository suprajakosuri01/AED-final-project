/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.SystemAdminRole;
import Business.Role.Role;

import java.util.ArrayList;

        
        

/**
 *
 * @author suprajakosuri
 */
public class AdminOrganization extends Organization {
    
     private String organizationName;
    
    public AdminOrganization() {
        super(Type.Admin.getValue());
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SystemAdminRole());
        return roles;
        
    }
    
    
}
