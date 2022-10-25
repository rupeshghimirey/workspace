package myMath;

public class MyMathClient {
    public static void main(String[] args) {

        System.out.printf("The max value is: %s \n",MyMath.max(11,22));
        System.out.printf("The min value is: %s \n",MyMath.min(5,7));

        System.out.printf("The age is in range: %s! \n",MyMath.isAgeInRange(23));

        System.out.println(MyMath.counterMethod(4));
    }

}
