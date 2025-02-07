import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxSum = Integer.MIN_VALUE;
        int minProduct = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            maxSum = Math.max(maxSum, a + b);
            minProduct = Math.min(minProduct, a * b);
        }

        System.out.println("Максимальная сумма пары: " + maxSum);
        System.out.println("Минимальное произведение пары: " + minProduct);
    }
}
