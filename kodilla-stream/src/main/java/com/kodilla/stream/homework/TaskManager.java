package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {

        // list of all tasks
        TaskRepository.getTasks()
                .stream()
                .map(t -> t.toString())
                .forEach(tn -> System.out.println(tn));

        System.out.println("--------------------------------------");
        // tasks with deadline not met
        List<String> listOfTasks = TaskRepository.getTasks()
                .stream()
                .filter(t -> t.getDeadline().isAfter(LocalDate.now()))
                .map(tn -> tn.getName())
                .collect(Collectors.toList());
        System.out.println(listOfTasks);
    }
}
