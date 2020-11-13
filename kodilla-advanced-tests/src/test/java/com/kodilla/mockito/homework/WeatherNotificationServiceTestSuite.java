package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WeatherNotificationServiceTestSuite {

    WeatherNotificationService notificationService = new WeatherNotificationService();
    Subscriber subscriber = Mockito.mock(Subscriber.class);
    Location location1 = Mockito.mock(Location.class);
    Location location2 = Mockito.mock(Location.class);
    WeatherNotification notification = Mockito.mock(WeatherNotification.class);

    @Test
    public void subscriberShouldGetWeatherNotificationForGivenLocation() {
        // subscribe user to location
        notificationService.addSubscriberToGivenLocation(location1, subscriber);
        // send notification to subscribers of the location
        notificationService.sendNotificationForLocation(notification, location1);

        System.out.println(notificationService.getMap());
        Mockito.verify(subscriber, Mockito.times(1)).receiveWeatherNotification(notification);
    }

    @Test
    public void subscriberCanUnsubscribeFromGivenLocation() {
        // subscribe user to different locations
        notificationService.addSubscriberToGivenLocation(location1, subscriber);
        notificationService.addSubscriberToGivenLocation(location2, subscriber);
        // unsubscribe user from given location
        notificationService.removeSubscriberFromGivenLocation(location2, subscriber);
        // send weather notifications
        notificationService.sendAllWeatherNotifications(notification);

        Mockito.verify(subscriber, Mockito.times(1)).receiveWeatherNotification(notification);
        // TODO if we want to check numberOfInvocations before and after subscription is deleted we will receive '3'
    }

    @Test
    public void subscriberCanUnsubscribeFromAllLocations() {
        // subscribe user to different locations
        notificationService.addSubscriberToGivenLocation(location1, subscriber);
        notificationService.addSubscriberToGivenLocation(location2, subscriber);
        // unsubscribe user from all locations TODO method which should do it doesn't work
        notificationService.removeSubscriberFromGivenLocation(location2, subscriber);
        notificationService.removeSubscriberFromGivenLocation(location1, subscriber);
        // send weather notifications
        notificationService.sendAllWeatherNotifications(notification);

        Mockito.verify(subscriber, Mockito.never()).receiveWeatherNotification(notification);
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