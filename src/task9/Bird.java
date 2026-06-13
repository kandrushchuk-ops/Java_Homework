package task9;

import java.util.Objects;

public class Bird extends Animal {
    String family;
    int maxFlight;

    public Bird(String family, int maxFlight, String color, int lifetime, FoodType foodType) {
        super(color, lifetime, foodType);
        this.family = family;
        this.maxFlight = maxFlight;
    }


    public void sing() {
        System.out.println(family + " поет");
    }

    public void peck() {
        System.out.println(family + " клюет");
    }

    public void layEggs() {
        System.out.println(family + " высижывает яйца");
    }

    @Override
    public void makeSound() {
        System.out.println(family + " поет <3");
    }

    @Override
    public void play() {
        System.out.println(family + " играет");
    }

    @Override
    public String toString() {
        return "Птица: " + family + ", цвет: " + color + ", живет: " + lifetime + " лет.";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bird bird = (Bird) o;
        return maxFlight == bird.maxFlight &&
                Objects.equals(family, bird.family) &&
                Objects.equals(color, bird.color) &&
                Objects.equals(foodType, bird.foodType) &&
                lifetime == bird.lifetime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(family, maxFlight, color, lifetime, foodType);
}
}


//
//Определить поля в классе Птица: семейство, максимальная высота полёта. В классе птица методы-петь,
//клевать, высиживать птенцов.
//Создать по объекту соответствующих классов продемонстрировать поведение собак и птиц.
//        (вызвать соответствующие методы в классах собака и птица)