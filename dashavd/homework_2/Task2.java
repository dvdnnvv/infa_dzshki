import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[15];

        // Ввод массива из 15 элементов
        System.out.println("Введите 15 целых чисел:");
        for (int i = 0; i < 15; i++) {
            arr[i] = scanner.nextInt();
        }

        // Нахождение первого отрицательного и последнего положительного элемента
        int firstNegativeIndex = -1, lastPositiveIndex = -1;

        for (int i = 0; i < 15; i++) {
            if (arr[i] < 0 && firstNegativeIndex == -1) {
                firstNegativeIndex = i; // Запоминаем индекс первого отрицательного числа
            }
            if (arr[i] > 0) {
                lastPositiveIndex = i; // Обновляем индекс последнего положительного числа
            }
        }

        // Обмен элементов, если найдены оба
        if (firstNegativeIndex != -1 && lastPositiveIndex != -1) {
            swap(arr, firstNegativeIndex, lastPositiveIndex);
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
