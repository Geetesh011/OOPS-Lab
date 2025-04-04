abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class ShapeDemo {
    public static void main(String args[]) {
        Shape obj = new Circle();
        obj.draw();
    }
}
