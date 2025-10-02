public class WordProcessor implements Counter{

    private String text = "Please enter a sentence";

    public void setText(String text) {
            this.text = text;
    }
    public String getText() {
        return text;
    }



    @Override
    public int countWords(String sentence){

        if (sentence == null){
            return 0;
        }
        else {
            String [] words = sentence.split(" ");
            return  words.length;
            //creates a string array called words,
            // calls the split function on the sentence with the parameter a space, thus creating
            // an array of the individual words
            // returns the function length for the string array words

            }

        }

    @Override
    public int countLetters(String sentence){

        int letters = 0;

        if (sentence == null){
            return 0;
        }
        else {
            for (int i=0;i<sentence.length();i++){
                if ( Character.isLetter(sentence.charAt(i)) )
                    letters++;
            }

            //loops inside the string sentence char by char verifying if it is letter (function already exists
            //java knows it's looping a string by the second parameter

            return letters;
        }



    }

    @Override
    public int getLength(String sentence){

        if  (sentence == null){
            return 0;
        }
        else {
            return sentence.length();
        }

    }


    }
