/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.ElectricityMaintainanceManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vivek
 */
public class ElectricityMaintainanceOrganization extends Organization {
    public ElectricityMaintainanceOrganization() {
        super(Organization.Type.ElectricityMaintainance.getValue());
        
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ElectricityMaintainanceManagerRole());
        return roles;
    }
}
