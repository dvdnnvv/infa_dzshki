import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int maxSum = Integer.MIN_VALUE, minSum = Integer.MAX_VALUE;
        int maxIndex = 0, minIndex = 0;

        for (int i = 0; i < n - 1; i++) {
            int sum = arr[i] + arr[i + 1];
            if (sum > maxSum) {
                maxSum = sum;
                maxIndex = i;
            }
            if (sum <= minSum) {
                minSum = sum;
                minIndex = i;
            }
        }

        System.out.println("Макс. сумма: " + maxSum + ", индексы: " + maxIndex + " и " + (maxIndex + 1));
        System.out.println("Мин. сумма: " + minSum + ", индексы: " + minIndex + " и " + (minIndex + 1));
    }
}
