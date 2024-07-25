package poly.ex4;

public class Dog extends PureAbstractAnimal {

    @Override
    public void sound() {
        System.out.println("Bark!");
    }

    @Override
    public void move() {
        System.out.println("Dog Move");
    }
}
