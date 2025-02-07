import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите основание системы счисления k (2 < k < 9):");
        int k = scanner.nextInt();
        if (k <= 2 || k >= 9) {
            System.out.println("Ошибка: k должно быть в диапазоне 2 < k < 9.");
            return;
        }

        System.out.println("Введите число n в системе счисления с основанием k:");
        int n = scanner.nextInt();

        int decimal = 0;
        int power = 0;

        while (n > 0) {
            int digit = n % 10;
            if (digit >= k) {
                System.out.println("Ошибка: цифра числа n не может быть больше или равна основанию системы.");
                return;
            }
            decimal += digit * Math.pow(k, power);
            n /= 10;
            power++;
        }

        System.out.println("Число в десятичной системе: " + decimal);
    }
}
