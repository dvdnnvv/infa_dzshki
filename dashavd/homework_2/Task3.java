import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[15];

        // Ввод массива
        for (int i = 0; i < 15; i++) {
            arr[i] = scanner.nextInt();
        }

        // Нахождение первого отрицательного и последнего положительного элемента
        int firstNegative = -1;
        int lastPositive = -1;

        // Ищем первый отрицательный элемент
        for (int i = 0; i < 15; i++) {
            if (arr[i] < 0) {
                firstNegative = i;
                break;
            }
        }

        // Ищем последний положительный элемент
        for (int i = 14; i >= 0; i--) {
            if (arr[i] > 0) {
                lastPositive = i;
                break;
            }
        }

        // Если такие элементы найдены, меняем их местами
        if (firstNegative != -1 && lastPositive != -1) {
            int temp = arr[firstNegative];
            arr[firstNegative] = arr[lastPositive];
            arr[lastPositive] = temp;
        }

        // Вывод измененного массива
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
