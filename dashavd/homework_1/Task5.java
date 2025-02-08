import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод количества чисел
        System.out.print("Введите количество чисел n: ");
        int n = scanner.nextInt();

        double[] numbers = new double[n]; // Создаем массив для хранения чисел

        // Ввод последовательности чисел
        System.out.println("Введите последовательность чисел:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
        }

        // Обработка массива: увеличиваем отрицательные числа на 0.5, остальные заменяем на 0.1
        for (int i = 0; i < n; i++) {
            if (numbers[i] < 0) {
                numbers[i] += 0.5; // Увеличиваем отрицательные числа на 0.5
            } else {
                numbers[i] = 0.1; // Заменяем положительные числа и ноль на 0.1
            }
        }

        // Вывод изменённой последовательности
        System.out.println("Изменённая последовательность:");
        for (double num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close(); 
    }
}
