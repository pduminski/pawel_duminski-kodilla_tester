package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student("Tom Taylor", new Teacher("Mr. Brown")));
        listOfStudents.add(new Student("Tony Montana", new Teacher("Mr. Blue")));
        listOfStudents.add(new Student("Will Smith", null));

        for (Student student : listOfStudents)
            System.out.println(student.getName() + "  " + student.getTeacher().getName());
    }
}
