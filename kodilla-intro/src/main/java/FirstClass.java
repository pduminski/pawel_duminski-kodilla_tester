public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2015);
        System.out.println(notebook.weight + "g " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();

        Notebook heavyNotebook = new Notebook(2000,1500, 2019);
        System.out.println(heavyNotebook.weight + "g " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();

        Notebook oldNotebook = new Notebook(1600, 500, 2005);
        System.out.println(oldNotebook.weight + "g " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();

        // testing price/year
        Notebook notebook1 = new Notebook(2000, 1500, 2005);
        System.out.println(notebook1.weight + "g " + notebook1.price + " " + notebook1.year);
        notebook1.checkIfWorthBuying();

        Notebook notebook2 = new Notebook(1600, 950, 2009);
        System.out.println(notebook2.weight + "g " + notebook2.price + " " + notebook2.year);
        notebook2.checkIfWorthBuying();

        Notebook notebook3 = new Notebook(1100, 900, 2015);
        System.out.println(notebook3.weight + "g " + notebook3.price + " " + notebook3.year);
        notebook3.checkIfWorthBuying();

        Notebook notebook4 = new Notebook(3000, 4000, 2019);
        System.out.println(notebook4.weight + "g " + notebook4.price + " " + notebook4.year);
        notebook4.checkIfWorthBuying();

        Notebook notebook5 = new Notebook(2500, 300, 2018);
        System.out.println(notebook5.weight + "g " + notebook5.price + " " + notebook5.year);
        notebook5.checkIfWorthBuying();


    }
}
