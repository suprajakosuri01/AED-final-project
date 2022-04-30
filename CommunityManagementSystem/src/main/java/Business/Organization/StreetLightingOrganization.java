/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.StreetLightMaintenanceManagerRole;
import java.util.ArrayList;

/**
 *
 * @author sowmika
 */
public class StreetLightingOrganization extends Organization{
    
    public StreetLightingOrganization() {
        super(Organization.Type.StreetLighting.getValue());
        
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new StreetLightMaintenanceManagerRole());
        return roles;
    }
    
}
