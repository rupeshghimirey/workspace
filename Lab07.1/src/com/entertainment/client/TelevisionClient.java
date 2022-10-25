package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

public class TelevisionClient {
    public static void main(String[] args) {
        Television television1 = new Television("Sony", 55);
        Television television2 = new Television("LG", 23);

        television1.turnOn();
        television1.turnOff();
        television2.turnOn();
        television2.turnOff();
        television2.setDisplay(DisplayType.OLED);

        System.out.println("TV INFO");
        System.out.println(television1.toString());
        System.out.println(television2.toString());

        System.out.println(Television.getInstanceCount() + " instances");


    }
}
