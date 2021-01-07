public class SimpleArray {
    public static void main(String[] args) {
        String[] names = new String[] {"Rafał", "Damian", "Piotr", "Grzegorz", "Dariusz"};

        String name = names[2];
        System.out.println(name);

        int numberOfElements = names.length;
        if (names.length == 5) {
            System.out.println("moja tablica zawiera 5 elementów");
        }

        }
    }
