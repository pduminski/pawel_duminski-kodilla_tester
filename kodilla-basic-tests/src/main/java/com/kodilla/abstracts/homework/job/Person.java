package com.kodilla.abstracts.homework.job;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void getResponsibilities() {
        System.out.println(firstName + "'s responsibility is to " + job.getResponsibilities());
    }
}
