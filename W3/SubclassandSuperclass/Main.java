package SubclassandSuperclass;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(5.5, "red", false);
        shapes[1] = new Rectangle(2.0, 4.0, "blue", true);
        shapes[2] = new Square(6.0, "yellow", true);

        // Melakukan looping untuk memunculkan semuanya
        for (Shape s : shapes) {
            System.out.println("---------------------------------------");
            System.out.println(s.toString()); // Memanggil toString masing-masing
            System.out.println("Area      : " + s.getArea());
            System.out.println("Perimeter : " + s.getPerimeter());
        }
    }
}
