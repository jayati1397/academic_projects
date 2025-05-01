/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Role.RoleType role;

    public UserAccount(String username, String password, Role.RoleType role){
        this.username=username;
        this.password=password;
        this.role=role;
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

    public Role.RoleType getRole() {
        return role;
    }
    
    public void setRole(Role.RoleType role) {
        this.role = role;
    }
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}