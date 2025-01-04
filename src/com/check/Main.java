package com.ghulam;

import com.ghulam.product.Product;
import com.ghulam.product.ProductView;
import com.ghulam.utils.ValidationUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> products = ProductView.initializeProducts(); // Load predefined products
        ArrayList<Cart> cart = new ArrayList<>();
        boolean exit = false;

        System.out.println("Welcome to the Customisable Product Store!");

        while (!exit) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. View Products");
            System.out.println("2. Customize Product");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    ProductView.displayProducts(products);
                    break;

                case "2":
                    ProductView.customizeProduct(products, cart, scanner);
                    break;

                case "3":
                    CartView.displayCart(cart);
                    break;

                case "4":
                    CartView.checkout(cart);
                    exit = true; // Exit after checkout
                    break;

                case "5":
                    System.out.println("Thank you for visiting! Goodbye!");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
