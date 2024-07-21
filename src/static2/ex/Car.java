package static2.ex;

public class Car {
    private final String name;
    private static int count = 0;

    public Car(String name) {
        System.out.println("purchased: " + name);
        this.name = name;
        count++;
    }

    static void showTotalCars() {
        System.out.println("Total purchased count: " + count);
    }
}
