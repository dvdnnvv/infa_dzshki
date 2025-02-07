import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        long sum = 0, product = 1, sumSquares = 0;
        for (int num : arr) {
            sum += num;
            product *= num;
            sumSquares += num * num;
        }

        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + product);
        System.out.println("Сумма квадратов: " + sumSquares);
        System.out.println("Среднее: " + (sum / (double) n));
    }
}
