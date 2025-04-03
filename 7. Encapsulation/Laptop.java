
// Program 7: Encapsulation in Laptop Class
class Laptop {
    private String brand;
    private int ramSize;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        if (ramSize > 0) {
            this.ramSize = ramSize;
        }
    }
}