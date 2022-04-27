/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employee;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;
/**
 *
 * @author adepu
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
         switch (role){
             case 1:
                employee = new Admin(name);
                break;
                
            case 2:
                employee = new TrashRemovalWorker(name);
                break;
                
            case 3:
                employee = new TrashRemovalSupervisor(name);
                break;

            case 4:
                employee = new ElectricityManagementWorker (name);
                break;

            case 5:
                employee = new ElectricityManagementSupervisor(name);
                break;
                
            case 6:
                employee = new GasManagementSupervisor(name);
                break;
                
            case 7:
                employee = new GasManagementWorker(name);
                break;
                
            case 8:
                employee = new LandScapeManagementAgent(name);
                break;

            case 9:
                employee = new DrinkingWaterManagementAgent(name);
                break;

            case 10:
                employee = new CommunitySecurityManagementWorker(name);
                break;

            case 11:
                employee = new CommunitySecurityManagementSupervisor(name);
                break;

             case 12:
                employee = new Doctor(name);
                break;
           
            case 13:
                employee = new LabAssistent(name);
                break;

            
         }
         employeeList.add(employee);
        return employee;
     }
    
}
