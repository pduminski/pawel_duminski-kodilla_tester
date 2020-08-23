public class SimpleArray {
    public static void main(String[] args) {

        String[] cars = new String[] {"Honda", "Seat", "Audi", "Skoda", "Hundai"};
        String car = cars[3];
        int  numberOfElements = cars.length;

        System.out.println(car);
        System.out.println("Length of the table: " + numberOfElements + " elements");

    }
}
