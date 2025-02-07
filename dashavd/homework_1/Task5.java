import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество чисел n:");
        int n = scanner.nextInt();

        double[] numbers = new double[n];

        System.out.println("Введите последовательность чисел:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            if (numbers[i] < 0) {
                numbers[i] += 0.5;
            } else {
                numbers[i] = 0.1;
            }
        }
        System.out.println("Изменённая последовательность:");
        for (double num : numbers) {
            System.out.print(num + " ");
        }
    }
}
