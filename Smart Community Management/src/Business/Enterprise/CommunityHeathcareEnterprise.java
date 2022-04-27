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
public class CommunityHeathcareEnterprise extends Enterprise {
    
    public CommunityHeathcareEnterprise(String name){
        
        super(name,EnterpriseType.CommunityHeathcare);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        
        return null;
    }
    
}
