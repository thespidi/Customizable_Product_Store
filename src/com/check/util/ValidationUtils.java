package com.ghulam.utils;

public class ValidationUtils {

    // Validate non-negative price
    public static boolean isValidPrice(double price) {
        return price >= 0;
    }

    // Validate positive quantity
    public static boolean isValidQuantity(int quantity) {
        return quantity > 0;
    }

    // Validate non-empty strings
    public static boolean isValidString(String value) {
        return value != null && !value.trim().isEmpty();
    }

    // Display error messages
    public static void showError(String message) {
        System.err.println("Error: " + message);
    }
}
