interface Counter {

    //count amount of words
    default int countWords(String sentence) {
        return 0;
    }

    //count amount of letters
    int countLetters (String sentence);
    //get length
    int getLength(String sentence);



}
