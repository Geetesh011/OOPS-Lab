
// Encapsulation Example 3: Encapsulation with Validation
class Product {
    private String name;
    private double price;

    public String getName() { return name; }
    public void setName(String name) {
        if (name != null && !name.isEmpty()) { this.name = name; }
        else { System.out.println("Invalid product name"); }
    }

    public double getPrice() { return price; }
    public void setPrice(double price) {
        if (price >= 0) { this.price = price; }
        else { System.out.println("Price cannot be negative"); }
    }

    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Laptop");
        product.setPrice(1500.0);

        System.out.println("Product: " + product.getName());
        System.out.println("Price: $" + product.getPrice());

        product.setPrice(-100);
    }
}
