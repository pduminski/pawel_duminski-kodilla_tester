package com.kodilla.mockito.homework;

import com.kodilla.mockito.Notification;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class WeatherNotificationServiceTestSuite {

    WeatherNotificationService notificationService = new WeatherNotificationService();
    Subscriber subscriber1 = Mockito.mock(Subscriber.class);
    Subscriber subscriber2 = Mockito.mock(Subscriber.class);
    Location location1 = Mockito.mock(Location.class);
    Location location2 = Mockito.mock(Location.class);
    WeatherNotification notification1 = Mockito.mock(WeatherNotification.class);
    WeatherNotification notification2 = Mockito.mock(WeatherNotification.class);

    @Test
    public void subscriberShouldGetWeatherNotificationForGivenLocation() {
        // add two subscribers to notificationService
        notificationService.addSubscriber(subscriber1);
        notificationService.addSubscriber(subscriber2);
        // add two locations to notificationService
        notificationService.addLocation(location1);
        notificationService.addLocation(location2);
        // connect subscribers to different locations
        notificationService.addSubscriberToGivenLocation(location1, subscriber1);
        notificationService.addSubscriberToGivenLocation(location2, subscriber2);
        // send different notification for every location
        notificationService.sendNotificationForLocation(notification1, location1);
        notificationService.sendNotificationForLocation(notification2, location2);

        Mockito.verify(subscriber1, Mockito.times(1)).receiveWeatherNotification(notification1);
        Mockito.verify(subscriber2, Mockito.times(1)).receiveWeatherNotification(notification2);
    }

    @Test
    public void subscriberCanUnsubscribeFromGivenLocation() {

    }

    @Test
    public void subscriberCanUnsubscribeFromAllLocations() {

    }

    @Test
    public void notificationFromGivenLocationShouldBeReachedOnlyByThisLocationSubscribers() {

    }

    @Test
    public void systemShouldAllowSendingNotificationToEveryone() {

    }

    @Test
    public void givenLocationCanBeDeleted() {

    }
}