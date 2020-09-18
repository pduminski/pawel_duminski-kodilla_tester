import java.util.Random;

public class RandomNumbers {
    private int sumOfNumbers = 0;
    private int lowestReturnedValue = -1; // out of bounds value
    private int highestReturnedValue = 31; // out of bounds value

    public void returnedNumberAfterReaching5000() {
        Random rand = new Random();
        int lowestValue = 31;
        int highestValue = 0; // 31 because the second value for generating int is exclusive not inclusive

        while (sumOfNumbers < 5000) {

                int number = rand.nextInt(31);
            System.out.println(number);
                // lowest - to 100 jest po to, zeby przy pierwszym uruchomieniu przekazac juz warosc number / np tylko przy 1 iteracji
                getLowestReturnedValue(number);

                // highest - to 100 jest po to, zeby przy pierwszym uruchomieniu przekazac juz warosc number
                getHighestReturnedValue(number);

                System.out.println("Generated Number: " + number + ", sum of the numbers: " + sumOfNumbers);

                sumOfNumbers += number;
        }
        System.out.println("Sum of the numbers after reaching value 5000 is: " + sumOfNumbers);
    }

    public int getLowestReturnedValue(int number) {
        if (number <= lowestReturnedValue) {
            lowestReturnedValue = number;
        }
        return lowestReturnedValue;
    }

    public int getHighestReturnedValue(int number) {
        if (number >= highestReturnedValue) {
            highestReturnedValue = number;
        }
        return highestReturnedValue;
    }
}
