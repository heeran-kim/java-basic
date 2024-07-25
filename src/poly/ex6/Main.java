package poly.ex6;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Chicken chicken = new Chicken();
        Bird bird = new Bird();

        soundAnimal(dog);
        soundAnimal(chicken);
        soundAnimal(bird);

        // flyAnimal(dog);
        flyAnimal(chicken);
        flyAnimal(bird);

        moveAnimal(dog);
        moveAnimal(chicken);
        moveAnimal(bird);
    }

    private static void moveAnimal(AbstractAnimal animal) {
        animal.move();
    }

    private static void soundAnimal(AbstractAnimal animal) {
        animal.sound();
    }

    private static void flyAnimal(Fly fly) {
        fly.fly();
    }
}
