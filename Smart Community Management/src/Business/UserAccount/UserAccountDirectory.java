package Business.UserAccount;





import Business.Employee.Employee;
import Business.Resident.Resident;
import Business.Role.ResidentRole;
import Business.Role.Role;
import java.util.ArrayList;


public class UserAccountDirectory {
    
    private ArrayList<UserAccount> Accountlist;

    public UserAccountDirectory() {
        Accountlist = new ArrayList();
    }

    public ArrayList<UserAccount> getAccountList() {
        return Accountlist;
    }
    
    public UserAccount validateUser(String username, String password){
        for (UserAccount usa: Accountlist)
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
       Accountlist.add(userAccount);
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
       Accountlist.add(userAccount);
        return userAccount;  
    }
    
    public boolean UsernameMatch(String username){
        for (UserAccount usa : Accountlist){
            if (usa.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
}
