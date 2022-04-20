package Business.UserAccount;


import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author vivek
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> Accountlist;

    public UserAccountDirectory() {
        Accountlist = new ArrayList();
    }

    public ArrayList<UserAccount> getAccountList() {
        return Accountlist;
    }
    
    public UserAccount validateUser(String username, String password){
        for (UserAccount usa: userAccountList)
            if (usa.getUsername().equals(username) && usa.getPassword().equals(password)){
                return usa;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAccount createResidentAccount(String username, String password, Resident resident)
    {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setResident(resident);
        ResidentRole role = new ResidentRole();
        userAccount.setRole(role);
        AccountList.add(userAccount);
        return userAccount;  
    }
    
    public boolean UsernameMatch(String username){
        for (UserAccount usa : AccountList){
            if (usa.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
}
