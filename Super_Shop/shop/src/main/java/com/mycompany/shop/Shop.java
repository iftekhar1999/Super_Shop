package com.mycompany.shop;

import java.util.Scanner;

public class Shop {
    
    // Instance variables for items
    int item;
    
    // Constructor
    public Shop(){
        System.out.println("This is constructor");
    }
    
    // Method to set item
    public void setItem(int item){
        this.item = item;
    }
    
    // Method to get item
    public int getItem(){
        return item;
    }

    // Method to display fish price
    public void fishPrice(){
        System.out.println("Taka 800 per fish");
    }
    
    // Method to display grocery price
    public void groceryPrice(){
        System.out.println("Taka 500 per grocery item");
    }
    
    // Method to display meat price
    public void meatPrice(){
        System.out.println("Taka 700 per kg meat");
    }  

    public static void main(String[] args) {
        
        System.out.println("Welcome to our shop !!! ");
        
        // Create scanner object to take input
        Scanner obj = new Scanner(System.in);
        
        // Prompt for user name
        System.out.print("Enter your name: ");
        String name = obj.nextLine();
        System.out.println("Hello, " + name);
        
        // Create instances of Shop for different products
        Shop fish = new Shop();
        Shop grocery = new Shop();
        Shop meat = new Shop();
        
        // Calling methods using objects
        fish.fishPrice();
        grocery.groceryPrice();
        meat.meatPrice();
        
        // Set and get item example (using encapsulation)
        fish.setItem(800);  // Setting price for fish
        System.out.println("Fish Price: " + fish.getItem() + " Taka");
        
        grocery.setItem(500);  // Setting price for grocery
        System.out.println("Grocery Price: " + grocery.getItem() + " Taka");
        
        meat.setItem(700);  // Setting price for meat
        System.out.println("Meat Price: " + meat.getItem() + " Taka");
    } 
}
