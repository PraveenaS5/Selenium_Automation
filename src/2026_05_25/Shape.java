// Base class
class Shape {
    public void display() {
        System.out.println("This is a shape");
    }
}

// Derived class 1
class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

// Derived class 2
class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.display();
        c.area();

        System.out.println();

        Rectangle r = new Rectangle(4, 6);
        r.display();
        r.area();
    }
}
