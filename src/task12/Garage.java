package task12;

import java.util.ArrayList;
import java.util.List;


public class Garage<T extends Vehicle> {
    private List<T> vehicles;

    public Garage() {
        this.vehicles = new ArrayList<>();
    }


    public void addVehicle(T vehicle) {
        vehicles.add(vehicle);
    }

    public boolean isEntryPermitted(T vehicle) {
        return vehicle.getEmissions() < 100;
    }

    public List<T> getVehicles() {
        return vehicles;
    }
}
