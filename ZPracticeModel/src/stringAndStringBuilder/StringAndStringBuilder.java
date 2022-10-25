package stringAndStringBuilder;

public class StringAndStringBuilder {
    public static String constructMyAddressUsingString() {
        return "86 Boston Hbr,Cameron,NC,28326";
    }

    public static String constructMyAddressUsingStringBuilder() {
        String address = new StringBuilder(64)
                .append("86 Boston Hbr,")
                .append("Cameron,")
                .append("NC,28326").toString();

        return address;
    }

}
