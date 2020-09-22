package com.kodilla.abstracts;

public class Application {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.giveVoice();

        Animal duck = new Duck();
        duck.giveVoice();

        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);
    }
}
