package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolManagement = new HashMap<>();
        Principal principalTom = new Principal("Tom", "Taylor");
        Principal principalGeorge = new Principal("George", "Awful");
        Principal principalAlbert = new Principal("Albert", "Alberto");

        School schoolCopernicus = new School("Copernicus School", 31, 25, 27);
        School schoolJohnDoe = new School("John Doe School", 30, 30, 20);
        School schoolMinority = new School("Not A very popular school", 5, 9, 11);

        schoolManagement.put(principalTom, schoolCopernicus);
        schoolManagement.put(principalGeorge, schoolJohnDoe);
        schoolManagement.put(principalAlbert, schoolMinority);

        for (Map.Entry<Principal, School> principalToSchool : schoolManagement.entrySet()) {
            System.out.println(principalToSchool.getKey() + " takes care of " +
                    principalToSchool.getValue());
        }
    }
}