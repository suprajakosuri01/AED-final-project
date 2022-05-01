/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author vivek
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
                employee = new TrashRemovalMan(name);
                break;
                
            case 3:
                employee = new TrashRemovalManager(name);
                break;

            case 4:
                employee = new DrinkingWaterSupplyWorker(name);
                break;

            case 5:
                employee = new  DrinkingWaterManager(name);
                break;
                
            case 6:
                employee = new ElectricityMaintainanceManager(name);
                break;
                
            case 7:
                employee = new ElectricityMaintainanceEmployee(name);
                break;
                
            case 8:
                employee = new SecurityGaurd(name);
                break;

            case 9:
                employee = new SecurityDepartmentHead(name);
                break;

            case 10:
                employee = new DisasterManagementEmployee(name);
                break;

            case 11:
                employee = new DisasterManagementManager(name);
                break;

             case 12:
                employee = new Doctor(name);
                break;
           
            case 13:
                employee = new ClinicManager(name);
                break;

            case 14:
                employee = new NGOManager(name);
                break;
            
            case 15:
                employee = new GovernmentManager(name);
                break;
        }

        employeeList.add(employee);
        return employee;
    }   
}
