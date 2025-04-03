
// Method Overloading - Example 2
class Display {
    void show(String message) {
        System.out.println("Message: " + message);
    }

    void show(int number) {
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {
        Display display = new Display();
        display.show("Hello, World!");
        display.show(123);
    }
}
