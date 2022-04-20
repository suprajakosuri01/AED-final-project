/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Enterprise to edit this template
 */
package Business.Enterprise;

/**
 *
 * @author vivek
 */
public class Enterprise {
    
    public abstract class Enterprise extends Organization {
    
    public EnterpriseType enterpriseType;
    public OrganizationDirectory organizationDirectory;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public enum EnterpriseType{
        
        Resident("Resident"),
        CommunityComplaintManagemen("CommunityComplaintManagemen"),
        CommunitySafety("CommunitySafety"),
        CommunityHeathcare("CommunityHeathcare");
        
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
    
}
