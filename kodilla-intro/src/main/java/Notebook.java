public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        } else if (this.price > 1000) {
            System.out.println("This notebook is expensive");
        } else {
            System.out.println("Something went wrong...");
        }
    }

    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This is so light!");
        } else if (this.weight >= 1000 && this.weight <= 1700) {
            System.out.println("This weight is perfect.");
        } else if (this.weight > 1700) {
            System.out.println("This is too heavy!");
        } else {
            System.out.println("Something went wrong...");
        }
    }

    public void checkIfWorthBuying() {
        if (this.price > 1000 && this.year < 2010) {
            System.out.println("Not worth the price nowadays.");
        } else if (this.price < 1000 && this.year < 2010) {
            System.out.println("Worth considering.");
        } else if ((this.price > 700 && this.price <= 1500) && this.year >= 2010) {
            System.out.println("Standard price.");
        } else  if (this.price > 1500 && this.year >= 2010) {
            System.out.println("High-end laptop.");
        } else {
            System.out.println("This is too cheap to be true - scam alert.");
        }
    }
}
