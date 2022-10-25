package flowControl;

public class FlowControlClient {
    public static void main(String[] args) {
        System.out.printf("Is it even number? %s \n",FlowControl.isItEvenNumber(12));
        System.out.printf("A to hexadecimal is: %s\n", FlowControl.hexCharToDecimal('A'));
        System.out.printf("B to hexadecimal is: %s\n", FlowControl.hexCharToDecimal('B'));
        System.out.printf("C to hexadecimal is: %s\n", FlowControl.hexCharToDecimal('C'));
        System.out.printf("D to hexadecimal is: %s\n", FlowControl.hexCharToDecimal('D'));
        System.out.printf("9 to hexadecimal is: %s\n", FlowControl.hexCharToDecimal('9'));
    }
}
