package task9;

public class Dog extends Animal {
    String name;
    String breed;
    int weight;

    public Dog(String name, String breed, int weight, String color, int maxLife, String foodType) {
        super(color, maxLife, FoodType.MEAT);
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }


    public void bark() {
        System.out.println(name + " barks");
    }

    public void bite() {
        System.out.println(name + " bites");
    }

    public void run() {
        System.out.println(name + " runs");
    }
    @Override
    public void play() {
        System.out.println(name + " plays");
    }
    @Override
    public void makeSound() {
        System.out.println(name + "Гав-Гав!");
    }
}

//В классе Собака реализовать методы: лаять, кусать, бегать, играть,
// прыгать. При этом, в консоли должны выводится имя собаки вместе с описанием действия (пример. Рекс прыгает).
//В классе собака определить имя, порода, средний вес. В классе Собака реализовать методы: лаять, кусать, бегать, играть, прыгать.
