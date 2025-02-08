import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[15];

        // Ввод массива из 15 элементов
        System.out.println("Введите 15 целых чисел:");
        for (int i = 0; i < 15; i++) {
            arr[i] = scanner.nextInt();
        }

        // a) Перестановка элементов между вторым и десятым (с 3 по 9 индексы)
        for (int i = 2, j = 8; i < j; i++, j--) {
            swap(arr, i, j);
        }

        // b) Перестановка элементов между k-м и s-м (k и s вводятся пользователем)
        System.out.print("Введите индексы k и s для перестановки (от 1 до 15): ");
        int k = scanner.nextInt() - 1; // Приводим к индексации массива (от 0)
        int s = scanner.nextInt() - 1;

        if (k >= 0 && k < s && s < 15) {
            for (int i = k, j = s; i < j; i++, j--) {
                swap(arr, i, j);
            }
        } else {
            System.out.println("Ошибка: индексы должны быть в пределах 1-15 и k < s.");
        }

        // c) Перестановка элементов между максимальным и минимальным
        int minIdx = 0, maxIdx = 0;
        for (int i = 1; i < 15; i++) {
            if (arr[i] < arr[minIdx]) minIdx = i;
            if (arr[i] > arr[maxIdx]) maxIdx = i;
        }

        // Обеспечиваем правильный порядок перестановки
        if (minIdx > maxIdx) {
            int temp = minIdx;
            minIdx = maxIdx;
            maxIdx = temp;
        }

        for (int i = minIdx, j = maxIdx; i < j; i++, j--) {
            swap(arr, i, j);
        }

        // Вывод измененного массива
        System.out.println("Измененный массив:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close(); // Закрываем Scanner
    }

    // Вспомогательный метод для обмена элементов массива
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
