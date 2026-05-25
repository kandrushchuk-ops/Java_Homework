package task9;

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


}


//
//Определить поля в классе Птица: семейство, максимальная высота полёта. В классе птица методы-петь,
//клевать, высиживать птенцов.
//Создать по объекту соответствующих классов продемонстрировать поведение собак и птиц.
//        (вызвать соответствующие методы в классах собака и птица)