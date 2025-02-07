import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите действительное число a:");
        double a = scanner.nextDouble();

        System.out.println("Введите натуральное число n:");
        int n = scanner.nextInt();

        if (n <= 0 || a == 0) {
            System.out.println("Ошибка: n должно быть натуральным числом, а a не должно быть равно нулю.");
            return;
        }

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += 1 / Math.pow(a, Math.pow(2, i - 1));
        }

        System.out.println("Результат: " + sum);
    }
}
