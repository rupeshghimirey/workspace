package vehicle;

// this is the changes made by somoone else
// Someone else change the business logics
public class Bike extends Vehicle{

    public Bike(String vin) {
        super(vin);
    }

    @Override
    public void moveTo(String location) {
        System.out.println("Moving with a bike way to " + location);
    }
}
// someone else changes done


