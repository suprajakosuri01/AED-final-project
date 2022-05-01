/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.TrashRemovalManagerRole;
import java.util.ArrayList;

/**
 *
 * @author vivek
 */
public class TrashRemovalOrganization extends Organization{
    
    
    
    public TrashRemovalOrganization() {
        super(Organization.Type.TrashRemoval.getValue());
        
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TrashRemovalManagerRole());
        return roles;
    }
}
