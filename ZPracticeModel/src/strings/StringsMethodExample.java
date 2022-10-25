package strings;

public class StringsMethodExample {

    public static void main(String[] args) {
        String testString = "This is a test string!";

        // contains (Char Sequence)
        boolean isCharInTheString = testString.contains("test");
        boolean contain = testString.contains("isas");
        System.out.printf("isCharInTheString %s \n", isCharInTheString);
        System.out.printf("contain %s \n", contain);

        // endsWith(String suffix)
        boolean isEndChar = testString.endsWith("s");
        boolean isEndChars = testString.endsWith("!");
        System.out.printf("isEndChar %s \n" , isEndChar);
        System.out.printf("isEndChars %s \n" , isEndChars);

        //equals(String anotherString)
        String testString1 = "This is a test string";
        String testString2 = "This is a test string!";
        System.out.printf("Testing two Strings %s \n", testString.equals(testString1));
        System.out.printf("Testing two Strings %s \n", testString.equals(testString2));

        // equalsIgnoreCase(String anotherString)
        System.out.printf("equalsIgnoreCase: %s \n", testString.equalsIgnoreCase("This is a Test String!"));

        // indexOf(String str)
        System.out.printf("index of t:  %s \n", testString.indexOf("t"));

        // length()
        System.out.printf("Length of testString1 %s \n", testString1.length());

        // split(String regex)
        String[] stringArray = testString.split(" ");
        for(String eachWord : stringArray) {
            System.out.printf("stringArray: %s \n",eachWord );
        }

        // startsWith(String prefix)
        System.out.printf("starts with %s \n", testString.startsWith("T"));

        // strip()

        System.out.printf("Strip method:  %s \n", testString.strip());

        // substring(int beginIndex)
        System.out.printf("Substring method: %s \n",testString.substring(0, testString.length()-3));

        // to upperCase
        System.out.printf("Uppercase: %s \n", testString.toUpperCase());

        // to lowerCase
        System.out.printf("Lowercase: %s \n", testString.toLowerCase());

    }
}
