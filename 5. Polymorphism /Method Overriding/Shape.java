
// Method Overriding - Example 2
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();

        Circle circle = new Circle();
        circle.draw();
    }
}
