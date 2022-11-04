package vehicle;

// chnages by other
// changes by other
// chnages by other
public class Bike extends Vehicle{

    public Bike(String vin) {
        super(vin);
    }

    @Override
    public void moveTo(String location) {
        System.out.println("Moving with a bike way to " + location);
    }
}

