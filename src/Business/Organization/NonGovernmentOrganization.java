/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.NGOManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vivek
 */
public class NonGovernmentOrganization extends Organization {
     public NonGovernmentOrganization() {
        super(Organization.Type.NGO.getValue());
        
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NGOManagerRole());
        return roles;
    }
}
