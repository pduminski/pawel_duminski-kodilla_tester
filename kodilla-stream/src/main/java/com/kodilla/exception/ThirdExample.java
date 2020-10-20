package com.kodilla.exception;

public class ThirdExample {
    public static void main(String[] args) {
        AirportRepository airportRepository = new AirportRepository();
        try {
            boolean isVienaInUse = airportRepository.isAirportInUse("Viena");
            System.out.println("Viena status: " + isVienaInUse);
        } catch (AirportNotFoundException e) {
            System.out.println("Sorry, the airport cannot be served by our airlines");
        } finally {
            System.out.println("Thank you for using Kodilla airlines");
        }

    }
}
