/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import java.util.ArrayList;
import Business.Role.Role;

/**
 *
 * @author vivek
 */
public class ResidentEnterprise extends Enterprise {
    
    public ResidentEnterprise(String name){
        
        super(name,EnterpriseType.Resident);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        
        return null;
    }
    
}
