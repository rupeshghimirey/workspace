package iteration;

public class Iteration {

    public static void displayNumbersUsingForLoop(int start, int end) {

        for(int i = start; i < end; i++) {
            System.out.println(i);
        }
    }

    public static void displayNumbersUsingWhile(int start, int end) {
        int i = start;

        while(i < end) {
            System.out.println(i);
            i++;
        }
    }

    public static void displayNumbersUsingDoWhile(int start, int end) {
        int i = start;
        do {
            System.out.println(i);
            i++;
        }
        while(i<end);
    }
    public static void displayEvenNumbersOnlyUsingForLoop(int start, int end) {
        for(int i = start; i < end; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

}
