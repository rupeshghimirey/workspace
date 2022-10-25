package carPackage;

public class Car {

    private String brand = "bmw";
    private String model = "X3";
    private String color = "white";
    private int year = 2022;
    private static int numberOfTimesTurnOnMethodInvoked;


    // constructors
    public Car() {

    }

    public Car(String brand, String model, String color, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;

    }

    // business logic
    public void turnOn() {
        numberOfTimesTurnOnMethodInvoked++;
        System.out.println("Turning on the " + brand );
    }
    public void turnOff() {
        System.out.println("Turning it off " + brand + " " + model);
    }
    public void drive() {
        System.out.println(brand + " is moving!");
    }
    public static int getNumberOfTimesTurnOnMethodInvoked(){
        int numberOfTimesInvoked = Car.numberOfTimesTurnOnMethodInvoked;
        return numberOfTimesInvoked;

    }

    //accessors
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }






    //toString
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
