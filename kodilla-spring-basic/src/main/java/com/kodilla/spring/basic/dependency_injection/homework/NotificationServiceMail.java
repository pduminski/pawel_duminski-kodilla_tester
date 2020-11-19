package com.kodilla.spring.basic.dependency_injection.homework;

public class NotificationServiceMail implements NotificationService {
    @Override
    public void success(String address) {
        System.out.println("Package delivered to: " + address + " [mail notification]");
    }

    @Override
    public void fail(String address) {
        System.out.println("Package not delivered to: " + address + "[mail notification]");
    }
}
