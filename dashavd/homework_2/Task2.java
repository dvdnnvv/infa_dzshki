import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[15];
        
        // Ввод массива
        for (int i = 0; i < 15; i++) {
            arr[i] = scanner.nextInt();
        }

        // Нахождение первого отрицательного и последнего положительного элемента
        int firstNegative = -1, lastPositive = -1;
        for (int i = 0; i < 15; i++) {
            if (arr[i] < 0 && firstNegative == -1) {
                firstNegative = i;
            }
            if (arr[i] > 0) {
                lastPositive = i;
            }
        }

        // Обмен элементов, если такие элементы есть
        if (firstNegative != -1 && lastPositive != -1) {
            int temp = arr[firstNegative];
            arr[firstNegative] = arr[lastPositive];
            arr[lastPositive] = temp;
        }

        // Вывод измененного массива
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
