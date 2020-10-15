package com.kodilla.stream.homework;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(
                "Learning STEAMS",
                LocalDate.now(),
                LocalDate.now().plusDays(5)));
        tasks.add(new Task(
                "Finish this exercise",
                LocalDate.now().minusWeeks(1),
                LocalDate.now().minusDays(2)));
        tasks.add(new Task(
                "Learning JAVA",
                LocalDate.of(2020, 9, 1),
                LocalDate.of(2021, 12, 24)));
        tasks.add(new Task(
                "Learning Selenium",
                LocalDate.of(2020, 9, 1).minusMonths(2),
                LocalDate.of(2020, Month.OCTOBER, 24)));

        return tasks;
    }
}
