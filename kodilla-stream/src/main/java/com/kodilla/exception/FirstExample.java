package com.kodilla.exception;

public class FirstExample {
    public static void main(String[] args) {
        String username = "John Cena";
        String[] nameParts = username.split(" ");
        System.out.println("First name: " + nameParts[0]);
        System.out.println("Last name: " + nameParts[1]);
    }
}
