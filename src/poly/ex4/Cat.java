package poly.ex4;

public class Cat extends PureAbstractAnimal {

    @Override
    public void sound() {
        System.out.println("Meow");
    }

    @Override
    public void move() {
        System.out.println("Cat Move");
    }
}
