package dva;

public class Vector2D {
    private double x;
    private double y;

    // Конструктор для нулевого вектора
    public Vector2D() {
        this.x = 0;
        this.y = 0;
    }

    // Конструктор с координатами
    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Метод сложения векторов (возвращает новый вектор)
    public Vector2D add(Vector2D other) {
        if (other == null) {
            throw new IllegalArgumentException("Другой вектор не может быть null");
        }
        return new Vector2D(this.x + other.x, this.y + other.y);
    }

    // Метод сложения векторов (изменяет текущий вектор)
    public void add2(Vector2D other) {
        if (other == null) {
            throw new IllegalArgumentException("Другой вектор не может быть null");
        }
        this.x += other.x;
        this.y += other.y;
    }

    // Метод вычитания векторов (возвращает новый вектор)
    public Vector2D sub(Vector2D other) {
        if (other == null) {
            throw new IllegalArgumentException("Другой вектор не может быть null");
        }
        return new Vector2D(this.x - other.x, this.y - other.y);
    }

    // Метод вычитания векторов (изменяет текущий вектор)
    public void sub2(Vector2D other) {
        if (other == null) {
            throw new IllegalArgumentException("Другой вектор не может быть null");
        }
        this.x -= other.x;
        this.y -= other.y;
    }

    // Метод умножения вектора на число (возвращает новый вектор)
    public Vector2D mult(double scalar) {
        return new Vector2D(this.x * scalar, this.y * scalar);
    }

    // Метод умножения вектора на число (изменяет текущий вектор)
    public void mult2(double scalar) {
        this.x *= scalar;
        this.y *= scalar;
    }

    // Метод для получения строкового представления вектора
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Метод для нахождения длины вектора
    public double length() {
        return Math.sqrt(x * x + y * y);
    }

    // Метод для нахождения скалярного произведения двух векторов
    public double scalarProduct(Vector2D other) {
        if (other == null) {
            throw new IllegalArgumentException("Другой вектор не может быть null");
        }
        return this.x * other.x + this.y * other.y;
    }

    // Метод для нахождения косинуса угла между векторами
    public double cos(Vector2D other) {
        if (other == null) {
            throw new IllegalArgumentException("Другой вектор не может быть null");
        }
        double scalarProd = this.scalarProduct(other);
        return scalarProd / (this.length() * other.length());
    }

    // Метод для сравнения векторов
    public boolean equals(Vector2D other) {
        if (other == null) {
            throw new IllegalArgumentException("Другой вектор не может быть null");
        }
        return this.x == other.x && this.y == other.y;
    }
}
