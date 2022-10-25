package arrayspackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayExample {

    // Exercise #1 – array of String
    public static String[] familyArray = {"Rupesh", "Dipesh", "Mahima", "Viaan", "Ram", "Rudra"};

    public static void convertAndDisplayNamesToUpperCase() {
        for (String member : familyArray) {
            System.out.printf(" %s\n", member.toUpperCase());
        }
    }

    // Ex-2, array of int
    public static int[] findOddNumbersFromArray(int[] numbers) {
        int[] oddArray;
        int counter = 0;
        if (numbers.length % 2 == 0) {
            oddArray = new int[numbers.length / 2];
        } else {
            oddArray = new int[(numbers.length / 2) + 1];
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddArray[counter] = numbers[i];
                counter++;
            }
        }
        return oddArray;
    }

    // Ex-3, array of int
    public static int findLargestNumberFromArray(int[] numbers) {
        int largestNumber = numbers[0];

        for (int number : numbers) {
            if (number > largestNumber) {
                largestNumber = number;
            }
        }
        return largestNumber;
    }

    //Exercise #4 – Varargs
    public static void convertAndDisplayNamesOfMyFriendsToUpperCaseUsingVarargs(String myName, String... myFriends) {

        for (String friend : myFriends) {
            System.out.printf(" %s's friends name:  %s\n", myName, friend.toUpperCase());
        }
    }

}
