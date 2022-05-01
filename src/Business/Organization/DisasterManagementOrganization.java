/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.DisasterManagementManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vivek
 */
public class DisasterManagementOrganization extends Organization {
    public DisasterManagementOrganization() {
        super(Organization.Type.DisasterManagement.getValue());
        
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DisasterManagementManagerRole());
        return roles;
    }
}
