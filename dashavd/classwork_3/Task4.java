import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, num;

        while ((num = scanner.nextInt()) != 0) {
            if (num > 0 && num % 2 == 0) {
                sum += num;
            }
        }

        System.out.println("Сумма положительных четных чисел: " + sum);
    }
}
