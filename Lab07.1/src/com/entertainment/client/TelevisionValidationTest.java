package com.entertainment.client;

import com.entertainment.Television;

public class TelevisionValidationTest {
    public static void main(String[] args) {
        Television television1 = new Television("Sony", 55);

        television1.turnOn();
        television1.turnOff();
        television1.setVolume(-1);
        television1.turnOn();
        System.out.println("*****************************************");
        Television tv = new Television();
        tv.setBrand("Samsung".toUpperCase());
        System.out.println("******************TOGGLE ON***********************");
        television1.toggleMute();
        television1.toString();
        System.out.println("******************TOGGLE OFF***********************");
        television1.toggleMute();
        television1.toString();
        System.out.println("BRAND SET");

        tv.setBrand("LG".toUpperCase());
        System.out.println(tv);
        tv.setBrand("Sony".toUpperCase());
        System.out.println(tv);
        tv.setBrand("Toshiba".toUpperCase());
        System.out.println(tv);
        tv.setBrand("Invalid".toUpperCase());
        System.out.println(tv);

    }
}
