package task9;

public class Zoo {
    private Animal[] animals = new Animal[0];

    public void addAnimal(Animal animal) {
        Animal[] newAnimals = new Animal[animals.length + 1];
        System.arraycopy(animals, 0, newAnimals, 0, animals.length);
        newAnimals[animals.length] = animal;
        animals = newAnimals;
    }

    public Animal[] getAnimals() {
        return animals;
    }


}
