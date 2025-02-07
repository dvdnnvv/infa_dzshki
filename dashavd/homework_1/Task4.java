import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество чисел n:");
        int n = scanner.nextInt();

        int count = 0;

        System.out.println("Введите числа:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            int length = String.valueOf(Math.abs(num)).length();
            boolean allEven = true;
            boolean allOdd = true;

            int temp = Math.abs(num);
            while (temp > 0) {
                int digit = temp % 10;
                if (digit % 2 == 0) {
                    allOdd = false;
                } else {
                    allEven = false;
                }
                temp /= 10;
            }

            if ((length == 3 || length == 5) && (allEven || allOdd)) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("Ровно два числа соответствуют условиям.");
        } else {
            System.out.println("Условию соответствуют " + count + " числа.");
        }
    }
}
