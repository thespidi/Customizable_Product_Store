package com.check;
import com.ghulam.utils.ValidationUtils;

public void setQuantity(int quantity) {
    if (!ValidationUtils.isValidQuantity(quantity)) {
        ValidationUtils.showError("Quantity must be positive.");
        return;
    }
    this.quantity = quantity;
    updateTotal();
}

public class Cart {
    private int id;                // Unique ID for the cart item
    private String itemName;       // Name of the item in the cart
    private double cost;           // Cost of a single unit of the item
    private int quantity;          // Quantity of the item in the cart
    private double total;          // Total cost (quantity * cost)

    // Constructor to initialize the Cart object
    public Cart(int id, String itemName, double cost, int quantity) {
        this.id = id;
        this.itemName = itemName;
        this.cost = cost;
        this.quantity = quantity;
        this.total = cost * quantity;  // Calculate total cost immediately
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
        updateTotal(); // Recalculate total when cost is updated
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        updateTotal(); // Recalculate total when quantity is updated
    }

    public double getTotal() {
        return total;
    }

    // Method to recalculate the total whenever cost or quantity changes
    private void updateTotal() {
        this.total = this.cost * this.quantity;
    }

    // Override toString method to display cart item details in a formatted manner
    @Override
    public String toString() {
        return String.format(
                "\n\u2588    %02d\t    \u2588 %-40s \u2588   %09.2f\t\t    \u2588   %02d\t     \u2588   %09.02f\t\t \u2588",
                id, itemName, cost, quantity, total);
    }
}
