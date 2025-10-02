import java.util.Scanner;

public class Driver2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        WordProcessor wp = new WordProcessor(); // could not call counter datatype because gettext is exclusive to WordProcessor


        System.out.println("Choose sentence");
        String sentence = input.nextLine();

        if (sentence == null || sentence.isEmpty()) { //user input never returns null - it has to be forced by isEmpty method
            sentence = wp.getText();
            System.out.println(sentence);
        }


        else{
            System.out.println("length: " + wp.getLength(sentence) +
                    "\nletters: " + wp.countLetters(sentence) +
                    "\nwords: " + wp.countWords(sentence));
        }




    }


}
