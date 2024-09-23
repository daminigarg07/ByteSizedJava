abstract class Shape {
    abstract void draw(); // Abstract method
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Shape shape = new Rectangle();
        shape.draw(); // Output: Drawing a Rectangle
    }
}
