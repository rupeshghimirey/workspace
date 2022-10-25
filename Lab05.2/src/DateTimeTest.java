/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

/*
 * The Java 8 Date/Time API consists of package java.time and its subpackages.
 * We will cover packages and imports in Session 7.
 * For the purposes of this lab, we give you a few wildcarded imports,
 * so you can use the classes in these packages without having to worry about importing them.
 */
import java.time.*;
import java.time.format.*;

class DateTimeTest {

    /**
     * main() calls each of the test methods in turn (currently commented out).
     * To run one test method at a time, uncomment the call to the one you want to execute.
     */
    public static void main(String[] args) {
        testNow();
        testCreate();
        testParse();
        testFormat();
    }

    /**
     * TASK: create current date, time, and date-time via now() and then print them.
     */
    public static void testNow() {
        // TODO
        LocalDate today = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime dateAndTime = LocalDateTime.now();

        System.out.printf("Today's Date: %s, CurrentTime: %s, DateAndTime: %s\n",today, currentTime, dateAndTime );
    }

    /**
     * TASK: implement the TODOs and print your results.
     */
    public static void testCreate() {
        // TODO: create your birthday via of(). What day of the week were you born on?
        LocalDate viaanBirthday = LocalDate.of(2022,06,25);
        DayOfWeek dayOfWeekViaanBirthday = viaanBirthday.getDayOfWeek();

        // TODO: use of() to create a value representing the 1st lunar landing - it happened on 7/20/69 at 3:18pm Eastern Time.

        LocalDate firstLunarLanding = LocalDate.of(1969, 07, 20);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMM-dd-yyyy");
        String display = firstLunarLanding.format(dateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("First Lunar Landing: " + display);
        // NOTE: ignore time-zone, just assume Eastern Time is the local time.
    }

    /**
     * TASK: implement the TODOs and print your results.
     */
    public static void testParse() {
        // TODO: create your birthday by parsing a text representation in standard format ("yyyy-MM-dd").
        LocalDate rupeshBirthday = LocalDate.parse("1992-10-22");
        System.out.println("rupeshBirthday: " + rupeshBirthday);



        // OPTIONAL: now create it by parsing text in the form "2/6/2014" (this is Feb 6, not Jun 2).
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        LocalDate mahimaBirthday = LocalDate.parse("04-24-1997", dateTimeFormatter);

        System.out.println("mahimaBirthday: " + mahimaBirthday + "\n");
    }

    /**
     * TASK: create formatted display strings for the date below, in the specified formats.
     */
    public static void testFormat() {
        LocalDate hastings = LocalDate.of(1066, 10, 14);

        // TODO: 10/14/1066
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMM-dd-yyyy");
        String display = hastings.format(dateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("Display: "+ display);


        // TODO: 14-10-1066
        System.out.println("Regular date format: "+hastings);

        // OPTIONAL: October 14, 1066
        String display1 = hastings.format(dateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("Display1: "+ display1);

    }
}