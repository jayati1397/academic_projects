package Business;

import Business.Employee.Employee;
import Business.Role.Role;
import static Business.Role.Role.RoleType.SysAdmin;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        Role.RoleType role = SysAdmin;
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", role);
        return system;
    }
    
}
