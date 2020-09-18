public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2015);
        Notebook heavyNotebook = new Notebook(2000,1500, 2019);
        Notebook oldNotebook = new Notebook(1600, 500, 2005);
        Notebook notebook1 = new Notebook(2000, 1500, 2005);
        Notebook notebook3 = new Notebook(1100, 900, 2015);
        Notebook notebook4 = new Notebook(3000, 4000, 2019);
        Notebook notebook5 = new Notebook(2500, 300, 2018);
        Notebook notebook2 = new Notebook(1600, 950, 2009);

        notebookParameters(notebook);
        notebookParameters(heavyNotebook);
        notebookParameters(oldNotebook);

        // testing price/year
        checkIfWorth(notebook1);
        checkIfWorth(notebook2);
        checkIfWorth(notebook3);
        checkIfWorth(notebook4);
        checkIfWorth(notebook5);
    }

    private static void checkIfWorth(Notebook notebook2) {
        System.out.println(notebook2.weight + "g " + notebook2.price + " " + notebook2.year);
        notebook2.checkIfWorthBuying();
    }

    private static void notebookParameters(Notebook notebook) {
        System.out.println(notebook.weight + "g " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
    }
}