package com.driver;

public class Pizza {

    private int price;
    private int totalPrice;
    private Boolean isVeg;

    private int toppings;
    boolean isCheeseAdded;
    boolean isToppingsAdded;
    boolean isBillCreated;
    boolean isTakeAway;
    public String bill = "";
//    public int cheeseCount = 0;
//    private int toppingsCount = 0;
//    private int takeawayCount = 0;
//    private int getbillCount = 0;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg){
            this.price = 300;
            this.toppings=70;
//            this.totalPrice = 300;
        }
        else{
            this.price = 400;
            this.toppings = 120;
//            this.totalPrice = 400;
        }
        this.bill += "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded){
            this.price += 80;
            isCheeseAdded = true;
//            this.bill += "Extra Cheese Added: " + 80 + "\n";
        }
//        this.cheeseCount = 1;
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded){
            this.price += this.toppings;
            isToppingsAdded = true;
        }
//        if(this.toppingsCount == 0 && this.price == 300){   //veg
//            this.totalPrice += 70;
//            this.bill += "Extra Toppings Added: " + 70 + "\n";
//        }
//        else if(this.toppingsCount == 0 && this.price == 400){//non-veg
//            this.totalPrice += 120;
//            this.bill += "Extra Toppings Added: " + 120 + "\n";
//        }
//        this.toppingsCount = 1;
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            this.price += 20;
            isTakeAway = true;
        }
//        if(this.takeawayCount == 0){
//            this.totalPrice += 20;
//            this.bill += "Paperbag Added: " + 20 + "\n";
//        }
//        this.takeawayCount = 1;
    }

    public String getBill(){
        // your code goes here
        if(!isBillCreated){
            if(isCheeseAdded){
                this.bill += "Extra Cheese Added: " + 80 + "\n";
            }
            if(isToppingsAdded){
                this.bill += "Extra Toppings Added: " + this.toppings + "\n";
            }
            if(isTakeAway){
                this.bill += "Paperbag Added: " + 20 + "\n";
            }
            this.bill += "Total Price: " + this.price + "\n";
            this.isBillCreated = true;
            return this.bill;
        }
//        if(this.getbillCount == 0){
//            this.bill += "Total Price: " + this.totalPrice + "\n";
//        }
//        this.getbillCount = 1;
//        return this.bill;
        return "";
    }
}