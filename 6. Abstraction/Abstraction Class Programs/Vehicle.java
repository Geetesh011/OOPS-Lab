abstract class Vehicle {
    abstract void start();
}
class Car extends Vehicle {
    void start() {
        System.out.println("Car is starting");
    }
}
class VehicleDemo {
    public static void main(String args[]) {
        Vehicle obj = new Car();
        obj.start();
    }
}