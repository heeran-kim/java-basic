package poly.ex5;

public class Pig implements InterfaceAnimal {

    @Override
    public void sound(){
        System.out.println("oink");
    }

    @Override
    public void move() {
        System.out.println("Pig Move");
    }
}
