import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива n:");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Ошибка: n должно быть натуральным числом.");
            return;
        }

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = (i % 2 == 0) ? (i * 2 + 1) : -(i * 2 + 1);
        }

        System.out.println("Полученный массив:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
