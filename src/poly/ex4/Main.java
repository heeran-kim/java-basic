package poly.ex4;

public class Main {

    public static void main(String[] args) {
        PureAbstractAnimal[] animalArr = {new Dog(), new Cat(), new Pig()};

        for (PureAbstractAnimal animal : animalArr) {
            soundAnimal(animal);
            moveAnimal(animal);
        }
    }

    private static void soundAnimal(PureAbstractAnimal animal) {
        System.out.println("SOUND TEST START");
        animal.sound();
        System.out.println("SOUND TEST END");
    }

    private static void moveAnimal(PureAbstractAnimal animal) {
        System.out.println("MOVE TEST START");
        animal.move();
        System.out.println("MOVE TEST END");
    }
}
