public class NumberGrid {


    void output(int range) {

        for (int row = 1; row <= range; row++) { // outer loop: handles rows

            for (int col = 1; col <= range; col++) { // inner loop: prints columns   + inner loop big O = O(n^2)
                System.out.print(row + " ");          // print on same line
            }

            System.out.println(); // move to next row after inner loop finishes
        }
    }





}


