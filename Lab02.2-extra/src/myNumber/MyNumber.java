package myNumber;

public class MyNumber {

    public static int computeRandomInt(int start, int end) {
        int randomInt =  start + (int)(Math.random() * (end-start));
        return randomInt;
    }
}
