
// Hierarchical Inheritance - Product, Electronics, and Clothing
class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void productInfo() {
        System.out.println("Product Name: " + name + ", Price: $" + price);
    }
}

class Electronics extends Product {
    String brand;

    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    public void electronicsInfo() {
        productInfo();
        System.out.println("Brand: " + brand);
    }
}

class Clothing extends Product {
    String size;

    public Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    public void clothingInfo() {
        productInfo();
        System.out.println("Size: " + size);
    }
}

public class HierarchicalInheritance_Product {
    public static void main(String[] args) {
        Electronics electronic1 = new Electronics("Smartphone", 799, "Samsung");
        electronic1.electronicsInfo();

        Clothing clothing1 = new Clothing("T-shirt", 29, "L");
        clothing1.clothingInfo();
    }
}