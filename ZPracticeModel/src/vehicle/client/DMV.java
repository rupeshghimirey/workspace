package vehicle.client;

import vehicle.Bike;
import vehicle.Car;
import vehicle.Vehicle;

public class DMV {

    public static void main(String[] args) {
        
        Vehicle vehicle1 = new Vehicle("ABC123");
        Vehicle vehicle2 = new Bike("DEF123");
        Vehicle vehicle3 = new Car("GHI123");

        Vehicle[] vehicles = {vehicle1,vehicle2,vehicle3};

        for(Vehicle vehicle: vehicles) {
            vehicle.moveTo("SF");
        }

    }
}
