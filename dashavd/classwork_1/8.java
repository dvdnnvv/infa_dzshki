import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите числа a, b, c, d: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        if (a <= b && b <= c && c <= d) {
            double max = Math.max(Math.max(a, b), Math.max(c, d));
            a = b = c = d = max;
        } else if (!(a > b && b > c && c > d)) {
            a *= a; b *= b; c *= c; d *= d;
        }

        System.out.println("Результат: " + a + ", " + b + ", " + c + ", " + d);
        scanner.close();
    }
}