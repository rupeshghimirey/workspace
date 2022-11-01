package vehicle;

public class Vehicle {

    private String vin;

    public Vehicle(String vin) {
        this.vin = vin;
    }

    public void moveTo(String location) {
        // move in some general vehicle way
        System.out.println("Moving with a Vehicle way to " + location);
    }
}
