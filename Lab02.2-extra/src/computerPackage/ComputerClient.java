package computerPackage;

public class ComputerClient {
    public static void main(String[] args) {

        ComputerUsingIntPrimitives p1 = new ComputerUsingIntPrimitives();
        ComputerUsingLongPrimitives p2 = new ComputerUsingLongPrimitives();

        ComputerUsingOverloadedMethods computerUsingOverloadedMethods = new ComputerUsingOverloadedMethods();

        System.out.println("int Primitives");

        System.out.println(p1.add(1, 4));
        System.out.println(p1.subtract(5, 3));
        System.out.println(p1.multiply(2, 2));
        System.out.println(p1.divide(10, 5));

        System.out.println("Long Primitives");
        System.out.println(p2.add(5, 3));
        System.out.println(p2.subtract(10, 2));

        System.out.println("Using Overloaded methods");
        int intAddition = computerUsingOverloadedMethods.add(2,6);
        System.out.println(intAddition);
        int intSubtraction = computerUsingOverloadedMethods.subtract(8,6);
        System.out.println(intSubtraction);
         long longAddition = computerUsingOverloadedMethods.add(10L,6L);
        System.out.println(longAddition);
        long longSubtraction = computerUsingOverloadedMethods.subtract(23L,8L);
        System.out.println(longSubtraction);






    }
}
