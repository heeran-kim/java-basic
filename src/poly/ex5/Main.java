package poly.ex5;

public class Main {

    public static void main(String[] args) {
        // Interface cannot be instantiated
        // InterfaceAnimal interfaceAnimal = new InterfaceAnimal();

        InterfaceAnimal[] animalArr = {new Dog(), new Cat(), new Pig()};

        for (InterfaceAnimal animal : animalArr) {
            soundAnimal(animal);
            moveAnimal(animal);
        }
    }

    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("SOUND TEST START");
        animal.sound();
        System.out.println("SOUND TEST END");
    }

    private static void moveAnimal(InterfaceAnimal animal) {
        System.out.println("MOVE TEST START");
        animal.move();
        System.out.println("MOVE TEST END");
    }
}
