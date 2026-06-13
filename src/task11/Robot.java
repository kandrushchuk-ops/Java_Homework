package task11;

public interface Robot {
    default void repairRobot() {
        System.out.println("Робот отремонтирован стандартным способом");
    }

    void turnOn();
    void turnOff();
    void uniquePossibility();
}
