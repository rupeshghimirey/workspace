package iteration;

public class IterationClient {

    public static void main(String[] args) {
        System.out.println("USING FOR LOOP");
        Iteration.displayNumbersUsingForLoop(2,7);
        System.out.println("USING WHILE LOOP");
        Iteration.displayNumbersUsingWhile(2,7);
        System.out.println("USING DO-WHILE LOOP");
        Iteration.displayNumbersUsingDoWhile(2,7);
        System.out.println("FOR LOOP WITH IF: FOR PRINTING EVEN NUMBERS");
        Iteration.displayEvenNumbersOnlyUsingForLoop(2,7);

    }
}
