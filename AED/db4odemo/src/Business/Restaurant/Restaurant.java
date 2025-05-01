/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author harold
 */
public class Restaurant {
    String name;
    String username;
    String password;
    HashMap<String, Integer> menuItems = new HashMap<String, Integer>();
    
    public Restaurant(String name, String username, String password){
        this.name=name;
        this.username=username;
        this.password=password;
        this.menuItems = new HashMap<>();
    }

    public String getUsername() {
        return username;
    }

    public HashMap<String, Integer> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(HashMap<String, Integer> menuItems) {
        this.menuItems = menuItems;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void addMenuItem(String menuitemname, int price){
        this.menuItems.put(menuitemname, price);
    }
    
    public int searchMenuItem(String menuItemName){
        for(int i=0; i<this.menuItems.size(); i++){
            if(this.menuItems.get(i).equals(menuItemName)){
                return i;
            }
        }
        return -1;
    }
    
}
