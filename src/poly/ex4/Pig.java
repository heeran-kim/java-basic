package poly.ex4;

public class Pig extends PureAbstractAnimal {

    @Override
    public void sound(){
        System.out.println("oink");
    }

    @Override
    public void move() {
        System.out.println("Pig Move");
    }
}
