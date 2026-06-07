package task12;

public class Vehicle {
    private String name;
    private Integer emissions;


    public Vehicle(String name, Integer emissions) {
        this.name = name;
        this.emissions = emissions;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public Integer getEmissions() {
        return emissions;
    }

    // Сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public void setEmissions(Integer emissions) {
        this.emissions = emissions;
    }

    @Override
    public String toString() {
        return "Vehicle{name='" + name + "', emissions=" + emissions + "}";
    }
}
