import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        if (a <= b) {
            a = 0;
        }

        System.out.println("Результат: " + a + ", " + b);
        scanner.close();
    }
}