package arrayspackage;

import java.util.Arrays;

public class ArrayExampleClient {

    public static void main(String[] args) {
        ArrayExample.convertAndDisplayNamesToUpperCase();
        int[] intArray = {1,2,3,4,5,6,7,8,9};
        int[] oddNumbersFromArray = ArrayExample.findOddNumbersFromArray(intArray);

        System.out.printf("Odd Array: %s\n", Arrays.toString(oddNumbersFromArray));

        int[] array1 = {8,3,2,1,4,5,6,10,8,3,2};
        System.out.println("Largest Number from an Array: " + ArrayExample.findLargestNumberFromArray(array1));

        System.out.println("*****WITH ONE NAME*****");
        ArrayExample.convertAndDisplayNamesOfMyFriendsToUpperCaseUsingVarargs("Rupesh","Sanjog");
        System.out.println("*****WITH TWO NAME*****");
        ArrayExample.convertAndDisplayNamesOfMyFriendsToUpperCaseUsingVarargs("Rupesh","Sanjog", "Santosh");
        System.out.println("*****WITH THREE NAME*****");
        ArrayExample.convertAndDisplayNamesOfMyFriendsToUpperCaseUsingVarargs("Rupesh","Sanjog","Santosh", "Mahima");
    }
}
