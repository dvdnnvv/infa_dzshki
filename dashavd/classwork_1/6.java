import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Введите число " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        System.out.print("Числа из интервала (1, 3): ");
        for (double num : numbers) {
            if (num > 1 && num < 3) {
                System.out.print(num + " ");
            }
        }
        
        scanner.close();
    }
}