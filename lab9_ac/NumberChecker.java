public class NumberChecker {


    int findMax(Integer[] numbers) {

        // assume first element is the max
        int max = numbers[0]; // O

        // loop through remaining numbers
        for (int i = 1; i < numbers.length; i++) { // BIG O : O(n) -> a loop
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;

        //growth : T(n) = c₁ (O) + (c₂·n [from the loop])

    }

}
