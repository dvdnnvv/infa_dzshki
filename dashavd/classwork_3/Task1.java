import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int maxIndex = 0, minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] >= arr[maxIndex]) {
                maxIndex = i;
            }
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        System.out.println("Последний номер максимального: " + (maxIndex + 1));
        System.out.println("Первый номер минимального: " + (minIndex + 1));
    }
}
