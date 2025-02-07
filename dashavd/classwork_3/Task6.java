import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a) Арифметическая прогрессия
        int[] arithmetic = new int[10];
        int a = scanner.nextInt(); // первый член
        int p = scanner.nextInt(); // разность
        for (int i = 0; i < 10; i++) {
            arithmetic[i] = a + i * p;
            System.out.print(arithmetic[i] + " ");
        }
        System.out.println();

        // b) Числа Фибоначчи
        int[] fibonacci = new int[20];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < 20; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        for (int num : fibonacci) {
            System.out.print(num + " ");
        }
    }
}
