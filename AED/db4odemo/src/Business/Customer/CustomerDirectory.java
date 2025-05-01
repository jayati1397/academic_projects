/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    ArrayList<Customer> customerList;
    public CustomerDirectory(){
        this.customerList = new ArrayList<>();
    }
    public void addCustomer(Customer customer){
        this.customerList.add(customer);
    }
    public boolean checkIfUsernameIsUnique(String username){
        if(customerList==null){
            return true;
        }
        for (Customer c : customerList){
            if (c.getUsername().equals(username))
                return false;
        }
        return true;
    }
    public Customer searchCusotmer(String username){
        for(int i=0; i<customerList.size(); i++){
            if(username.equals(customerList.get(i).username)){
                return customerList.get(i);
            }
        }
        return null;
    }
}
