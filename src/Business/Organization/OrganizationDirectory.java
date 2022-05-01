/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author vivek
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        
        Organization organization = null;
        
        if (type.getValue().equals(Type.Admin.getValue())){
            organization = new AdminOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.DisasterManagement.getValue())){
            organization=new DisasterManagementOrganization();
            organizationList.add(organization);
        }
        
        
        else if (type.getValue().equals(Type.TrashRemoval.getValue())){
            organization=new TrashRemovalOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.Government.getValue())){
            organization=new GovernmentOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.NGO.getValue())){
            organization=new NonGovernmentOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.Security.getValue())){
            organization=new SecurityOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.ElectricityMaintainance.getValue())){
            organization=new ElectricityMaintainanceOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.DrinkingWater.getValue())){
            organization=new DrinkingWaterOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.Hospital.getValue())){
            organization=new HospitalOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    
    }
    
}
