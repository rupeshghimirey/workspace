package vehicle;

public class Car extends Vehicle{

    private String vin;

    public Car(String vin) {
        super(vin);
    }

    @Override
    public void moveTo(String location) {
        // move the car way
        System.out.println("Moving with a Car way to " + location);
    }
}
