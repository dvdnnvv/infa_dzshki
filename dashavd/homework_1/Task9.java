import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод числа a
        System.out.print("Введите действительное число a: ");
        double a = scanner.nextDouble();

        double f; // Переменная для хранения результата

        // Вычисление значения функции в зависимости от a
        if (a <= 0) {
            f = 0; // Если a <= 0, то f(a) = 0
        } else if (a <= 1) { 
            f = Math.pow(a, 2) - a; // Если 0 < a <= 1, то f(a) = a^2 - a
        } else {
            f = Math.pow(a, 2) - Math.sin(Math.PI * Math.pow(a, 2)); 
            // Если a > 1, то f(a) = a^2 - sin(π * a^2)
        }

        // Вывод результата
        System.out.println("Значение функции f(a): " + f);

        scanner.close(); // Закрываем Scanner после использования
    }
}
