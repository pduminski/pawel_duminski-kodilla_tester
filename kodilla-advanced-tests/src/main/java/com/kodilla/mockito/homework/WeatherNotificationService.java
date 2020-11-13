package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherNotificationService {

    private Set<Subscriber> subscribers = new HashSet<>();
    private Set<Location> locations = new HashSet<>();
    Map<Location, Subscriber> locationSubscriberHashMap = new HashMap<>();

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void addLocation(Location location) {
        locations.add(location);
    }

    public void addSubscriberToGivenLocation(Location location, Subscriber subscriber) {
        locationSubscriberHashMap.put(location, subscriber);
    }

    public void removeSubscriberFromGivenLocation(Location location, Subscriber subscriber) {

    }

    public void sendGlobalNotification(WeatherNotification notification) {
        subscribers.forEach(subscriber -> subscriber.receiveWeatherNotification(notification));
    }

    public void sendNotificationForLocation(WeatherNotification notification, Location location) {
        for (Map.Entry<Location, Subscriber> locationSubscriberEntry : locationSubscriberHashMap.entrySet())
            if (locationSubscriberEntry.getKey().equals(location))
                locationSubscriberEntry.getValue().receiveWeatherNotification(notification);
    }
}
