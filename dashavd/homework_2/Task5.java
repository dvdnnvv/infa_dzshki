import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод числа n
        System.out.println("Введите число n:");
        int n = scanner.nextInt();
        int[] arr = new int[15];

        // Заполнение массива цифрами числа n в обратном порядке
        int idx = 0;
        while (n > 0 && idx < 15) {
            arr[idx] = n % 10;  // Извлекаем последнюю цифру числа
            n /= 10;  // Убираем последнюю цифру из числа
            idx++;  // Переходим к следующей ячейке массива
        }

        // Заполнение оставшихся ячеек массива нулями (если число n содержит меньше 15 цифр)
        while (idx < 15) {
            arr[idx] = 0;
            idx++;
        }

        // Вывод массива
        System.out.println("Массив, содержащий цифры числа n в обратном порядке:");
        for (int i = 0; i < 15; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close(); // Закрытие scanner
    }
}
