package Tasks_9.Task3;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(5), new Rectangle(4, 6), new Triangle(3, 4)};
        for (Shape shape : shapes) {
            shape.draw();
            System.out.println("Площадь: " + shape.area());
        }
    }
}