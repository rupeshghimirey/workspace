package stringAndStringBuilder;

public class StringAndStringBuilderClient {
    public static void main(String[] args) {
        System.out.printf("Comparing using == %s\n",
                StringAndStringBuilder.constructMyAddressUsingString() == StringAndStringBuilder.constructMyAddressUsingStringBuilder());

        System.out.printf("Comparing using .equlas:: %s\n",
                StringAndStringBuilder.constructMyAddressUsingString().equals(StringAndStringBuilder.constructMyAddressUsingStringBuilder()));
    }
}
