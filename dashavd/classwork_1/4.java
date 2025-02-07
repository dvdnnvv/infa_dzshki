import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Введите число " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
            if (numbers[i] >= 0) {
                numbers[i] *= numbers[i];
            }
        }

        System.out.println("Результат: " + numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
        scanner.close();
    }
}