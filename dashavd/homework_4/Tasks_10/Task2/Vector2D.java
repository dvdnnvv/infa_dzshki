package homework_4.Tasks_10.Task2;

class Vector2D {
    private double x, y;

    public Vector2D() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector2D add(Vector2D v) {
        return new Vector2D(this.x + v.x, this.y + v.y);
    }

    public void add2(Vector2D v) {
        this.x += v.x;
        this.y += v.y;
    }

    public Vector2D sub(Vector2D v) {
        return new Vector2D(this.x - v.x, this.y - v.y);
    }

    public void sub2(Vector2D v) {
        this.x -= v.x;
        this.y -= v.y;
    }

    public Vector2D mult(double scalar) {
        return new Vector2D(this.x * scalar, this.y * scalar);
    }

    public void mult2(double scalar) {
        this.x *= scalar;
        this.y *= scalar;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double length() {
        return Math.sqrt(x * x + y * y);
    }

    public double scalarProduct(Vector2D v) {
        return this.x * v.x + this.y * v.y;
    }

    public double cos(Vector2D v) {
        return this.scalarProduct(v) / (this.length() * v.length());
    }

    public boolean equals(Vector2D v) {
        return this.x == v.x && this.y == v.y;
    }
}