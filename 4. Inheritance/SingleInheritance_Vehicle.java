
// Single Inheritance - Vehicle and Car
class Vehicle {
    String make;
    String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Vehicle Make: " + make + ", Model: " + model);
    }
}

class Car extends Vehicle {
    String fuelType;

    public Car(String make, String model, String fuelType) {
        super(make, model);
        this.fuelType = fuelType;
    }

    public void carDetails() {
        displayInfo();
        System.out.println("Fuel Type: " + fuelType);
    }
}

public class SingleInheritance_Vehicle {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", "Petrol");
        car.carDetails();
    }
}