package com.customisableproductstore;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String email;
    private List<String> orderHistory;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.orderHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getOrderHistory() {
        return orderHistory;
    }

    public void addOrder(String order) {
        orderHistory.add(order);
    }
}
