
// Method Overriding - Example 1
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting");
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start();

        Bike bike = new Bike();
        bike.start();
    }
}
