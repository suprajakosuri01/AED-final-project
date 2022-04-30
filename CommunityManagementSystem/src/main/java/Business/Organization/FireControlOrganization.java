/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FireControlManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 *  @author sowmika
 * 
 */
public class FireControlOrganization extends Organization {
    
    public FireControlOrganization() {
        super(Organization.Type.FireControl.getValue());
        
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FireControlManagerRole());
        return roles;
    }
}
