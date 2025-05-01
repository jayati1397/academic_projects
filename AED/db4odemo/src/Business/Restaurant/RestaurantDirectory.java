/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    ArrayList<Restaurant> restaurantList;
    
    public RestaurantDirectory(){
        this.restaurantList = new ArrayList<>();
    }
    
    public void addRestaurant(Restaurant restaurant){
        this.restaurantList.add(restaurant);
    }
    public boolean checkIfUsernameIsUnique(String username){
        if(restaurantList==null){
            return true;
        }
        for (Restaurant rl : restaurantList){
            if (rl.getUsername().equals(username))
                return false;
        }
        return true;
    }
    public Restaurant searchRestaurant(String username){
        for(int i=0; i<restaurantList.size(); i++){
            if(username.equals(restaurantList.get(i).username)){
                return restaurantList.get(i);
            }
        }
        return null;
    }

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(ArrayList<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }
    
}
