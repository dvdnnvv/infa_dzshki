import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите первое число: ");
            int num1 = Integer.parseInt(scanner.nextLine());
            System.out.print("Введите второе число: ");
            int num2 = Integer.parseInt(scanner.nextLine());
            System.out.println("Результат деления: " + (num1 / num2));
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: некорректный ввод числа.");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль.");
        }
    }
}
