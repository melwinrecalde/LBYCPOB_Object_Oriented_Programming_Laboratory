// Vehicle.java
public class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void move() {
        System.out.println(brand + " is moving");
    }
}