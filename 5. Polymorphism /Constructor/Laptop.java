
// Constructor Polymorphism - Example 2
class Laptop {
    String brand;
    int price;

    Laptop(String brand) {
        this.brand = brand;
        System.out.println("Laptop brand: " + brand);
    }

    Laptop(String brand, int price) {
        this.brand = brand;
        this.price = price;
        System.out.println("Laptop brand: " + brand + ", Price: " + price);
    }

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Dell");
        Laptop laptop2 = new Laptop("HP", 800);
    }
}
