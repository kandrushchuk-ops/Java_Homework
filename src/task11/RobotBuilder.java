package task11;

class RobotBuilder implements RobotEngineer {
    private String model;
    private int power;
    private String country;
    private String constructionDevice;
    private String material;
    private boolean isOn;

    public RobotBuilder(String model, int power, String country, String constructionDevice, String material) {
        this.model = model;
        this.power = power;
        this.country = country;
        this.constructionDevice = constructionDevice;
        this.material = material;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Робот-строитель \"" + model + "\" включён");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Робот-строитель \"" + model + "\" выключен");
    }

    @Override
    public void uniquePossibility() {
        if (isOn) {
            System.out.println("Робот-строитель \"" + model + "\" строит с помощью " + constructionDevice);
        } else {
            System.out.println("Робот-строитель \"" + model + "\" не может строить — он выключен");
        }
    }

    @Override
    public void createItem() {
        if (isOn) {
            System.out.println("Робот-строитель \"" + model + "\" создаёт бетон из " + material);
        } else {
            System.out.println("Робот-строитель \"" + model + "\" не может создавать бетон — он выключен");
        }
    }
}
