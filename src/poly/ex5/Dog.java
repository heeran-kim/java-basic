package poly.ex5;

public class Dog implements InterfaceAnimal {

    @Override
    public void sound() {
        System.out.println("Bark!");
    }

    @Override
    public void move() {
        System.out.println("Dog Move");
    }
}
