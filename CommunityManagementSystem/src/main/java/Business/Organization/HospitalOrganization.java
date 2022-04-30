/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HospitalManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sowmika
 */
public class HospitalOrganization extends Organization {
    
     public HospitalOrganization() {
        super(Organization.Type.Hospital.getValue());
        
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HospitalManagerRole());
        return roles;
    }
    
}
