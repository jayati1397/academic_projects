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
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author jayatipatel
 */
public class Order {
    LocalDateTime orderDate;
    Customer customer;
    DeliveryMan deliveryMan;
    Restaurant restaurant;
    HashMap<String, Integer> orderList;
    ArrayList<String> commentList;
    public enum Status{
        Incomplete("Incomplete"),
        Complete("Complete");
        private String value;
        private Status(String value){
            this.value=value;
        }
        public String getValue(){
            return value;
        }
    }
    Status status;
    public Order(Customer customer, LocalDateTime orderDate, Order.Status status){
        this.customer=customer;
        this.orderDate=orderDate;
        this.status=status;
        this.orderList=new HashMap<>();
        this.commentList=new ArrayList<>();
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }
    
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public DeliveryMan getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(DeliveryMan deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public HashMap<String, Integer> getOrderList() {
        return orderList;
    }

    public void setOrderList(HashMap<String, Integer> orderList) {
        this.orderList = orderList;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ArrayList<String> getCommentList() {
        return commentList;
    }

    public void setCommentList(ArrayList<String> commentList) {
        this.commentList = commentList;
    }
    
}
