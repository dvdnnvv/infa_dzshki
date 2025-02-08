import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод действительного числа a
        System.out.print("Введите действительное число a: ");
        double a = scanner.nextDouble();

        // Ввод натурального числа n
        System.out.print("Введите натуральное число n: ");
        int n = scanner.nextInt();

        // Проверка на корректность входных данных
        if (n <= 0 || a == 0) {
            System.out.println("Ошибка: n должно быть натуральным числом, а a не должно быть равно нулю.");
            scanner.close(); // Закрываем Scanner перед выходом
            return;
        }

        double sum = 0; // Переменная для хранения суммы

        // Вычисление суммы по формуле: S = 1/a^(2^0) + 1/a^(2^1) + ... + 1/a^(2^(n-1))
        for (int i = 0; i < n; i++) {
            sum += 1 / Math.pow(a, Math.pow(2, i));
        }

        // Вывод результата
        System.out.println("Результат: " + sum);

        scanner.close(); // Закрываем Scanner после использования
    }
}
