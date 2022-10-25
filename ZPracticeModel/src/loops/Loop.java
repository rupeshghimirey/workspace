package loops;

public class Loop {
    public static void main(String[] args) {

        int index = 5;

        while (index > 0) {
            System.out.println("index = " + index);
            index--;
        }

        int index2 = -1;

        do {
            System.out.println("index2 = " + index2);
            index2--;
        }
         while (index2 > 0);

         // regular for loop
        for (int i = 0; i <= 3; i++) {
            System.out.print(i + " ");
        }

        // enhanced for loop
        int[] ages = { 44, 54, 3, 7 };
        for (int age : ages) { System.out.println(age);
        }

        String [] names = {"Rupesh", "Mahima", "Viaan"};

        for(String name: names) {
            System.out.println(name);
        }

    }

}
