class Vehicle {
    double speed = 20.0;

    double timeTaken(double distance) {
        return (distance/speed);
    }
}

public class Car extends Vehicle {
    String brand = "Mahindra";

    void printBrand() {
        System.out.println(brand);
    }

    public static void main(String[] args) {
        new Car().printBrand();
        System.out.println(new Car().timeTaken(45));
    }
}
