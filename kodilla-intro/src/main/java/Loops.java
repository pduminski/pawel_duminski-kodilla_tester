public class Loops {
    public static void main(String[] args) {

        int[] numbers = new int[] {1, 3, 5, 7, 9};
        countAndDisplaySumOfAllElements(numbers);
    }

    private static void countAndDisplaySumOfAllElements(int[] provideNumbers) {
        int[] helper = provideNumbers;
        int sum = 0;

        for (int i = 0; i < helper.length; i++) {
            sum += helper[i];
        }

        System.out.println("Sum of all the elements it: " + sum);
    }
}
