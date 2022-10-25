package flowControl;

public class FlowControl {

    public static boolean isItEvenNumber(int number) {
        return (number % 2 == 0);
//        if(number % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
    }

    public static int hexCharToDecimal(char hexChar) {
        switch(hexChar) {
            case 'A':
                return 10;

            case 'B':
                return 11;

            case 'C':
                return 12;

            case 'D':
                return 13;

            case 'E':
                return 14;
            case 'F':
                return 15;
            default:
                return hexChar - '0';
        }
    }
}
