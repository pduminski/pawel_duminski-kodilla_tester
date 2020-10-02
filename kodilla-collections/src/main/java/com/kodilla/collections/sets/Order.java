package com.kodilla.collections.sets;

import java.util.Objects;

public class Order {
    private String oderNumber;
    private String productName;
    private double quantity;

    public Order(String oderNumber, String productName, double quantity) {
        this.oderNumber = oderNumber;
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getOderNumber() {
        return oderNumber;
    }

    public String getProductName() {
        return productName;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.quantity, quantity) == 0 &&
                Objects.equals(oderNumber, order.oderNumber) &&
                Objects.equals(productName, order.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oderNumber, productName, quantity);
    }

    @Override
    public String toString() {
        return "Order{" +
                "oderNumber='" + oderNumber + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
