package task11;

class RobotCook implements Robot {
    private String model;
    private int power;
    private String country;
    private String cookingDevice;
    private boolean isOn;

    public RobotCook(String model, int power, String country, String cookingDevice) {
        this.model = model;
        this.power = power;
        this.country = country;
        this.cookingDevice = cookingDevice;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Робот-повар \"" + model + "\" включён");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Робот-повар \"" + model + "\" выключен");
    }

    @Override
    public void uniquePossibility() {
        if (isOn) {
            System.out.println("Робот-повар \"" + model + "\" готовит блюдо с помощью " + cookingDevice);
        } else {
            System.out.println("Робот-повар \"" + model + "\" не может готовить — он выключен");
        }
    }
}
