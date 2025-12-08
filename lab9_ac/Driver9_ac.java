public class Driver9_ac {

    public static void main(String[] args) {

        NumberChecker numChecker = new NumberChecker();
        int max = numChecker.findMax(new Integer[] {5, 2, 7, 9, 10, 1, 2});

        System.out.println("Max number is " + max);

        NumberGrid grid = new NumberGrid();

        grid.output(5);


    }
}
