
// Constructor Polymorphism - Example 1
class Car {
    String model;
    int year;

    Car(String model) {
        this.model = model;
        System.out.println("Car model: " + model);
    }

    Car(String model, int year) {
        this.model = model;
        this.year = year;
        System.out.println("Car model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Tesla");
        Car car2 = new Car("BMW", 2022);
    }
}
