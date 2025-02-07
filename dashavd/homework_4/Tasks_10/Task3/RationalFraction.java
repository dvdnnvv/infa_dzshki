package homework_4.Tasks_10.Task3;

class RationalFraction {
    private int numerator, denominator;

    public RationalFraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public RationalFraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    public void reduce() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }

    public RationalFraction add(RationalFraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        RationalFraction result = new RationalFraction(newNumerator, newDenominator);
        result.reduce();
        return result;
    }

    public void add2(RationalFraction other) {
        this.numerator = this.numerator * other.denominator + other.numerator * this.denominator;
        this.denominator = this.denominator * other.denominator;
        reduce();
    }

    public RationalFraction sub(RationalFraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        RationalFraction result = new RationalFraction(newNumerator, newDenominator);
        result.reduce();
        return result;
    }

    public void sub2(RationalFraction other) {
        this.numerator = this.numerator * other.denominator - other.numerator * this.denominator;
        this.denominator = this.denominator * other.denominator;
        reduce();
    }

    public RationalFraction mult(RationalFraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        RationalFraction result = new RationalFraction(newNumerator, newDenominator);
        result.reduce();
        return result;
    }

    public void mult2(RationalFraction other) {
        this.numerator = this.numerator * other.numerator;
        this.denominator = this.denominator * other.denominator;
        reduce();
    }

    public RationalFraction div(RationalFraction other) {
        if (other.numerator == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        RationalFraction result = new RationalFraction(newNumerator, newDenominator);
        result.reduce();
        return result;
    }

    public void div2(RationalFraction other) {
        if (other.numerator == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        this.numerator = this.numerator * other.denominator;
        this.denominator = this.denominator * other.numerator;
        reduce();
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public double value() {
        return (double) numerator / denominator;
    }

    public boolean equals(RationalFraction other) {
        return this.numerator == other.numerator && this.denominator == other.denominator;
    }

    public int numberPart() {
        return numerator / denominator;
    }
}