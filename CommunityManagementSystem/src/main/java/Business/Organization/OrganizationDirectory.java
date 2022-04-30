/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;
/**
 *
 *@author sowmika
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
        
        else if (type.getValue().equals(Type.FireControl.getValue())){
            organization=new FireControlOrganization();
            organizationList.add(organization);
        }
        
        
        else if (type.getValue().equals(Type.GarbageRemoval.getValue())){
            organization=new GarbageRemovalOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.Government.getValue())){
            organization=new GovernmentOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.NonGovernment.getValue())){
            organization=new NonGovernmentOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.Police.getValue())){
            organization=new PoliceOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.StreetLighting.getValue())){
            organization=new StreetLightingOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.WaterSupply.getValue())){
            organization=new WaterSupplyOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.Hospital.getValue())){
            organization=new HospitalOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    
    }
}
