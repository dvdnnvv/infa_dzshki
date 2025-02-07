import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите a, b, c (a ≠ 0): ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double d = b * b - 4 * a * c;

        if (d < 0) {
            System.out.println("Действительных корней нет.");
        } else if (d == 0) {
            System.out.println("Один корень: " + (-b / (2 * a)));
        } else {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Корни уравнения: " + x1 + " и " + x2);
        }

        scanner.close();
    }
}