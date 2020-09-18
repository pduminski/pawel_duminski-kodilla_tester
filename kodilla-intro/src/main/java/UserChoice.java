import java.util.Scanner;

public class UserChoice {
    public static String chooseColor() {
        Scanner chooseColor = new Scanner(System.in);
        System.out.println("Enter color: ");
        String chosenColor = chooseColor.nextLine().trim().toUpperCase();

        return chosenColor;
    }
}
