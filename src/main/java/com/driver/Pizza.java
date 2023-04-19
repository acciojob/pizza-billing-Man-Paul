package com.driver;

public class Pizza {

    private int price;
    private int totalPrice;
    private Boolean isVeg;
    private String bill = "";
    private int cheeseCount = 0;
    private int toppingsCount = 0;
    private int takeawayCount = 0;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg){
            this.price = 300;
            totalPrice = 300;
        }
        else{
            this.price = 400;
            totalPrice = 400;
        }
        bill += "Base Price Of The Pizza: " + totalPrice + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(cheeseCount == 0){
            totalPrice += 80;
            bill += "Extra Cheese Added: " + 80 + "\n";
        }
        cheeseCount = 1;
    }

    public void addExtraToppings(){
        // your code goes here
        if(toppingsCount == 0 && this.getPrice() == 300){   //veg
            totalPrice += 70;
            bill += "Extra Toppings Added: " + 70 + "\n";
        }
        else if(toppingsCount == 0 && this.getPrice() == 400){//non-veg
            totalPrice += 120;
            bill += "Extra Toppings Added: " + 120 + "\n";
        }
        toppingsCount = 1;
    }

    public void addTakeaway(){
        // your code goes here
        if(takeawayCount == 0){
            totalPrice += 20;
            bill += "Paperbag Added: " + 20 + "\n";
        }
        takeawayCount = 1;
    }

    public String getBill(){
        // your code goes here
        bill += "Total Price: " + totalPrice + "\n";
        return this.bill;
    }
}