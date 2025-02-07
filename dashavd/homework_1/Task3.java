import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        final double PI = 3.141592653589793;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите два неравных целых числа m и n:");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        if (m == n) {
            System.out.println("Числа должны быть неравны.");
            return;
        }

        double fraction1 = (double) m / n;
        double fraction2 = (double) n / m;

        if (Math.abs(fraction1 - PI) < Math.abs(fraction2 - PI)) {
            m *= 10;
            System.out.println("Дробь m/n ближе к π. Новое значение m: " + m);
        } else {
            n *= 2;
            System.out.println("Дробь n/m ближе к π. Новое значение n: " + n);
        }
    }
}
