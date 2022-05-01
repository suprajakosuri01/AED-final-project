/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.DrinkingWaterManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vivek
 */
public class DrinkingWaterOrganization extends Organization{
    public DrinkingWaterOrganization() {
        super(Organization.Type.DrinkingWater.getValue());
        
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DrinkingWaterManagerRole());
        return roles;
    }
    
}
