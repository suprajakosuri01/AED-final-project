/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 *  @author supraja kosuri
 */
public abstract class Enterprise extends Organization {
    
    public EnterpriseType enterpriseType;
    public OrganizationDirectory organizationDirectory;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public enum EnterpriseType{
        
        Residents("Resident"),
        GrievanceManagement("GrievanceManagement"),
        EmergencyResponse("EmergencyResponse"),
        CovidHelp("CovidHelp");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value = value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
            return value;
    }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory = new OrganizationDirectory();
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    
}
