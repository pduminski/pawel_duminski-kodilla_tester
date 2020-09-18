import java.util.Random;

public class RandomNumbers {
    private int sumOfNumbers = 0;
    private int lowestReturnedValue = 31; // highest out of bounds
    private int highestReturnedValue = -1; // out of bounds value

    public void returnedNumberAfterReaching5000() {
        Random rand = new Random();
        int lowestValue = 0;
        int highestValue = 31; // 31 because the second value for generating int is exclusive not inclusive

        while (sumOfNumbers < 5000) {
            int number = rand.nextInt(31);

            getLowestReturnedValue(number);
            getHighestReturnedValue(number);

            System.out.println("Generated Number: " + number + ", sum of the numbers: " + sumOfNumbers);

            sumOfNumbers += number;
        }
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

    public void printHighestAndLowest() {
        System.out.println("Highest: " + this.highestReturnedValue + " Lowest: " + this.lowestReturnedValue);
    }
}