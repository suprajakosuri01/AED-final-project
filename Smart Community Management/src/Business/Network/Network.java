/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import Business.Resident.ResidentDirectory;
import Business.UserAccount.UserAccountDirectory;


/**
 *
 * @author vivek
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

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
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
