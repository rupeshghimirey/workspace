package wordCountUsingList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class WordCount {
    public static void main(String[] args) {
        String stringExample = "Hello I love Boston.Yes,you do Love Boston";

        String[] stringArray = stringExample.split("[, ?.@]+");

        List<String> initialWordsList = Arrays.asList(stringArray);

        HashMap<String, Integer> uniqueWordsMap = new HashMap<>();

        System.out.println(initialWordsList);

        int counter = 1;
        for (int i = 0; i <initialWordsList.size() ; i++) {

            for (int j = i+1; j <initialWordsList.size() ; j++) {
                if(initialWordsList.get(i).equalsIgnoreCase(initialWordsList.get(j))) {
                    initialWordsList.set(j,"repeatedWord");
                    counter++;
                }
            }
            if(!initialWordsList.get(i).equals("repeatedWord")) {
                System.out.printf("%10s %10s \n", initialWordsList.get(i), counter);
            }
            counter = 1;
        }

    }
}
