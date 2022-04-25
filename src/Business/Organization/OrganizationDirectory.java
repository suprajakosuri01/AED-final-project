/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author suprajakosuri
 */
public class OrganizationDirectory {
     private ArrayList<Organization> organizationList;
    
  public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

     public Organization createOrganization(Organization.Type type){
        
        Organization organization = null;
         if (type.getValue().equals(Organization.Type.Admin.getValue())){
            organization = new AdminOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.TrashRemovalManagement.getValue())){
            organization=new TrashRemovalManagementOrganization();
            organizationList.add(organization);
        }
        
        
        else if (type.getValue().equals(Organization.Type.ElectricityManagement.getValue())){
            organization=new ElectricityManagementOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.GasManagement.getValue())){
            organization=new GasManagementOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.LandScapeManagement.getValue())){
            organization=new LandScapeManagementOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.DrinkingWaterManagement.getValue())){
            organization=new DrinkingWaterManagementOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.CommunitySecurityManagement.getValue())){
            organization=new CommunitySecurityManagementOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.Doctor.getValue())){
            organization=new DoctorOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.Lab.getValue())){
            organization=new LabOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    
    }
       


  
}
