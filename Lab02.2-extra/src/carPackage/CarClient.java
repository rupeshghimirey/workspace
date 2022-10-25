package carPackage;

import carPackage.Car;

public class CarClient {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Audi", "A7", "black", 2021);



        car1.setBrand("Honda");
        car1.setModel("Civic");
        car1.setColor("Black");
        car1.setYear(2020);

        car1.turnOn();
        car1.drive();
        car1.turnOff();
        System.out.println("****************");
        car2.turnOn();
        car2.drive();
        car2.turnOff();

        System.out.printf("Number of times Turn on method invoked: %s", Car.getNumberOfTimesTurnOnMethodInvoked());

    }
}
