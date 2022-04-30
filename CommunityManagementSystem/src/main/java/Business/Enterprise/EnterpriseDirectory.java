/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 *  @author supraja kosuri
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createEnterprise(String name, Enterprise.EnterpriseType type){
        
        Enterprise enterprise = null;
        if(type == Enterprise.EnterpriseType.Residents){
            
            enterprise = new ResidentsEnterprise(name);
            enterpriseList.add(enterprise);
        }
         else if (type == Enterprise.EnterpriseType.GrievanceManagement){
            
            enterprise = new GrievanceManagementEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if (type == Enterprise.EnterpriseType.EmergencyResponse){
            
            enterprise = new EmergencyResponseEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if (type == Enterprise.EnterpriseType.CovidHelp){
                
            enterprise=new CovidHelpEnterprise(name);
            enterpriseList.add(enterprise);
           
        }
        return enterprise;
    }
}
