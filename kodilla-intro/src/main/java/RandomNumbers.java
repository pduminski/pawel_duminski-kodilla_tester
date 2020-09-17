import java.util.Random;

public class RandomNumbers {
    private int sumOfNumbers = 0;
    private int lowestReturnedValue = 32; // out of bounds value
    private int highestReturnedValue = -1; // out of bounds value

    public void returnedNumberAfterReaching5000() {
        Random rand = new Random();
        int lowestValue = 0;
        int highestValue = 31; // 31 because the second value for generating int is exclusive not inclusive

        while (sumOfNumbers < 5000) {
//                int number = rand.nextInt(highestValue - lowestValue) + lowestValue - highestValue;
                int number = lowestValue +  (int)(Math.random()*(highestValue));

                // lowest - to 100 jest po to, zeby przy pierwszym uruchomieniu przekazac juz warosc number / np tylko przy 1 iteracji
                if (number <= lowestReturnedValue) {
                    lowestReturnedValue = number;
                }

                // highest - to 100 jest po to, zeby przy pierwszym uruchomieniu przekazac juz warosc number
                if (number >= highestReturnedValue) {
                    highestReturnedValue = number;
                }

                System.out.println("Generated Number: " + number + ", sum of the numbers: " + sumOfNumbers);

                sumOfNumbers += number;
                continue;

        }
        System.out.println("Sum of the numbers after reaching value 5000 is: " + sumOfNumbers);
    }

    public int getLowestReturnedValue() {
        return lowestReturnedValue;
    }

    public int getHighestReturnedValue() {
        return highestReturnedValue;
    }
}
