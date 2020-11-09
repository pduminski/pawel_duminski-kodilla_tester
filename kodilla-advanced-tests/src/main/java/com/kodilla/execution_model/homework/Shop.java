package com.kodilla.execution_model.homework;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Shop {
    Set<Order> uniqueOrders = new HashSet<>();

    public void addOrder(Order order) {
        uniqueOrders.add(order);
    }

    public Set<Order> ordersFromLastTwoYears() {
        Set<Order> ordersWithDateLessThenTwoYears = new HashSet<>();
        for (Order order : uniqueOrders) {
            if (!order.getOrderDate().before(Date.valueOf(LocalDate.now().minusYears(2)))) {
                ordersWithDateLessThenTwoYears.add(order);
            }
        }

        return ordersWithDateLessThenTwoYears;
    }

    public Set<Order> returnOrdersWhichAreBetweenBoundriesOfLowestAndHighestOrderValue(double lowest, double highest) {
        Set<Order> orders = new HashSet<>();
        for (Order order : uniqueOrders) {
            if (order.getOrderValue() > lowest && order.getOrderValue() < highest)
                orders.add(order);
        }
        return orders;
    }

    public int returnOrdersAmount() {
        return uniqueOrders.size();
    }

    public double returnValueForAllOrders() {
        double result = 0.00;
        for (Order order : uniqueOrders) {
            result += order.orderValue;
        }
        return result;
    }
}
