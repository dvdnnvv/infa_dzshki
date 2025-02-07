package Tasks_9.Task3;

class Triangle extends Shape {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }

    @Override
    void draw() {
        System.out.println("Рисую треугольник.");
    }
}