package task9;

public class Animal {
    String color;
    int lifetime;
    FoodType foodType;

    public Animal(String color, int lifetime, FoodType foodType) {
        this.color = color;
        this.lifetime = lifetime;
        this.foodType = foodType;
    }


    public void makeSound(){
        System.out.println("Animal sound");
    }
    public void play(){
        System.out.println("Animal play");
    }

    @Override
    public String toString() {
        return "Животное с цвет: " + color + ", Жизнь: " + lifetime + ", Еда: " + foodType;
    }



}
//окрас, максимальная продолжительность жизни, тип еды
// которой питаются (мясо, насекомые, растения)
//Определить методы в классе животное: (издание звуков, животное играет)
// В классе собака определить имя, порода, средний вес.