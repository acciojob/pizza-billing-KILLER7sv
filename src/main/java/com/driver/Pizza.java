package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        // your code goes here
        this.isVeg = isVeg;
        if(this.isVeg) {
            this.price = 300;
        }else{
            this.price = 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        this.price += 80;

    }

    public void addExtraToppings(){
        // your code goes here
        if(this.isVeg){
            this.price += 70;
        }else{
            this.price += 120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        this.price += 20;
    }

    public String getBill(){
        // your code goes here
        this.bill = String.valueOf(this.price);
        return this.bill;
    }
}
