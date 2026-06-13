package task12;

public class Car extends Vehicle {
    public Car(String name, Integer emissions) {
        super(name, emissions);
    }

    @Override
    public String toString() {
        return "Car{name='" + getName() + "', emissions=" + getEmissions() + "}";
    }
}
