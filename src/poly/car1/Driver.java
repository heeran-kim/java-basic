package poly.car1;

public class Driver {
    // OCP
    // Closed for modification
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void drive() {
        System.out.println("Drive.drive");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
