package com.example.aditi.foodorderingapp;

/**
 * Created by aditi on 6/4/18.
 */

public class Order {
    String username, itemname;

    public Order(){

    }

    public Order(String username, String itemname){
        this.itemname = itemname;
        this.username = username;
    }

    public String getUsername(){
        return username;
    }

    public String getItemname(){
        return itemname;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setItemname(String itemname){
        this.itemname = itemname;
    }
}
