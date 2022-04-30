/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.GarbageRemovalManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sowmika
 */
public class GarbageRemovalOrganization extends Organization {
    
    public GarbageRemovalOrganization() {
        super(Organization.Type.GarbageRemoval.getValue());
        
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GarbageRemovalManagerRole());
        return roles;
    }
    
}
