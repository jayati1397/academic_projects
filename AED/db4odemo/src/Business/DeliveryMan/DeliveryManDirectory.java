/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Restaurant.Restaurant;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    ArrayList<DeliveryMan> deliveryManList;
    public DeliveryManDirectory(){
        this.deliveryManList = new ArrayList<>();
    }
    public void addDeliveryMan(DeliveryMan deliveryMan){
        this.deliveryManList.add(deliveryMan);
    }
    public boolean checkIfUsernameIsUnique(String username){
        if(deliveryManList==null){
            return true;
        }
        for (DeliveryMan dm : deliveryManList){
            if (dm.getUsername().equals(username))
                return false;
        }
        return true;
    }
    public DeliveryMan searchDeliveryMan(String username){
        for(int i=0; i<deliveryManList.size(); i++){
            if(username.equals(deliveryManList.get(i).username)){
                return deliveryManList.get(i);
            }
        }
        return null;
    }

    public ArrayList<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }

    public void setDeliveryManList(ArrayList<DeliveryMan> deliveryManList) {
        this.deliveryManList = deliveryManList;
    }
    
}
