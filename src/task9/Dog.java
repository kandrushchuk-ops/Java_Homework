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

        if (name == null) {
            if (dog.name != null) return false;
        } else if (!name.equals(dog.name)) {
            return false;
        }

        if (breed == null) {
            if (dog.breed != null) return false;
        } else if (!breed.equals(dog.breed)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed);
    }
}
