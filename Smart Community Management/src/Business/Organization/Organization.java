/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author suprajakosuri
 */
public class Organization {
    
    public String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    
     public enum Type
             
    {
       
        Admin("Admin Organization"),
       TrashRemovalManagement ("Trash Removal Organization"),
       ElectricityManagement("Electricity management Organization"),
      GasManagement ("Gas management Organization"),
        LandScapeManagement ("Land scape management Organization"),
        DrinkingWaterManagement("Drinking water management Organization"),
        CommunitySecurityManagement("community security  Organization"),
        Doctor("Doctor Organization"),
        Lab("Lab Organization");
        
        private String value;
        
        private Type(String value){
                
            this.value = value;
            
        }

        public String getValue() {
            
            return value;
        }
}
      public Organization(String name) {
        this.name = name;
       
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }
      public Organization(){
        
    }
 public Organization(){
        
    }
 public abstract ArrayList<Role> getSupportedRole();
 
 
 public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

 
 public int getOrganizationID() {
        return organizationID;
    }
 
  public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
  
  
    public String getName() {
        return name;
    }

     public WorkQueue getWorkQueue() {
        return workQueue;
    }
     
    public void setName(String name) {
        this.name = name;
    }

   

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    

    public int getOrganizationID() {
        return organizationID;
    }

   

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Organization.counter = counter;
    }
    
   @Override
    public String toString() {
        return name;
    }




}

    
