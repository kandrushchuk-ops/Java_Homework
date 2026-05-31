package task9;

import java.util.Objects;

public class Dog extends Animal {
    String name;
    String breed;
    int weight;

    public Dog(String name, String breed, int weight, String color, int lifetime, FoodType foodType) {
        super(color, lifetime, foodType);
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }


    public void bark() {
        System.out.println(name + " barks");
    }

    public void bite() {
        System.out.println(name + " кусает");
    }

    public void run() {
        System.out.println(name + " бежит");
    }

    @Override
    public void play() {
        System.out.println(name + " играет");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " гавкает!");
    }

    @Override
    public String toString() {
        return "Собака: " + name + ", Порода:" + breed + ", Вес:" + weight + ", Цвет:" + color + ", Время жизни:" + lifetime + ", Еда:" + foodType + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return weight == dog.weight &&
                Objects.equals(name, dog.name) &&
                Objects.equals(breed, dog.breed) &&
                Objects.equals(color, dog.color) &&
                Objects.equals(foodType, dog.foodType) &&
                lifetime == dog.lifetime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, weight, color, lifetime, foodType);
    }


}

//В классе Собака реализовать методы: лаять, кусать, бегать, играть,
// прыгать. При этом, в консоли должны выводится имя собаки вместе с описанием действия (пример. Рекс прыгает).
//В классе собака определить имя, порода, средний вес. В классе Собака реализовать методы: лаять, кусать, бегать, играть, прыгать.
