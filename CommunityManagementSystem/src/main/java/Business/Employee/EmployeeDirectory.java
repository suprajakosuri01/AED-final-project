/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Role.AdminRole;
import java.util.ArrayList;

/**
 *
 *  @author supraja kosuri
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name, int role ){
        
         Employee employee = null;
        
         switch (role) {
             
            case 1:
                employee = new Admin(name);
                break;
                
            case 2:
                employee = new GarbageRemovalMan(name);
                break;
                
            case 3:
                employee = new GarbageRemovalManager(name);
                break;

            case 4:
                employee = new WaterSupplier(name);
                break;

            case 5:
                employee = new WaterSupplyManager(name);
                break;
                
            case 6:
                employee = new StreetLightingMaintenanceEmployee(name);
                break;
                
            case 7:
                employee = new StreetLightingMaintenanceManager(name);
                break;
                
            case 8:
                employee = new PoliceMan(name);
                break;

            case 9:
                employee = new PoliceDepartmentHead(name);
                break;

            case 10:
                employee = new FireControlEmployee(name);
                break;

            case 11:
                employee = new FireControlManager(name);
                break;

             case 12:
                employee = new Doctor(name);
                break;
           
            case 13:
                employee = new HospitalManager(name);
                break;

            case 14:
                employee = new NGOManager(name);
                break;
            
            case 15:
                employee = new GovernmentOrganizationManager(name);
                break;
        }

        employeeList.add(employee);
        return employee;
    }   
    
}
