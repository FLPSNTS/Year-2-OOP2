public class Menu {

    void displayMenuOption(int opt) throws InvalidOptionException {

        if (opt < 1 || opt > 3) throw new InvalidOptionException("Invalid option - pick between 1-3");

        System.out.println("You chose option " + opt);
    }


}
