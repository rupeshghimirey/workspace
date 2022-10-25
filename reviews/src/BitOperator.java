public class BitOperator {

    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        boolean singleOr = a > 3 | b >6;

        boolean singleAnd = a > 3 & b >6;

        // exercise bitwise operator
        int bitwiseAndResult = 0b1101 & 0b11001;
        int bitwiseOrResult = 0b1101 | 0b11001;
        System.out.println(bitwiseAndResult);
        System.out.println(bitwiseOrResult);

    }
}
