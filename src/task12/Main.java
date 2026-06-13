package task12;

public class Main {
    public static void main(String[] args) {

        Garage<Car> carGarage = new Garage<>();
        Garage<Motorcycle> motorcycleGarage = new Garage<>();


        Car car1 = new Car("BMW X5", 80);
        Car car2 = new Car("Mercedes GLC", 120);

        Motorcycle motorcycle1 = new Motorcycle("Yamaha R1", 60);
        Motorcycle motorcycle2 = new Motorcycle("Harley Davidson", 150);


        carGarage.addVehicle(car1);
        carGarage.addVehicle(car2);

        motorcycleGarage.addVehicle(motorcycle1);
        motorcycleGarage.addVehicle(motorcycle2);

        System.out.println("=== ГАРАЖ ДЛЯ АВТОМОБИЛЕЙ ===");
        for (Car car : carGarage.getVehicles()) {
            System.out.println("Транспортное средство: " + car.getName());
            System.out.println("Количество выбросов: " + car.getEmissions());
            System.out.println("Въезд разрешён: " + carGarage.isEntryPermitted(car));
            System.out.println("---");
        }

        System.out.println("\n=== ГАРАЖ ДЛЯ МОТОЦИКЛОВ ===");
        for (Motorcycle motorcycle : motorcycleGarage.getVehicles()) {
            System.out.println("Транспортное средство: " + motorcycle.getName());
            System.out.println("Количество выбросов: " + motorcycle.getEmissions());
            System.out.println("Въезд разрешён: " + motorcycleGarage.isEntryPermitted(motorcycle));
            System.out.println("---");
        }
    }
}
