package wrappers;

public class WrapperExampleClient {

    public static void main(String[] args) {
        System.out.printf("The integer value in primitive type of converted string is %s! \n",WrapperExample.convertStringToIntPrimitive("7"));
        System.out.printf("The integer value in object type of converted string is %s!",WrapperExample.convertStringToIntObject("9"));

    }

}
