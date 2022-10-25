package wordCount;

import java.util.Arrays;

public class WordCount {
    public static void main(String[] args) {
        String stringExample = "Hello I love Boston.Yes,you do Love Boston";
        String initialString = stringExample;

//        String[] stringArray1 = initialString.split("[, ?.@]+");

        String[] stringArray = stringExample.split("[, ?.@]+");

        int counter = 1;
        for (int i = 0; i <stringArray.length ; i++) {
            for (int j = i+1; j <stringArray.length ; j++) {
                if(stringArray[i].equalsIgnoreCase(stringArray[j])) {
                    counter++;
                    stringArray[j] = "repeatedWord";
                }
            }
            if(!stringArray[i].equals("repeatedWord")) {
                System.out.printf("%10s %10s \n", stringArray[i], counter);
            }
            counter = 1;
        }

//        System.out.printf("\n%s\n", Arrays.toString(stringArray));
//        System.out.printf("\n%s\n", Arrays.toString(stringArray1));

    }
}
