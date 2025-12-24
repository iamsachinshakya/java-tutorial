package inheritance;

public class Car extends Vehicle {

    int wheel;

    public Car() {
        super();
        super.running();
        wheel = 4;
        System.out.println("Car constructor created");

    }

    void running() {
        System.out.println("Car running....");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.running();
    }
}
