
// Encapsulation Example 4: Encapsulation with Access Control
class Car {
    private String brand;
    private String model;
    private int year;

    public void setCarDetails(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayCarDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.setCarDetails("Toyota", "Camry", 2022);
        car.displayCarDetails();
    }
}
