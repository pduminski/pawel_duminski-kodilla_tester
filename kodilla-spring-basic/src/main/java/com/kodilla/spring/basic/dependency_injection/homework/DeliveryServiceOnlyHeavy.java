package com.kodilla.spring.basic.dependency_injection.homework;

public class DeliveryServiceOnlyHeavy implements DeliveryService {
    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight < 70) {
            System.out.println("Package is too light for us");
            return false;
        }
        System.out.println("Delivering in progress...");
        return true;
    }
}
