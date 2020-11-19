package com.kodilla.spring.basic.dependency_injection.homework;

public class NotificationServiceSMS implements NotificationService {
    @Override
    public void success(String address) {
        System.out.println("SMS notification - Package delivered to: " + address);
    }

    @Override
    public void fail(String address) {
        System.out.println("SMS notification - Package not delivered to: " + address);
    }
}
