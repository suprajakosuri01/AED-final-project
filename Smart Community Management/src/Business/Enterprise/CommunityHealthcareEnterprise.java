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
public class CommunityHealthcareEnterprise extends Enterprise{
     
    public CommunityHealthcareEnterprise(String name){
        
        super(name,Enterprise.EnterpriseType.CommunityHealthcare);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        
        return null;
    }
}
