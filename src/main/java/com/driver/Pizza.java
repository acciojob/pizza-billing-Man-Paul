package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public int extraCheese = 0;

    public int extraToppings = 0;

    public int paperbag = 0;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg == true)
            price = 300;
        else
            price = 400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        extraCheese = 80;
    }

    public void addExtraToppings(){
        // your code goes here
        extraToppings = 70;
    }

    public void addTakeaway(){
        // your code goes here
        paperbag = 20;
    }

    public String getBill(){
        // your code goes here
        bill = "";
        int total = getPrice() + extraCheese + extraToppings + paperbag;
        bill += "Base Price of the Pizza: " + getPrice() + "\n" +
                "Extra Cheese Added: " + extraCheese + "\n" +
                "Extra Toppings Added: " + extraToppings + "\n" +
                "Paperbag Added: " + paperbag + "\n" +
                "Total Price: " + total;
        return this.bill;
    }
}
