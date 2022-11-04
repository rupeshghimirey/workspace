package vehicle;

// Rupesh changes
// Rupesh changes
// Rupesh changes
public class Bike extends Vehicle{

    public Bike(String vin) {
        super(vin);
    }

    @Override
    public void moveTo(String location) {
        System.out.println("Moving with a bike way to " + location);
    }
}