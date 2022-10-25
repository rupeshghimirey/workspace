package datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: "+today);
        LocalDate tomorrow = today.plusDays(1);
        System.out.println("Tomorrow's date: "+tomorrow);

        LocalDate localDate = LocalDate.of(1992, Month.OCTOBER, 22);

        LocalTime localTime = LocalTime.now();
        System.out.println("LocalTime: "+ localTime);
        System.out.println("newYearsDay: " + localDate);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        LocalDate bday = LocalDate.of(1969, 1, 18);
        System.out.println("bday: " + bday);

        System.out.println("zonedDateTime " + zonedDateTime);

        LocalTime born = LocalTime.parse("20:50:42");
        LocalDateTime t = LocalDateTime.parse("1969-01-18T20:50:42");

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMM-dd-yyyy");

        LocalDate parsedDateFormatter = LocalDate.parse("Feb-12-2022",dateTimeFormatter );

        System.out.println("parsedDateFormatter: " + parsedDateFormatter);

        LocalDate rupeshBirthday = LocalDate.of(1992, 10, 22);

        String display =
                rupeshBirthday.format(dateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));

        System.out.println("Display birthday: "+display );

        String format = rupeshBirthday.format(DateTimeFormatter.ofPattern(("EEE, MMM-dd-yyyy")));

        System.out.println("format "+  format);
        System.out.println(rupeshBirthday.getDayOfMonth());
        System.out.println(rupeshBirthday.getMonth());
        System.out.println(rupeshBirthday.getYear());
        System.out.println(rupeshBirthday.getDayOfWeek());

    }


}
