/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Restaurant.Restaurant;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author jayatipatel
 */
public class OrderDirectory {
    ArrayList<Order> orderList;
    public OrderDirectory(){
        this.orderList = new ArrayList<>();
    }
    public ArrayList<Order> restaurantOrders(Restaurant restaurant){
        ArrayList<Order> ans = new ArrayList<>();
        for(int i=0; i<orderList.size(); i++){
            if(orderList.get(i).restaurant.equals(restaurant)){
                ans.add(orderList.get(i));
            }
        }
        return ans;
    }
    public ArrayList<Order> customerOrders(Customer customer){
        ArrayList<Order> ans = new ArrayList<>();
        for(int i=0; i<orderList.size(); i++){
            if(orderList.get(i).customer.equals(customer)){
                ans.add(orderList.get(i));
            }
        }
        return ans;
    }
    public ArrayList<Order> deliveryManOrders(DeliveryMan deliveryMan){
        ArrayList<Order> ans = new ArrayList<>();
        for(int i=0; i<orderList.size(); i++){
            if(orderList.get(i).deliveryMan.equals(deliveryMan)){
                ans.add(orderList.get(i));
            }
        }
        return ans;
    }
    public void addOrder(Order order){
        this.orderList.add(order);
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    public Order searchOrder(LocalDateTime date){
        for(int i=0; i<this.orderList.size(); i++){
            if(this.orderList.get(i).getOrderDate().equals(date)){
                return this.orderList.get(i);
            }
        }
        return null;
    }
}
