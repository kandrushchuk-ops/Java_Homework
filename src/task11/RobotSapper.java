package task11;

class RobotSapper implements RobotEngineer {
    private String model;
    private int power;
    private int chassisNumber;
    private String material;
    private boolean isOn;

    public RobotSapper(String model, int power, int chassisNumber, String material) {
        this.model = model;
        this.power = power;
        this.chassisNumber = chassisNumber;
        this.material = material;
        this.isOn = false;
    }

    @Override
    public void repairRobot() {
        System.out.println("Робот-сапёр \"" + model + "\" отремонтирован специальным способом с использованием " + material);
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Робот-сапёр \"" + model + "\" включён");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Робот-сапёр \"" + model + "\" выключен");
    }

    @Override
    public void uniquePossibility() {
        if (isOn) {
            System.out.println("Робот-сапёр \"" + model + "\" разминирует территорию с помощью шасси №" + chassisNumber);
        } else {
            System.out.println("Робот-сапёр \"" + model + "\" не может разминировать — он выключен");
        }
    }

    @Override
    public void createItem() {
        if (isOn) {
            System.out.println("Робот-сапёр \"" + model + "\" создаёт приспособление для разминирования из " + material);
        } else {
            System.out.println("Робот-сапёр \"" + model + "\" не может создавать приспособления — он выключен");
        }
    }
}
