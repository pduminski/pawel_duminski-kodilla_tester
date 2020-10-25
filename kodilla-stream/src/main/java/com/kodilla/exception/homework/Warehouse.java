package com.kodilla.exception.homework;

import com.kodilla.exception.AirportNotFoundException;

import java.util.HashSet;
import java.util.Set;

public class Warehouse {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("66"));
        warehouse.addOrder(new Order("1000"));
        warehouse.addOrder(new Order("1001"));
        warehouse.addOrder(new Order("1002"));

        try {
            Order correct = warehouse.getOrder("66");
            System.out.println(correct);
        } catch (OrderDoesntExistException e) {
            System.out.println("Provided order number does not exist");
        }

        try {
            Order incorrect = warehouse.getOrder("1003");
            System.out.println(incorrect);
        } catch (OrderDoesntExistException e) {
            System.out.println("Provided order number does not exist");
        }
    }
    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        orders.add(order);
        System.out.println("Order with number: " + order.getNumber() + " has been added.");
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        if (orders.stream().filter(n -> n.getNumber().equals(number)).count() == 1)
            return orders.stream().filter(n -> n.getNumber().equals(number)).findFirst().get();
        throw new OrderDoesntExistException();
    }
}

