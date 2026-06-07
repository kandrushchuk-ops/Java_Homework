package task12;

public class Motorcycle extends Vehicle {
    public Motorcycle(String name, Integer emissions) {
        super(name, emissions);
    }

    @Override
    public String toString() {
        return "Motorcycle{name='" + getName() + "', emissions=" + getEmissions() + "}";
    }
}
