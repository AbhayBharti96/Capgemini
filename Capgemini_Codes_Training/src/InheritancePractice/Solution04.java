package InheritancePractice;

class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {
    int r = 3;
    void draw() {
        System.out.println("Area of Circle: " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {
    int l = 20;
    int w = 3;

    void draw() {
        System.out.println("Area of Rectangle: " + (l * w));
    }
}

public class Solution04 {
    public static void main(String[] args) {

        Shape s1 = new Circle();      // Hierarchical inheritance
        Shape s2 = new Rectangle();

        s1.draw();
        s2.draw();
    }
}
