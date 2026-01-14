package PolyMorphismAssigment;

import java.util.Scanner;

// Base class
class MenuItem {
    double calculatePrice(double price) {
        return price; // default (no discount)
    }
}

// Veg item
class VegItem extends MenuItem {
    double calculatePrice(double price) {
        return price - (price * 0.40); // 40% discount
    }
}

// Non-Veg item
class NonVegItem extends MenuItem {
    double calculatePrice(double price) {
        return price - (price * 0.20); // 20% discount
    }
}

public class Solution08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter price:");
        double price = sc.nextDouble();

        System.out.println("Select Item Type:");
        System.out.println("1. Veg Item");
        System.out.println("2. Non-Veg Item");

        int choice = sc.nextInt();

        MenuItem item;   // Base class reference (polymorphism)

        switch (choice) {
            case 1:
                item = new VegItem();
                break;
            case 2:
                item = new NonVegItem();
                break;
            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        double finalAmount = item.calculatePrice(price);
        System.out.println("Final Bill Amount: " + finalAmount);

        sc.close();
    }
}
