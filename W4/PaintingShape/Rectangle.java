package W4.PaintingShape;

public class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double l, double w) {
        super("Rectangle");
        length = l;
        width = w;
    }

    public String toString() {
        return super.toString() + " of length " + length + " and width " + width;
    }

    public double area() {
        return length * width;
    }
}