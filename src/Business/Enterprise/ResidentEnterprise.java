/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author vivek
 */
public class ResidentEnterprise {
    public ResidentsEnterprise(String name){
        
        super(name,Enterprise.Enterprise.EnterpriseType.Resident);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        
        return null;
    }
    
}
