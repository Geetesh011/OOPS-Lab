
// Constructor Overloading - Example 2
class Product {
    String productName;
    double price;

    Product(String productName) {
        this.productName = productName;
        System.out.println("Product Name: " + productName);
    }

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        System.out.println("Product Name: " + productName + ", Price: $" + price);
    }

    public static void main(String[] args) {
        Product prod1 = new Product("Laptop");
        Product prod2 = new Product("Smartphone", 799.99);
    }
}
