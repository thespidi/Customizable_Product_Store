package com.ghulam.product;

import com.ghulam.utils.ValidationUtils; // Importing validation utilities

public class Product {
    private String name;
    private double price;
    private String color;         // Customization: Color
    private String design;        // Customization: Design
    private String customText;    // Customization: Custom Text

    // Constructor
    public Product(String name, double price) {
        if (!ValidationUtils.isValidString(name)) {
            throw new IllegalArgumentException("Product name cannot be null or empty.");
        }
        if (!ValidationUtils.isValidPrice(price)) {
            throw new IllegalArgumentException("Price must be non-negative.");
        }
        this.name = name;
        this.price = price;
        this.color = "Default Color";   // Default customization
        this.design = "Default Design"; // Default customization
        this.customText = "";           // Default customization
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!ValidationUtils.isValidString(name)) {
            throw new IllegalArgumentException("Product name cannot be null or empty.");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (!ValidationUtils.isValidPrice(price)) {
            throw new IllegalArgumentException("Price must be non-negative.");
        }
        this.price = price;
    }

    // Get and Set Customizations
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (!ValidationUtils.isValidString(color)) {
            throw new IllegalArgumentException("Color cannot be null or empty.");
        }
        this.color = color;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        if (!ValidationUtils.isValidString(design)) {
            throw new IllegalArgumentException("Design cannot be null or empty.");
        }
        this.design = design;
    }

    public String getCustomText() {
        return customText;
    }

    public void setCustomText(String customText) {
        if (!ValidationUtils.isValidString(customText)) {
            throw new IllegalArgumentException("Custom text cannot be null or empty.");
        }
        this.customText = customText;
    }

    // Method to apply customizations to the product
    public void applyCustomization(String color, String design, String customText) {
        setColor(color);
        setDesign(design);
        setCustomText(customText);
    }

    // Override toString for easy display of product details
    @Override
    public String toString() {
        return "Product: " + name + "\n" +
               "Price: $" + String.format("%.2f", price) + "\n" +
               "Color: " + color + "\n" +
               "Design: " + design + "\n" +
               "Custom Text: " + (customText.isEmpty() ? "None" : customText);
    }
}
