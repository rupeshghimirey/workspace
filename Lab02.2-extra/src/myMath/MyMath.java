package myMath;

public class MyMath {
    private static final int MINIMUM_AGE=5;
    private static final int MAXIMUM_AGE=100;

    public static int min(int x, int y) {
        if(x<y) {
            return x;
        }
        return y;
    }

    public static int max(int x, int y) {
        if(x>y) {
            return x;
        }
        return y;
    }

    public static boolean isAgeInRange(int age) {
        if(age >= MINIMUM_AGE && age <= MAXIMUM_AGE) {
            return true;
        }
        return false;
    }

    public static int counterMethod(int argument) {
        var counter = 0;

        for (int i = 0; i < argument; i++) {
            System.out.println(i);
            counter++;


        }
        return counter;
    }
}
