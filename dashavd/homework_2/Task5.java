import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[15];

        // Заполнение массива цифрами числа n в обратном порядке
        int idx = 0;
        while (n > 0 && idx < 15) {
            arr[idx] = n % 10;
            n /= 10;
            idx++;
        }

        // Вывод массива
        for (int i = 0; i < 15; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
