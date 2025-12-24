package inheritance;

public class Vehicle {
    int wheel;
    String color;
    String brand;
    String model;
    int price;

    public Vehicle() {
        color = "black";
        brand = "Tata";
        model = "safari";
        price = 16_00_000;
        System.out.println("vehicle constructor created");
    }

    void breaking() {
        System.out.println("breaking...");
    }

    void starting() {
        System.out.println("starting...");
    }

    void running() {
        System.out.println("running....");
    }

}
