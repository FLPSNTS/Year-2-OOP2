public class NumberChecker {


    int findMax(Integer[] numbers) {

        // assume first element is the max
        int max = numbers[0];

        // loop through remaining numbers
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }

}
