package poly.ex5;

public class Cat implements InterfaceAnimal {

    @Override
    public void sound() {
        System.out.println("Meow");
    }

    @Override
    public void move() {
        System.out.println("Cat Move");
    }
}
