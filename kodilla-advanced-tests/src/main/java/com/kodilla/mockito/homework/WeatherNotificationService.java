package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherNotificationService {

//    HashMap<Subscriber, Set<Location>> locationSubscriberHashMap = new HashMap<>();
//
//    public void addSubscriberToGivenLocation(Location location, Subscriber subscriber) {
//        locationSubscriberHashMap.put(subscriber);
//        locationSubscriberHashMap.computeIfAbsent(subscriber, k -> new HashSet<>()).add(location);
//    }
//
//    public void removeSubscriberFromGivenLocation(Location location, Subscriber subscriber) {
//        locationSubscriberHashMap.remove(location, subscriber);
//    }
//
//    public void removeSubscriberFromAllLocations(Subscriber subscriber) {
//        for (Map.Entry<Location, Subscriber> locationSubscriberEntry : locationSubscriberHashMap.entrySet()) {
//            if (locationSubscriberEntry.getValue().equals(subscriber))
//                locationSubscriberHashMap.remove(locationSubscriberEntry.getKey());
//        }
//    }
//
//    public void sendGlobalNotification(WeatherNotification notification) {
//
//    }
//
//    public void sendNotificationForLocation(WeatherNotification notification, Location location) {
//        for (Map.Entry<Location, Subscriber> locationSubscriberEntry : locationSubscriberHashMap.entrySet())
//            if (locationSubscriberEntry.getKey().equals(location))
//                locationSubscriberEntry.getValue().receiveWeatherNotification(notification);
//    }
//
//    public void sendAllWeatherNotifications(WeatherNotification notification) {
//        for (Map.Entry<Location, Subscriber> locationSubscriberEntry : locationSubscriberHashMap.entrySet()) {
//            locationSubscriberEntry.getValue().receiveWeatherNotification(notification);
//        }
//    }
//
//    public Map<Location, Subscriber> getMap() {
//        return locationSubscriberHashMap;
//    }
}
