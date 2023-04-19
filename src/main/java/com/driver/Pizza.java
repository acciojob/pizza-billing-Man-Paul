package com.driver;

public class Pizza {

    private int price;
    private int totalPrice;
    private Boolean isVeg;
    public String bill = "";
    private int cheeseCount = 0;
    private int toppingsCount = 0;
    private int takeawayCount = 0;
    private int getbillCount = 0;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg){
            this.price = 300;
            this.totalPrice = 300;
        }
        else{
            this.price = 400;
            this.totalPrice = 400;
        }
        this.bill += "Base Price Of The Pizza: " + this.totalPrice + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(cheeseCount == 0){
            this.totalPrice += 80;
            this.bill += "Extra Cheese Added: " + 80 + "\n";
        }
        cheeseCount = 1;
    }

    public void addExtraToppings(){
        // your code goes here
        if(toppingsCount == 0 && this.getPrice() == 300){   //veg
            this.totalPrice += 70;
            this.bill += "Extra Toppings Added: " + 70 + "\n";
        }
        else if(toppingsCount == 0 && this.getPrice() == 400){//non-veg
            this.totalPrice += 120;
            this.bill += "Extra Toppings Added: " + 120 + "\n";
        }
        toppingsCount = 1;
    }

    public void addTakeaway(){
        // your code goes here
        if(takeawayCount == 0){
            this.totalPrice += 20;
            this.bill += "Paperbag Added: " + 20 + "\n";
        }
        takeawayCount = 1;
    }

    public String getBill(){
        // your code goes here
        if(getbillCount == 0){
            this.bill += "Total Price: " + this.totalPrice + "\n";
        }
        getbillCount = 1;
        return this.bill;
    }
}