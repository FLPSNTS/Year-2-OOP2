import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    /**
     * Maps words to their occurrence count.
     */
    private final Map<String, Integer> wordMap = new HashMap<String, Integer>();

    public void addWord(String word){

        if (word.isEmpty()){
            return;
        }

        if (wordMap.containsKey(word)){
            wordMap.put(word,wordMap.get(word)+1);

        }

        else{
            wordMap.put(word,1);
        }

    }

    public void addSentence (String sentence){

        String[] words = sentence.split(" ");

        for (String word : words){

            addWord(word); //the addword return should handle everything else

        }

    }

    public void outputResults(){

        System.out.println(wordMap);

        for (Map.Entry<String,Integer> entry : wordMap.entrySet() ) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }
    }

}
