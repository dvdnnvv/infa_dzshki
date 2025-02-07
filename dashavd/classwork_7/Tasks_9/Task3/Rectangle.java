package Tasks_9.Task3;

class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }

    @Override
    void draw() {
        System.out.println("Рисую прямоугольник.");
    }
}