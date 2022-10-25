package _04_array_examples;

import java.util.Arrays;

public class ArrayOfString_Level2 {

    public static void main(String[] args) {

        // TODO: Exercise #1
        // - Create an array of String by using "split" method
        //   from "I love Boston.  Yes, you do love boston."
        //   using "[, ?.@]+" as regular expression
        // - Display the array

        String initialString = "I love Boston.  Yes, you do love boston.";
        String[] stringArray = initialString.split("[, ?.@$&]+");


        // TODO: Exercise #2
        // - Create a new array of String with unique word (but
        //   case-insensitive manner) from
        //   the array of String that was created above.
        //   The resulting array should be all lower-case, however.
        //   In other words, the new array should contain
        //   "i", "love", "boston", "yes", "do" as it's
        //   element values
        // - Display the array


        int counter = 1;
        int uniqueWordArrayCount = 0;
        String[] uniqueWordArray = new String[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            for (int j = i + 1; j < stringArray.length; j++) {
                if (stringArray[i].equalsIgnoreCase(stringArray[j])) {
                    counter++;
                    stringArray[j] = "repeatedWord";
                }
            }
            if (!stringArray[i].equals("repeatedWord")) {
                uniqueWordArrayCount++;
                uniqueWordArray[i] = stringArray[i];
            }

        }
        System.out.println(Arrays.toString(uniqueWordArray));

        // TODO: Exercise #3
        // - Create an array of "char" from a String "Life is good"
        // - Display the array
        String lifeIsGoodString = "Life is good";
        char[] charArray = new char[lifeIsGoodString.length()];

        for (int i = 0; i < charArray.length; i++) {
            if (lifeIsGoodString.charAt(i) != ' ') {
                charArray[i] = lifeIsGoodString.charAt(i);
            }
        }

        System.out.println(Arrays.toString(charArray));

    }

    public static int getNumberOfCharCount(String string) {
        int numberOfCharCount = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {

                numberOfCharCount++;
            }
        }
        return numberOfCharCount;

    }
}
