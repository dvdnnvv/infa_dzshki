package tri;

public class RationalFraction {
    private int numerator;   // Числитель
    private int denominator; // Знаменатель

    // Конструктор для дроби, равной нулю
    public RationalFraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    // Конструктор с заданными значениями числителя и знаменателя
    public RationalFraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce(); // Сразу сокращаем дробь при создании
    }

    // Метод для сокращения дроби
    public void reduce() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator)); // Нахождение НОД
        this.numerator /= gcd;
        this.denominator /= gcd;

        // Если знаменатель отрицательный, меняем знаки у числителя и знаменателя
        if (denominator < 0) {
            this.numerator = -this.numerator;
            this.denominator = -this.denominator;
        }
    }

    // Метод для сложения двух дробей (возвращает новый объект)
    public RationalFraction add(RationalFraction other) {
        if (other == null) {
            throw new IllegalArgumentException("Другой объект RationalFraction не может быть null");
        }
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        RationalFraction result = new RationalFraction(newNumerator, newDenominator);
        result.reduce(); // Сокращаем результат
        return result;
    }

    // Метод для сложения двух дробей (результат сохраняется в текущем объекте)
    public void add2(RationalFraction other) {
        if (other == null) {
            throw new IllegalArgumentException("Другой объект RationalFraction не может быть null");
        }
        this.numerator = this.numerator * other.denominator + other.numerator * this.denominator;
        this.denominator = this.denominator * other.denominator;
        reduce(); // Сокращаем результат
    }

    // Метод для вычитания двух дробей (возвращает новый объект)
    public RationalFraction sub(RationalFraction other) {
        if (other == null) {
            throw new IllegalArgumentException("Другой объект RationalFraction не может быть null");
        }
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        RationalFraction result = new RationalFraction(newNumerator, newDenominator);
        result.reduce(); // Сокращаем результат
        return result;
    }

    // Метод для вычитания двух дробей (результат сохраняется в текущем объекте)
    public void sub2(RationalFraction other) {
        if (other == null) {
            throw new IllegalArgumentException("Другой объект RationalFraction не может быть null");
        }
        this.numerator = this.numerator * other.denominator - other.numerator * this.denominator;
        this.denominator = this.denominator * other.denominator;
        reduce(); // Сокращаем результат
    }

    // Метод для умножения двух дробей (возвращает новый объект)
    public RationalFraction mult(RationalFraction other) {
        if (other == null) {
            throw new IllegalArgumentException("Другой объект RationalFraction не может быть null");
        }
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        RationalFraction result = new RationalFraction(newNumerator, newDenominator);
        result.reduce(); // Сокращаем результат
        return result;
    }

    // Метод для умножения двух дробей (результат сохраняется в текущем объекте)
    public void mult2(RationalFraction other) {
        if (other == null) {
            throw new IllegalArgumentException("Другой объект RationalFraction не может быть null");
        }
        this.numerator = this.numerator * other.numerator;
        this.denominator = this.denominator * other.denominator;
        reduce(); // Сокращаем результат
    }

    // Метод для деления дроби на другую (возвращает новый объект)
    public RationalFraction div(RationalFraction other) {
        if (other == null) {
            throw new IllegalArgumentException("Другой объект RationalFraction не может быть null");
        }
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        RationalFraction result = new RationalFraction(newNumerator, newDenominator);
        result.reduce(); // Сокращаем результат
        return result;
    }

    // Метод для деления дроби на другую (результат сохраняется в текущем объекте)
    public void div2(RationalFraction other) {
        if (other == null) {
            throw new IllegalArgumentException("Другой объект RationalFraction не может быть null");
        }
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно");
        }
        this.numerator = this.numerator * other.denominator;
        this.denominator = this.denominator * other.numerator;
        reduce(); // Сокращаем результат
    }

    // Метод для получения строкового представления дроби
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Метод для получения десятичного значения дроби
    public double value() {
        return (double) numerator / denominator;
    }

    // Метод для сравнения двух дробей
    public boolean equals(RationalFraction other) {
        if (other == null) {
            throw new IllegalArgumentException("Другой объект RationalFraction не может быть null");
        }
        return this.numerator == other.numerator && this.denominator == other.denominator;
    }

    // Метод для получения целой части дроби
    public int numberPart() {
        return numerator / denominator;
    }

    // Вспомогательный метод для нахождения наибольшего общего делителя (НОД)
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
