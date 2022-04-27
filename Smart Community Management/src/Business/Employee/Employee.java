/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employee;

/**
 *
 * @author adepu
 */
public class Employee {

    
    private String name;
    private int id;
    private static int count = 1;
    private int roleNumber;
    public Employee(String name, int roleNumber){
        id=count;
        count++;
        this.name=name;
        this.roleNumber=roleNumber;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }

    public int getRoleNumber() {
        return roleNumber;
    }

    public void setRoleNumber(int roleNumber) {
        this.roleNumber = roleNumber;
    }
    @Override
    public String toString() {
        return name;
    }
     public String getRole(){
         int roleNumber = this.getRoleNumber();
        
        String role = "";
        switch (roleNumber) {
            case 2:
                role = "TrashRemovalWorker";
                break;
            case 3:
                role = "TrashRemovalSupervisor";
                break;
            case 4:
                role = "ElectricityWorker";
                break;
            case 5:
                role = "ElectricitySupervisor";
                break;
               case 6:
                role = "GasSupervisor";
                break;
            case 7:
                role = "GasWorker";
                break; 
                
            case 8:
                role = "LandscapeAgent";
                break;
            case 9:
                role = "DrinkingWaterAgent";
                break;
            
            case 10:
                role = "CommunitySecurityWorker";
                break;
            case 11:
                role = "CommunitySecuritySupervisor";
                break;
            
            case 12:
                role = "Doctor";
                break;
            case 13:
                role = "LabAssistant";
                break;
           
             
        }
        return role;    
     }
     public String getOrg(){
         int roleNumber = this.getRoleNumber();
         String org="";
         
        if (roleNumber == 2 || roleNumber == 3) {
            org = "TrashRemovalManagementOrganization";
        }
        if (roleNumber == 4 || roleNumber == 5) {
            org = "ElectricityManagementOrganization ";
        }
        if (roleNumber == 6 || roleNumber == 7) {
            org = "GasManagementOrganization";
        }
        if (roleNumber == 8 ) {
            org = "LandScapeManagementOrganization";
        }
        if (roleNumber == 9 ) {
            org = "DrinkingWaterManagementOrganization";
        }
        if (roleNumber == 10 || roleNumber == 11) {
            org = "CommunitySecurityManagementOrganization";
        }
        if (roleNumber == 12) {
            org = "DoctorOrganization";
        }
         if (roleNumber == 13) {
            org = "LabOrganization";
        }
        return org;
     }
     
}
