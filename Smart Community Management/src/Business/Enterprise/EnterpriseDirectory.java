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
        if(type == Enterprise.EnterpriseType.Resident){
            
            enterprise = new ResidentEnterprise(name);
            enterpriseList.add(enterprise);
        }
         else if (type == Enterprise.EnterpriseType.CommunityComplaintManagement){
            
            enterprise = new CommunityComplaintManagementEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if (type == Enterprise.EnterpriseType.CommunitySafety){
            
            enterprise = new CommunitySafetyEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if (type == Enterprise.EnterpriseType.CommunityHeathcare){
                
            enterprise=new CommunityHeathcareEnterprise(name);
            enterpriseList.add(enterprise);
           
        }
        return enterprise;
    }
    
    
    
}
