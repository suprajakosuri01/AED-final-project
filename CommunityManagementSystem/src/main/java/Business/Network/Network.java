/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import Business.Resident.ResidentDirectory;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;

/**
 *
 *  @author supraja kosuri
 */
public class Network {
    
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private ResidentDirectory residentDirectory;
    private UserAccountDirectory userAccountDirectory;
    
    public Network(){
        
        enterpriseDirectory = new EnterpriseDirectory();
        residentDirectory = new ResidentDirectory();
        userAccountDirectory = new UserAccountDirectory();
 
    }
    public String getName() {
        return name;
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public ResidentDirectory getResidentDirectory() {
        return residentDirectory;
    }

    public void setResidentDirectory(ResidentDirectory residentDirectory) {
        this.residentDirectory = residentDirectory;
    }

        public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
    
    
    
    @Override
    public String toString(){
        return name;
    }
    
}
