package _04_array_examples;

import java.util.Arrays;

public interface ArrayOfInt_Level2 {
    public static void main(String[] args) {

        // TODO: Exercise #1
        // - Let's say you have any array of int
        //   initialized with 3,9,6,2,1,10,5
        // - Create another array of int where
        //   the numbers are sorted, in other words,
        //   the new array should have 1,2,3,5,6,9,10

        int[] intArray = {3,9,6,2,1,10,5};
        int[] sortedArray = new int[intArray.length];
        int index = 0;

        for (int i = 0; i < intArray.length; i++) {
            int smallestNumber = intArray[0];
            int smallestNumberIndex = 0;
            for (int j = 0; j < intArray.length; j++) {
                if(intArray[j] < smallestNumber) {
                    smallestNumber = intArray[j];
                    smallestNumberIndex = j;
                }
            }
            sortedArray[index] = intArray[smallestNumberIndex];
            intArray[smallestNumberIndex] = Integer.MAX_VALUE;
            index++;

        }
        System.out.println(Arrays.toString(sortedArray));
    }
}
