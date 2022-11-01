package collection;

import compositionExample.Employee;

import java.time.LocalDate;
import java.util.*;

public class CollectionExample {



    public static void main(String[] args) {

        List<String> names = new ArrayList<>();




        names.add("Amy");
        names.add("Leanne");

        names.add(1, "Bobby");

        names.add(2,"Amilia");

        names.set(2,"Rupesh");

        System.out.println(names);

        Set<String> cities = new HashSet<>();

        cities.add("New York");
        cities.add("Boston");
        cities.add("New York");

        System.out.println(cities);

    }

}
