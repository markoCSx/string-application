package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {

        System.out.println();

        //1. Create variables for an item name (String) and item price (double)

        String itemName = "Starbucks coffee";
        double itemPrice = 9.99;

        //2. Create a quantity variable (int)

        int itemQuantity = 1;

        //3. Build and print: EX. "You bought 3 apples for $7.10"

        System.out.println("You bought " + itemQuantity + " " + itemName + " for " + itemPrice);
    }
}
