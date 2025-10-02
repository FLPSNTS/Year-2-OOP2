public class WordProcessor implements Counter{

    private String text = "Default Sentence";

    public void setText(String text) {
            this.text = text;
    }
    public String getText() {
        return text;
    }

    @Override
    public int countWords(String sentence){

        if (sentence == null){

            sentence = this.text;

        }

        String [] words = sentence.split(" ");
        return  words.length;

    }

    @Override
    public int countLetters(String sentence){

        int letters = 0;

        if (sentence == null) {
            sentence = this.text;
        }

        for (int i=0;i<sentence.length();i++){
            if ( Character.isLetter(sentence.charAt(i)) )
                letters++;
        }

        return letters;
        }

    @Override
    public int getLength(String sentence){

        if  (sentence == null){
            sentence = this.text;
        }

        return sentence.length();

    }


}
