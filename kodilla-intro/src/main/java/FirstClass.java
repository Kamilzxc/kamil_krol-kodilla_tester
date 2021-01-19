public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook (600,1000,2019);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkQuality();

        Notebook heavyNotebook = new Notebook(2000,1500,2021);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkQuality();

        Notebook oldNotebook = new Notebook(1200,500,2009);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkQuality();

    }
}