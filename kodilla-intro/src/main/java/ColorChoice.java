public class ColorChoice {
    public String printColor() {
        String colorChoice = UserChoice.chooseColor();
        String chosenColor = "";

        switch (colorChoice) {
            case "R":
                chosenColor = "RED";
                break;
            case "G":
                chosenColor = "GREEN";
                break;
            case "B":
                chosenColor = "BLUE";
                break;
            case "Y":
                chosenColor = "YELLOW";
                break;
            default:
                System.out.println("Something went wrong...");
        }
        return chosenColor;
    }
}
