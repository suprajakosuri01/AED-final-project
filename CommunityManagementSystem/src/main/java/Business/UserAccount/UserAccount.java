/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Resident.Resident;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;

/**
 *
 * @author supraja kosuri
 */
public class UserAccount {
  
    private String username;
    private String password;
    private Employee employee;
    private Resident resident;
    private Role role;
    private WorkQueue workQueue;

    public UserAccount() {
        workQueue = new WorkQueue();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public Resident getResident() {
        return resident;
    }

    public void setResident(Resident resident) {
        this.resident = resident;
    }

    @Override
    public String toString() {
        if (this.employee != null) return this.employee.getName();
        else if (this.resident != null) return this.resident.getName();
        else return "";
    }
    
    public boolean isEmployeeBusy()
    {
        for (WorkRequest workRequest : workQueue.getListOfWorkQueues())
        { 
            if(workRequest.getStatus() != null && workRequest.getStatus().equalsIgnoreCase("Employee On the way"))
                return true;
        }
        return false;
        //"Employee On the way"
    }
    
    
    
}
