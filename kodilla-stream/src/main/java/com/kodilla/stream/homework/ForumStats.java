package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double averageNumberOfPosts = UsersRepository.getUsersList()
                .stream()
                .map(u -> u.getNumberOfPosts())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("Average number of posts for all users: " + averageNumberOfPosts);

        double averageNumberOfPostsForUserAboveOrEqual40 = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .map(n -> n.getNumberOfPosts())
                .mapToInt(m -> m)
                .average()
                .getAsDouble();
        System.out.println("Average number of posts for users above or equal 40: " + averageNumberOfPostsForUserAboveOrEqual40);

        double averageNumberOfPostsForUsersBelow40 = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .map(n -> n.getNumberOfPosts())
                .mapToInt(m -> m)
                .average()
                .getAsDouble();
        System.out.println("Average number of posts for user below 40: " + averageNumberOfPostsForUsersBelow40);
    }
}
