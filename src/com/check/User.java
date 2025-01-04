package com.ghulam.user;

import com.ghulam.utils.ValidationUtils;

import java.util.Scanner;

public class User {
    private String name;
    private String email;
    private String phone;

    public User(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Method to capture user details
    public static User getUserDetails(Scanner scanner) {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        String email;
        do {
            System.out.print("Enter your email: ");
            email = scanner.nextLine();
        } while (!ValidationUtils.isValidEmail(email));

        String phone;
        do {
            System.out.print("Enter your phone number: ");
            phone = scanner.nextLine();
        } while (!ValidationUtils.isValidPhone(phone));

        return new User(name, email, phone);
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nEmail: " + email + "\nPhone: " + phone;
    }
}
