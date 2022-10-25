public class LocalVariable {

    private static int myInt;
    private static String myName;

    private static void myMethod() {
        int localInt = 10;
        String localMyName = "Viaan";

        System.out.println("localInt: " + localInt + ", localMyName: " + localMyName);
        System.out.println("myInt: " + myInt + ", myName: " + myName);

    }

    public static void main(String[] args) {
        myMethod();
    }

}
