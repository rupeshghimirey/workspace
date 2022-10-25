package wrappers;

public class WrapperExample {

    public static int convertStringToIntPrimitive(String toBeConvertedString) {
        int convertedValue = Integer.parseInt(toBeConvertedString);
        return convertedValue;
    }

    public static Integer convertStringToIntObject(String toBeConvertedString) {
        Integer convertedValue = Integer.parseInt(toBeConvertedString);
        return convertedValue;
    }

}
