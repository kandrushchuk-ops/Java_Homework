package task9;

public class Bird extends Animal {
    String family;
    int maxFlight;

    public Bird(String family, int maxFlight, String color, int lifetime, FoodType foodType) {
        super(color, lifetime, foodType);
        this.family = family;
        this.maxFlight = maxFlight;
    }

    Bird sparrow = new Bird("Sparrow", 10, "red", 10, FoodType.INSECTS);


    public void sing() {
        System.out.println(family + " is singing");
    }

    public void peck() {
        System.out.println(family + "pecking");
    }

    public void layEggs() {
        System.out.println(family + "laying eggs");
    }

    @Override
    public void makeSound() {
        System.out.println(family + "singing");
    }

    @Override
    public void play() {
        System.out.println(family + " is playing");
    }

}


//
//Определить поля в классе Птица: семейство, максимальная высота полёта. В классе птица методы-петь,
//клевать, высиживать птенцов.
//Создать по объекту соответствующих классов продемонстрировать поведение собак и птиц.
//        (вызвать соответствующие методы в классах собака и птица)