package poly.basic;

public class Child extends Parent {
    private int value;

    public void childMethod() {
        System.out.println("Child.childMethod");
    }

    @Override
    public void sameNameMethod() {
        System.out.println("Child.sameNameMethod");
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
