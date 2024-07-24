package poly.ex3;

public class AnimalPolyMain {

    public static void main(String[] args) {
        AbstractAnimal[] animalArr = {new Dog(), new Cat(), new Pig()};

        for (AbstractAnimal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("SOUND TEST START");
        animal.sound();
        System.out.println("SOUND TEST END");
    }
}
