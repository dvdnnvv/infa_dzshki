import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[15];

        // Ввод массива
        for (int i = 0; i < 15; i++) {
            arr[i] = scanner.nextInt();
        }

        // a) Перестановка элементов между вторым и десятым (с 3 по 9)
        for (int i = 2, j = 8; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // b) Перестановка элементов между k-м и s-м
        int k = scanner.nextInt();
        int s = scanner.nextInt();
        for (int i = k, j = s - 2; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // c) Перестановка элементов между максимальным и минимальным
        int minIdx = 0, maxIdx = 0;
        for (int i = 1; i < 15; i++) {
            if (arr[i] < arr[minIdx]) minIdx = i;
            if (arr[i] > arr[maxIdx]) maxIdx = i;
        }

        if (minIdx > maxIdx) {
            int temp = minIdx;
            minIdx = maxIdx;
            maxIdx = temp;
        }

        for (int i = minIdx, j = maxIdx; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // Вывод измененного массива
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
