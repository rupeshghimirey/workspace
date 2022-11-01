package wordCountUsingMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class WordCount {
    public static void main(String[] args) {
        String stringExample = "Hello I love Boston.Yes,you do Love Boston";

        String[] stringArray = stringExample.toLowerCase().split("[, ?.@]+");
        List<String> initialWordsList = Arrays.asList(stringArray);
        HashMap<String, Integer> uniqueWordsMap = new HashMap<>();
        System.out.println(initialWordsList);

            for (String word :initialWordsList) {
                if(uniqueWordsMap.containsKey(word)) {
                    Integer count = uniqueWordsMap.get(word);
                    uniqueWordsMap.put(word, count + 1);
                } else {
                    uniqueWordsMap.put(word,1);
                }
            }

        System.out.println(uniqueWordsMap);


    }
}
