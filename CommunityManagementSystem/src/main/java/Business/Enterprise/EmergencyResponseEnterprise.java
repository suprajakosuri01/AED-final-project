/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 *  @author supraja kosuri
 */
public class EmergencyResponseEnterprise extends Enterprise {
    
    public EmergencyResponseEnterprise(String name){
        
        super(name,EnterpriseType.EmergencyResponse);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        
        return null;
    }
}
