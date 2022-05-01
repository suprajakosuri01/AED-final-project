/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vivek
 */
public class SafetyEnterprise extends Enterprise {
    
    
    public SafetyEnterprise(String name){
        
        super(name,EnterpriseType.Safety);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        
        return null;
    }
    
}
