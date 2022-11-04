package vehicle;

// Collab changes
// Collab changes
// Collab changes
public class Bike extends Vehicle{

    public Bike(String vin) {
        super(vin);
    }

    @Override
    public void moveTo(String location) {
        System.out.println("Moving with a bike way to " + location);
    }
}
