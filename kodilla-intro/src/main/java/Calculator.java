public class Calculator {

    static int counter = 0;

    public Calculator() {
        counter++;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double circleArea(double r) {
        String name = UserDialogs.getUserName();
        System.out.println("Hi, " + name + ". Thank you for using our software");
        return Math.PI * r * r;
    }

    public double circleParimeter(double r) {
        return 2 * Math.PI * r;
    }
}
