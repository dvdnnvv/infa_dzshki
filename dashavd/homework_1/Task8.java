import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос размера массива
        System.out.print("Введите размер массива n: ");
        int n = scanner.nextInt();

        // Проверяем, что n - натуральное число (больше 0)
        if (n <= 0) {
            System.out.println("Ошибка: n должно быть натуральным числом.");
            scanner.close(); // Закрываем Scanner перед выходом
            return;
        }

        int[] array = new int[n]; // Создаём массив размером n

        // Заполняем массив по заданному правилу
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                array[i] = i * 2 + 1;  // Чётные индексы: положительные числа
            } else {
                array[i] = -(i * 2 + 1); // Нечётные индексы: отрицательные числа
            }
        }

        // Выводим полученный массив
        System.out.println("Полученный массив:");
        for (int value : array) {
            System.out.print(value + " ");
        }

        scanner.close(); // Закрываем Scanner после использования
    }
}
