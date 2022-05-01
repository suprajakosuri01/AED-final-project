/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employee;

/**
 *
 * @author vivek
 */
public class Employee {
    
    private String name;
    private int id;
    private static int count = 1;
    private int roleNumber;

    public Employee(String name, int roleNumber) {
        id = count;
        count++;
        this.name = name;
        this.roleNumber = roleNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    
    public String getRole() {
        
        int roleNumber = this.getRoleNumber();
        String role = "";
        switch (roleNumber) {
            case 2:
                role = "GarbageRemovalMan";
                break;
            case 3:
                role = "GarbageRemovalManager";
                break;
            case 4:
                role = "WaterSupplier";
                break;
            case 5:
                role = "WaterSupplyManager";
                break;
            case 6:
                role = "StreetLightingTechnician";
                break;
            case 7:
                role = "StreetLightingMaintenanceManager";
                break;
            case 8:
                role = "PoliceMan";
                break;
            case 9:
                role = "PoliceDepartmentHead";
                break;
            case 10:
                role = "FireControlOrganizationEmployee";
                break;
            case 11:
                role = "FireDepartmentHead";
                break;
            case 12:
                role = "Doctor";
                break;
            case 13:
                role = "HospitalManager";
                break;
            case 14:
                role = "NGOManager";
                break;
            case 15:
                role = "GovernmentOrganizationManager";
                break;
             
        }
        return role;
    }

    public String getOrg() {
        
        int roleNumber = this.getRoleNumber();
        
        String org = "";
        if (roleNumber == 2 || roleNumber == 3) {
            org = "TrashRemovalOrganization";
        }
        if (roleNumber == 4 || roleNumber == 5) {
            org = "DrinkingWaterOrganization";
        }
        if (roleNumber == 6 || roleNumber == 7) {
            org = "ElectricityOrganization";
        }
        if (roleNumber == 8 || roleNumber == 9) {
            org = "SecurityOrganization";
        }
        if (roleNumber == 10 || roleNumber == 11) {
            org = "DisasterManagementOrganization";
        }
        if (roleNumber == 12 || roleNumber == 13) {
            org = "HospitalOrganization";
        }
        if (roleNumber == 14) {
            org = "NGO";
        }
         if (roleNumber == 15) {
            org = "GovernmentOrganization";
        }
        return org;
    }
    
}
