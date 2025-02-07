import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // a) Обмен 2-го и 5-го
        if (n >= 5) {
            int temp = arr[1];
            arr[1] = arr[4];
            arr[4] = temp;
        }

        // b) Обмен m-го и n-го
        int m = scanner.nextInt(), k = scanner.nextInt();
        if (m > 0 && k > 0 && m <= n && k <= n) {
            int temp = arr[m - 1];
            arr[m - 1] = arr[k - 1];
            arr[k - 1] = temp;
        }

        // c) Обмен 3-го и максимального
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        if (n >= 3) {
            int temp = arr[2];
            arr[2] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        // Вывод
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
