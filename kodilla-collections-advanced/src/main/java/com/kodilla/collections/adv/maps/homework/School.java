package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Integer> amountOfStudentsPerClass = new ArrayList<>();

    public School(String name, int ... studentsAmountInACertainClass) {
        this.name = name;
        for (int studentsInClassX : studentsAmountInACertainClass)
            this.amountOfStudentsPerClass.add(studentsInClassX);
    }

    @Override
    public String toString() {
        return name + ", amount of students in classes: " + amountOfStudentsPerClass;
    }
}