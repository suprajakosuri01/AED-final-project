/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.ClinicManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vivek
 */
public class HospitalOrganization extends Organization {
    
    
     public HospitalOrganization() {
        super(Organization.Type.Hospital.getValue());
        
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ClinicManagerRole());
        return roles;
    }
    
    
}
