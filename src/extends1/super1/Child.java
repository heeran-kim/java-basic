package extends1.super1;

public class Child extends Parent{

    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child. hello");
    }

    public void call() {
        System.out.println("value = " + value);
        System.out.println("This value = " + this.value);
        System.out.println("Super value = " + super.value);
        System.out.println();

        System.out.println("JUST HELLO");
        hello();
        System.out.println("THIS HELLO");
        this.hello();
        System.out.println("SUPER HELLO");
        super.hello();
    }
}
