package poly.ex3;

public class Dog extends AbstractAnimal {

    @Override
    public void sound() {
        System.out.println("Bark!");
    }

    @Override
    public void move() {
        System.out.println("Cat Move");
    }
}
