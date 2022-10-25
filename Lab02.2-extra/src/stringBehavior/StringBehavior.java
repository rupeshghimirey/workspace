package stringBehavior;

public class StringBehavior {


    public static void main(String[] args) {
        String stringOne = "Rupesh";
        String stringTwo = "Rupesh";
        String stringThree = new String("Rupesh");
        String stringFour = new String("Rupesh");

        if(stringOne ==  (stringTwo)) {
            System.out.println("They are equal!");
        } else {
            System.out.println("They are not equal!");
        }

    }
}




