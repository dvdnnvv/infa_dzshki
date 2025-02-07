import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите натуральное число n (n <= 100):");
        int n = scanner.nextInt();

        if (n <= 0 || n > 100) {
            System.out.println("Ошибка: n должно быть натуральным числом от 1 до 100.");
            return;
        }
        int digitCount = String.valueOf(n).length();

        int sumOfDigits = 0;
        int temp = n;
        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }

        int firstDigit = Integer.parseInt(String.valueOf(String.valueOf(n).charAt(0)));

        int penultimateDigit = (n >= 10) ? (n / 10) % 10 : -1;

        System.out.println("a) Количество цифр: " + digitCount);
        System.out.println("b) Сумма цифр: " + sumOfDigits);
        System.out.println("c) Первая цифра: " + firstDigit);
        if (penultimateDigit != -1) {
            System.out.println("d) Предпоследняя цифра: " + penultimateDigit);
        } else {
            System.out.println("d) Число меньше 10, предпоследней цифры нет.");
        }
    }
}
