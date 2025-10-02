import java.util.Scanner;

public class Driver2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose sentence");
        String sentence = input.nextLine();

        Counter counter = new WordProcessor();
        counter.countWords(sentence);
        counter.countLetters(sentence);
        counter.getLength(sentence);

        System.out.println("length: " + counter.getLength(sentence) +
                "\nletters: " + counter.countLetters(sentence) +
                "\nwords: " + counter.countWords(sentence));




    }


}
